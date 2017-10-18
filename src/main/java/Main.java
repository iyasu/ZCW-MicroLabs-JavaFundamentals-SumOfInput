import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        int userNumber;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        userNumber = in.nextInt();

        System.out.println("The sum of the numbers from 1 to " + userNumber + " is " + sumOfNumbers(userNumber));
    }

    public static int sumOfNumbers(int n){
        int sum = 0;

        for(int i = n; i > 0; i--){
            sum += i;
        }
        return sum;
    }
}
