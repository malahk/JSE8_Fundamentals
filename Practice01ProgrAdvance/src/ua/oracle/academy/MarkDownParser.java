package ua.oracle.academy;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarkDownParser implements Parseable {

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
	private static final String TAB = "\t";
	private static final String SHARP = "#";
	private static final String EMPTY_STRING = "";

	@Override
	public void parse() {
		System.out.println();
	}

	public MarkDownParser() {

	}

	public static String Parser(String s) {
		String[] parsedArray = getParagraph(s);
		for (int index = 0; index < parsedArray.length; ++index) {
			//System.out.println(index + "  :");
			s = parsedArray[index];
			//System.out.println("orig: " + s);
			if (s.charAt(0) == '#') {
				s = createHeader(s);
			} else {
				s = addParagraph(s);
			}
			//System.out.println("headrer: " + s);
			s = parseEmphasi2(s);
			//System.out.println("emphati: " + s);
			s = parseStrong(s);
			//System.out.println("strong: " + s);
			s = parseURL(s);
			//System.out.println("url: " + s);
			parsedArray[index] = s;

			//System.out.println("result: " + s);
		}

		return Arrays.toString(parsedArray);

	}

	public static String[] getParagraph(String s) {
		String[] parsedArray = s.split("\n");
		String parsedStringTemp = EMPTY_STRING;
		for (int i = 0; i < parsedArray.length; ++i) {
			parsedStringTemp += parsedArray[i].trim() + "\n";
		}
		
		return parsedStringTemp.split("\n{2,}");
		
	}
	public static String addParagraph(String s) {
		
		return SIMPLE_START + s + SIMPLE_END;
	}

	public static String getHTMLStart(String s) {
		String tempString = EMPTY_STRING;
		tempString = tempString.concat(HTML_START).concat(BODY_START);
		return tempString;

	}

	public static String getHTMLEnd(String s) {
		String tempString = EMPTY_STRING;
		tempString = tempString.concat(HTML_END).concat(BODY_END);
		return tempString;

	}

	public static String createHeader(String s) {
		if (s.indexOf(SHARP) == 0) {
			String[] header = new String(s.substring(s.indexOf(SHARP),
					s.lastIndexOf(SHARP) + 1)).split(EMPTY_STRING);
			String parsedString = EMPTY_STRING;
			parsedString = parsedString.concat("<h" + header.length + ">")
					.concat(s = s.replaceAll(SHARP, EMPTY_STRING)).trim()
					.concat("</h" + header.length + "> \n");
			return TAB + parsedString;
		} else {
			return EMPTY_STRING;
		}
	}

	public static String parseURL(String s) {
		String[] parsedArray = s.split("\\)");
		String textURL;
		String url = EMPTY_STRING;
		String subLine;
		String result = EMPTY_STRING;
		Integer startPosition;

		for (int subPosition = 0; subPosition < parsedArray.length; ++subPosition) {
			subLine = parsedArray[subPosition];

			if (subPosition == parsedArray.length - 1 && s.charAt(s.length() - 1) != ')') {
				result += subLine;
				break;
			}

			startPosition = 0;
			textURL = EMPTY_STRING;

			for (int position = 0; position < subLine.length(); ++position) {
				if ('[' == subLine.charAt(position)) {
					startPosition = position;
					textURL = subLine.substring(subLine.indexOf('[') + 1, subLine.indexOf(']'));
				} else if ('(' == subLine.charAt(position)) {
					startPosition = startPosition > 0 ? startPosition : position;
					url = subLine.substring(subLine.indexOf('(') + 1, subLine.length());
				} else {
					continue;
				}
			}

			result += subLine.substring(0, startPosition)
					+ "<a href=\"" + url + "\">" + (textURL.isEmpty() ? url : textURL) + "</a>";
		}

		return result;
	}

	public static String parseEmphasi(String s) {
		String emphasiText = s;
		Integer lastEntry = 0;
		for (int position = 0; position < s.length(); ++position) {
			if ('*' == s.charAt(position)) {
				emphasiText = s.substring(position + 1);
				emphasiText = emphasiText
						.substring(0, emphasiText.indexOf('*'));
				position += emphasiText.length() + 1;
			} else
				continue;
		}

		return TAB + emphasiText;
	}

	public static String parseEmphasi2(String s) {
		String emphasiText = s;
		Integer endPosition = -1;
		Integer startPosition = 0;

		while ((startPosition = s.substring(endPosition + 1).indexOf('*')) >= 0) {
			startPosition += endPosition + 1;
			if ((endPosition = s.substring(startPosition + 1).indexOf('*')) == -1) {
				break;
			}
			endPosition += startPosition + 1;
			emphasiText = s.substring(0, startPosition).concat(EMPHASI_START)
					+ s.substring(startPosition + 1, endPosition).concat(
							EMPHASI_END) + s.substring(endPosition + 1);

		}

		return TAB + emphasiText;
	}

	public static String parseStrong(String s) {
		String strongText = s;
		Integer startPosition = 0;
		Integer endPosition = -2;
		while ((startPosition = parseStrong1(s.substring(endPosition + 2))) > -1) {
			startPosition += endPosition + 2;
			if ((endPosition = parseStrong1(s.substring(startPosition + 2))) == -1) {
				break;
			}
			endPosition += startPosition + 2;
			strongText = s.substring(0, startPosition).concat(STRONG_START)
					+ s.substring(startPosition + 2, endPosition).concat(
							STRONG_END) + s.substring(endPosition + 2);
		}

		return TAB + strongText;
	}

	public static Integer parseStrong1(String s) {
		Integer startPosition = s.indexOf('*');
		char secondAsterix = '*';
		while (startPosition != -1) {
			if (s.charAt(startPosition + 1) == secondAsterix) {
				return startPosition;
			}
		}

		return -1;
	}

}
