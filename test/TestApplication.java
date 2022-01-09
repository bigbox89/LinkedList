import main.java.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestApplication {

    private LinkedList<Integer> list = new LinkedList<>();

    @Before
    public void cleanList() {
        list.clear();
    }

    @Test
    public void sizeTest() {
        assertEquals(list.size(), 0);
        fillList();
        assertEquals(list.size(), 5);
    }

    @Test
    public void sortTest(){
        assertEquals(list.size(), 0);
        fillList();
        list.sort();
        assertEquals(list.get(0), 120 );
        assertEquals(list.get(1), 50 );
        assertEquals(list.get(2), 34 );
        assertEquals(list.get(3), 11 );
        assertEquals(list.get(4), -10 );
    }

    @Test
    public void addTest(){
        assertEquals(list.size(), 0);
        list.add(34);
        list.add(120);
        list.add(-10);
        list.add(11);
        list.add(50);
        assertEquals(list.size(), 5);
    }

    @Test
    public void removeTest() {
        fillList();
        assertEquals(list.size(), 5);
        list.remove(34);
        assertEquals(list.size(), 4);
        list.removeAt(0);
        assertEquals(list.size(), 3);
    }

    @Test
    public void clearTest() {
        fillList();
        assertEquals(list.size(), 5);
        list.clear();
        assertEquals(list.size(), 0);
    }

    @Test
    public void getTest() {
        fillList();
        assertEquals(list.get(1), 120);
    }

    private void fillList() {
        list.add(34);
        list.add(120);
        list.add(-10);
        list.add(11);
        list.add(50);
    }
}