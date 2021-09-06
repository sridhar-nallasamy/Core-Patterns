package com.sri.patterns.prorotype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Watch Dogs");
		game1.setMembership(new Membership());

		Game game2 = game1.clone();

		Game game3 = new Game(game1);

		System.out.println(game1);
		System.out.println(game2);
		System.out.println(game3);
	}

}
