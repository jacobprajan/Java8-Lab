package com.supplier1;

import java.util.function.Supplier;

// Length should be 8 characters
// 2, 4, 6, 8 place only digits
// 1, 3, 5 ,7 place only upper case alphabets or these symbols  @ # $

public class GetRandomPassword {

	public static void main(String[] args) {

		Supplier<String> s = () -> {

			String password = "";

			Supplier<Integer> d = () -> (int) (Math.random() * 10);

			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";

			Supplier<Character> c = () -> symbols.charAt((int) (Math.random() * 29));

			for (int i = 1; i <= 8; ++i) {
				if (i % 2 == 0) {
					password += d.get();
				} else {
					password += c.get();
				}

			}
			return password;
		};

		System.out.println(s.get());

	}

}
