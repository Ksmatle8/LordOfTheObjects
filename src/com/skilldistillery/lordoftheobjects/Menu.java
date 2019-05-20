package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Menu {


		//		Loop Menu until decision is made
		
public boolean menu () {
		Scanner input = new Scanner(System.in);
		boolean offerChoice = true;
		boolean play = false;
		System.out.print("Are you ready to proceed? Please type Y for Yes and N for No. (Y/N) ");
		String decision = input.nextLine();
		System.out.println();

		while (offerChoice = true) {
			if (decision.equalsIgnoreCase("Y")) {
				System.out.println("Very well, O Great Gertrude. May the powers of the deep help you overthrow");
				System.out.println("your foes!");
				System.out.println();
				offerChoice = false;
				play = true;
				break;
			} 
			else if (decision.equalsIgnoreCase("N")) {
				System.out.println("That's understandable. Return, O Great Gertrude, to the Deep and live");
				System.out.println("to fight another day!");
				System.out.println();
				offerChoice = false;
				System.exit(0);
			} 
			else {
				System.out.println("You're about to face down 3 legendary superheroes. You're going to have");
				System.out.println("to do a little better than that. Y or N?");
				decision = input.nextLine();
			}
		}
		return play;
	}
}