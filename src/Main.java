import Introduction.Hero;

public class Main {
    public static void main(String[] args){
        // Instantiation of our Hero class
        Hero superman = new Hero();

        System.out.println("Hi! I am " + superman.name);
        superman.fight("Batman");
        superman.fly();
    }
}