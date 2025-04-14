// Base class
// TODO: Define a class called Animal with:
public class Animal {
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



