package com.bmeurer05.morseTranslator;

import java.util.HashMap;
import java.util.ArrayList;

public class MorseTranslator {
	
	private final HashMap<String, String> morseToText;
	private final HashMap<String, String> textToMorse;
	
	public MorseTranslator() {
		morseToText = new HashMap<String, String>();
		morseToText.put(".-", "A");
        morseToText.put("-...", "B");
        morseToText.put("-.-.", "C");
        morseToText.put("-..", "D");
        morseToText.put(".", "E");
        morseToText.put("..-.", "F");
        morseToText.put("--.", "G");
        morseToText.put("....", "H");
        morseToText.put("..", "I");
        morseToText.put(".---", "J");
        morseToText.put("-.-", "K");
        morseToText.put(".-..", "L");
        morseToText.put("--", "M");
        morseToText.put("-.", "N");
        morseToText.put("---", "O");
        morseToText.put(".--.", "P");
        morseToText.put("--.-", "Q");
        morseToText.put(".-.", "R");
        morseToText.put("...", "S");
        morseToText.put("-", "T");
        morseToText.put("..-", "U");
        morseToText.put("...-", "V");
        morseToText.put(".--", "W");
        morseToText.put("-..-", "X");
        morseToText.put("-.--", "Y");
        morseToText.put("--..", "Z");
        morseToText.put("/", " "); 
        
        textToMorse = new HashMap<String, String>();
        textToMorse.put("A", ".-");
        textToMorse.put("B", "-...");
        textToMorse.put("C", "-.-.");
        textToMorse.put("D", "-..");
        textToMorse.put("E", ".");
        textToMorse.put("F", "..-.");
        textToMorse.put("G", "--.");
        textToMorse.put("H", "....");
        textToMorse.put("I", "..");
        textToMorse.put("J", ".---");
        textToMorse.put("K", "-.-");
        textToMorse.put("L", ".-..");
        textToMorse.put("M", "--");
        textToMorse.put("N", "-.");
        textToMorse.put("O", "---");
        textToMorse.put("P", ".--.");
        textToMorse.put("Q", "--.-");
        textToMorse.put("R", ".-.");
        textToMorse.put("S", "...");
        textToMorse.put("T", "-");
        textToMorse.put("U", "..-");
        textToMorse.put("V", "...-");
        textToMorse.put("W", ".--");
        textToMorse.put("X", "-..-");
        textToMorse.put("Y", "-.--");
        textToMorse.put("Z", "--..");
        textToMorse.put(" ", "/");
	}
	
	public String translateTextToMorse(String text) { 
		text = text.toUpperCase();
		char[] charactersArray = text.toCharArray();
		String[] stringArray = charArrayToString(charactersArray, charactersArray.length);
		String translated = "";
		
		for(int i = 0; i < charactersArray.length; i++) {
			System.out.print(textToMorse.get(stringArray[i]) + " ");
			translated += textToMorse.get(stringArray[i]) + " ";
		}
		
		return translated;
	}
	
	private String[] charArrayToString(char[] charArray, int arrayLenght) {
		String[] stringArray = new String[arrayLenght];
		for(int i = 0; i < charArray.length; i++) {
			stringArray[i] = String.valueOf(charArray[i]);
		}
		return stringArray;
	}
	
//	public String translateMorseToText(String text) {
//		
//		return null;
//	}
	
}
