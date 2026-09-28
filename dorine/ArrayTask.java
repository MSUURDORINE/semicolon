import java.util.Scanner;
public class ArrayTask{
    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
      
        int[] number   = new int[5];
       

        for(int i = 0; i < 5; i++  ){ 

        System.out.println("Enter number"+ (i +1));

        int firstNumber = inputCollector.nextInt();

        number[1] = firstNumber;
    }

		for(int i = 0; i < 5; i++);

        System.out.println(number[1]);
        
    




        int largest = number[0];
        int smallest = number[0];
        int sum = 0;


        for(int count = 0; count < 5; count++){

            if(number[count] > largest){
             largest = number[count];
        }

             if(number[count] < smallest){
        }       smallest = number[count];

         sum += number[count];
 }       

       double average = (double) sum / number.length;

        System.out.println("Largest is: " + largest);
        System.out.println("Smallest is: " + smallest);
        System.out.println("Average is: " + average);

    }


}




