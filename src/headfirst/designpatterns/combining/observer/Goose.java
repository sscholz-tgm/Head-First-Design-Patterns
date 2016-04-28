package headfirst.designpatterns.combining.observer;

/**
 * 
 * (Commentator sscholz-tgm)
 * Adapter Pattern / Proxy Pattern  class to get adapted
 * comparable to Decorator Pattern "Core" Class (but honk instead of quack)
 * but does not implement Quackable and does not override Quack
 * => Adapter Pattern or Proxy Pattern
 */
public class Goose {

	public void honk() {
		System.out.println("Honk");
	}

	public String toString() {
		return "Goose";
	}
}
