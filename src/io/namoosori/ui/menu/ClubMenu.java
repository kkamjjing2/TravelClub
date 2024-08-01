package io.namoosori.ui.menu;

import io.namoosori.ui.console.ClubConsole;

import java.util.Scanner;

public class ClubMenu {
	private Scanner scanner;
	private ClubConsole console;

	public ClubMenu(){
		this.scanner = new Scanner(System.in);
		this.console = new ClubConsole();
	}

	public void show() {
		int inputNumber = 0;

		while (true) {
			displayMenu();
			inputNumber = selectMenu();

			switch (inputNumber) {
				case 1 :
					 console.register();
					break;
				case 2 :
					console.findAll();
					break;
				case 3 :
					// console.register();
					break;
				case 4 :
					// console.register();
					break;
				case 5 :
					// console.register();
					break;
				case 6 :
					// console.register();
					break;
				case 0 :
					// console.register();
					break;
				default:
					System.out.println("Choose again!");
			}
		}
	}

	private void displayMenu() {
		System.out.println("....................");
		System.out.println("Club Menu");
		System.out.println("....................");
		System.out.println("1. Register");
		System.out.println("2. Find(All)");
		System.out.println("3. Find(ID)");
		System.out.println("4. Find(Name)");
		System.out.println("5. Modify");
		System.out.println("6. Remove");
		System.out.println("....................");
		System.out.println("0. Previous");
		System.out.println("....................");
	}

	private int selectMenu() {
		System.out.println("Select : ");
		int menuNumber = scanner.nextInt();
		if (menuNumber >= 0 && menuNumber <= 6) {
			scanner.nextLine();
			return menuNumber;
		} else {
			System.out.println("It's a invalid number --> + menuNumber");
			return -1;
		}
	}
}
