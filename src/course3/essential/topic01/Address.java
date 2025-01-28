package course3.essential.topic01;

public class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private String house;
    private int apartment;

    // Methods get і set for each field
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {
        // Creating an instance of the Address class
        Address address = new Address();

        // Set address information
        address.setIndex("33-072");
        address.setCountry("Україна");
        address.setCity("Київ");
        address.setStreet("Хрещатик");
        address.setHouse("22/3");
        address.setApartment(101);

        // Display field values
        System.out.println("Поштова адреса:");
        System.out.println("Індекс: " + address.getIndex());
        System.out.println("Країна: " + address.getCountry());
        System.out.println("Місто: " + address.getCity());
        System.out.println("Вулиця: " + address.getStreet());
        System.out.println("Будинок: " + address.getHouse());
        System.out.println("Квартира: " + address.getApartment());
    }

}