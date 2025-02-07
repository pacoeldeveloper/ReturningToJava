// Code used to better understand Module 3 from the "Introduction to
// Software Development" course by Amazon.

package Introduction;

/*
* "Hero" is defined as a class. A class is a blueprint that is used to create
* various instances of an object. An object is every thing we can name -a noun-.
* That is why here "Hero" is a valid class, as is the generalized term for characters
* like Batman or Superman. Moreover, Batman or Superman will be our objects, meaning
* these are specialized or unique instances of a common class called "Hero".
* */
public class Hero {
    // What attributes/characteristics define a Hero?
    public String name = "Superman";    // as we are in another package, to access our attributes
                                        // we make our variable public or we set a getter...
    int strength = 100;
    int health = 100;
    boolean canFly = true;

    // What actions can our Hero do?
    public void fight(String villain){
        System.out.println("I am fighting against " + villain);
    }

    public void fly(){
        if (canFly){
            System.out.println("I am flying");
        } else {
            System.out.println("I cannot fly but i can use my car!");
        }
    }
}
