package application;

import javax.swing.plaf.synth.SynthSeparatorUI;

import ducks.Duck;
import ducks.MallardDuck;
import turkeys.Turkey;
import turkeys.WildTurkey;

public class App {

	public static void main(String[] args) {

		System.out.println("------------------>");
		
		Duck duck = new MallardDuck();
		duck.fly();
		duck.quack();
		
		System.out.println("------------------>");
		
		Turkey turkey = new WildTurkey();
		turkey.fly();
		turkey.gobble();
		
		System.out.println("------------------>");
		
		Duck adapter = new TurkeyAdapter(turkey);
		adapter.quack();
		adapter.fly();
		
	}

}
