package application;

import ducks.Duck;
import turkeys.Turkey;

public class TurkeyAdapter implements Duck{

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for (int count = 0 ; count < 5 ; count++){
			turkey.fly();
		}
	}

	
}
