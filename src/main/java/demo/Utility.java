package demo;

public class Utility {
	
	public static String cleanXmlString(String xmlString)
	{
		if(xmlString.isEmpty() || xmlString == null)
			return "";
		
		return xmlString.replace("<![CDATA[", "")
				         .replace("&lt;", "<")
				         .replace("&gt;",">")
				         .replace("]]>", "");
		
	}

}
