public class Car{

    //attributes
    private String brand;
    private String model;
    private int speed;

    //constructor
    public Car(String brand, String model, int speed){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    //methods 
    // To accelerate the car speed 
    public void accelerate(int increment){
        speed += increment;
    }

    // To display the feature
    public void displayFeatures(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}