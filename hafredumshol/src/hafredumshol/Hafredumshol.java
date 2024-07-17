package hafredumshol;

import static java.lang.Math.abs;

public class Hafredumshol {
//הפרד ומשול - שאלת הגשה
// א
    public static void aleph(int[] arr, int begin, int end) {
        int min2 = 0;
        int min1 = findMin(arr, begin, end);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min1) {
                if (i == 0) {
                    min2 = arr[i + 1];
                } else if (i == arr.length - 1) {
                    min2 = arr[i - 1];
                } else if (arr[i + 1] < abs(arr[i - 1])) {
                    min2 = arr[i + 1];
                } else {
                    min2 = arr[i - 1];
                }
            }
        }
        System.out.println("the numbers are: " + min1 + " and " + min2);

    }

    static int findMin(int[] arr, int begin, int end) {
        if (begin == end) {
            return arr[begin];
        } else {
            int middle = (begin + end) / 2;
            int max1 = findMin(arr, begin, middle);
            int max2 = findMin(arr, middle + 1, end);
            if (abs(max1) > abs(max2)) {
                return max2;
            }
            return max1;
        }
    }

//ב
//מי גדול ממי
// minimini < min < max < maximaxi
    public static int maxi(int[] arr) {
        int minimini = arr[0], min = arr[1], max = arr[arr.length - 2], maximaxi = arr[arr.length - 1];
        int absminimini = abs(minimini);
        int absmin = abs(min);
        int max1, max2;
        if (absminimini > maximaxi) {
            max1 = absminimini;
        } else {
            max1 = maximaxi;
        }
        if (absmin > max) {
            max2 = absmin;
        } else {
            max2 = max;
        }
        if (absminimini > max) {
            max2 = absminimini;
        }
        if (absmin > maximaxi) {
            max2 = absmin;
        }

        int sum = max1 + max2;
        return sum;

    }

    public static void main(String[] args) {
        //א
        int[] t1 = new int[]{-3, 0, 4, 7, 10};
        int[] t2 = new int[]{-9, -4, 0, 2, 10};
        int[] t3 = new int[]{-9, -4, -3, 1, 2};
        int[] t4 = new int[]{-9, -4, 2, 6, 10};
        int[] t5 = new int[]{-5, -4, 6, 7, 10};
        int[] t6 = new int[]{-3, 1, 2, 7, 9};
        int[] t7 = new int[]{-7, -4, -3, -2, 9};
        int[] t8 = new int[]{3, 5, 6, 12, 20};
        int[] t9 = new int[]{0, 5, 6, 45, 50};
        int[] t10 = new int[]{-3, 4, 6, 8, 18};
        int[] t11 = new int[]{-7, -4, -3, -2, 0};
        int[] t12 = new int[]{-7, -4, -3, -2, -1};
        int[] t13 = new int[]{-7, -4, -3, -2, 1};

        int end = t1.length - 1;
        int begin = 0;
        System.out.println("א");
        aleph(t1, begin, end);
        aleph(t2, begin, end);
        aleph(t3, begin, end);
        aleph(t4, begin, end);
        aleph(t5, begin, end);
        aleph(t6, begin, end);
        aleph(t7, begin, end);
        aleph(t8, begin, end);
        aleph(t9, begin, end);
        aleph(t10, begin, end);
        aleph(t11, begin, end);
        aleph(t12, begin, end);
        aleph(t13, begin, end);

        //ב
        int[] b1 = new int[]{-8, -6, -1, 9, 11};
        int[] b2 = new int[]{-8, -6, -1, 7, 11};
        int[] b3 = new int[]{-8, -6, -1, 4, 5};
        int x1 = maxi(b1);
        int x2 = maxi(b2);
        int x3 = maxi(b3);
        System.out.println("ב");
        System.out.println("the sum is "+x1);
        System.out.println("the sum is "+x2);
        System.out.println("the sum is "+x3);

    }

}
