package com.skilldistillery.lordoftheobjects;

public class Kirk extends Character {
	// fields are inherited

	// constructor
	public Kirk(String name, int health) {
		this.name = name;
		this.health = health;

	}

	// Methods (getters and setters are inherited for name, health, and updated
	// health levels
	public void kirkWins() {
		System.out.println("Captain Kirk WINS! You have lost, poor Gertie.");
		System.out.println("Death is the true Final Frontier. Embrace your fate.");
		System.exit(0);
	}

	public void kirkAttack() {

		int kirkAttackChoice = 1 + (int) (Math.random() * 3);
//		System.out.println(kirkAttackChoice);

		if (kirkAttackChoice == 1) {
			System.out.println("Oooh...You've done some damage to Kirk! But he's fighing back.");
			System.out.println("He hits you with the phaser, and you've been injured. ");
			System.out.println();
		} else if (kirkAttackChoice == 2) {
			System.out.println("Look, Captain Kirk has a torn shirt and he's bleeding!");
			System.out.println("He nails you with his phaser, and it stings!");
			System.out.println();
		} else if (kirkAttackChoice == 3) {
			System.out.println("Oh look, Kirk just exploded a meteor, and you've been hit.");
			System.out.println();
		}

	}

	public int kirkDamage() {

		int kirkRandomDmg = 1 + (int) (Math.random() * 4);
		System.out.println("You lose " + kirkRandomDmg + " health points.");
		return kirkRandomDmg;
	}

}