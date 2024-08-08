package com.logical.test.soal;

public class SoalNo3 {
    public static void main(String[] args){
        int n = 10;
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n){
        int first = 0, second = 1;

        for (int i = 1; 1 <= n; i++) {
            System.out.println(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }
    }
}
