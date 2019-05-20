package com.skilldistillery.lordoftheobjects;

public class Character {

	// Field
	protected String name;
	protected int health;

	// Constructors
	public Character(String name, int health) {
		this.name = name;
		this.health = health;
	}

	public Character() {
	}

	// Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() { // this needs to take in change in health, ie damage.
		return health;
	}

	public void setHealth(int damage) { // this takes in the initial and subsequent values of HP
		this.health = this.health - damage;
		this.health = health;

	}
}
