package ch3;

public class Demo8 {
   public static void main(String[] args) {
       //打印特定图形
       /*
                     行数     最大数字    左边空格数
       1 2 3 4 5 6     1       7-行号         0
         1 2 3 4 5     2                     2
           1 2 3 4     3                     4
             1 2 3     4                     6
               1 2     5                     8
                 1     6                     10
       */
      for(int i = 1;i <= 6;i++){
        for(int k = 1;k <= (i-1)*2 ; k++){
            System.out.print(" ");       //空格部分
        }

        for(int j = 1;j <= 7-i;j++){
            System.out.print(j + " ");
        }
        System.out.println();
      }
   } 
}
