import java.util.Scanner;


public class PrimeFactors {
    public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.print ("Enter Number: ");

    int number = input.nextInt();

 for (int index = 2; index <=  number; index ++){

        

    while(number % index == 0) {

    System.out.println(index + " ");
    number /= index;

    }
    
    }
    
    }
}
    


