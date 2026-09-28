import java.util.Scanner;
    public class Fixed{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favourite Number: ");
        int favouriteNumber = input.nextInt();
        boolean repeat = true;
        int fixedNumber = 17;
while (repeat){
       if (favouriteNumber > fixedNumber){
        System.out.println("Above, Try again");
        repeat = true;
}
        else
            if(favouriteNumber < fixedNumber){
               System.out.println("Below, Try again");
                repeat = true;
}
        else
            if(favouriteNumber == fixedNumber){
                System.out.println("Correct");
                repeat = false;
}


}

}


}




