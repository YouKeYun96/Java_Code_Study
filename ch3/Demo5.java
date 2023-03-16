package ch3;

import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        //从控制台输入两个数，并计算最小公倍数
        //同时能被数1和数2都整除的最小的数
        //最小公倍数的范围是较大的数到两个数的乘积
        /*
            能同时被数 1 和数 2 整除的数：
            n % 数1 == 0 && n % 数2 == 0
            范围：从交大的数，取到数 1 和数 2 的乘积
            被除数 / 除数 = 商 …… 余数   整除：余数为0
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个数：");
        int one = sc.nextInt();
        System.out.print("输入第二个数：");
        int two = sc.nextInt();
        
        if(one > two){  //确定了 one 是比较小的数， two 是比较大的数
            int temp = one;
            one = two;
            two = temp;
        }
        for(int i = two;i <= one * two;i++){  //遍历被除数
            if(i % one == 0 && i % two == 0){
                System.out.println(i + "是最小公倍数");
                break;
            }
        }
        sc.close();
    }    
}
