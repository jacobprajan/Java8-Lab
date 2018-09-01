package com.userauth.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthUser {
	
	
	public static void main(String[] args) {
		
		Predicate<User> p = user -> user.getUserName().equals("Jakez") && user.getPassword().equals("java");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name : ");
		String username = sc.next();
		System.out.println("Enter password : ");
		String password = sc.next();
		sc.close();
		User user = new User(username, password);
		
		userAuth(user, p);
		
	}

	private static void userAuth(User user, Predicate<User> p) {
		if(p.test(user)) {
			System.out.println("Authentication success");
		} else {
			System.out.println("Authentication failed");
		}
		
	}

}
