/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maarachim;

/**
 *
 * @author כהן יעל
 */
import java.util.Scanner;

public class Maarachim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int a = 0, b = 0, average = 0, sum = 0, g = 0, merchak = 0, average2 = 0, sum2 = 0;
//        System.out.println("הכנס חמש נתונים מספריים");
//        int[] srr = new int[5];
//        for (g = 0; g < 5; g++) {
//            srr[g] = input.nextInt();
//            sum = sum + srr[g];
//        }
//        average = sum / 5;
//        for (g = 0; g < 5; g++) {
//            merchak = Math.abs(srr[g] - average);
//            sum2 = sum2 + merchak;
//
//        }
//        average2 = sum2 / 5;
//        System.out.println("ממוצע הנתונים הוא" + average);
//        System.out.println("סטיית התקן היא" + average2);
//        int max = 0, i = 0, ms = 0; //ms=mispar siduri
//        System.out.println("הכנס ארבע מספרים למערך");
//        int[] arr = new int[4];
//        for (i = 0; i < 4; i++) {
//            arr[i] = input.nextInt();
//            if (arr[i] > max) {
//                max = arr[i];
//                ms = i;
//            }
//        }
//        System.out.println("המקום הסידורי של האיבר הגדול הוא" + (ms));
//       
//       int min=999, j=0;
//        System.out.println("הכנס חמש מספרים למערך");
//       int []brr=new int [5];
//       for(j=0; j<5; j++)
//       {
//       brr [j]=input.nextInt();
//       if(j<min)
//       {
//           min=j;
//            brr[0]=j;
//       }   
//       
//tirgul maarachim
//amud 11 sheela 14
//        int[] t = new int[10];
//        int x = 0, i = 0, j = 0, count = 0, r=0;
//        System.out.println("please enter 10 numbers");
//        for (i = 0, j = 0; i < 10; i++) {
//            x = input.nextInt();
//            if (x > 0) {
//                t[j] = x;
//                j++;
//                count++;
//            }
//
//        }
//
//        for (i = 10 - count; i < 10; i++) {
//            t[i] = 0;
//        }
//        
//        for(int r = 0; r < 10; r++) {
//            System.out.println(t[j]);
//        }
//amud 11 sheela 15
//        int[] t = new int[100];
//        int[] t1 = new int[50];
//        int[] t2 = new int[50];
//        int i = 0, j = 0;
//        for (i = 0, j = 0; i < 50; i++, j = j + 2) {
//            t[j] = t1[i];
//            t[j + 1] = t2[i];
//        }
//amud 11 sheela 18 {44,7,12,51,43,23,30,19,29,15}
//        int[] t = new int[]{44, 7, 12, 51, 43, 23, 30, 19, 29, 15};
//        int i = 0, j = 0, x = 0, sum1 = 0, sum2 = 0, num = 0;
////        System.out.println("enter 10 numbers");
////        for (i = 0; i < 10; i++) {
////
////            t[i] = input.nextInt(); 
////        }
//
//        for (i = 0; i < 10; i++) {
//            sum1 = t[i] + t[i + 1] + t[i + 2] + t[i + 3] + t[i + 4];
//            sum2 = t[i + 1] + t[i + 2] + t[i + 3] + t[i + 4] + t[i + 5];
//            if (sum1 > sum2) {
//                sum2 = sum1;
//                num = i;
//            }
//        }
//        System.out.println("the Continuous number are: " + t[num] + t[num+1]+ t[num+2]+ t[num+3]+ t[num+4]);
////        System.out.println("the Continuous numbes are: " + t[num+1]);
////        System.out.println("the Continuous numbes are: " + t[num+2]);
////        System.out.println("the Continuous numbes are: " + t[num+3]);
////        System.out.println("the Continuous numbes are: " + t[num+4]);
//        System.out.println("and their sum is " + sum1);
//amud 11 sheela 19
//        int[] t = new int[20];
//        int[] arr = new int[10];
//        int i = 0, count = 0, achadot = 0, asarot = 0, meot = 0, max = 0, num, k = 0;
//        System.out.println("הכנס עשרים מספרים בין אפס לשלוש מאות");
//        for (i = 0; i < 20; i++) {
//            num = input.nextInt();
//            while (t[i] > 300 || t[i] < 0) {
//                System.out.println("הודעת שגיאה: יש להכניס מספר בין אפס לשלוש מאות");
//                System.out.println("הכנס מספר אחר");
//                num = input.nextInt();
//            }
//            t[i] = num;
//            if (t[i] < 9)//sifra achat
//            {
//                count += 1;
//                achadot = t[i];
//                arr[achadot]++;
//            }
//            if (t[i] < 99)//shtei sfarot
//            {
//                count += 2;
//                achadot = t[i] % 10;
//                asarot = t[i] / 10;
//                arr[achadot]++;
//                arr[asarot]++;
//            }
//            if (t[i] > 99)//shalosh sfarot
//            {
//                count += 3;
//                achadot = t[i] % 10;
//                asarot = t[i] / 10 % 10;
//                meot = t[i] / 100;
//                arr[achadot]++;
//                arr[asarot]++;
//                arr[meot]++;
//            }
//        }
//        for (int j = 0; j < 10; j++) {
//            if (arr[j] > max) {
//                max = arr[j];
//                k = j;
//            }
//        }
//        System.out.println("the number of the digits in the array is" + count);
//        System.out.println("the most common digit is " + k + " and it repeat itself " + max + " times");
//chipus binary bemaarach memuyan
//        int k = 0, x = 0, low = 0, mid, high = 8, place = 0;
//        int[] t = new int[]{1, 2, 3, 4, 5, 56, 80, 90, 99};
//        mid = (high + low) / 2;
//        System.out.println("enter a number");
//        x = input.nextInt();
//        while (t[mid] != x) {
//
//            if (x == t[mid]) {
//                place = mid;
//                break;
//            } else if (x > mid) {
//                low = mid;
//            } else {
//                high = mid;
//            }
//            if (low == high) {
//                place = -1;
//            }
//
//        }
//
//        if (place == -1) {
//            System.out.println("the number is not in the array");
//        }
//        System.out.println("the place of the number is " + place);
        //sheela 2 bmivchan shhaya
