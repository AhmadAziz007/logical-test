package com.logical.test.soal;

import java.util.Scanner;

public class SoalNo5 {
    public static void main(String[] args){

        String[] array1 = {"b", "7", "h", "6", "h", "k", "i", "5", "g", "7", "8"};
        int count1 = countNumbers(array1);
        System.out.println("Jumlah angka pada array 1: " + count1);

        String[] array2 = {"b", "7", "h", "6", "h", "k", "i", "5", "g", "7", "8"};
        int count2 = countNumbers(array2);
        System.out.println("Jumlah angka pada array 2: " + count2);

        String[] array3 = {"b", "7", "h", "6", "h", "k", "i", "5", "g", "7", "8"};
        int count3 = countNumbers(array3);
        System.out.println("Jumlah angka pada array 3: " + count3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan elemen array");
        String input = scanner.nextLine();

        input = input.replace("[", "").replace("]", "");

        String[] inputArray = input.split("[,\\s]+");

        int count = countNumbers(inputArray);

        System.out.println("Jumlah angka dalam array adalah: " + count);

        scanner.close();
    }

    public static int countNumbers(String[] array){
        int count = 0;

        for (String element : array) {
            if (isNumeric(element)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isNumeric(String str) {
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
