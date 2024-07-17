// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void func(Box t){
        System.out.println(t.getValue());
    }
    public static void main(String[] args) {
        Box<Integer> a = new Box<Integer>();
        Box<String> b = new Box<String>();
        func(a);
        func(b);
    }
}