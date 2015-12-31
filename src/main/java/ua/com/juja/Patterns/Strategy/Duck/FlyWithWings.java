package ua.com.juja.Patterns.Strategy.Duck;

public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
