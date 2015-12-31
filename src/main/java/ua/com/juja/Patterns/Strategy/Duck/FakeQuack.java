package ua.com.juja.Patterns.Strategy.Duck;

import ua.com.juja.Patterns.Strategy.DuckMy.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
