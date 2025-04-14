
// TODO: Define a class Cat that extends Mammal
// - Constructor takes name and passes name, true, "carnivore", 4, "Meow!" to
// super
// - Override speak() to print "<name> says: Meow!"
public class Cat extends Mammal {
    public Cat(String name) {
        super(name, true, "carnivore", 4, "Meow!");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }
}
