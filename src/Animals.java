class Animals {
    void makeSound() {
        System.out.println("SOund" );
    }

    void makeSound(String volume) {
        System.out.println("SOund" + volume);

    }
}

class Dog extends Animals {
    // override the method
    @Override
    void makeSound(String volume) {
        System.out.println(volume);
    }

}
