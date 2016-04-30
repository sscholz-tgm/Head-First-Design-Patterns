package headfirst.designpatterns.combining.observer;
/**
 * 
 * (Commentator sscholz-tgm)
 * Adapter / Proxy / ~Decorator Pattern:
 * The Interface all the other classes need to be or
 * have to adapt to.
 * Observer Pattern is an observable from quackobservable
 * 
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
