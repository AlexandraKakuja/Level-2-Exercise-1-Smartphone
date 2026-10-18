package smartphone;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand) {
        super(brand);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void setAlarm() {
        System.out.println("Alarm set!");
    }
}
