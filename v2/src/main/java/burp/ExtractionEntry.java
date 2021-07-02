package burp;

public class ExtractionEntry {
	IBurpExtenderCallbacks callbacks;
	String name, extractionmsgID;
	String startString, stopString, selectedText, isUrldecode, value;
	
	public ExtractionEntry(IBurpExtenderCallbacks callbacks, String name, String extractionmsgID) {
		this.callbacks = callbacks;
		this.name = name;
		this.extractionmsgID = extractionmsgID;
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public String getextractionmsgID() {
		return this.extractionmsgID;
	}
	
	 
	
	
}
