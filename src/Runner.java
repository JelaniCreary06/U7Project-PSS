import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address address = null;

        String streetNumber, streetName, apartmentNumber, city, state, zipcode;


           System.out.print("Enter a street number: "); streetNumber = scanner.nextLine();
           System.out.print("Enter a street name: "); streetName = scanner.nextLine();

           System.out.print("Do you wish to enter an apartment number? (y/n): ");
           if (scanner.nextLine().equalsIgnoreCase("y")) {
               System.out.print("Enter an apartment number: ");
               apartmentNumber = scanner.nextLine();
           } else apartmentNumber = "";

           System.out.println("Enter a city: "); city = scanner.nextLine();
           System.out.println("Enter a state: "); state = scanner.nextLine();
           System.out.println("Enter a zipcode: "); zipcode = scanner.nextLine();


    }

    public static String validateAddressInput(String input) {
        String inputArray[] = input.split(" ");
        if (inputArray.length > 1) return inputArray[0] + "-" + inputArray[1];
        return input;
    }
}
