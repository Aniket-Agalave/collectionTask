package com.TKA.task;

import java.util.Scanner;

public class ProductUtility {
	static Scanner sc = new Scanner(System.in);

	public static Product preapareProduct() {
		System.out.println("enter product id");
		int id = sc.nextInt();

		System.out.println("enter product name");
		String name = sc.next();

		System.out.println("enter product QTY");
		int qty = sc.nextInt();

		System.out.println("enter product price");
		double price = sc.nextDouble();

		System.out.println("enter product MFG date");
		String mfgDate = sc.next();

		System.out.println("enter product exp date");
		String expDate = sc.next();

		Product product = new Product(id, name, qty, price, mfgDate, expDate);

		return product;
	}
}
