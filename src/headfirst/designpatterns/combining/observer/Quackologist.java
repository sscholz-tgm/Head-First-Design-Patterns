package headfirst.designpatterns.combining.observer;
/**
 * 
 * (Commentator sscholz-tgm)
 * Observer Pattern
 * the concrete Observer
 * => implements Observer
 */
public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
	
}
