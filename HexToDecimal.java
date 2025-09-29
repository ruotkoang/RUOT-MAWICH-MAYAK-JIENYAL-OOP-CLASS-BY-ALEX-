import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal digit: ");
        char hexDigit = scanner.next().charAt(0);
        int decimal = hexToDecimal(hexDigit);
        System.out.println("Decimal value of " + hexDigit + " is: " + decimal);
    }

    public static int hexToDecimal(char hexDigit) {
        if (hexDigit >= '0' && hexDigit <= '9') {
            return hexDigit - '0';
        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
            return 10 + (hexDigit - 'A');
        } else if (hexDigit >= 'a' && hexDigit <= 'f') {
            return 10 + (hexDigit - 'a');
        } else {
            System.out.println("Invalid hexadecimal digit");
            return -1; // or throw an exception
        }
    }
}
