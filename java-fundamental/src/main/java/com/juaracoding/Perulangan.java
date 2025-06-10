package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			System.out.println(i);
		}
		System.out.println("Next Statement");

		// 1 3 5 7 9
		//		for (int i = 0; i < 10; i++){
		//			System.out.println(i);
		//		}

		for (int i = 1; i < 10; i+=2){
			System.out.println(i);
		}

		//		for (int i = 1; i < 10; i++) {
		//			if (i % 2 != 0) {
		//				System.out.println(i);
		//			}
		//		}

		//		for (int i = 1; i < 10; i++) {
		//			if (i % 2 == 0) continue;
		//			System.out.println(i);
		//		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		int tinggi = 5;
		for (int i = 0; i <= tinggi; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int j = tinggi; j >= 0; j--) {
			for (int k = 0; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--- WHILE ---");
		int x = 0;
		while (x < 5){
			System.out.println(x);
			x++;
		}

		System.out.println("--- DO WHILE ---");
		int y = 1;
		do {
			System.out.println(y);
			y++;
		} while (y < 5);
			System.out.println();
		System.out.println("--- BREAK ---");

		System.out.println("------------------------------------------------");
		String PIN_YANG_BENAR = "1234";
		int max3 = 3;
		boolean isBlocked = false;

		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= max3; i++) {
			System.out.print("Masukkan PIN: ");
			String inputPin = scanner.next();

			if (inputPin.equalsIgnoreCase(PIN_YANG_BENAR)) {
				System.out.println("Login berhasil!");
				break;
			} else {
				if (i == max3) {
					isBlocked = true;
					System.out.println("Akun diblokir sementara");
				} else {
					System.out.println("PIN salah. Percobaan tersisa: " + (max3 - i));
				}
			}
		}

		scanner.close();

		System.out.println("--- CONTINUE ---");
		int item = 0;
		int sum = 0;
		while(item<5) {
			item++;
			if(item == 4) {
				System.out.println("Ini yang terlompati "+item);
				continue;
			}
			sum += item;
			System.out.println("1 kali loop ke "+item);
		}
		System.out.println(sum);
	}
}
