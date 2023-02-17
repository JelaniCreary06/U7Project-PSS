public class PostageCalculator extends Package {

    public static double calculatePostage(Package p) {
        return calculatePostage(p.origin(), p.destination(), p.weight(), p.length(), p.width(), p.height());
    }

    public static double calculatePostage(Address a1, Address a2, double weight, double length, double width, double height) {
        return calculatePostage(a1.zipcode(), a2.zipcode(), weight, length, width, height);
    }

    public static double calculatePostage(String z1, String z2, double weight, double length, double width, double height) {
        return 3.75 + costIfExceedingSize(length, width, height)
                + costBasedOnWeight(weight) + costBasedOnZipcode(z1, z2);
    }

    private static double costBasedOnWeight(double weight) {
        if (weight > 40) return  (400 * 0.05) + ( ((weight - 40) /.1) * 0.1);
        return (weight / .1) * 0.05;
    }

    private static double costBasedOnZipcode(String zip1, String zip2) {
        return Math.abs((Integer.parseInt(zip1.substring(0, 3)) - Integer.parseInt(zip2.substring(0, 3)))) / 100;
    }

    private static double costIfExceedingSize(double length, double width, double height) {
        if (length + width + height > 36) return ((length + width + height) - 36) * .1;
        return 0;
    }
}
