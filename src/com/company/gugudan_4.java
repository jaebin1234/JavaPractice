package com.company;

/*구구단 구현*/

import java.util.Scanner;

public class gugudan_4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("구구단 중 몇단을 알고 싶으신 가요?");
        int n = sc.nextInt();

        if(n>1 && n<10){
            for(int i=1;i<10;i++){
                int result = n * i;
                System.out.println(n + "*" + i + "=" + result);
            }
        }else if(n<2 || n>9){
            System.out.println("2~9 사이의 숫자를 입력하시오");
        }

    }
}

