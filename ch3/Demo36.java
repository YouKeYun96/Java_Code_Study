package ch3;

public class Demo36 {
    public static void main(String[] args) {
        System.out.println("第一次运行：");
        fun("Python","Java");//传入两个参数
        System.out.println("第二次运行：");
        fun("C++","Python","C#");
    }

    public static void fun(Object...args){//可以输入任意多个数据，使用数组表示
        for(int i=0;i<args.length;i++){
            System.out.println(args[i] + "、");
        }
    }

}
