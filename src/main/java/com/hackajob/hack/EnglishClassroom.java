package com.hackajob.hack;

import java.util.HashMap;
import java.util.Map;

public class EnglishClassroom {

    public static String run(boolean morseToEnglish, String textToTranslate) {
        Map<String, String> englishToMorse = new HashMap<>();
        englishToMorse.put("A", ".-");
        englishToMorse.put("B", "-...");
        englishToMorse.put("C", "-.-.");
        englishToMorse.put("D", "-..");
        englishToMorse.put("E", ".");
        englishToMorse.put("F", "..-.");
        englishToMorse.put("G", "--.");
        englishToMorse.put("H", "....");
        englishToMorse.put("I", "..");
        englishToMorse.put("J", ".---");
        englishToMorse.put("K", "-.-");
        englishToMorse.put("L", ".-..");
        englishToMorse.put("M", "--");
        englishToMorse.put("N", "-.");
        englishToMorse.put("O", "---");
        englishToMorse.put("P", ".--.");
        englishToMorse.put("Q", "--.-");
        englishToMorse.put("R", ".-.");
        englishToMorse.put("S", "...");
        englishToMorse.put("T", "-");
        englishToMorse.put("U", "..-");
        englishToMorse.put("V", "...-");
        englishToMorse.put("W", ".--");
        englishToMorse.put("X", "-..-");
        englishToMorse.put("Y", "-.--");
        englishToMorse.put("Z", "--..");

        Map<String, String> morseToEnglishMap = new HashMap<>();
        morseToEnglishMap.put(".-", "A");
        morseToEnglishMap.put("-...", "B");
        morseToEnglishMap.put("-.-.", "C");
        morseToEnglishMap.put("-..", "D");
        morseToEnglishMap.put(".", "E");
        morseToEnglishMap.put("..-.", "F");
        morseToEnglishMap.put("--.", "G");
        morseToEnglishMap.put("....", "H");
        morseToEnglishMap.put("..", "I");
        morseToEnglishMap.put(".---", "J");
        morseToEnglishMap.put("-.-", "K");
        morseToEnglishMap.put(".-..", "L");
        morseToEnglishMap.put("--", "M");
        morseToEnglishMap.put("-.", "N");
        morseToEnglishMap.put("---", "O");
        morseToEnglishMap.put(".--.", "P");
        morseToEnglishMap.put("--.-", "Q");
        morseToEnglishMap.put(".-.", "R");
        morseToEnglishMap.put("...", "S");
        morseToEnglishMap.put("-", "T");
        morseToEnglishMap.put("..-", "U");
        morseToEnglishMap.put("...-", "V");
        morseToEnglishMap.put(".--", "W");
        morseToEnglishMap.put("-..-", "X");
        morseToEnglishMap.put("-.--", "Y");
        morseToEnglishMap.put("--..", "Z");

        StringBuilder translatedText = new StringBuilder();


        if (!morseToEnglish) {
            String[] englishWords  = textToTranslate.split("  ");
            for (String englishWord : englishWords) {
                String[] word = englishWord.split(" ");
                for (String s : word) {
                    translatedText.append(morseToEnglishMap.get(s));
                }
                translatedText.append(" ");

            }

        } else {
            for (int i = 0; i < textToTranslate.length(); i++) {
                String letter = String.valueOf(textToTranslate.charAt(i)).toUpperCase();
                if (!letter.isBlank() && englishToMorse.containsKey(letter)) {
                    translatedText.append(englishToMorse.get(letter)).append(" ");
                } else {
                    translatedText.append("  ");
                }
            }

        }


        return translatedText.toString();
    }

    public static void main(String[] args) {
        System.out.println(run(true, "The wizard quickly jinxed the gnomes before they vaporized."));
    }
}
