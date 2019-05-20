package com.skilldistillery.lordoftheobjects;

public class Luke extends Character {
	// fields are inherited

	// constructor
	public Luke(String name, int health) {
		this.name = name;
		this.health = health;

	}

	// Methods (getters and setters are inherited for name, health, and updated
	// health levels

	public void lukeWins() {
		System.out.println("The Force prevails! Luke wins, and Gertie the Kraken has lost.");
		System.out.println("Go bravely into the deepest deep of Death.");
		System.exit(0);
	}

	public void lukeAttack() {

		int lukeAttackChoice = 1 + (int) (Math.random() * 3);

		if (lukeAttackChoice == 1) {
			System.out.println("Oooooh, looks like you cut off Luke's other hand! He's ticked!");
			System.out.println("He hits you with his light sabre, and you've been injured. ");
			System.out.println();
		} else if (lukeAttackChoice == 2) {
			System.out.println("You have hit Luke hard. Now he has something to prove.");
			System.out.println("He nails you with his light sabre and lose a tentacle.");
			System.out.println();
		} else if (lukeAttackChoice == 3) {
			System.out.println("Luke doesn't take this fight lightly. He strikes back.");
			System.out.println("You are deeply wounded.");
			System.out.println();
		}

	}

	public int lukeDamage() {

		int lukeRandomDmg = 1 + (int) (Math.random() * 4);
		System.out.println("You lose " + lukeRandomDmg + " health points.");
		System.out.println();
		return lukeRandomDmg;
	}

}