package ua.com.juja.patterns.Strategy.Duck;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
