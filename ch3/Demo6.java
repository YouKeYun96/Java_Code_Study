package ch3;
public class Demo6 {
    public static void main(String[] args) {
        //计算2000年1月1日到2008年1月1日相距多少天（注意闰年）
        /*
            多少天？：累加求和，声明一个求和变量，初始值为0
            年份的天数：闰年和平年的问题，不用考虑月份，闰年366，平年365
            一个年份不可能既是366也是365，使用if……else判断
            范围：2000~2007
        */
        int sum = 0;
        for(int i = 2000;i <= 2007;i++){
            if(i % 4 ==0 && i % 100 != 0 || i % 400 == 0){
                //闰年
                sum += 366;
            }else{
                //平年
                sum += 365;
            }
        }
        System.out.println("2000 年 1月 1日到 2007 年 12 月 31日共计"+sum+"天");
    }
}
