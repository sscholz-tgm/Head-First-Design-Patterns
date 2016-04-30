package headfirst.designpatterns.combining.observer;
/**
 * 
 * (Commentator sscholz-tgm)
 * Observer Pattern
 * an interface for the observables that is
 * mother of Quackable
 */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
