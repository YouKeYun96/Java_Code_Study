package ch3;

public class Demo3 {
    public static void main(String[] args) {
        //打印1000以内的水仙花数
        /*
            水仙花数：三位数，每一位的三次方之和等于它本身
            范围：100~999
            思路：需要把三位数的各十百位都分别取出来，模去除高位，除去除低位。 
        */
        for(int i = 100;i <= 999;i++){
            int a = i / 100;      //百位
            int b = i / 10 % 10;  //十位
            int c = i % 10;       //个位
            if(a*a*a + b*b*b + c*c*c == i){
                System.out.println(i + "是水仙花数");
            }
        }
    }
}
