package Util;

/**
 * @author:YiMing
 * @create:2020/12/8,10:20
 * @version:1.0
 */
public class StudentTest {
    public static void main(String[] args) {

        func(new Student1<Integer>() {
            @Override
            public Integer test(Integer param) {
                System.out.println(param);
                return param;
            }
        });
        System.out.println("--------------------lambda------------------");
        //lambda
        func((Integer x)->{
            System.out.println(x);
            return x;
        });
    }
    static void func(Student1<Integer> student1){
        int x = 1;
        student1.test(x);
    }
}
