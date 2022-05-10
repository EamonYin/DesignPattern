package Util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author:YiMing
 * @create:2020/12/9,15:54
 * @version:1.0
 */
public class StreamLambdaTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");
        long count = strings.stream().peek(e -> System.out.println("Filtered value: " + e)).count();
        System.out.println(count);
        System.out.println("-------map-------");
        List<User> users = Arrays.asList(new User(1), new User(3), new User(2));
        users.stream().map(User::getId).forEach(System.out::println);

        File file = new File("F:\\hahaha.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            /*for (User u: users) {
                fileWriter.write(u.toString());
            }*/

//            users.stream().map(User::getId).forEach(fileWriter::write);

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


class User {
    Integer id;

    public User(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}