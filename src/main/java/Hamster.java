


public class Hamster extends Pet {

    public Hamster(String name, String dateOfBirth, String masterName) {
        super(name, dateOfBirth, masterName);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " \nMasterName: " + masterName;
    }
}