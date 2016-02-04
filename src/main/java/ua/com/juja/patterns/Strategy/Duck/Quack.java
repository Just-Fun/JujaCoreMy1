package ua.com.juja.patterns.Strategy.Duck;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
