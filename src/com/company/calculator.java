package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {


        Scanner a =new Scanner(System.in);
        System.out.println("b를 입력하시오.(단 양수를 입력하시오.)");
        int b = a.nextInt();
        System.out.println("c를 입력하시오.(단,c는 0이 아니어야한다.)");
        int c = a.nextInt();
        //Scanner b =new Scanner(System.in);
        System.out.printf("두수의 합 %d \n",b+c);
        System.out.printf("두수의 차는 %d \n",b-c);
        System.out.printf("두수의 곱은 %d \n",b*c);
        System.out.printf("두수의 나눗셈의 몫은 %d \n",b/c);

    }

}

