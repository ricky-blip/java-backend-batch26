package com.juaracoding;

import java.text.DecimalFormat;

public class Operator {
	public static void main(String[] args) {
		int amount = 2;
		long price = 10_000_000;
		long subtotal = amount * price;
		System.out.println(subtotal);
		//jika hasilnya 2.0E7 pakai di bawah ini
//		DecimalFormat df = new DecimalFormat("#");
//		System.out.println(df.format(subtotal));
//		System.out.printf("Subtotal = %.2f%n", subtotal);

		int x = 2;
		int num1 = 10 * x++; //suffix
		System.out.println(num1);

		int y = 2;
		int num2 = 10 * ++y; //prefix
		System.out.println(num2);

		int modulus = 5 % 2;
		System.out.println(modulus);

		int modulus2 = 12 % 3;
		System.out.println(modulus2);

		int num = (5 + 3) * 5;
		System.out.println(num);

		int a = 10;
		a += 5; // a = a + 5
		System.out.println(a);


	}
}
