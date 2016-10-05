package com.company;

public class Main {

    public static void main(String[] args) {
        // int size = 4;
        int[] arr = {100, -30, 4, 7, 4, 78, 4, 56, 4, 56, 4, -2};
        // int[] grades = new int[size];
        // grades[0] = 87;
        // System.out.println("the size of grades array is: " + grades.length);
        // display(arr);
        // System.out.println("Sum is " + sum(arr));
        // System.out.println("Max is " + max(arr));
        // System.out.println("Is there 56? " + check(arr, 56));
        // System.out.println("Is last positive? " + isLastNumPositive(arr));
       // System.out.println(display(arr));
        // System.out.println("The sum of 1-3-5 index is " + sumOfIndexes(arr));
       // System.out.println("Nu mber 56 appears" + numberOfTimes(arr, 56) + " times " );
        // int[] largeArray = multipleArr(arr);
        // display(largeArray);
        // printArray(arr);
        // int[] reverseArr = revArr(arr);
        // display(reverseArr);
        System.out.println(maxDif(arr));
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int maxDif(int[] arr){
        int min = arr[0];
        int max = arr[arr.length-1];
        for(int i=0; i < arr.length; i++){
            if(min < arr[i]) {
                min = arr[i];
            }
            else if(max > arr[i]){
                    max = arr[i];
                }
        }
        return min+max;
    }
    public static int[] revArr(int[] arr){
        int temp = arr.length-1;
        int [] revArray = new int[arr.length];
                for(int i=0; i < arr.length; i++) {
                    revArray[i] = arr[temp];
                    temp--;
                }
        return revArray;
    }
    public static int sum(int[] arr){
        int summ = 0;
        for (int i = 0; i < arr.length; i++){
            summ += arr[i];
        }
        return summ;
    }
    public static int max(int[] arr){
        int maxx = 0;
        for (int i = 0; i < arr.length; i++){
            if(maxx < arr[i]){
                maxx = arr[i];
            }
        }
        return maxx;
    }
    public static boolean check(int[] arr, int x){
        boolean exists = false;
        for (int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                exists = true;
            }
        }
        return exists;
    }
    public static boolean isLastNumPositive(int[] arr){
        boolean isPositive = true;
        int last = arr[arr.length-1];
        if(last < 0) {
            isPositive = false;
        }
        return isPositive;
    }

   public static int sumOfIndexes(int[] arr){
        int sumInd = 0;
        for (int i = 0; i < arr.length; i+=2){
            sumInd += arr[i];
        }
        return sumInd;
    }
    public static int numberOfTimes(int[] arr, int x){
        int times = 0;
        for (int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                times++;
            }
        }
        return times;
    }
    public static int[] multipleArr(int[] arr){
        int[] arr2 = new int [arr.length*2];
        for (int i = 0; i < arr.length; i++){
            arr2[i * 2] = arr[i];
            arr2[(i * 2) +1] = arr[i];
        }
        return arr2;
    }
}
