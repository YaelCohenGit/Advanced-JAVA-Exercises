/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;

/**
 *
 * @author כהן יעל
 */
public class Functions {

    /**
     * @param args the command line arguments
     */
    //choveret functions
    //amud 7 
    public static void function1(int x, int y) {
        for (int i = x + 1; i < y; i++) {
            System.out.println(i);
        }
    }

    public static int function3(int x) {
        int sum = 0;
        for (int i = 1; i < x + 1; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    public static int function4(int x) {
        if (x < 0) {
            x = x * (-1);
        }
        System.out.println(x);
        return x;
    }

    public static int function5(int x, int y) {
        int count = 0;
        while (x > 0) {
            if (x % 10 == y) {
                count++;
            }
            x = x / 10;
        }
        System.out.println(count);
        return count;
    }

    public static void function7(int[] t, int[] t2, int[] t3) {
        int i = 0, j = 0, k = 0;
        while (i < t.length && j < t2.length) {
            if (t[i] > t2[j]) {
                t3[k] = t[i];
                i++;
                k++;
            } else if (t[i] < t2[j]) {
                t3[k] = t2[i];
                j++;
                k++;
            } else if (t[i] == t2[j]) {
                t3[k] = t[i];
                i++;
                j++;
                k++;
            }
        }
        if (i < t.length) {
            for (int m = i; m < t3.length; m++) {
                t3[k] = t[m];
                k++;
            }
        }

        if (j < t2.length) {
            for (int n = j; n < t3.length; n++) {
                t3[k] = t2[n];
                k++;
            }
        }

    }

    //amud 6 - sheela kala of misrad hachinuch test
    public static int aleph(int num, int digit) {
        int a = 0, x = 0;
        a = num * 10 + digit;
        return a; //a=num+digit lfi seder
    }

    public static int bet(int first) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int x = 0, count=0;
        System.out.println("now enter 10 numbers.");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            count++;
            if (arr[i] == 0 || arr[i] == 9) {
                break;
            }
        }
        System.out.println("finished first loop");
        for (int i = 0; i < count; i++) {
            first = first * 10 + arr[i];
        }
//        System.out.println(first);
        return first;

    }

//    public static int gimel(int x) {
//   
//    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int[] t = new int[]{1, 3, 5, 8};
//        int[] t2 = new int[]{2, 4, 6, 7};
//        int[] t3 = new int[8];
//        function7(t, t2, t3);
//        for (int i = 0; i < t3.length; i++) {
//            System.out.print(t3[i] + " ");
//        }
        //amud 6 - sheela kala of misrad hachinuch test
        int x = 0, count = 0;
        for (int i = 0; i < 980; i++) {
            System.out.println("welcome to our company! please press the number of extension.");
            int y = input.nextInt();
            x = bet(y);
            if (x % 10 == 9) {
                count++;
            }
        }
        System.out.println("the num of customers who left a massage is: " + count);

    }

}
