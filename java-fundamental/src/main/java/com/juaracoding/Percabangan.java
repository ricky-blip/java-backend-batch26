package com.juaracoding;

public class Percabangan {
	public static void main(String[] args) {
		if (false){
			System.out.println("Statement");
		}

		System.out.println("Next Statement");

		int amount = 1;
		int stock = 2;
		if (amount < 0){
			System.out.println("Valid Input");
		}  else {
			System.out.println("Minimal pembelian produk ini adalah 1 barang");
		}

		int userInput = 2;
		if (userInput <= stock){
			System.out.println("Valid Input");
		} else {
			System.out.println("Maximal Pembelian " + stock);
		}

		//else if
		//ekonomis = 5000, regular 15000, express = 20000, instant = 25000
		System.out.println("---------- Jenis Ekspedisi ----------");
		String ekonomis = "5.000";
		String regular = "15.000";
		String express = "20.000";
		String instant = "25.000";

		String jenisEkspedisi = "regular";

		if (jenisEkspedisi.equalsIgnoreCase("Regular")){
			System.out.println("Ongkir " + jenisEkspedisi + " " + "Rp." + regular);
		} else if (jenisEkspedisi == "Ekonomis") {
			System.out.println("Ongkir " + jenisEkspedisi + " " + "Rp." + ekonomis);
		} else if (jenisEkspedisi == "Express") {
			System.out.println("Ongkir " + jenisEkspedisi + " " + "Rp." + express);
		} else if (jenisEkspedisi == "Instant") {
			System.out.println("Ongkir " + jenisEkspedisi + " " + "Rp." + instant);
		} else {
			System.out.println("Ongkir 50.000");
		}

		switch (jenisEkspedisi.toLowerCase()) {
			case "Regular":
				System.out.println("Ongkir " + jenisEkspedisi + " Rp." + regular);
				break;
			case "Ekonomis":
				System.out.println("Ongkir " + jenisEkspedisi + " Rp." + ekonomis);
				break;
			case "Express":
				System.out.println("Ongkir " + jenisEkspedisi + " Rp." + express);
				break;
			case "Instant":
				System.out.println("Ongkir " + jenisEkspedisi + " Rp." + instant);
				break;
			default:
				System.out.println("Ongkir 50.000");
				break;
		}

	}
}
