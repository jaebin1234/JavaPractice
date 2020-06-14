package com.company;

/*구구단 구현*/

import java.util.Scanner;

public class gugudan_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단의 몇단을 알고싶으신가요?");
        int n = sc.nextInt();

        int [] result = new int[9];
        for(int i = 0; i< result.length;i++){
            result[i] = n*(i+1);
            System.out.println(n+"*"+(i+1)+"="+result[i]);
        }

    }
}

