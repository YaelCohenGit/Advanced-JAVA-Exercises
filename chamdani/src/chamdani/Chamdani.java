/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamdani;

import java.util.Arrays;

public class Chamdani {
// generators
// seder godel: o(n)

    public static void generator(int[] t, int x) {
        int count = 0, i = 0, j = 0;
        Arrays.sort(t);
        j = t.length - 1;
        for (i = 0; i < j; i++) {
            if (t[i] + t[j] >= x && i !=j) {
                count++;
                j--;
                System.out.println("זוג גנרטורים: " + t[i] + ", " + t[j]);
            }
        }
        System.out.println("מספר המכונות שהופעלו הוא " + count);
    }

    public static void main(String[] args) {
        int[] a = new int[]{42, 111, 55, 6, 65, 20, 20, 77, 121, 5, 17, 31, 2, 100};
    
      generator(a,60);
    }

}
