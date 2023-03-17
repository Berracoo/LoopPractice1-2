import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int givenNum = input.nextInt();
        System.out.println();
        for(int i = 0; i < givenNum; i++){
            if(i % 2 == 0){
                System.out.println("Numbers that are even excluding given number : " + i);
            }
        }


   
    }
}