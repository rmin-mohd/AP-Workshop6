public abstract class Bird extends Animal {
    protected double heightOfFlight;

    public Bird(String name, int age, String attributes, double heightOfFlight) {
        super(name, age, attributes);
        this.heightOfFlight = heightOfFlight;
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age + ", Height of fly: " + heightOfFlight + " \"" + attributes + "\"");
    }

    public String toString() {
        return super.toString() + "\nHeight of Flight: " + this.heightOfFlight;
    }
}