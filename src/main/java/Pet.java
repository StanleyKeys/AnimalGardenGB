public abstract class Pet extends Animal {
    String masterName;

    public Pet(String name, String dateOfBirth, String masterName) {
        super(name, dateOfBirth);
        this.masterName = masterName;
    }
}
