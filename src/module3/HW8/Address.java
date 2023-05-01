package module3.HW8;

public class Address {
    private String city;
    private String region;

    public Address(String city, String region) {
        this.city = city;
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
