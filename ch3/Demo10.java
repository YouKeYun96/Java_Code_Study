package ch3;

public class Demo10 {
    public static void main(String[] args) {
        //我国古代数学家张丘建在“算经”里曾提出一个世界数学史上有名的百鸡问题：“鸡翁一，值钱五；鸡母一，值钱三；鸡雏三，值钱一；百钱买百鸡，问鸡翁、母、雏各几何？”
        //5x + 3y + z/3 = 100
        //公鸡 五元一只
        int cock;
        //母鸡 三元一只
        int hen;
        //鸡仔 一元三只
        int chickenBaby;
        for(cock = 0;cock <= 20; cock++){
            for(hen = 0;hen <= 33;hen++){
                chickenBaby = 100 - cock - hen;
                if(5*cock + 3*hen + chickenBaby/3 == 100 && chickenBaby%3 == 0){
                    System.out.println("公鸡有："+cock+"只，"+"母鸡有："+hen+"只，"+"鸡仔有："+chickenBaby+"只");
                }
            }
        }
    }

}
