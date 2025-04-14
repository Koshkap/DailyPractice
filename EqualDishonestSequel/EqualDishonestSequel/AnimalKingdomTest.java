
// Main class to test
// TODO: Define class AnimalKingdomTest with a main method
public class AnimalKingdomTest {
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Whiskers");
        a1.speak();
        a2.speak();
        System.out.println(a1);
        System.out.println(a2);
        Animal a3 = new Dog("Buddy");
        Animal a4 = new Bird("Tweety");
        a4.speak();
        if (a1 instanceof Mammal) {
            Mammal m1 = (Mammal) a1;
            m1.performTrick();
        }
    }

// - Create Animal a1 = new Dog("Buddy")
// - Create Animal a2 = new Cat("Whiskers")
// - Call speak() on both (demonstrating polymorphism)
// - Print both using System.out.println
// - Use equals() to compare a1 to a new Dog("Buddy")

// Additional TODOs:
// 1. Create a new subclass of Animal (e.g., Bird) and override speak()

// 2. Try to extend Human – what happens and why?
    //error: cannot inherit from final Human because it is final
// 3. Override equals() in Dog or Cat to also check the type
// 4. Add a method to Mammal called performTrick() and call it via downcasting
    
}