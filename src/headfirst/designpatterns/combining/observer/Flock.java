package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;
/**
 * 
 * (Commentator sscholz-tgm)
 * Observer Pattern
 * has a "concrete observable"
 * and is a Quackable
 * 
 * and uses a Quackable iterator
 * => Iterator Pattern
 */
public class Flock implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
  
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
   
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	public void notifyObservers() { }
  
	public String toString() {
		return "Flock of Ducks";
	}
}
