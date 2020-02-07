package com.company;
import java.util.Random;
import java.util.Scanner;

public class guessGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        byte sentinelValue = 0;
        int randNum = randNumBetween0to20();
        System.out.print(randNum + "Guess a number between 0 - 20 in 5 chances: ");
        short guessedNum = reader.nextShort();
        while (sentinelValue <= 4) {
            if (20 >= guessedNum && guessedNum > randNum) {
                System.out.printf("your guess is too high, guess again" +
                        "\t\t\t\t\t\t\t\tLives left = %d", (5 - sentinelValue));
                guessedNum = reader.nextShort();
                System.out.println("sv " + sentinelValue);
                sentinelValue += 1;

                continue;

            }
            else if (guessedNum < randNum && guessedNum >= 0) {
                System.out.printf("your guess is too low, guess again" +
                        "\t\t\t\t\t\t\t\tLives left = %d", (5 - sentinelValue));
                guessedNum = reader.nextShort();
                System.out.println("sv " + sentinelValue);
                sentinelValue += 1;

                continue;
            }
            else if (guessedNum == randNum){
                System.out.printf("congrats you guessed the number right in %d attempts", sentinelValue);
//                sentinelValue += 1;
                break;
            }
            else
                System.out.println("only numbers between 0 to 20 are allowed!");
                System.out.print("guess again");
                guessedNum = reader.nextShort();
        }
        if (sentinelValue == 5)
            System.out.println("GAME OVER! actual number was " + randNum);
    }
    public static int randNumBetween0to20(){
        Random num = new Random();
        float p = num.nextFloat();
        return (int) (p * 20);
        }

    }

