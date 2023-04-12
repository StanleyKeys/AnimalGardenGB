

public class GardenApp {

    public static void main(String[] args) {
        AppSystem app = new AppSystem();
        app.mainMenu();
        Dog d = new Dog("Buddy", "20.10.2000", "James");
        showAnimal(d.getInfo());

        Camel c = new Camel("Plevaka", "10.01.2000", "yes", "no", 105);
        showAnimal(c.getInfo());
    }

    public static void showAnimal(String s) {
        System.out.println(s);
    }


}
