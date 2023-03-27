package oopsandbeyond;
import java.util.Random ;
import java.util.Scanner ;
//Exercise 3 : create a java class guess the number which will generate a random number between 1-100 and takes and input from the user,
// guessing its value , if the input value isn't correct , java will return whether the entered number is smaller or larger than the number,
// and again take the input from the user , till the user gives a right answer :
public class guessthenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        int gc= rand.nextInt(1,101);
        int rc= 5 ;
        System.out.println("You have a total of 5 chances to give the correct answer : ");
        for (int i = 0 ; i<rc ; i++){
            System.out.print("Guess the number (1-100) : ");
            int uc=sc.nextInt();
            if(uc==gc){
                System.out.println("This is the correct choice !!!! ");
                return ;
            }
            else if(uc<gc){
                System.out.println("The entered number is smaller than the right number , try again : ");
                System.out.println("chances remaining : "+(rc-i-1));
            }
            else {
                System.out.println("The entered number is larger than the right number , try again : ");
                System.out.println("Chances remaining : "+(rc-i-1));
            }
        }
        System.out.println("You ran out of all chances , the correct answer was : "+rc);
    }
}
