public abstract class Pack extends Animal {

    String hoofs;
    String hump;
    int loadCapacity;

    public Pack(String name, String dateOfBirth, String hoofs, String hump, int loadCapacity) {
        super(name, dateOfBirth);
        this.hoofs = hoofs;
        this.hump = hump;
        this.loadCapacity = loadCapacity;

    }
}
