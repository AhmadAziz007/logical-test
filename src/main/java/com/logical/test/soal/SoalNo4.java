package com.logical.test.soal;

import java.util.Scanner;

public class SoalNo4 {

    public static void main(String[] args) {
        /**
        int[] prices1 = {7, 8, 3, 10, 8};
        int[] prices2 = {5, 12, 11, 12, 10};
        int[] prices3 = {7, 18, 27, 10, 29};
        int[] prices4 = {20, 17, 15, 14, 10};
        int[] prices5 = {10, 9, 6, 5, 15};

        System.out.println("Input 1: " + getBestStockPrice(prices1));
        System.out.println("Input 2: " + getBestStockPrice(prices2));
        System.out.println("Input 3: " + getBestStockPrice(prices3));
        System.out.println("Input 4: " + getBestStockPrice(prices4));
        System.out.println("Input 5: " + getBestStockPrice(prices5));
        **/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah harga saham: ");
        String input = scanner.nextLine();

        input = input.replace("[", "").replace("]", "");

        String[] inputArray = input.split("[,\\s]+");
        int[] prices = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            prices[i] = Integer.parseInt(inputArray[i]);
        }

        int bestBuyPrice = getBestStockPrice(prices);

        if (bestBuyPrice == 0 && prices.length > 1 ) {
            System.out.println("Tidak ada keutungan yang dapat diperoleh dari harga saham yang diberikan.");
        } else {
            System.out.println("Harga beli saham dengan keuntungan terbaik adalah: " + bestBuyPrice);
        }
        scanner.close();
    }

    public static int getBestStockPrice(int[] prices){
        if (prices == null || prices.length < 2 ) {
            throw new IllegalArgumentException("Array harus memiliki setidaknya dua element.");
        }

        int minPrice = prices[0];
        int maxProfit = 0;
        int bestBuyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
                bestBuyPrice = minPrice;
            }

            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        ///return bestBuyPrice;
        return maxProfit > 0 ? bestBuyPrice : 0;
    }
}
