package javainterviewprogram;

public class StringChangePosition {
	public static void main(String[] arg) {
	    StringBuffer phrase = new StringBuffer("Genpact headstrong marketing limited");
	    String substring = "headstrong";
	    String replacement = "limited";
	    int position = phrase.lastIndexOf(substring); // Find start of "two"
	    
	    phrase.replace(position, position + substring.length(), replacement);
	    
	    
	    System.out.println(phrase);
	  }

	}
	

