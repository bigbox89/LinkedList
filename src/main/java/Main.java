package main.java;

public class Main {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(120);
        list.add(-10);
        list.add(11);
        list.add(50);
        list.add(100);
        list.add(99);
        list.remove(120);
        System.out.println(list);
    }
}
