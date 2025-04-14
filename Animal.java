
// Base class
// TODO: Define a class called Animal with:
class Animal {
    // - A protected String field called name
    protected String name;

    // - A constructor that takes a name and assigns it
    public Animal(String name) {
        this.name = name;
    }

    // - A public void method called speak() that prints a generic sound
    public void speak() {
        System.out.println("yip");
    }

    // - Override toString() to return "Animal: " + name
    // - Override equals(Object o) to compare names if o is an Animal
    public String toString() {
        return "Animal: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Animal) {
            Animal other = (Animal) o;
            return this.name.equals(other.name);
        }
        return false;
    }
}

// Subclass
// TODO: Define a class called Mammal that extends Animal with:
// - A protected boolean field called warmBlooded (set to true)
// - A protected String field called dietType (e.g., "herbivore")
// - A protected int field called numLegs (e.g., 4)
// - A protected String field called sound (e.g., "growl")
// - A constructor that uses super to set name and sets these fields
// - Override speak() to print the value of sound prefixed by name
class Mammal extends Animal {
    protected boolean warmBlooded = true;
    protected String dietType;
    protected int numLegs;
    protected String sound;

    public Mammal(String name, boolean warmBlooded, String dietType, int numLegs, String sound) {
        super(name);
        this.warmBlooded = warmBlooded;
        this.dietType = dietType;
        this.numLegs = numLegs;
        this.sound = sound;
    }
    @Override
    public void speak() {
        System.out.println(name + " says: " + sound);
    }
    public void performTrick() {
        System.out.println(name + " performs a trick!");
    }
}

// Subclasses of Mammal
// TODO: Define a class Dog that extends Mammal
// - Constructor takes name and passes name, true, "omnivore", 4, "Woof!" to
// super
// - Override speak() to print "<name> says: Woof!"
class Dog extends Mammal {
    public Dog(String name) {
        super(name, true, "omnivore", 4, "Woof!");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }
    public boolean equals(Object o) {
        if (o instanceof Dog) {
            Dog other = (Dog) o;
            return this.name.equals(other.name);
        }
        return false;
    }
}

// TODO: Define a class Cat that extends Mammal
// - Constructor takes name and passes name, true, "carnivore", 4, "Meow!" to
// super
// - Override speak() to print "<name> says: Meow!"
class Cat extends Mammal {
    public Cat(String name) {
        super(name, true, "carnivore", 4, "Meow!");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("chirp");
    }
}

// TODO: Define a final class Human that extends Mammal
// - Constructor takes name and passes name, true, "omnivore", 2, "Hello!" to
// super
final class Human extends Mammal {
    public Human(String name) {
        super(name, true, "omnivore", 2, "Hello!");
    }
}

// TODO: Define a class Reptile that extends Animal
// - Add fields: boolean warmBlooded (set to false), int numLegs, String
// dietType, String sound
// - Constructor should take all values and use super for name
// - Override speak() to print the value of sound prefixed by name
class Reptile extends Animal {
    protected boolean warmBlooded = false;
    protected int numLegs;
    protected String dietType;
    protected String sound;

    public Reptile(String name, int numLegs, String dietType, String sound) {
        super(name);
        this.numLegs = numLegs;
        this.dietType = dietType;
        this.sound = sound;
    }
}

// Main class to test
// TODO: Define class AnimalKingdomTest with a main method
public class Animal {
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Whiskers");
        a1.speak();
        a2.speak();
        System.out.println(a1);
        System.out.println(a2);
        Animal a3 = new Dog("Buddy");
        System.out.println("a1 = a3:" + a1.equals(a3));
    }
}
