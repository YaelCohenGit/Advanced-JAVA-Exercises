/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author כהן יעל
 */
public class Recursion {
//haratza shel sheelot nituach

    public static int func1(int x) {
        if (x < 0) {
            return 1;
        }
        return x + func1(x - 2);
    }

    public static int foo(int x) {
        if (x < 10) {
            return x;
        }
        return foo(x / 10) + x % 10;
    }

    public static int atzeret(int x) {
        if (x > 0) {
            return x * atzeret(x - 1);
        }
        return 1;
    }

    //amud 5 sheela 1
    public static int num1(int x) {
        int count = 0;
        if (x > 0) {
            count++;
            return num1(x / 10) + count;
        }
        return count;
    }

    //amud 5 sheela 2
//    public static int num2(int x, int y) {
//        int count = 0;
//        if (x > 0) {
//            count++;
//            return num2(x , y) + count;
//        }
//        return count;
//    }

    //amud 5 sheela 4
    public static void numPrefix(int x) {
        if (x > 0) {
            System.out.println(x);
            x = x / 10;
            numPrefix(x);
        }
    }

//    amud 5 sheela 5
    public static void num5(int x, int y) {
        if (x > 0 && y > 0) {
            if (x % 10 == y % 10) {
                System.out.println(x % 10);
            }
            num5(x / 10, y / 10);
        }
    }

    //amud 5 sheela 6
    public static boolean num6(int x) {
        if (x > 0) {
            if (x % 2 == 0) {
                return true;
            }
            return num6(x / 10);
        }
        return false;
    }
    //amud 5 sheela 7

    public static int num7(int x) {
        if (x > 0) {
            if (x % 2 == 0) {
                return 1 + num7(x / 10);
            }
            return num7(x / 10);
        }
        return 0;
    }

    public static int num8(int x) {
        if (x == 0) {
            return -1;
        }
        int a = num8(x / 10);
        if ((x % 2 != 0) && (a < x % 10)) {
            return x % 10;
        }
        return a;
    }

    public static void num9(int x) {
        //ad shoresh x
        for (int i = 1; i < x; i++) {
            if ((i / i == 0) && (i / 1 == i)) {
                System.out.println(i);
            }
        }
    }
//    def find_primes(start, end):
//    primes = set(range(start, end))
//    k = 2
//
//    while k < end:
//        for number in set(primes) - set([k]):
//            if (number % k) == 0:
//                primes.remove(number)
//
//        k += 1
//
//    return primes

    public static void main(String[] args) {
//        int x = atzeret(4);
//        System.out.println(x);
//        numPrefix(654);
//        num5(74749, 40);
//        System.out.println(num6(23));
//        System.out.println(num7(25));
//        System.out.println(num8(135));
//        num9(135);
//        int func1_5 = func1(5);
//        int func1_8 = func1(8);
//        System.out.println(func1_5);
//        System.out.println(func1_8);
//        int foo_data = foo(529);
//        System.out.println(foo_data);
//        int count = num1(1114);
//        System.out.println(count);
    }

}
