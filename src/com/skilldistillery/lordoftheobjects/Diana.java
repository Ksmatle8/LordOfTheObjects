package com.skilldistillery.lordoftheobjects;

public class Diana extends Character {
	// fields are inherited

	// constructor
	public Diana(String name, int health) {
		this.name = name;
		this.health = health;
	}

	// Methods (getters and setters are inherited for name, health, and updated
	// health levels

	public void dianaWins() {
		System.out.println("Wonder Woman wins, and Gertie the Kraken has lost.");
		System.out.println("You are awesome, but you are no match for Diana.");
		System.exit(0);
	}

	public void dianaAttack() {

		int dianaAttackChoice = 1 + (int) (Math.random() * 3);

		if (dianaAttackChoice == 1) {
			System.out.println("You're tough, but are you a match for Wonder Woman's awesomeness?");
			System.out.println("She throws a space truck at you, and you've been injured. ");
			System.out.println();
		} else if (dianaAttackChoice == 2) {
			System.out.println("Wonder Woman is willing to fight for those who cannot fight for themselves.");
			System.out.println("She hacks you with her sword, and you lose a tentacle.");
			System.out.println();
		} else if (dianaAttackChoice == 3) {
			System.out.println("Wonder Woman's bracelets deflect the flying debris, and you're hit.");
			System.out.println("You are deeply wounded.");
			System.out.println();
		}

	}

	public int dianaDamage() {

		int dianaRandomDmg = 1 + (int) (Math.random() * 4);
		System.out.println("You lose " + dianaRandomDmg + " health points.");
		return dianaRandomDmg;
	}
}