import java.util.Scanner;
public class AsterisksPrinter {
    public static void main (String [] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number between one and 30: ");
    int input1 = input.nextInt ();

    System.out.print("Enter second number between one and 30: ");
    int input2 = input.nextInt ();

    System.out.print("Enter third number between one and 30: ");
    int input3 = input.nextInt ();

    System.out.print("Enter fourth number between one and 30: ");
    int input4 = input.nextInt ();

    System.out.print("Enter fifth number between one and 30: ");
    int input5 = input.nextInt ();
    
    
    if (input1 <= 30) {
    int starter1 = 1;
    while ( starter1 <= input1) {
    System.out.print("*");
    starter1++;
}

}

    System.out.print("\n");
    

    if  (input2 <= 30) {
    int starter2 = 1;
    while ( starter2 <= input2) {
    System.out.print("*");
    starter2++;
}

}
   
    System.out.print("\n");

    if  (input3 <= 30) {
    int starter3 = 1;
    while ( starter3 <= input3) {
    System.out.print("*");
    starter3++;
}
}


    System.out.print("\n");


   if  (input4 <= 30) {
    int starter4 = 1;
    while ( starter4 <= input4) {
    System.out.print("*");
    starter4++;
}
}
  

    System.out.print("\n");

   if  (input5 <= 30) {
    int starter5 = 1;
    while ( starter5 <= input5) {
    System.out.print("*");
    starter5++;
}
    
}

    System.out.print("\n");

    }
    
}
