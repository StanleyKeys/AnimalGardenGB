


public class Camel extends Pack {


    public Camel(String name, String dateOfBirth, String hoofs, String hump, int loadCapacity) {
        super(name, dateOfBirth, hoofs, hump, loadCapacity);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format("\nHoofs: %s, \nHump: %s, \nLoadCapacity: %d kg",hoofs, hump, loadCapacity);
    }
}
