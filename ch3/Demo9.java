package ch3;

public class Demo9 {
    public static void main(String[] args) {
        //打印指定菱形
        /*
           *         分成上面四行正三角、下面三行倒三角
          ***
         *****
        *******
         *****
          ***
           *
        */
        //上半部分
        for(int i = 1;i <= 4;i++){
            for(int k = 1;k <= 4-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //下半部分
        for(int i = 3;i >= 1;i--){
            for(int k = 1;k <= 4-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j <= 2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
