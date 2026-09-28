import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.print("Equilateral: ");
    double hypotenuse = input.nextDouble();
    
    double area = (Math.sqrt(3)/4 * (hypotenuse * hypotenuse)  );
    double volume = area * hypotenuse ;

    System.out.println("The area is " + area);
    System.out.println("The volume of the triangular prism is " + volume);


}



}

