import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double ans1, ans2, ans3, ans4;

        System.out.println("Question 1: 40 + 26 = ");
        ans1 = read.nextDouble();
        if(ans1 == 66){
            System.out.println("Correct Answer");
        }else {
            System.out.println("Wrong Answer");
        }

        System.out.println("Question 2: 83 - 30 = ");
        ans2 = read.nextDouble();
        if(ans2 == 8){
            System.out.println("Correct Answer");
        }else {
            System.out.println("Wrong Answer");
        }

        System.out.println("Question 3: 50 * 4 = ");
        ans3 = read.nextDouble();
        if(ans3 == 200){
            System.out.println("Correct Answer");
        }else {
            System.out.println("Wrong Answer");
        }

        System.out.println("Question 4: 25 / 2 = ");
        ans4 = read.nextDouble();
        if(ans4 == 12.5){
            System.out.println("Correct Answer");
        }else {
            System.out.println("Wrong Answer");
        }



    }
}