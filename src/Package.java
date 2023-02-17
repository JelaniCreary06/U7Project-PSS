public class Package {
    private Address origin, destination;
    private double weight, width, length, height;

    public Package() {}
    public Package(Address origin, Address destination, double weight, double length, double width, double height) {
        this.origin = origin; this.destination = destination;
        this.weight = weight; this.width = width;
        this.length = length; this.height = height;
    }

    public Package(Address origin, Address destination) { this.origin = origin; this.destination = destination; }

    public void origin(Address origin) { this.origin = origin; }
    public Address origin() { return this.origin; }

    public void destination(Address destination) { this.destination = destination; }
    public Address destination() { return this.destination; }

    public void weight(double weight) { this.weight = weight; }
    public double weight() { return this.weight; }

    public void length(double length) { this.length = length; }
    public double length() { return this.length; }

    public void width(double width) { this.width = width; }
    public double width() { return this.width; }

    public void height(double height) { this.height = height; }
    public double height() { return this.height; }
}
