package com.TKA.task;

import java.util.ArrayList;
import java.util.List;

public class ProductOperation {

	List<Product> list = new ArrayList<Product>();

	public String addProduct(Product product) {

		list.add(product);
		return "Product addes successfully !";
	}

	public Object getAllProduct() {
		try {
			if (list.isEmpty()) {
				return "Product not exist";
			} else {
				return list;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return "something went wrong";
		}
	}

	public Object getProduct(String productName) {
		for (Product product : list) {
			if (product.getProductName().equals(productName)) {
				return product;
			}
		}
		return "product not exist";

	}
}
