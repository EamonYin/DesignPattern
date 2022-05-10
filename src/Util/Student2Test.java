package Util;

/**
 * @author:YiMing
 * @create:2020/12/8,10:50
 * @version:1.0
 */
public class Student2Test {
    public static void main(String[] args) {
        int num = 60;
        displayAge(num, new Student2<Integer>() {
            @Override
            public int Age(int num) {
                return num;
            }
        });

        System.out.println("--------------lambda1-----------------");
        int age = 18;
        displayAge(age, (a) -> a);

        System.out.println("--------------lambda2-----------------");
        displayAge2(age, (a) -> {
            System.out.println("学生" + a + "岁");
            return a;
        });
    }

    public static void displayAge(int age, Student2<Integer> student2) {
        System.out.println(student2.Age(age));
    }

    public static void displayAge2(int age, Student2_2<Integer> student) {
        student.Age(age);
    }
}
