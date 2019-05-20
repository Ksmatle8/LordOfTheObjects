
package com.skilldistillery.lordoftheobjects;

public class SpaceKrakenDriver {

	public static void main(String[] args) {
		SpaceKrakenApp gertrudeApp = new SpaceKrakenApp();
		
		gertrudeApp.intro();
		
		Menu menu = new Menu();
		boolean play = menu.menu();
		if (play) {

			gertrudeApp.run();
		}
	}
}
