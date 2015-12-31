package ua.com.juja.Patterns.Strategy.Duck;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
