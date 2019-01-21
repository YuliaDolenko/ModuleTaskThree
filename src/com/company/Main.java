package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        area();
    }

    public static void area() {
        Scanner enter = new Scanner(System.in);
        int a = enter.nextInt();
        int b = enter.nextInt();
        int c = enter.nextInt();

//        double a = 5;
//        double b = 6;
//        double c = 2;
        double p = (a + b + c) / 2;
        if (p < a || p < b || p < c) {
            System.out.println("Введите ещё раз числа, меньше, у вас получаются число больше, чем p =" + p + " ,а квадратный корень из отрицательно числа не вычисляется!");
            area();
            System.out.println("Предыдущее не вычислялось и равнялось: ");
        }
        double s;

        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        int result = (int) s;
        System.out.println("Площадь равна: " + s + ", это примерно: " + result);
    }
}
