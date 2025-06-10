package com.juaracoding;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		//Cara 1
		int[] prices = {20000,20000,30000,10000,20000};
		System.out.println(prices[3]);
		//Cara 2
		int[] harga = new int[3];
		harga[0] = 20_000;
		harga[1] = 11_000;
		harga[2] = 40_000;
		harga[1] = 15_000; //ubah nilai index 1
		System.out.println(harga[2]);
		//looping array
		System.out.println("-----Looping Array-----");
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		System.out.println();
		int no = 0;
		for (int hargas : harga) {
			System.out.println(no+ "."+ hargas);
			no++;
		}
		System.out.println();
		System.out.println("Input data Cars");
//		int jmlData =  5;
//		String[] cars = new String[jmlData];
//		Scanner input = new Scanner(System.in);
//		// Input
//		for (int i = 0; i < jmlData; i++) {
//			System.out.print("Masukkan nama mobil" + ": ");
//			cars[i] = input.next();
//		}
//
//		// Output List
//		System.out.println("\nData mobil yang dimasukkan: ");
//		for (int i = 0; i < jmlData; i++) {
//			System.out.println("Mobil " + ": " + cars[i].toUpperCase());
//		}
//
//		input.close();
		System.out.println();
		int total = 0;
		for (int price : prices) {
			total += price;
		}

		double totalFinal  = 0;
		if (total >= 100000) {
			//totalFinal = total * 0.05;
			totalFinal = total;
			System.out.println(totalFinal);
			System.out.println("Yay, Dapat Diskon 5%");
		} else {
			totalFinal = total;
			System.out.println(totalFinal);
			System.out.println("tidak dapat Diskon 5%");
		}
		//
		System.out.println("------------------------------");
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

		for (int i = 0; i < myNumbers.length; i++) { //looping jumlah arraynya ada 2
			for (int j = 0; j < myNumbers[i].length; j++) { //looping value dari 2 arraynya
				System.out.println(myNumbers[i][j]);
			}
		}
		System.out.println("Sorting");
		System.out.println("------------------------------");
		int[] prices2 = {20000,20000,30000,10000};
		int search = 10000;
		boolean isFound = false;
		for (int i = 0; i < prices2.length; i++) {
			if (prices2[i] == search) {
				 isFound = true;
			}
			//
			if (isFound){
				System.out.println("Ditemukan di indeks: " + i);
			}else {
				System.out.println("data tidak ditemukan");
			}
		}
		System.out.println("------------------------------");
		String[] cities = {"Jakarta", "Bandung", "Bali", "Palembang"};
		String nilaiTerpanjang = "";

		for (int i = 0; i < cities.length; i++) {
			if (cities[i].length() > nilaiTerpanjang.length()) {
				nilaiTerpanjang = cities[i];
			}
		}

		System.out.println("Kata terpanjang: " + nilaiTerpanjang + " (" + nilaiTerpanjang.length() + " huruf)");
		System.out.println("------------------------------");
	}

//		Arrays.sort(prices);
//		for(int price : prices){}
//		System.out.println(price);
//		}
//		Arrays.sort(cities, Collections.reverse0rder());
//		for(String city : cities){
//			System.out.println(city) ;
//		}
}
