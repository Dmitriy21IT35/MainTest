package com.company;

import java.util.Scanner;

public class Main {
//Для решения формульных задач.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Scanner in1 = new Scanner(System.in);

        int x = in1.nextInt();
        if (n >= 0) {
            double s = 0;
            for (int i = 0; i < n; ++i) {

                double p = (Math.pow(-1, i)) *(Math.pow(x, 2*n))/ getFactorial(n);
                s = p + s;
            }
            System.out.println(s);
        }
        else {
            System.out.println("Ошибка!");
        }
    }

    private static double getFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * getFactorial(n - 1);
        }
    }
}