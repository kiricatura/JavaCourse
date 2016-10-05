package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(distance(45, 20)); // TASK 1
        System.out.println("prod=" + product(4, 6)); // 24
        System.out.println("quat=" + quatient(10, 3)); // 3 times
        System.out.println("rest=" + rest(10, 3)); // 1 modulo remind left
        System.out.println("power=" + power(2, 8)); // 2 multiplied by itself 8 times = 256
        System.out.println("sqrt=" + sqrt(50)); //  7
    }

    public static int power(int x, int y) {
        if (y==0){
                return 1;
            }
        if (x== 0) {
            return 0;
        }
            int result = x;
        for (int i=1; i < y; i++){
        result = product(result, x);
        }
        return result;
    }

    public static int sqrt(int z){
        int y = 2;
        int x = 0;
        for (int i = 1;  power(i, y) < z; i++){
            x +=1;
            }
        return x;
        }

    public static int product(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }

        int prod = 0;
        int small = x;
        int big = y;
        if (x > y) {
            small = y;
            big = x;
        }
        for (int i = 0; i < small; i++) {
            prod += big;
        }
        return prod;
    }

    public static int quatient(int x, int y) {
        if (x == y) {
            return 1;
        }
        int small = x;
        int big = y;
        int count = 0;
        if (x > y) {
            big = x;
            small = y;
        }
        for (int prod = small; prod < big; prod += small) {
            count++;
        }
        return count;
    }

    public static int rest(int x, int y) {
        return distance(x, product(quatient(x, y), y));
    }

    public static int distance(int x, int y) {
        int z = 0;
        if (y < x) {
            for (int i = 1; i < x; i++) {
                z++;
                int step = i + y;
                if (step == x) {
                    return z;
                }
            }
        } else {
            for (int i = 1; i < y; i++) {
                z++;
                int step = i + x;
                if (step == y) {
                    return z;
                }
            }
        }
        return z;
    }
}

