package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * 
 * (Commentator sscholz-tgm)
 * Observer Pattern the Observable
 * also has the list of iterable observers
 * and is a QuackObservable
 * has the methods needed for an observable (notify, register,..)
 */
public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
 
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
