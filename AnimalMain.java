import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        //Creating an ArrayList to store the Animal objects
        ArrayList<Animal> animals = new ArrayList<>();

        //Creating a Scanner object to read the user input
        Scanner scanner = new Scanner(System.in);

        //Printing the title of the program and the instructions for stopping
        System.out.println("Animal Menu");
        System.out.println("Press 'enter' to stop input");

        while (true) {
            //Asking the user for the name of the animal
            System.out.print("Please enter a name (or press 'enter' to use the default constructor): ");
            //Reading the user's input and storing it as a string
            String name = scanner.nextLine();

            //Checking if the input is empty and if so breaking the loop
            if (name.isEmpty()) {
                break;
            }

            //Asking the user if the animal is a dog or not
            System.out.print("Is it a dog? (yes or no): ");
            String input = scanner.nextLine().toLowerCase();

            //Assigning isDog as a Boolean variable based on user input
            boolean isDog = input.equals("yes");

            //Creating and adding different Animal objects to the list
            animals.add(new Animal(name, isDog)); //Constructor with both parameters
            animals.add(new Animal(name)); //Constructor with only name
            animals.add(new Animal(isDog)); //Constructor with only isDog
            animals.add(new Animal()); //Default constructor
        }

        //Printing the details of each animal in the list after the input is finished
        System.out.println("List of Animals:");
        //Using the enhanced for loop to iterate through every animal in the list
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

