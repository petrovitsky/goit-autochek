package main.module7.lesson;

public class UserTest {
    public static void main(String[] args) {
        User.getBuilder()
                .name("Eugene")
                .lastName("Petrov")
                .mail("ggg@gmail.com")
                .login("psv");
    }
}
