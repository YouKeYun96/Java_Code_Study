package ch5;

import java.util.Scanner;

public class MC {
    static Scanner sc = new Scanner(System.in);
    //伴随着对象实例存在的二维数组
    double[][] array;


    //方法input，伴随对象实例存在，无参数，无返回值
    //控制台输出提示提醒输入二维数组的行数和列数，然后再提示输入所有的数组元素(double类型数组)
    public void input(){
        System.out.println("请输入二维数组的行数");
        int n = sc.nextInt();
        System.out.println("请输入二维数组的列数：");
        int m = sc.nextInt();

        //补充代码完成获取所有的
        array = new double[n][m];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println("请输入第"+(i+1)+"行第"+(j+1)+"列的元素：");
                array[i][j] = sc.nextDouble();
            }
        }
    }

    //方法add，将数组中所有的元素翻倍，无参数，无返回值
    public void add(){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]+=array[i][j];
            }
        }
    }


    //方法show，将数组中所有元素以矩形的形式打印到命令行，无参数，无返回值
    public void show(){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.printf("%6s",array[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
