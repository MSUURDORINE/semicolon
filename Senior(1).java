import java.util.Scanner;

public class Grade{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 13){
             System.out.println("Child");
            }

        if (age > 13 && age < 17){
             System.out.println("Teenager");
            }

        if (age > 18 && age < 64){
             System.out.println("Adult");
            }

        if (age > 65){
            System.out.println("Senior");
            }

        }
    }
