package BackendLLD2.SOLID.V7DependencyInjection;

import BackendLLD2.SOLID.V3.Flyable;

public class Pigeon extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying Low");
    }

    @Override
    public void makeSound() {

    }
}
