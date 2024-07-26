public class Animal {
    //Setting the attributes for the animal's name and whether it is a dog
    private String name;
    private boolean isDog;

    //Creating the default constructor
    public Animal() {
        this.name = "Unknown";
        this.isDog = false;
    }

    //Creating the constructor with only name
    public Animal(String name) {
        this.name = name;
        this.isDog = false; // Default to not being a dog
    }

    //Creating the constructor with only isDog
    public Animal(boolean isDog) {
        this.name = "Unknown"; // Default to unknown name
        this.isDog = isDog;
    }

    //Creating the constructor with both name and isDog
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    //Getter for the name attribute
    public String getName() {
        return name;
    }

    //Setter for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    //Getter for the isDog attribute
    public boolean isDog() {
        return isDog;
    }

    //Overriding the toString method to return a string representation of the animal
    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }

    //Overriding the equals method to compare the Animal objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return isDog == animal.isDog && name.equals(animal.name);
    }

    //Overriding the hashCode method to provide a hash code for the Animal objects
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (isDog ? 1 : 0);
        return result;
    }
}
