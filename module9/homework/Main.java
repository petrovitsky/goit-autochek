package main.module9.homework;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
//        list.add(new MyUser("zero",0));
//        list.add(new MyUser("first", 1));
//        list.add(new MyUser("second", 2));
//        list.add(new MyUser("third", 3));
//        list.add(new MyUser("fourth", 4));
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        list.printList();

        list.clear();

        list.printList();

        list.add(31);
        list.add(221);
        list.add(365);
        list.add(9874);

        list.printList();
        System.out.println(list.size());

    }

//    private static <E> void printList(MyList list) {
//        for (Object m : list) {
//            System.out.println( m);
//        }
//        System.out.println("------ ---- ----- ---");
//    }


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

