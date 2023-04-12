

public class GardenApp {

    public static void main(String[] args) {
        Dog d = new Dog("Buddy", "20.10.2000", "James");
        showAnimal(d.getInfo());
    }

    public static void showAnimal(String s) {
        System.out.println(s);
    }
}
