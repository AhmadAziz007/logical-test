package com.logical.test.soal;

public class SoalNo1 {
    public static void main(String[] args){
        String sentence1 = "italem irad irigayaj";
        String sentence2 = "iadab itsap ulalreb";
        String sentence3 = "nalub kusutret gnalali";

        System.out.println(reverseWords(sentence1));
        System.out.println(reverseWords(sentence2));
        System.out.println(reverseWords(sentence3));
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
        }

        return reversedSentence.toString().toString().trim();
    }
}