//        int[] a = new int[]{2, 8, 8, 8, 12, 24, 7, 7, 6};
////        int[] a = new int[]{6, 7, 7, 24, 12, 8, 8, 8, 2};
//        int[] b = new int[8];
//        int count = 1;
//        for (int i = 0; i < a.length - 2; i++) {
//            if (a[i] == a[i + 1]) {
//                count++;
//            }
//            if (a[i + 1] != a[i + 2] && count > 1) {
//                b[count] = a[i];
//                count=1;
//            } else {
//                count = 1;
//            }
//            if(i<=a.length])
//        }
//        System.out.println("maarach a: ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + ", ");
//        }
//        System.out.println("maarach b: ");
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i] + ", ");
//        }
//        int[] a = new int[]{2, 8, 8, 8, 12, 24, 7, 7, 6};
//        int[] b = new int[8];
//        int count = 1;
//        for (int i = 0; i < a.length - 1; i++) {
//            if (a[i] == a[i + 1]) {
//                count++;
//                for (int j = i; j < a.length - (i+1); j++) {
//                    if(a[j+1]==a[j+2])
//                        count++;
//                }
//                b[count] = a[i];
//                count=1;
//            }
//        }
//        System.out.println("maarach a: ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + ", ");
//        }
//        System.out.println("maarach b: ");
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i] + ", ");
//        }
        int[] a = new int[]{2, 8, 8, 8, 12, 24, 7, 7, 6};
        int[] b = new int[8];
        int count = 1, count2 = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
                for (int j = a.length - 1; j > i; j--) {
                    count2++;
                    if (a[j] == a[i + 1]) {
                        count = a.length - i - count2 + 1;
//                        System.out.println("count=" + count + " i=" + i + " j=" + j);
                        break;
                    }

                }
                b[count-1] = a[i];
                count = 1;
                count2 = 0;
                i = i + count - 1;
            }
        }
        System.out.println("maarach b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + ", ");
        }

    }
}
