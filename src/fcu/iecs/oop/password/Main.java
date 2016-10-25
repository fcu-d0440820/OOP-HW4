package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		PasswordEncorder password1 = new PasswordEncorder();
		String password;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string:");
		password = scanner.nextLine();
		password = password1.encode(password);
		System.out.println("The string after encode:"+password);
	}

}
