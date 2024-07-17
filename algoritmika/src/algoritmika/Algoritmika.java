/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmika;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Algoritmika {


    public static void main(String[] args) {
//choveret miyunim
//amud 3 sheela 2
        int x, sum = 0, y = 0;
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("enter a number");
        x = 9;
        for (int i = 0, j = 9; i < 10 && j > 0; i++, j--) {
            sum = t[i] + t[j];
            if (sum > x) {
                sum = t[i] + t[j - 1];
            }
            if (sum < x) {
                sum = t[i + 1] + t[j];
            }
            if (sum == x) {
                break;
            }
        }
        System.out.println("there is a sequence in the array which is sum is " + x);

//sheela-limtzo merchak mehaefes hakarov bemaarach   
//        int distance1 = 0, distance2 = 0;
//        int[] t = new int[]{0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1};
//        for (int i = 0; i < t.length; i++) {
//            distance1 = 0;
//            distance2 = 0;
//            if (t[i] == 1) {
//                for (int j = 1; j < t.length - i; j++) {
//                    if (t[i + j] == 0) {
//                        distance1 = j;
//                        break;
//                    }
//                }
//                for (int j = 1; j <= i; j++) {
//                    if (t[i - j] == 0) {
//                        distance2 = j;
//                        break;
//                    }
//                }
//                if (distance1 == 0 && distance2 > 0) {
//                    t[i] = distance2;
//                } else if (distance2 == 0 && distance1 > 0) {
//                    t[i] = distance1;
//                } else if (distance1 > distance2) {
//                    t[i] = distance2;
//                } else {
//                    t[i] = distance1;
//                }
//            }
//        }
//        for (int i = 0; i < t.length; i++) {
//            System.out.print(t[i] + ", ");
//        }
//choveret miunim 
//amud 2 sheela 7
        int[] s = new int[]{3, 8, 2, 32, 56, 34, 1, 7, 77, 25};
        int min = 999, b = s.length, saver, saver2 = 0;
        for (int i = 0; i < s.length; i++) {
            min = 999;
            for (int j = 0 + i; j < s.length; j++) {
                if (s[j] < min) {
                    min = s[j];
                    saver2 = j;
                }
            }
            saver = s[i];
            s[i] = min;
            min = s[i];
            System.out.println(min + ", ");
        }

//        int []t= {3,8,1,32,56,34,91,7,77,25};
//        int []u=new int[10];
//        int min=999, max=0, i=0;
//        for(i=0; i<9; i++)
//        {
//        if(t[i]<min)
//            u[0]=t[i];
//        
//        }
//        
//       for(i=1; i<10; i++)
//            {
//            System.out.println(u[i]);
//            }
//        int []t= {3,8,2,32,56,34,91,7,77,25};
//        int x=0;
//        for(int i=0; i<10; i++)
//        {
//            if(i!=9)
//            {
//                if(t[i]>t[i+1])
//                {
//                    x=t[i];
//                    t[i]=t[i+1];
//                    t[i+1]=t[i];
//                }
//            }
//        }
//        
//        for(int i=1; i<10; i++)
//        {
//            System.out.println(t[i]);
//        }
//            int []t= {3,8,2,32,56,34,91,7,77,25};
//            int x=0;
//            for(int i=0; i<10; i++)
//                {
//                    if(t[i]>t[i+1])
//                        {
//                            x=t[i];
//                            t[i]=t[i+1];
//                            t[i+1]=t[i];
//                        }
//                }
//            
//            for(int i=1; i<10; i++)
//                {
//                    System.out.println(t[i]);
//                }
//            int []t= {3,8,2,32,56,34,91,7,77,25};
//            int x=0, y=0;
//            if(t[0]>t[1])
//                        {
//                            x=t[0];
//                            t[0]=t[1];
//                            t[1]=t[0];
//
//                        }
//            for(int i=2; i<10; i++)
//            {
//                if(t[0]>t[i])
//                    {
//                        y=t[0];
//                        t[0]=t[i];
//                        t[0]=t[i];
//                    }
//                else t[i+2]=t[i];
//                    
//            }
//            
//            
//               for(int i=1; i<10; i++)
//                {
//                    System.out.println(t[i]);
//                }
//            int []t= {1,2,3,4,5,6,7,8,9,10};
//            int []t= {2,3,4,5,6,7,8,9,10,1};
//            int x=0;
//            for(int i=0; i<10; i++)
//            {
//              if(t[i]==i+1)
//                  x=1;
//            }
//            if(x==1)
//                System.out.println("yes");
//            else System.out.println("no");
//              int []t= {3,8,2,32,56,34,91,7,77,25};
//              int i=0,x=0, y=0;
//             //add
//             t[i]=t[i]+x;
//             //get
//             y=t[i];
//             //add all
    }

}
