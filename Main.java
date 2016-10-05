package com.company;

import java.util.Random;

public class Main {

    static int[] myLotto = {5,6,2,15,34,56};        // 1-36.
    static int[] lotto = new int[6];
    static int myExtra = 3;
    static int extra;
    static int guesses = 0;
    static boolean won = true;
    public static void main(String[] args) {

      // Math.sqrt();

        random();
        display(lotto);
    }

    public static void random(){
        Random random = new Random();
        for (int i = 0; i < lotto.length; i++){
            int number = random.nextInt(36);
            lotto[i] = number;
            if(number == myLotto[i]){
                guesses++;
            }
        }
        Random random1 = new Random();
        int number1 = random.nextInt(6);
         if(number1 != myExtra){
            won = false;
        }
        }

    public static void display(int[] lotto){
        for (int i = 0; i < lotto.length; i++){
            System.out.println(lotto[i]);
        }
        System.out.println("You guessed "+ guesses + "/6 and extra: " + won);
    }

}
