package Introduction;

/*
 As said in the LegoSet class, the DeatStar class could actually be a subclass of a LegoSet as
 the DeathStar lego set IS-A Lego Set. This relationship "IS-A" will be very useful to understand
 if in reality, a class/entity inherits from another entity.

 In Java, to say that some class inherits from another one we use the keyword "extends"
 */
public class DeathStar extends LegoSet {

    // Here we defined a constructor as usual.
    // However, is different as we use the constructor of the superclass with the keyword super()
    // We needed to create the constructor with the same parameters as the superclass as the latter
    // has or is defined only by a parameterized constructor.
    public DeathStar(String universeBasedOn, int totalPieces) {
        super(universeBasedOn, totalPieces);
    }

    // We can create specialized methods for this class
    public void shootLaser(){
        System.out.println("The DeathStar is Shooting its laser.");
    }
}
