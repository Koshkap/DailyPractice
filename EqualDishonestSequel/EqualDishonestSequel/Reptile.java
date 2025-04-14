
// TODO: Define a class Reptile that extends Animal
// - Add fields: boolean warmBlooded (set to false), int numLegs, String
// dietType, String sound
// - Constructor should take all values and use super for name
// - Override speak() to print the value of sound prefixed by name
public class Reptile extends Animal {
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
