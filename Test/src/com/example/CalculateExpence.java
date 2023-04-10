package com.example;

import java.io.*;
import java.util.*;

public class CalculateExpence {
	static ArrayList<Integer> information;

	static void houseRent() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter House Rent: ");
			String houseRent = input.nextLine();
			information.add(Integer.parseInt(houseRent));
		} catch (NumberFormatException e) {
			System.out.println("Enter valid number");
			houseRent();

		}
		// information.add(Integer.parseInt(house_rent));
		// return 0;
	}

	static void phoneBill() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Phone Bill: ");
			String phoneBill = input.nextLine();
			information.add(Integer.parseInt(phoneBill));
		} catch (NumberFormatException e) {
			System.out.println("Enter valid number");
			phoneBill();

		}
		// information.add(Integer.parseInt(house_rent));
		// return 0;
	}

	static void shoppingBill() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Shopping: ");
			String shoppingBill = input.nextLine();
			information.add(Integer.parseInt(shoppingBill));
		} catch (NumberFormatException e) {
			System.out.println("Enter valid number");
			shoppingBill();

		}
		// information.add(Integer.parseInt(house_rent));
		// return 0;
	}

	static void electricBill() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Electricity Bill: ");
			String electricBill = input.nextLine();
			information.add(Integer.parseInt(electricBill));
		} catch (NumberFormatException e) {
			System.out.println("Enter valid number");
			electricBill();

		}
		// information.add(Integer.parseInt(house_rent));
		// return 0;
	}

	static void waterBill() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Water Supply Bill: ");

			String waterBill = input.nextLine();
			information.add(Integer.parseInt(waterBill));
		} catch (NumberFormatException e) {
			System.out.println("Enter valid number");
			waterBill();

		}
		// information.add(Integer.parseInt(house_rent));
		// return 0;
	}

	static void gasBill() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Gas Bill: ");

			String gasBill = input.nextLine();
			information.add(Integer.parseInt(gasBill));
		} catch (NumberFormatException e) {
			System.out.println("Enter valid number");
			gasBill();

		}
		// information.add(Integer.parseInt(house_rent));
		// return 0;
	}

	public static void main(String[] args) {
		information = new ArrayList<>();
		houseRent();
		phoneBill();
		shoppingBill();
		electricBill();
		waterBill();
		gasBill();
		int sum = 0;
		for (int amount : information) {
			sum += amount;
		}
		System.out.println("Remaining Amount is " + (200000 - sum));

	}

}
