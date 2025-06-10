package com.juaracoding;

import java.awt.*;

public class Passing {
	public static void main(String[] args) {
		//passsing by value
		int umur = 81;
		int duplikatUmur = umur;
		duplikatUmur = 1308;

		System.out.println(umur);
		System.out.println(duplikatUmur);

		//passsing by references
		Rectangle kotak = new Rectangle((int) 20.0, (int) 30.0);
		Rectangle duplikatKotak = kotak;

		duplikatKotak.setSize((int) 80.0, (int) 90.0);

		System.out.println(kotak.getSize());
		System.out.println(duplikatKotak.getSize());

		System.out.println(kotak);

	}

}
