package smartphone;

public class Phone {

    protected String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public void call() {
        System.out.println("Making a call...");
    }
}
