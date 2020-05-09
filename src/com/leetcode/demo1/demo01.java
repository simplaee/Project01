package com.leetcode.demo1;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        tiaoyue(a);

    }

    private static void tiaoyue(int[] a) {
        int c = 0 ;
        int s1=0;
        for (int i = 0; i < a.length;) {
            int[] s = new int[a[i]] ;
            for (int j = 0; j < a[i]; j++) {
                i = a[j] + i ;

                s[j] = i;

                i -= a[j];
            }
            c++;

            for (int k = 0; k < s.length; k++) {
                if(s[k]>s1){
                    s1 = s[k];
                }
            }


            if(s1 == a.length){
                System.out.println(c);
                break;
            }
        }

    }


}
