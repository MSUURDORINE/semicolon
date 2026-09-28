import java.util.Scanner;

public class Upper{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();

          char character = word.charAt(0);

            if (character.isUpper){
                System.out.println("The first character is uppercase.");
} 
                else{ 
               System.out.println("The first character is lowercase.");
} 
}

  
}

