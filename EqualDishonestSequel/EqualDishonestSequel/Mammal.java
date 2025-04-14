
// Subclass
// TODO: Define a class called Mammal that extends Animal with:
// - A protected boolean field called warmBlooded (set to true)
// - A protected String field called dietType (e.g., "herbivore")
// - A protected int field called numLegs (e.g., 4)
// - A protected String field called sound (e.g., "growl")
// - A constructor that uses super to set name and sets these fields
// - Override speak() to print the value of sound prefixed by name
public class Mammal extends Animal {
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
