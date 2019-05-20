package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Kraken extends Character {
	// fields are inherited

	// constructor
	public Kraken(String name, int health) {
		this.name = name;
		this.health = health;

	}

	// Methods (getters and setters are inherited for name, health, and updated
	// health levels

	public int krakAttack(Scanner kb) {
		System.out.println("You're about to attack! Which move would you like to use? ");

		System.out.println("  1: Tear the enemy apart with your kraken beak.");
		System.out.println("  2: Spit boiling acid at your enemy.");
		System.out.println("  3: Grab the enemy with your tentacles.");

		int krakAttackChoice = kb.nextInt();
		while (krakAttackChoice < 1 || krakAttackChoice > 3) { //this catches any bad inputs from human
			System.out.println("Gertie doesn't know that move. Try again.");
			krakAttackChoice = kb.nextInt();
		}
		if (krakAttackChoice == 1) {
			System.out.println(" * CHOMP CHOMP CHOMP * ");
			System.out.println();
			return krakDamage();
		} else if (krakAttackChoice == 2) {
			System.out.println(" * THROWS BURNING ACID * ");
			System.out.println();
			return krakDamage();
		} else if (krakAttackChoice == 3) {
			System.out.println(" * TENTACLES REACH OUT AND CRUSH THE ENEMY * ");
			System.out.println();
			return krakDamage();

		} 
		return 0;
	}

	public int krakDamage() {

		int krakRandomDmg = 1 + (int) (Math.random() * 7);
		System.out.println("You dealt " + krakRandomDmg + " damage to your enemy.");
		return krakRandomDmg;
	}

	public void krakWinsFinal() {
		System.out.println("Gertie the Kraken WINS! Congratulations, you now rule the Universe!");
		System.out.println("All your enemies now cower in shame.");
	}

	public void krakWins() {
		System.out.println("ha-HA! You win! On to the next fight! ");
		System.out.println();
	}

}