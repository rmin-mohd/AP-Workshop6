public class Eagle extends Bird {
    public Eagle(String name, int age, String attributes, double heightofFlight) {
        super(name, age, attributes, heightofFlight);
    }

    public String toString() {
        return super.toString();
    }

    public void hunt(Prey prey){
        Animal animal = (Animal) prey;
        System.out.println(name + "hunted " + animal.getName());
    }
}