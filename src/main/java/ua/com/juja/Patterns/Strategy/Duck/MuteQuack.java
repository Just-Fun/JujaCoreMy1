package ua.com.juja.Patterns.Strategy.Duck;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
