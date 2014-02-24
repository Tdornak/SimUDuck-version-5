package version5;

public class ModelDuck implements Duck, SwimGroup {

    public ModelDuck() {
        
    }

    @Override
    public void display() {
            System.out.println("I'm a model duck");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");       
    }

    
}
