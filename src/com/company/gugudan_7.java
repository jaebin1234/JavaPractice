package com.company;

/*구구단 구현*/
/* 메소드 활용하기 */


import java.util.Scanner;

public class gugudan_7 {
    public static int[] calculate(int times) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int dan, int i, int[] result) {
        System.out.println(dan + "*" + (i + 1) + "=" + result[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단의 몇단을 알고 싶으신 가요?");
        int n = sc.nextInt();

        int[] result = calculate(n);
        for (int i = 0; i < result.length; i++) {
            print(n, i, result);
        }


    }
}

