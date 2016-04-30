package headfirst.designpatterns.combining.observer;

/**
 * 
 * (Commentator sscholz-tgm)
 * Observer Pattern
 * has a "concrete observable"
 * and is a Quackable
 */
public class RedheadDuck implements Quackable {
	Observable observable;

	public RedheadDuck() {
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
		return "Redhead Duck";
	}
}
