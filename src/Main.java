public class Main {
    public static void main(String[] args) {
        System.out.println("Hi team!");
        Node<String> a = new Node("Marsel");
        Node<String> b = new Node("Java");
        Node<String> c = new Node("Innopolis");
        Node<String> d = new Node("JVM");
        Node<String> e = new Node("javac");
        Node<String> f = new Node("Lists");
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);

        for (Node current = a; current != null; current = current.getNext()) {
            System.out.println((String) current.getValue());
        }
    }
}
