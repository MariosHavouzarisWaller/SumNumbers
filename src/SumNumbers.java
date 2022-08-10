import java.util.Scanner;

public class SumNumbers {

    // Here we use a while loop to sum numbers from 1 to the input (sumTo) adding each to the sumTotal
    public static void main(String[] args) {
        // Initialising the scanner and the variables
        int sumTotal = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();
        int count = 1;

        // Use a count to iterate up to the input (sumTo), each time adding that onto sumTotal
        while (count <= sumTo) {
            sumTotal = sumTotal + count;
            count++;
        }
        System.out.println(sumTotal);
    }
}