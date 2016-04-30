package headfirst.designpatterns.combining.observer;

/**
 * 
 * (Commentator sscholz-tgm)
 * Observer Pattern
 * has a "concrete observable"
 * and is a Quackable
 */
public class MallardDuck implements Quackable {
	Observable observable;
 
	public MallardDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
 
	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Mallard Duck";
	}
}
