import static Introduction.LegoSet.destroy;
import Introduction.DeathStar;
import Introduction.Hero;

/*
   NOTE:
   - The Hero class is used to understand/explain what a class is
   - The LegoSet and DeathStar classes are used to understand inheritance
 */
public class Main {
    public static void main(String[] args){
        // Instantiation of our Hero class
        Hero superman = new Hero();

        System.out.println("Hi! I am " + superman.name);
        superman.fight("Batman");
        superman.fly();

        // Instantiation of our DeathStar class; This is an example of single-level inheritance
        DeathStar deathStar = new DeathStar("Star Wars", 1400);

        // These methods are from our superclass
        deathStar.build(1040);
        deathStar.display();
        // This method is from the subclass
        deathStar.shootLaser();

        // This method is an example of polymorphism, as we can pass any type of the superclass-subclass
        destroy(deathStar);
    }
}