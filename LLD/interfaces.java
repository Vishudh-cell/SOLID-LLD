interface Animal {
    abstract void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class interfaces {
    public static void main(String args[]) {
        Animal horse = new Horse();
        Animal chicken = new Chicken();
        horse.walk();
        chicken.walk();
    }
}