package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class HotelRoom {
	String roomName;

	int roomNumber;
	boolean booking_status;
	private static List<HotelRoom> roomList = new ArrayList<HotelRoom>();

	public HotelRoom(int roomNumber, String roomName, boolean booking_status) {
		super();
		this.roomName = roomName;
		this.booking_status = booking_status;
		this.roomNumber = roomNumber;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public boolean getBooking_status() {
		return booking_status;
	}

	public void setBooking_status(boolean booking_status) {
		this.booking_status = booking_status;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public static void main(String[] args) throws IOException {
		initializeRoom();
		displayOptions();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter The Number");
		String number = reader.readLine(); // taking string input
		switch (number) {
		// Case statements
		case "1":
			bookRoom();
			break;
		case "2":
			cancelBooking();
			break;
		case "3":
			displayBookings();
			break;

		case "4":
			exit();
			break;
		// Default case statement
		default:
			showErrorMessage();
		}
//		roomList.stream().forEach((roomData) -> {
//			System.out.print(roomData.getRoomNo() + " ");
//		});

	}

	static void displayOptions() {
		System.out.println("Welcome to the Hotel Booking System!");
		System.out.println("1.Book a room");
		System.out.println("2.Cancel bookings");
		System.out.println("3 Display bookings");
		System.out.println("4 Exit");
		System.out.println("Enter your choice");

	}

	static void initializeRoom() {
		for (int i = 1; i <= 10; i++) {
			HotelRoom room = new HotelRoom(i, "Room" + i, true);
			roomList.add(room);
		}

		// return roomList;
	}

	static void cancelBooking() throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the room number you want to cancel(1-10)");
			String number = reader.readLine(); // taking string input
			Iterator<HotelRoom> iterator = roomList.iterator();
			while (iterator.hasNext()) {
				HotelRoom roomData = iterator.next();
				if (roomData.getRoomNumber() == Integer.parseInt(number)) {
					if (roomData.getBooking_status()) {
						System.out.print("This room is not booked, please enter a valid room number.");
						mainCaller();

					} else {
						System.out.print("Booking cancelled successfully");
						roomData.setBooking_status(true);
						mainCaller();
					}

				}
			}
		} catch (NumberFormatException e) {
			// cancelBooking();
			System.out.println("Please enter the correct room number");
			cancelBooking();
		}
	}

	static void bookRoom() throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the room number you want to book(1-10)");
			String number = reader.readLine(); // taking string input
			// roomList.stream().forEach(y -> System.out.println(y));
			Iterator<HotelRoom> iterator = roomList.iterator();
			while (iterator.hasNext()) {
				HotelRoom roomData = iterator.next();
				if (roomData.getRoomNumber() == Integer.parseInt(number)) {
					if (roomData.getBooking_status()) {
						System.out.print("Booking Successful !! Thank you for choosing our hotel.");
						roomData.setBooking_status(false);
						mainCaller();
						break;
						// System.out.println(roomData.getRoomName()+" "+roomData.getBooking_status());

					} else {
						System.out.print("This room is already booked,please choose another room");
						mainCaller();
					}

				}
			}
		} catch (NumberFormatException e) {
			/// return Integer.parseInt(number);
			System.out.println("Please enter the correct room number");
			bookRoom();
		}
	}

	static void displayBookings() {
		System.out.println("Booked Booking List");
		List<HotelRoom>checkCount = roomList.stream().filter(entry -> !entry.getBooking_status()).collect(Collectors.toList());
        if(checkCount.size()==0) {
        	System.out.println("<<<<<< Empty Booking List >>>>>>>>> ");
        }
        else {
		roomList.stream().filter(entry -> !entry.getBooking_status()).forEach(data -> {

			System.out.println("<<<<<<"+data.getRoomName() + ": Booked >>>>>>");

		});
        }
		mainCaller();

	}

	static void exit() {
		System.out.println("Exiting Hotel Booking System, GoodBye!");
	}

	static void showErrorMessage() {
		System.out.println("Invalid Choice, Please try again");
		mainCaller();
	}

	static void mainCaller() {
		// System.out.println("mainCaller!");

		// Calling the main() method
		try {
			main(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
