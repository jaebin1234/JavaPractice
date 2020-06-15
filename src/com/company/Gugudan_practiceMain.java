package com.company;

/*구구단 구현*/
/* 메소드 활용하기 */


import java.util.Scanner;

public class Gugudan_practiceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단중 몇단을 알고싶으신가요?");
        int n = sc.nextInt();

        int result[] = Gugudan_practiceSub.calculate(n);
        for(int i=0;i<result.length;i++){
            Gugudan_practiceSub.print(n,i,result);
        }
    }

    }


