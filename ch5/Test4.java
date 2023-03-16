package ch5;

import java.util.Scanner;
public class Test4 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		//定义一个5行5列的int二维数组，并且通过双重for循环赋值。
		int a[][] = new int[3][3];

		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println("请输入第"+(i+1)+"行第"+(j+1)+"列的元素：");
				a[i][j] = input.nextInt();
			}
		}

		//再将这个二维数组以矩形形式打印出来
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}


		input.close();




	}
}
