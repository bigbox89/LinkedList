public interface MyLinkedList<T> {
    Integer size();

    void add(T element);

    boolean remove(T t);

    boolean removeAt (int index);

    void sort();

    T get (int index);

}
