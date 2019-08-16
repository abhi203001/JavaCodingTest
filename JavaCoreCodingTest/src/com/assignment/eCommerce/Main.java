package com.assignment.eCommerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Customers> customers = new ArrayList<>();
	static ArrayList<Order> orders = new ArrayList<Order>();
	static ArrayList<Products> products = new ArrayList<Products>();

	public static void registerCustomer(Customers c) {

		System.out.println("Enter the customer Name");

		Scanner sc = new Scanner(System.in);
		String cname = sc.next();
		c.setCname(cname);

		System.out.println("Enter the email address");
		String email = sc.next();
		c.setEmail(email);

		System.out.println("Enter the password");
		String password = sc.next();
		c.setPasword(password);

		customers.add(c);

		System.out.println("Customer Added Successfully");

	}

	public static void createProduct(Products p) {

		System.out.println("Enter Product Name");
		Scanner sc = new Scanner(System.in);
		String pname = sc.next();
		p.setProductName(pname);

		System.out.println("Enter Product Price");
		double productPrice = sc.nextDouble();
		p.setPrice(productPrice);

		products.add(p);

		System.out.println("Products created successfully");

	}

	public static void createOrder(Order o) {
		Scanner sc = new Scanner(System.in);
		Customers c = new Customers();
		System.out.println("Enter ORDERID");
		int orderId = sc.nextInt();
		o.setOrderId(orderId);
		
		System.out.println("Customer Name : ");
		String cname = sc.next();

		o.setCustomerName(cname);
		
		System.out.println("Enter the Product you want to order");
		String productNameToBeOrdered = sc.next();
		o.setProductNameToBeOrdered(productNameToBeOrdered);

		orders.add(o);

	}

	public static void viewOrders() {

		for (Order o : orders) {
			System.out.print(o.getOrderId()+" "+o.getProductNameToBeOrdered() + " " + o.getCustomerName() );
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customers c = new Customers();
		Order o = new Order();
		Products p = new Products();

		boolean flag = true;
		do {
			System.out.println("Press 1 for Register a Customer");
			System.out.println("Press 2 for Create a Product");
			System.out.println("Press 3 for Create an Order");
			System.out.println("Press 4 View Orders");
			System.out.println("Press 5 for Exit");

			switch (sc.nextInt()) {
			case 1:
				registerCustomer(c);
				break;
			case 2:
				createProduct(p);
				break;
			case 3: System.out.println("Enter email");	
					String email = sc.next();
					System.out.println("Enter Password");
					String pass = sc.next();
					boolean valid =true;
					for(Customers c1 : customers) {
						if((c1.getEmail()).equals(email) && (c1.getPasword()).equals(email)) {
							createOrder(o);
							valid = false;
							break;
						}
					}
					if(!valid)
						System.out.println("Invalid credentials");
				break;
			case 4:
				viewOrders();
				break;
			case 5:
				flag = false;
			}
		} while (flag);

	}
}

/*
 * Workflow Example: 1. Register a Customer 2. Create a Product 3. Create an
 * Order i) A customer needs to log in with valid credentials. ii) Display the
 * list of products with their name and price iii) A customer can select
 * multiple products in his cart iv) Perform checkout (Calculate the total
 * amount and collect the delivery details) 4. View orders 5. Exit
 */
