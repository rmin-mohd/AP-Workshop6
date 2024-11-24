public abstract class Mammal extends Animal {
    protected double speed;

    public Mammal(String name, int age, String attributes, double speed){
        super(name, age, attributes);
        this.speed = speed;
    }

    public void show(){
        System.out.print("Name: " + name + ", age: " + age + ", speed: " + speed + " \"" + attributes + "\"");
    }

    public String toString(){
        return super.toString() + "\nspeed: " + speed;
    }
}