package ch5;

public class Test1 {
    public static void main(String[] args) {
        String[] a = { "zs", "ls", "ww" };
        System.out.println("直接输出a:");
        System.out.println(a);
        String t = a[0];
        a[0] = a[1];
        a[1] = t;
        System.out.println("直接输出a:");
        System.out.println(a);
        System.out.print(a[0]);
        System.out.print(a[1]);
        System.out.print(a[2]);
    }
}
