import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. t: Z -> Z. t(x) = 3x");
        System.out.println("2. t: Z -> Z. t(x) = x^2");
        System.out.println("3. t: Z -> Z. t(x) = 2x - 2");
        System.out.println();
        System.out.println("Enter a number (1-3) to choose a function: ");
        Scanner scan = new Scanner(System.in);
        int iMenu = scan.nextInt();
        System.out.println();
        System.out.println("Enter x (1-100): ");
        int x = scan.nextInt();
        System.out.println();

        switch(iMenu) {
            case 1:
                int resultOne = 3 * x;
                System.out.println("Output: " + resultOne);
                if((resultOne) / 3 == x) {
                    System.out.println("This function is injective.");
                }
                else {
                    System.out.println("This function is not injective.");
                }
                break;
            case 2:
                double resultTwo = Math.pow(x, 2);
                System.out.println("Output: " + resultTwo);
                if(Math.sqrt(resultTwo) == x) {
                    if(Math.pow(-x, 2) == resultTwo) {
                        System.out.println("This function is not injective.");
                    }
                    else {
                        System.out.println("This function is injective.");
                    }
                }
                else {
                    System.out.println("This function is not injective.");
                }
                break;
            case 3:
                int resultThree = 2 * x - 2;
                System.out.println("Output: " + resultThree);
                if(((resultThree) + 2) / 2 == x) {
                    System.out.println("This function is injective.");
                }
                else {
                    System.out.println("This function is not injective.");
                }
                break;
            default:
                System.out.println("Part of your input was invalid.");
        }

    }
}