package ch5;

public class MyChallenge{
    //补充完成一个方法fun1，伴随着类而存在，参数为两个String，没有返回值，执行后直接在控制台输出
    //如：两个参数字符串"张三" "李四"  输出："张三喜欢李四"
    public static void fun1(String name1,String name2){
        System.out.println(name1+"喜欢"+name2);
    }


    //补充完成一个方法fun2，伴随着类而存在，参数为一个int类型整数，返回值为boolean类型
    //判断三位整数是不是水仙花数，是则返回true，否返回false
    public static boolean fun2(int num){
        int a = num / 100;      //百位
        int b = num / 10 % 10;  //十位
        int c = num % 10;       //个位
            
        return a*a*a + b*b*b + c*c*c == num;

    }


    //补充完成一个方法fun3，伴随着类而存在，参数为两个int类型整数，返回值为这两个数的最大公约数
    public static int fun3(int one,int two){
        int num = -1; //默认

        if(one > two){   //确定了 one 是较小的数，two 是较大的数
            int temp = one;    //临时变量，方便值的交换
            one = two;
            two = temp;
        }

        for(int i = one;i >= 1;i--){
            if(one % i == 0 && two % i == 0){
                num = i;
                break;
            }
        }

        return num;
    }








    public static void main(String[] args) {
        //补充代码，用合适的方式调用方法，测试三个方法是否写对。
        fun1("张三","李四");
        System.out.println(fun2(371));
        System.out.println(fun2(123));
        System.out.println(fun3(319,377));
 
    }
}