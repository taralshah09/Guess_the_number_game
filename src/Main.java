
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) Math.round(Math.random() * 100 + 1);
        int guessed = number;
//        System.out.println(guessed);
        int count = 0;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("your guess : ");
            int n = scanner.nextInt();

            if(n == guessed){
                System.out.println("Hurrah you guessed it right! " + guessed+" is the correct answer!" );
                System.out.print("you took "+ (count+1) +" chances");
                break;

            }
            else if(n > guessed){
                System.out.print("Lower\n");
            }
            else{
                System.out.print("higher\n");
            }
            count++;
        }


    }
}