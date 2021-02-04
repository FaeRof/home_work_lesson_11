package com.home_work_lesson_11;

import com.home_work_lesson_11.funinterface.FunInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.close();


        int testNumber = 11;
        String testLine = "Who are you? I didn't call you!";


        FunInterface<String> funInterface_1 = t -> new StringBuilder(t).reverse().toString();
        FunInterface<Integer> funInterface_2 = t -> {
            int result = 1;
            for (int i = 1; i <= t; i++) {
                result = result * i;
            }
            return result;
        };


        if (index == 1) {
            System.out.println(funInterface_1.select(testLine));
        } else if (index == 2) {
            System.out.println(funInterface_2.select(testNumber));
        } else System.out.println("Wrong index");

    }
}
