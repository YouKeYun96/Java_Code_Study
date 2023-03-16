package ch6;

public class Student {
    //姓名
    private String name;
    //年龄
    private int age = -1;
    //性别 1-男 0-女
    private int sex = -1;
    //年级
    private int grade = -1;

    //使用初始化块
    {
        System.out.println("进入初始化块");
        this.name = "斯人";
        this.age = 18;
        this.sex = 1;
        this.grade = 9;
    }


    //无参构造方法
    public Student(){
        System.out.println("无参构造方法初始化");
    }

    //全参构造方法
    public Student(String name,int age,int sex,int grade){
        System.out.println("带参构造方法初始化");
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.grade = grade;
    }


        /**
     * 学生读书的方法(如果参数的值是默认值，就代表不需要使用该变量。
     * 例如，当 bookAuthor 的值是 null 时，就不用打印 bookAuthor 这一属性)
     * @param bookName 书名
     * @param bookAuthor 作者
     * @param bookPrice 价格
     */
    public void read(String bookName, String bookAuthor, double bookPrice) {
        // 当 bookAuthor 使用的是默认值时，就只打印 bookName 和 bookPrice
        if (bookName != null && bookAuthor == null && bookPrice != 0.0) {
            System.out.println(this.name + "正在读《" + bookName + "》，书价：" + bookPrice);
        }

        // 当 bookPrice 使用的是默认值时
        if (bookName != null && bookAuthor != null && bookPrice == 0.0) {
            System.out.println(this.name + "正在读《" + bookName + "》，作者：" + bookAuthor);
        }

        //当全部的参数都使用的是默认值时
        if (bookName == null && bookAuthor == null && bookPrice == 0.0) {
            System.out.println(this.name + "正在读书");
        }

        //当全部的参数都使用的不是默认值时
        if (bookName != null && bookAuthor != null && bookPrice != 0.0) {
            System.out.println(this.name + "正在读《" + bookName + "》，作者：" + bookAuthor
+ "，书价：" + bookPrice);
        }
    }


    // 以下三个方法，演示了如何在重载中复用已有的方法
    /**
     * 学生读书
     * @param bookName 书名
     * @param bookAuthor 作者
     */
    public void read(String bookName, String bookAuthor) {
        this.read(bookName, bookAuthor, 0.0);
    }

    /**
     * 学生读书
     * @param bookName 书名
     * @param bookPrice 价格
     */
    public void read(String bookName, double bookPrice) {
        this.read(bookName, null, bookPrice);
    }
    /**
     * 学生读书
     * @param bookName 书名
     */
    public void read(String bookName) {
        this.read(bookName, null, 0.0);
    }
    /**
     * 学生读书
     */
    public void read() {
        this.read(null, null, 0.0);
    }

}
