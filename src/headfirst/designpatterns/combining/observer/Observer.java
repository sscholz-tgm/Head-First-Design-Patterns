package headfirst.designpatterns.combining.observer;
/**
 * 
 * (Commentator sscholz-tgm)
 * Observer Pattern the Observer
 * interface with the update method (param observable)
 * is used by the iterator
 */
public interface Observer {
	public void update(QuackObservable duck);
}
