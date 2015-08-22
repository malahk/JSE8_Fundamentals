package ua.oracle.academy;

public class MarkDownParserMain {

	public static void main(String[] args) 
	{
		String s = "##Header line \\n\\n Simple line *with* em \\n\\n Simple line **with** strong \\n\\n Line with link [Link to google](https://www.google.com) in center";

//		System.out.println(MarkDownParser.Parser("##Header line \n\n Simple line *with* em \n\n Simple line **with** strong \n\n Line with link [Link to google](https://www.google.com) in center \n\n just (u) in text"));
//		System.out.println(MarkDownParser.getParagraph("##Header line \n Simple line *with* em \n Simple **line** with strong \n Line with link [Link to google](https://www.google.com) in center\n Simple line *with123* em"));
//		System.out.println(MarkDownParser.getHTMLStart(""));
//		System.out.println(MarkDownParser.createHeader("Header line"));
//		System.out.println(MarkDownParser.parseEmphasi2("Simple line *with* em"));
//		System.out.println(MarkDownParser.parseStrong("Simple **line** with strong"));
//		System.out.println(MarkDownParser.parseURL("Line with link [Link to google](https://www.google.com) in center"));
//		System.out.println(MarkDownParser.getHTMLEnd(""));

		System.out.println(MarkDownParserREGEX.parser(s));
//		System.out.println(MarkDownParserREGEX.getHTMLStart(s));
//		System.out.println(MarkDownParserREGEX.createHeader(s));
//		System.out.println(MarkDownParserREGEX.parseEmphasi(s));
//		System.out.println(MarkDownParserREGEX.parseStrong(s));
//		System.out.println(MarkDownParserREGEX.parseURL(s));
//		System.out.println(MarkDownParserREGEX.getHTMLEnd(s));

	}

}
