public class LinkedList <T> implements MyLinkedList {
    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public void add(Object element) {
        Node<T> newNode = new Node<>((T) element);
        if (size == 0)  {
            first = newNode;
        } else  {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    public void addToBegin(T element)
    {
        Node<T> newNode = new Node<>(element);

        if (size == 0) {
            last = newNode;
        }
        else {
            newNode.next = first;
        }
        first = newNode;
        size++;
    }



    @Override
    public Object remove(Object o) {
        return null;
    }

    @Override
    public void sort() {

    }
}
