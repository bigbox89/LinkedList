package main.java;

public class LinkedList<T> implements MyLinkedList {
    private static class Node<T> {
        T value; // хранение значений разного типа
        Node<T> next; // хранение ссылки на следующий  узел
        private Node previous; // хранение ссылки на предыдущий узел

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> first; // хранение первой ссылки
    private Node<T> last; // хранение последней ссылки
    private int size = 0; // размер списка

    @Override
    public int size() {
        return size;
    }

    /**
     * добавление элемента в  список
     *
     * @param element элемент
     * @return
     */

    @Override
    public void add(Object element) {
        Node<T> newNode = new Node<>((T) element);
        if (size == 0) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
        size++;
    }

    /**
     * добавление элемента в начало списка
     *
     * @param element элемент
     * @return
     */

    public void addToBegin(T element) {
        Node<T> newNode = new Node<>(element);

        if (size == 0) {
            last = newNode;
        } else {
            newNode.next = first;
        }
        first = newNode;
        size++;
    }

    /**
     * удаление из списка по обьекту
     *
     * @param t элемент
     * @return
     */

    @Override
    public boolean remove(Object t) {
        int index = findElement((T)t);
        if (index != -1) {
            return removeAt(index);
        }
        return false;

    }

    /**
     * удаление из списка по индексу
     *
     * @param index индекс
     * @return
     */
    @Override
    public boolean removeAt(int index) {
        Node node = getNode(index);
        Node nodeNext = node.next;
        Node nodePrevious = node.previous;
        if (nodeNext != null) {
            nodeNext.previous = nodePrevious;
        } else {
            last = nodePrevious;
        }
        if (nodePrevious != null) {
            nodePrevious.next = nodeNext;
        } else {
            first = nodeNext;
        }
        size--;
        return true;
    }

    /**
     * сортировка списка
     *
     * @return
     */
    @Override
    public void sort() {

    }

    /**
     * получение элемента из списка по индексу
     *
     * @param index индекс
     * @return
     */
    @Override
    public Object get(int index) {
        return getNode(index).value; // возвращает данные(value) узла
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) { // вызывается ошибка если происходит выход за размер списка
            System.out.println("Выход за размеры списка");
        }
        Node node = first; // берется первый элемент списка по индексу(0)
        for (int i = 0; i < index; i++) { // через цикл проходим от 0 до нашего искомого индекса
            node = node.next; // на каждой итерации перезаписываем текущий узел на следующий в списке
        }
        return node; // возвращаем последную итеррацию перезаписи
    }

    /**
     * поиск элемента в списке через equals
     * @param t
     * @return возвращает индекс элемента если найден элемент или -1 если не найден
     */
    private int findElement(T  t) {
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (node.value.equals(t)) {
                return i;
            }
            node = node.next;
        }
        return -1; // возвращает -1 если элемента нет в списке
    }


    public void clear() {
        first = null;
        last = null;
        size = 0;
    }



}
