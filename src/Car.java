public class Car {

    String model;
    String make;

    Car(String model, String make) {
        this.model = model;
        this.make = make;
    }
}


// Inheritance
class Honda extends Car {

    Honda(String model, String make) {
        super(model, make);
    }

}
