import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumUp = 0 , i = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int givenNum = scanner.nextInt();
        System.out.println("*************");
        scanner.close();
        double average = 0;

        while(i < givenNum){
            i++;
            if(i % 12 == 0){
                sumUp += i;
                average = sumUp / (givenNum / 12);

            }
        }
        System.out.print("Sum : " + sumUp + " " + "Average : " + average);

    }
}