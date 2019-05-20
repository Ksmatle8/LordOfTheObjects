package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class SpaceKrakenApp {

	public void intro() {
		System.out.println();
		System.out.println("Welcome to Kraken vs. Superheroes!");
		System.out.println("In this game you are Gertrude, the ferocious Kraken. No mere");
		System.out.println("humanoid is a match for your size and strength.");
		System.out.println("...and YET....");
		System.out.println("there are those who seek to destroy you.");
		System.out.println("You must face Captain Kirk, Luke Skywalker and the amazing Wonder Woman");
		System.out.println("Diana and defeat them all with your terrifying monsterness. You will square off");
		System.out.println("with each in turn and choose your method of attack. You will either diminish your");
		System.out.println("opponent's strength, defeat them or lose the battle. You must keep your health factor");
		System.out.println("above zero to stay alive. If your opponent's health goes to zero or less, you have ");
		System.out.println("defeated them, and you can move on to the next opponent. You must defeat all three to");
		System.out.println("win the game.");
		System.out.println("Songs and legends have been written in your honor...");
		System.out.println("For centuries you have been dreaded and feared on the high seas...");
		System.out.println("But today you must prove yourself superior once again to all your foes.");
		System.out.println();
	}

	public void run() {

		Scanner kb = new Scanner(System.in);
		Kraken gertie = new Kraken("Gertrude", 25);
		Kirk kirk = new Kirk("Kirk", 10);
		Luke luke = new Luke("Luke", 10);
		Diana diana = new Diana("Diana", 12);

		System.out.println("Your first enemy comes from the infamous USS Enterprise...");
		System.out.println();

		while (gertie.getHealth() >= 0 && kirk.getHealth() >= 0) {

			int gertiesDmg = gertie.krakAttack(kb);

			kirk.setHealth(gertiesDmg);
			int kirksNewHealth = kirk.getHealth();

			if (kirksNewHealth > 0) {
				System.out.println("Kirk's health is now " + kirksNewHealth);
				System.out.println();

				kirk.kirkAttack();

				gertie.setHealth(kirk.kirkDamage());

				int gertiesNewHealth = (gertie.getHealth());
				if (gertiesNewHealth > 0) {
					System.out.println("Gertie the Kraken's health is now " + gertiesNewHealth);
					System.out.println();
				}
				if (gertiesNewHealth <= 0) {
					kirk.kirkWins();
				}
			}

			if (kirksNewHealth <= 0) {
				System.out.println("");
				gertie.krakWins();
			}

		}
		System.out.println("You must now face a foe from a galaxy far, far away...");
		System.out.println();

		while (gertie.getHealth() >= 0 && luke.getHealth() >= 0) {

			int gertiesDmg = gertie.krakAttack(kb);

			luke.setHealth(gertiesDmg);
			int lukeNewHealth = luke.getHealth();

			if (lukeNewHealth > 0) {
				System.out.println("Luke's health is now " + lukeNewHealth);
				System.out.println();

				luke.lukeAttack();

				gertie.setHealth(luke.lukeDamage());
				int gertiesNewHealth = (gertie.getHealth());

				if (gertiesNewHealth > 0) {
					System.out.println("Gertie the Kraken's health is now " + gertiesNewHealth);
					System.out.println();
				}
				if (gertiesNewHealth <= 0) {
					luke.lukeWins();
				}

			}
			if (lukeNewHealth <= 0) {
				System.out.println("");
				gertie.krakWins();
			}

		}
		System.out.println(
				"The next - and final - obstacle between you and ultimate power is to fight the amazing Wonder Woman Diana!! ");
		System.out.println();

		while (gertie.getHealth() >= 0 && diana.getHealth() >= 0) {

			int gertiesDmg = gertie.krakAttack(kb);
			
			diana.setHealth(gertiesDmg);
			int dianaNewHealth = diana.getHealth();

			if (dianaNewHealth > 0) {
				System.out.println("Diana's health is now " + dianaNewHealth);
				System.out.println();
				
				diana.dianaAttack();
				
				gertie.setHealth(diana.dianaDamage());
				int gertiesNewHealth = (gertie.getHealth());
				
				if (gertiesNewHealth > 0) {
					System.out.println("Gertie the Kraken's health is now " + gertiesNewHealth);
					System.out.println();
				}
				if (gertiesNewHealth <= 0) {
					diana.dianaWins();
				}

			}

			if (dianaNewHealth <= 0) {
				System.out.println("");
				gertie.krakWinsFinal();
				System.exit(0);
			}

		}
	}

}