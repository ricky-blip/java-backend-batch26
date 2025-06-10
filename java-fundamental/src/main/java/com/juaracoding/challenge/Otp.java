package com.juaracoding.challenge;

public class Otp {
	public static void main(String[] args) {
		System.out.println("---------- OTP ----------");
		System.out.println("");
		String nomorHP = "0812123";
		System.out.println("Input Nomor HP: " + nomorHP);

		boolean isRegistered = false;

		boolean isOTPReceived = false;
		String validOTP = "123456";
		String inputOTP = "123456";

		if (!isRegistered){ //Jika Sudah Register
			System.out.println("Nomor HP / Email terdaftar");
			String fullName = "Ricky Rinaldy";
			System.out.println("Halo " + fullName);
			System.out.println("");

			if (!isOTPReceived) { //Jika dapat OTP
				System.out.println("OTP anda adalah " + "|" + validOTP + "|");
				System.out.println("");
				System.out.println("Input OTP: " + inputOTP);

				boolean isOTPValid = inputOTP.equalsIgnoreCase(validOTP); //cek inputOTP SamaDengan validOTP

				if (isOTPValid) { //jika isOTPValid True
					System.out.println("OTP valid");
					System.out.println("");
					System.out.println("Return Landing Page");
					System.out.println("Welcome back, " + fullName);
					System.out.println("----- END -----");
				} else { //jika isOTPValid False
					System.out.println("OTP tidak valid");
				}

			} else { //Tidak dapat OTP
				System.out.println("Kirim ulang OTP");
			}

		} else { //Belum Register
			System.out.println(" --- X Nomor HP / Email belum terdaftar X --- ");
		}

	}
}
