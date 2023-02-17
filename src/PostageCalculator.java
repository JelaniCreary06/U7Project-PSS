public class PostageCalculator extends Package {

    public static double calculatePostage(Package p) {
        return 3.75 + costIfExceedingSize(p.length(), p.width(), p.height())
                + costBasedOnWeight(p.weight()) + costBasedOnZipcode(p.origin().zipcode(), p.destination().zipcode());
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
