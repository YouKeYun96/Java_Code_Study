package ch5;

public class Test2 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = a;
        b[0] = 10;
        System.out.println(a[0]);
    }
}
