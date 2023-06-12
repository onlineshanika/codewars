package com.hackerrank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoops {
//a+2pow(0).b+2pow(1).b+....+2pow(n-1).b)

    public static void main(String[] argh) {
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
        int a = 5;
        int b = 3;
        int n = 5;
        double sum = a;
        for (int k = 0; k < n; k++) {
            sum = (Math.pow(2, k) * b) + sum;
            System.out.print((int) sum + " ");
        }

//            System.out.print(sum.intValue() +" ");
//        }
//        in.close();
    }
//    8 14 26 50 98
//

}
//8+2*3=14
//14+4*3=26