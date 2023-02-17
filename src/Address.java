public class Address {
    private String streetNumber, streetName, apartmentNumber, city, state, zipcode;

    public Address(String city, String state, String zipcode, String streetname, String streetNumber, String apartmentNumber) {
        this.city = city; this.state = state; this.zipcode = zipcode;
        this.streetName = streetname; this.streetNumber = streetNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public Address (Address address) {
        this.city = address.city; this.state = address.state; this.zipcode = address.zipcode;
        this.streetName = address.streetName; this.streetNumber = address.streetNumber;
        this.apartmentNumber = address.apartmentNumber;
    }

    public Address (String address) {
        String addressArray[] = address.split(" "); int aptIndent = 0;

        this.apartmentNumber = "";
        if (addressArray.length > 5) {
            aptIndent = 1;
            this.apartmentNumber = addressArray[2].replace(",", "");
        }

        this.streetNumber = addressArray[0].replace(",", "");
        this.streetName = addressArray[1].replace(",", "");
        this.city = addressArray[2+aptIndent].replace(",", "");
        this.state = addressArray[3+aptIndent].replace(",", "");
        this.zipcode = addressArray[4+aptIndent].replace(",", "");
    }

    public void zipcode(String zipcode) { this.zipcode = zipcode; }
    public String zipcode() { return this.zipcode; }

    public void state(String state) { this.state = state; }
    public String state() { return this.state; }

    public void city(String city) { this.city = city; }
    public String city() { return this.city; }

    public void apartmentNumber(String apartmentNumber) { this.apartmentNumber = apartmentNumber; }
    public String apartmentNumber() { return this.apartmentNumber; }

    public void streetName(String streetName) { this.streetName = streetName; }
    public String streetName() { return this.streetName; }

    public void streetNumber(String streetNumber) { this.streetNumber = streetNumber; }
    public String streetNumber() { return this.streetNumber; }

    public String toString() {
        return this.streetNumber + " " + this.streetName + " " + this.apartmentNumber + ", " + this.city
                + ", " + this.state + " " + this.zipcode;
    }
}
