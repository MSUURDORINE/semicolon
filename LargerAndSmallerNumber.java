import java.util.Scanner;

public class LargerSmaller{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberOne = input.nextInt();

        System.out.print("Enter a number: ");
        int numberTwo = input.nextInt();


        if(numberOne > numberTwo){
            System.out.println("Largest: " + numberOne);
            System.out.println("Smallest: " + numberTwo)
        }

        else{
            System.out.println("Largest: " + numberTwo);
            System.out.println("Smallest: " + numberOne)
        }
    }
}
