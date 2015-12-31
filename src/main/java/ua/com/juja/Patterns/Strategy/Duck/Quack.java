package ua.com.juja.Patterns.Strategy.Duck;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
