package com.supplier1;

import java.util.function.Supplier;

// 6 digit password

public class GetRandomOTP {
	
	public static void main(String[] args) {
		
		Supplier<String> s = () -> {
			String otp = "";
			for(int i=0; i<6; ++i) {
				otp += (int) (Math.random() * 9);
			}
			return otp;			
		};
		
		System.out.println(s.get());
		
	}

}
