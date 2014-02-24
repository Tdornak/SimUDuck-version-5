package version5;

public class RubberDuck implements QuackOnlyGroup, SwimGroup {
	
    private QuackStrategy quackStrategy;
    
    public RubberDuck(QuackStrategy qs) {
            // these properties are inherited from Duck
            this.quackStrategy = qs;
    }

    public void display() {
            System.out.println("I'm a Rubber Duck");
    }

    @Override
    public void performQuack() {
        this.quackStrategy.quack();
    }

    @Override
    public void setQuackStrategy(QuackStrategy qs) {
        this.quackStrategy = qs;
    }

    @Override
    public QuackStrategy getQuackStrategy() {
        return quackStrategy;
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
    

    
	

}
