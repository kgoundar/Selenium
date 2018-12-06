package newpackage;

import java.util.Scanner;

public class Compare {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First String:");
			String first = sc.nextLine();
			System.out.println("Enter Second String:");
			String second = sc.nextLine();
			sc.close();

			System.out.println(first.compareTo(second));

			System.out.println(first.compareToIgnoreCase(second));

		}

}
