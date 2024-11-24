import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Enter the details of the parrot: ");
        animals.add(createParrot(scanner));

        System.out.println("Enter the details of the Eagle: ");
        animals.add(createEagle(scanner));

        System.out.println("Enter the details of Giraffe: ");
        animals.add(createGiraffe(scanner));

        System.out.println("Enter the details of the Cheetah: ");
        animals.add(createCheetah(scanner));

        for (Animal animal : animals){
            animal.show();
        }

        System.out.println();
        scanner.close();

    }

    private static Parrot createParrot(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Attributes: ");
        String attributes = scanner.nextLine();
        System.out.print("Height of Flight: ");
        double heightOfFlight = scanner.nextDouble();
        scanner.nextLine();
        return new Parrot(name, age, attributes, heightOfFlight);
    }

    private static Eagle createEagle(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Attributes: ");
        String attributes = scanner.nextLine();
        System.out.print("Height of Flight: ");
        double heightOfFlight = scanner.nextDouble();
        scanner.nextLine();
        return new Eagle(name, age, attributes, heightOfFlight);
    }

    private static Giraffe createGiraffe(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Attributes: ");
        String attributes = scanner.nextLine();
        System.out.print("Speed: ");
        double speed = scanner.nextDouble();
        scanner.nextLine();
        return new Giraffe(name, age, attributes, speed);
    }

    private static Cheetah createCheetah(Scanner scanner) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Attributes: ");
            String attributes = scanner.nextLine();
            System.out.print("Speed: ");
            double speed = scanner.nextDouble();
            scanner.nextLine();
            return new Cheetah(name, age, attributes, speed);
      }
    }
