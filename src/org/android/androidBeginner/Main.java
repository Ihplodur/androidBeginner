package org.android.androidBeginner;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 21;
        int guessCount = 0;
        int guess = -1;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // TODO Welcome Massage
        System.out.println("Hello to guess the number!");
        // TODO ASK for name
        System.out.println("What´s your name?");
        String name = scanner.next();
        // TODO ask for gamestart
        System.out.println(name + " do you want to start the game? \n\t(y) \n\t(n)");
        String yesNo = scanner.next().toLowerCase();

        while (!yesNo.equals("y")){
            System.out.println(name + " do you want to start the game now? \n\t(y) \n\t(n)o");
            yesNo = scanner.next().toLowerCase();
        }
        // TODO generate a random number
        int number = random.nextInt(1, max);
        // TODO ask for input int between 1 and max
        while (guessCount<5){
            guessCount ++;
            System.out.println("Please enter a number between 1 and "+ (max-1));
            guess = scanner.nextInt();
            if (guess < number){
                System.out.println(guess+" is to low");
            }
            else if (guess > number){
                System.out.println(guess+" is to high");
            }
            else {
                System.out.println(guess+" is the searched number! \n" +name+ " you won in your "+ guessCount + " try !");
                break;
            }
        }
        //TODO win/loose condition
        if (guessCount==5 & guess != number){
            System.out.println(number+" was the searched number! \nSorry " +name+ " you lost!");
        }
    }
}