package com.juaracoding.praktikum;

import java.util.Random;

public class Praktikum3 {

	private static final char[] VOKAL = {'a', 'e', 'i', 'o', 'u'};
	private static final char[] KONSONAN = {
			'b','c','d','f','g','h','j','k','l','m',
			'n','p','q','r','s','t','v','w','x','y','z'
	};

	public static void main(String[] args) {
		Random rand = new Random();

		// Jumlah karakter random antara 12 sampai 25
		int panjang = rand.nextInt(14) + 12; // 12 - 25

		StringBuilder sb = new StringBuilder();

		char firstChar = (rand.nextBoolean()) ? getRandomVokal(rand) : getRandomKonsonan(rand);
		sb.append(Character.toUpperCase(firstChar));

		boolean harusVokal = !isVokal(firstChar);

		for (int i = 1; i < 7 && i < panjang; i++) {
			if (harusVokal) {
				sb.append(getRandomVokal(rand));
			} else {
				sb.append(getRandomKonsonan(rand));
			}
			harusVokal = !harusVokal;
		}

		while (sb.length() < panjang) {
			sb.append(getRandomChar(rand));
		}

		System.out.println("Output\t: " + sb.toString());
	}

	private static boolean isVokal(char c) {
		return "aeiou".indexOf(Character.toLowerCase(c)) >= 0;
	}

	private static char getRandomVokal(Random rand) {
		return VOKAL[rand.nextInt(VOKAL.length)];
	}

	private static char getRandomKonsonan(Random rand) {
		return KONSONAN[rand.nextInt(KONSONAN.length)];
	}

	private static char getRandomChar(Random rand) {
		if (rand.nextBoolean()) {
			return getRandomVokal(rand);
		} else {
			return getRandomKonsonan(rand);
		}
	}
}
