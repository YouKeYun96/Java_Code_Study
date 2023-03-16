package ch3;

import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        //从控制台输入两个数，并计算最大公约数

        /*
            能同时将数1和数2都整除的最大的数
            最大公约数的范围是1到较小的那个数字

            方法1：穷举法
            先找出输入两个数中较小的数
            范围：1~较小的那个数
            方向：比较特殊，找最大，所以从大到小遍历
            条件：数1 % n == 0 && 数2 % n == 0
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个数：");
        int one = sc.nextInt();
        int a = one;

        System.out.print("输入第二个数：");
        int two = sc.nextInt();
        int b = two;

        if(one > two){   //确定了 one 是较小的数，two 是较大的数
            int temp = one;    //临时变量，方便值的交换
            one = two;
            two = temp;
        }

        for(int i = one;i >= 1;i--){
            if(one % i == 0 && two % i == 0){
                System.out.println(i + "是最大公约数");
                break;   //找到之后就跳出循环，节省时间
            }
        }

        /*
            方法2：辗转相除法
            例如，求（319，377）：∵ 319÷377=0（余319）
                                ∴（319，377）=（377，319）；
                                ∵ 377÷319=1（余58）
                                ∴（377，319）=（319，58）；
                                ∵ 319÷58=5（余29）
                                ∴ （319，58）=（58，29）；
                                ∵ 58÷29=2（余0）
                                ∴ （58，29）= 29；
                                ∴ （319，377）=29。

            代码逻辑描述：两个数a与b进行求余, 求余后将b赋值给a，将余数赋值给b。
                        再反复进行同样的操作，直到余数为0。
                        此时的b就是最大公约数
         */


        // Scanner sc = new Scanner(System.in);
        // System.out.print("输入第一个数：");
        // int one = sc.nextInt();
        // int a = one;

        // System.out.print("输入第二个数：");
        // int two = sc.nextInt();
        // int b = two;
            // int re = 0;
            // while(){
            //     re = a%b;


            // }

            // System.out.println( + "是最大公约数(辗转相除)");   
            // sc.close();

        int result = 0;
        while(b!=0){
            result = a % b;
            a = b;
            b = result;
        }  //注意最后循环结束时，b=0,a此时才是上一次b的值

        System.out.println(a + "是最大公约数(辗转相除)");   
        sc.close();
        
    }
}
