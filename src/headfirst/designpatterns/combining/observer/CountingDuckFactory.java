package headfirst.designpatterns.combining.observer;

/**
 * 
 * (Commentator sscholz-tgm)
 * Concrete Factory
 * creates QuackCounter Quackables with
 * the specific Duck Subclasses
 *
 */
public class CountingDuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
