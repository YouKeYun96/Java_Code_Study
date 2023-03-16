package ch3;

public class Demo7 {
    public static void main(String[] args) {
        //打印九九乘法表
        /*
            九九乘法表
            外层循环决定行，内层循环决定列
        */
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + "*" + i + "=" + j*i +"\t");
            }
            System.out.println();
        }
    }
}
