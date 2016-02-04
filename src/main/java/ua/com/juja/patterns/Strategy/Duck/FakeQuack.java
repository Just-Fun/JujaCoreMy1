package ua.com.juja.patterns.Strategy.Duck;

import ua.com.juja.patterns.Strategy.DuckMy.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
