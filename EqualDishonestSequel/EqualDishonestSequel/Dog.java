
// Subclasses of Mammal
// TODO: Define a class Dog that extends Mammal
// - Constructor takes name and passes name, true, "omnivore", 4, "Woof!" to
// super
// - Override speak() to print "<name> says: Woof!"
public class Dog extends Mammal {
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
