package main.module9.homework;


public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        list.addFirst("data4");
        list.addFirst("data5");
        list.addFirst("data6");
        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }

    }

}


class MyUser {
    private String name;
    private int age;

    MyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name = '" + name + '\'' +
                        ", age = " + age;
    }
}

