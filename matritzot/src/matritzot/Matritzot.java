/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matritzot;

import java.util.Scanner;

/**
 *
 * @author כהן יעל
 */
public class Matritzot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//amud 21 sheela 1 - a way which is better below
//        int i, j, sum = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0, k, l, sum8 = 0, sum9 = 0, n, shura, amuda;
//        int[][] mat = new int[7][7];
//        mat[0] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[1] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[2] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[3] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[4] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[5] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[6] = new int[]{1, 2, 3, 4, 5, 6, 7};
//
//        for (i = 0; i < 7; i++) {
//            sum1 = sum1 + mat[0][i];
//            sum2 = sum2 + mat[1][i];
//            sum3 = sum3 + mat[2][i];
//            sum4 = sum4 + mat[3][i];
//            sum5 = sum5 + mat[4][i];
//            sum6 = sum6 + mat[5][i];
//            sum7 = sum7 + mat[6][i];
//            sum8 = sum8 + mat[i][i];
//            sum9 = sum9 + mat[6 - i][6 - i];
//        }
//        System.out.println("the sum of the first row is " + sum1);
//        System.out.println("the sum of the second row is " + sum2);
//        System.out.println("the sum of the thir row is " + sum3);
//        System.out.println("the sum of the fourth row is " + sum4);
//        System.out.println("the sum of the fifth row is " + sum5);
//        System.out.println("the sum of the sixth row is " + sum6);
//        System.out.println("the sum of the seventh row is " + sum7);
//
//        System.out.println("the sum of the diagonal is " + sum8);
//        System.out.println("the sum of the other diagonal is " + sum9);
//        System.out.println("and now again:");
//
//        sum8 = 0;
//        sum9 = 0;
//
//        for (k = 0; k < 7; k++) {
//            sum8 = sum8 + mat[k][k];
//        }
//        System.out.println("the sum of the diagonal is " + sum8);
//
//        for (n = 6; n < 7; n--) {
//            sum9 = sum9 + mat[n][n];
//        }
//        System.out.println("the sum of the other diagonal is " + sum9);
//amud 21 sheela 1
//        int i, j, shura, amuda, diagnol1 = 0, diagnol2 = 0;
//        int[][] mat = new int[7][7];
//        mat[0] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[1] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[2] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[3] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[4] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[5] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        mat[6] = new int[]{1, 2, 3, 4, 5, 6, 7};
//        for (int m = 0; m < 7; m++) {
//            amuda = 0;
//            shura = 0;
//            for (int p = 0; p < 7; p++) {
//                shura += mat[m][p];
//                amuda += mat[p][m];
//            }
//            System.out.println("the sum of row number " + m + " is " + shura);
//            System.out.println("the sum of column number " + m + " is " + amuda);
//            diagnol1 += mat[m][m];
//            diagnol2 += mat[6 - m][6 - m];
//        }
//        System.out.println("the sum of the diagonal one is " + diagnol1);
//        System.out.println("the sum of the diagonal two is " + diagnol2);
//amud 21 sheela 2
//        int x;
//        int[][] mat = new int[20][5];
//        System.out.println("enter grades of your students");
//        for (int i = 0; i < 20; i++) {
//            System.out.println("enter grades of a specific student");
//            for (int j = 0; j < 5; j++) {
//                x = input.nextInt();
//                mat[i][j] = x;
//            }
//        }
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println("a report card for student number " + i);
//            for (int j = 0; j < 5; j++) {
//                System.out.println("your grade in subject number " + j + "is " + mat[i][j]);
//            }
//        }
//
//        System.out.println("a table for the teacher");
//        for (int i = 0; i < 20; i++) {
//            System.out.print("the number of the student: " + i);
//            System.out.print(i);
//            for (int j = 0; j < 5; j++) {
//                System.out.println("the number of the subject is: " + j + "and the grade is: " + mat[i][j]);
//            }
//        }
//amud 21 sheela 3
//        int[][] m = new int[4][20];
//        m[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        m[1] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        m[2] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        m[3] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        int[] b = new int[80];
//        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < 4; j++) {
//                 b[i]=m[j][i];
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 20; j++) {
//                for (int k = 0; k < 80; k++) {
//                    m[i][j]=a[k];
//                }
//            }
//        }
//beayot shchenim-sheela mehamorah
//        int m = 0, n = 0, count = 0;
//        int[][] mat = new int[5][5];
//        mat[0] = new int[]{1, 1, 1, 1, 1};
//        mat[1] = new int[]{1, 1, 0, 0, 1};
//        mat[2] = new int[]{1, 1, 0, 1, 1};
//        mat[3] = new int[]{1, 0, 1, 0, 1};
//        mat[4] = new int[]{1, 1, 1, 1, 1};
//        for (int i = 1; i < 4; i++) {
//            for (int j = 1; j < 4; j++) {
//                count=0;
//                if (mat[i][j] == 1) {
//                    if (mat[i - 1][j] == 0) {
//                        count++;
//                    }
//                    if (mat[i + 1][j] == 0) {
//                        count++;
//                    }
//                    if (mat[i][j - 1] == 0) {
//                        count++;
//                    }
//                    if (mat[i][j + 1] == 0) {
//                        count++;
//                    }
//                    if (mat[i - 1][j - 1] == 0) {
//                        count++;
//                    }
//                    if (mat[i - 1][j + 1] == 0) {
//                        count++;
//                    }
//                    if (mat[i + 1][j - 1] == 0) {
//                        count++;
//                    }
//                    if (mat[i + 1][j + 1] == 0) {
//                        count++;
//                    }
//                    System.out.println("the value of mat[" + i + "][" + j + "] is 1 and he has " + count + " neighbors which their value is 0.");
//                }
//
//            }
//
//        }
//        System.out.println("");

//pkudat switch-tirgul
        int a = 2, b = 0;
        switch(a) {
            case 4:
                b = 6;
                break;
            case 5:
                b = 7;
                break;
            default: b=10;
        }
        System.out.println(b);
    }

}
