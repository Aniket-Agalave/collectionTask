package com.TKA.task;

import java.util.List;
import java.util.Scanner;

public class TestProduct {
	public static void main(String[] args) {

		ProductOperation operation = new ProductOperation();
        System.out.println(" this is cahnges made by me");
        System.out.println(" new changes");
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. to add product");
			System.out.println("2. get specific product");
			System.out.println("3. get all product");
			System.out.println("0. to terminate application");

			System.out.println("enter your choice");
			choice = sc.nextInt();

			switch (choice) {

			case 0: {
				choice = 0;
				break;
			}
			case 1: {
				Product product = ProductUtility.preapareProduct();
				String msg = operation.addProduct(product);
				System.out.println(msg);
				break;
			}
			case 2: {
				String productName = sc.next();
				Object product = operation.getProduct(productName);
				System.out.println(product);

				break;
			}
			case 3: {
				Object allProduct = operation.getAllProduct();
				if (allProduct instanceof String) {
					System.out.println(allProduct);
				} else {
					List<Product> list = (List<Product>) allProduct;
					for (Product product : list) {
						System.out.println(product);
					}
				}
			}
			default:
				choice = 0;
			}

		} while (choice != 0);

	}
}
