import java.util.Scanner;

public class MyClass {

    Scanner sc =new Scanner( System.in);
    int number= sc.nextInt();
    int mod;
    int count;


    public void sendNumbers(){
        for (int i = 1; i <= number; i++) {
             separateDigits(i);
        }
        System.out.println(count);
        }

   public void separateDigits(int number) {
       while (number > 0) {
           mod = number % 10;
           number = number / 10;
           if (mod == 1)
               count++;
       }

       }
   }


