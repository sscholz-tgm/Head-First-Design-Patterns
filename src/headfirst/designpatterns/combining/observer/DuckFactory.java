package headfirst.designpatterns.combining.observer;

/**
 * 
 * (Commentator sscholz-tgm)
 * Concrete Factory
 * creates "standard" Quackables with
 * the specific Duck Subclasses
 *
 */
public class DuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
