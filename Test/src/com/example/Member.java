package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class Member {

	int memberId;
	String name;
	// List<Integer> borrowedBooks = new ArrayList<Integer>();
	// List<Integer> borrowedBooks = new ArrayList<Integer>();
	List<Integer> borrowedBooks = new ArrayList<Integer>();

	public Member(int memberId, String name, List<Integer> borrowedBooks) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.borrowedBooks = borrowedBooks;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(Integer borrowedBooks) {
		// borrowedBooks = new ArrayList<Integer>();
		this.borrowedBooks.add(borrowedBooks);
		// this.borrowedBooks.add(borrowedBooks);
		// this.borrowedBooks = borrowedBooks;
	}

	public void showMember() {
		System.out.println(this.getMemberId() + " " + this.getName() + this.getBorrowedBooks());
		// this.borrowedBooks.stream().forEach(data->System.out.println(data.getBookId()));
	}

}
