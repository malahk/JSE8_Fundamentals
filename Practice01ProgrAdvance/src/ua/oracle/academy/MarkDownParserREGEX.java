package ua.oracle.academy;

import java.util.regex.*;

/**
 * Created by Admin on 23.06.2015.
 */
public class MarkDownParserREGEX implements Parseable {

    private static final String HTML_START = "<html>\n";
    private static final String HTML_END = "</html>\n";
    private static final String BODY_START = "<body>\n";
    private static final String BODY_END = "</body>\n";
    private static final String SIMPLE_START = "<p>";
    private static final String SIMPLE_END = "</p>\n";
    private static final String EMPHASI_START = "<em>";
    private static final String EMPHASI_END = "</em>";
    private static final String STRONG_START = "<strong>";
    private static final String STRONG_END = "</strong>";
    private static final String URL_START = "<a href=\"";
    private static final String URL_END = "/a>";
    private static final String TAB = "\t";
    private static final String SHARP = "#";
    private static final String EMPTY_STRING = "";
    public static final Pattern HEADER_PATTERN = Pattern.compile("(#+)\\s*([\\w]+\\s[\\w]+)\\s");
//    public static final Pattern HEADER_PATTERN = Pattern.compile("(#+)\\s*(.+)\n{2,}");
    public static final Pattern EMPHASI_PATTERN = Pattern.compile("(\\w+\\s\\w+\\s)(\\*)(\\w+)(\\*)(\\s\\w+)");
    public static final Pattern STRONG_PATTERN = Pattern.compile("(\\w+\\s\\w+\\s)(\\*{2})(\\w+)(\\*{2})(\\s\\w+)");
    public static final Pattern URL_PATTERN = Pattern.compile("(.\\w+\\s\\w+.\\w+\\s)(\\[)(.+)(\\])(\\()(\\w+:/{2}\\w+\\.\\w+\\.\\w+)(\\))(\\s\\w+\\s\\w+)");

    @Override
    public void parse() {

    }

    public MarkDownParserREGEX() {

    }

    public static String parser(String s) {

        StringBuilder builder = new StringBuilder();
        builder.append(getHTMLStart());
        builder.append(createHeader(s));
        builder.append(parseEmphasi(s));
        builder.append(parseStrong(s));
        builder.append(parseURL(s));
        builder.append(getHTMLEnd());

        return builder.toString();
    }

    public static String getHTMLStart() {

        return HTML_START.concat(BODY_START);

    }

    public static String createHeader(String s)
    {
        Pattern p = HEADER_PATTERN;
        Matcher m = p.matcher(s);

        if (m.find()) {
            if (m.group(1).indexOf(SHARP) == 0) {
                int length = m.group(1).length();
                String content = m.group(2);
                String parsedString = EMPTY_STRING;
              parsedString =  String.format("<h%d>%s</h%d>\n",length,content,length);
              /*  parsedString = parsedString.concat("<h" + header.length() + ">").concat(m.group(2))
                        .concat(s = m.group(1).replaceAll(SHARP, EMPTY_STRING)).trim()
                        .concat("</h" + header.length() + "> \n");*/
                return TAB + parsedString;
            }

            return TAB + m.group(2) + "\n";
        } else {
            return null;
        }
    }

    public static String parseEmphasi(String s) {

        Pattern p = EMPHASI_PATTERN;
        Matcher m = p.matcher(s);
        if (m.find()) {

            return TAB + SIMPLE_START + m.group(1) + EMPHASI_START + m.group(3) + EMPHASI_END + m.group(5).trim() + SIMPLE_END;
        } else

            return EMPTY_STRING;
    }

    public static String parseStrong(String s) {

        Pattern p = STRONG_PATTERN;
        Matcher m = p.matcher(s);
        if (m.find()) {

            return TAB + SIMPLE_START + m.group(1) + STRONG_START + m.group(3) + STRONG_END + m.group(5).trim() + SIMPLE_END;
        } else

            return null;
    }

    public static String parseURL(String s) {

        Pattern p = URL_PATTERN;
        Matcher m = p.matcher(s);
        if (m.find()) {

            return TAB + SIMPLE_START + m.group(1) + URL_START + m.group(6) + "\">" + m.group(3) + URL_END + m.group(8).trim() + SIMPLE_END;
        } else

            return null;
    }

    public static String getHTMLEnd() {

        return HTML_END.concat(BODY_END);

    }
}
