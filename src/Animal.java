public abstract class Animal {
    protected String name;
    protected int age;
    protected String attributes;

    public Animal(String name, int age, String attributes) {
       this.name = name;
       this.age = age;
       this.attributes = attributes;
    }

    public String getName() {
        return this.name;
    }

    public void show(){
        System.out.println("Name: " + name + ", age: " + age +   " \"" + attributes  + "\"");
    }

    public String toString(){
        return "Name: " + this.name + "\nage: " + this.age + "\nAttributes: " + this.attributes;
    }
}

