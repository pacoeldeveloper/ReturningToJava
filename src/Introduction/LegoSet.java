package Introduction;

/*
    Within this file we will understand the key functionality of inheritance and its power.

    If you are not familiar with Lego, these are toys that enable the player to build with breaks a
    determined set by following a series of instructions or simply can build whatever the user may
    want. Now, in OOP, inheritance is the concept that allow uss to reuse code in a logical way. How?
    By using superclasses and subclasses.

    A superclass is a general blueprint of the properties and functionality a determined object should
    have. For example, in the Lego example, our present file 'LegoSet' can be thought as a superclass.
    Why? Because all lego sets (those that you can buy in a store and have a manual within the box) share
    the same properties (pieces, category or universe) and functionality (build, destroy, display).

    Now with this in mind, is easy to think what a subclass is. A subclass is the abstraction that will
    inherit the properties and behaviors of the superclass. In our example, the death star set of lego
    star wars would be a subclass of our superclass LegoSet.

    And now, you can start imagine the benefits of using this approach. If i know i will need to create
    various lego sets from different movies, I do not have to repeat the same functionalities over and
    over again as, in fact, my superclass has already done that for me. Now, this does not mean we cannot
    have specialized versions of a class that inherits a superclass. It is possible to extend a subclass
    , and also it is possible to modify the methods we inherit to make it more suitable to a particular
    abstraction.
 */

public class LegoSet {
    String universeBasedOn;
    int totalPieces;
    int piecesArmed;

    public LegoSet(String universeBasedOn, int totalPieces){
        this.universeBasedOn = universeBasedOn;
        this.totalPieces = totalPieces;
        this.piecesArmed = 0;
    }

    public void build(int pieces){
        piecesArmed +=  pieces;

        if (piecesArmed < totalPieces){
            System.out.println("The set is being built");
            System.out.println((totalPieces - piecesArmed)  + " pieces are left");
        } else {
            System.out.println("Finished!");
        }
    }

    public static void destroy(LegoSet set){
        set.piecesArmed = 0;
        System.out.println("Oh no, you destroyed your Lego based on " + set.universeBasedOn);
    }

    public void display(){
        System.out.println("This lego set is from " + universeBasedOn +
                " and has a total of " + totalPieces + " pieces");
    }

}
