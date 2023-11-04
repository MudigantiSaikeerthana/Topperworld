import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
public static void main(String[]args){
Random rand =new Random();
Scanner scanner=new Scanner(System.in);
int randomNumber=rand.nextInt(100)+1;
System.out.println("random number is"+randomNumber);
while(true){
System.out.println("Enetr your guess between 1-100");

int guess=scanner.nextInt();
if(guess==randomNumber){
System.out.println("guess number is correct you win the game");
break;
}
else if(randomNumber>guess){
System.out.println("the number is greater guess again");
}
else{
System.out.println("the number is smaller guess again");
}
}
}
}

