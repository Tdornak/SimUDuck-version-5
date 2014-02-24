package version5;

/*
 * Wait a second, didn't we say we should NOT program
 * to an implementation? But what are we doing in that
 * constructor? We're making a new instance of a concrete
 * Quack implementation class!
 * 
 * Good catch! That's exactly what we're doing ... for now!
 * Later, we'll have more design patterns that can help fix
 * this problem.
 * 
 * Still, notice that while we are setting the behaviors
 * to concrete classes, we could easily change that at runtime.
 * So we still have lots of flexibility here, but we're doing a
 * poor job of initializing the instance variables in a flexible
 * way. But think about it, since the quackBehavior instance
 * variable is an interface type, we could, through the magic
 * of polymorphism, dynamically asign a different QuackBehavior
 * implementation at runtime. We'll see this later.
 */	
public class BaldDuck implements FlyAndQuackGroup, SwimGroup {
	
    private FlyStrategy flyStrategy;
    private QuackStrategy quackStrategy;
    
    public BaldDuck(FlyStrategy fs, QuackStrategy qs) {
            // these properties are inherited from Duck
            this.flyStrategy = fs;
            this.quackStrategy = qs;
    }

    @Override
    public void display() {
            System.out.println("I'm a Bald Duck");
    }

    @Override
    public void performQuack() {
        this.quackStrategy.quack();
    }


    @Override
    public void swim() {
        System.out.println("I'm Swimming!");
    }

    @Override
    public void performFly() {
        this.flyStrategy.fly();
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
    public void setFlyStrategy(FlyStrategy fs) {
        this.flyStrategy = fs;
    }

    @Override
    public FlyStrategy getFlyStrategy() {
        return flyStrategy;
    }

    
    
	
}