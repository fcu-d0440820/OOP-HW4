package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		tiida tiida1 = new tiida()
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		number = scanner.nextLine();
		int i;
		for(i=0;i<number;i++){
			tiida1.tiida();
		}
	}

}
