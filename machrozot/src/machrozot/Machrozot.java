/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machrozot;

import java.util.Scanner;
import java.lang.String;

public class Machrozot {

    public static void kelet(String[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 10 names");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter a name");
            arr[i] = input.nextLine();
        }
    }

    public static void pelet(String[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if ((arr[j].compareTo(arr[j + 1])) > 0) {
                    String b = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = b;
                }
            }
        }
    }
//amud 14 
//sheela 1

    public static void revach(String x) {
        x = x.replace(' ', '_');
        System.out.println(x);
    }
//sheela 2

    public static void milim(String x) {
        int count = 1;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                count++;
                System.out.println(count);
            }
        }
    }

    //sheela 3
    public static void tat(String word, int x, int y) {
        if (y > word.length()) {
            y = word.length() - 1;
        }
        word = word.substring(x, y);
        System.out.println(word);
    }
    //sheela 4

    public static void keisar(String word, int num) {

    }

    public static void main(String[] args) {
//        String[] names2 = new String[7];
////        kelet(names2);
//        String[] names1 = new String[]{"a", "d", "c", "a", "a", "n", "z", "b", "l", "m"};
////        pelet(names1);
//        sort(names1);
//        pelet(names1);
        revach("yaeli cohen");
        milim("yaeli cohen");
        tat("yaelicohen", 2, 22);
    }

}
