package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
           
            FlyAndQuackGroup[] ducks = new FlyAndQuackGroup[] {
                new BaldDuck(new FlyWithWings(), new Quack()),
                new MallardDuck(new FlyNoWay(), new Squeak())
            
            };
            for (FlyAndQuackGroup duck : ducks) {
                duck.display();
                duck.performQuack();
                duck.performFly();
                duck.setFlyStrategy(new FlyRocketPowered());
                duck.setQuackStrategy(new Squeak());
                duck.performFly();
            }
            
//            FlyAndQuackGroup duck = new BaldDuck(new FlyWithWings(), new Quack());
//
//            duck.display();
//            duck.performQuack();
//            duck.performFly();
//            duck.setFlyStrategy(new FlyRocketPowered());
//            duck.setQuackStrategy(new Squeak());
//            duck.performFly();
//
//            QuackOnlyGroup duck2 = new RubberDuck(new Squeak());
//            duck2.display();
//            duck2.performQuack();
//            duck2.setQuackStrategy(new Quack());
//            duck2.performQuack();
	}

}
