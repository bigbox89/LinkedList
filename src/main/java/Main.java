import ArrayList.Crew;
import ArrayList.Intern;
import ArrayList.InternsRepository;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Check ArrayList
        System.out.println("Start Array List Demonstration");
        InternsRepository internsRepository = new InternsRepository();
        internsRepository.getAllInterns();
        Intern internForRemove = new Intern("Асфандиаров", "Тимур", 47, 60);

        Crew<Intern> spisok = internsRepository.getAllInterns();
        System.out.println("Печатаем весь список");
        spisok.printAll();
        System.out.println("Удаляем элемент из массива по обьекту " + internForRemove.toString());
        spisok.remove(internForRemove);
        System.out.println("Печатаем весь список");
        spisok.printAll();
        System.out.println("Сортируем список по сумме баллов в тесте");
        spisok.sort();
        System.out.println("Печатаем весь список");
        spisok.printAll();
        System.out.println("Получаем элемент из списка с индексом 2");
        System.out.println(spisok.get(2).toString());
        System.out.println("Печатаем капитанов");
        spisok.isCapitan();

        //Check LinkeList
        System.out.println("Start Linked List Demonstration");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(120);
        list.add(-10);
        list.add(11);
        list.add(50);
        list.add(100);
        list.add(99);
        list.printAll();
        list.remove(120);
        System.out.println("Remove 120");
        list.printAll();
        System.out.println("set -123 to 1");
        list.set(1, -123);
        list.printAll();
        list.sort();
        System.out.println("sort");
        list.printAll();
    }
}
