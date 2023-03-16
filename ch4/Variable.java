package ch4;

public class Variable {

    public static void main(String[] args){
        //for循环这种后面跟的语句一般就会放在代码块中，在for循环中局部生效
        //包括在for循环中定义的循环变量i，也是局部生效
        for(int i=1;i<10;i++){
            int a = 9;
            System.out.println(a + i);
        }

        // System.out.println(i);   //在使用局部变量的那个代码块外面，无效，会报错
        // System.out.println(a);   //在使用局部变量的那个代码块外面，无效，会报错

        
 

    }


}
