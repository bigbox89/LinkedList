import main.java.LinkedList;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestApplication {

    private LinkedList<String> list = new LinkedList<>();

    @Before
    public void cleanList() {
        list.clear();
    }

    @Test
    public void sizeTest() {
        assertEquals(list.size(), 0);

        fillList();

        assertEquals(list.size(), 3);
    }


    @Test
    public void addTest(){
        assertEquals(list.size(), 0);
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        list.add("Test5");
        assertEquals(list.size(), 5);
    }
/*
    @Test
    public void containsTest() {
        assertTrue(!list.contains("Text1"));

        list.add("Text1");

        assertTrue(list.contains("Text1"));
    }*/

    @Test
    public void removeTest() {
        fillList();

        assertEquals(list.size(), 3);

        list.remove("Test1");

        assertEquals(list.size(), 2);

        list.removeAt(0);

        assertEquals(list.size(), 1);
    }

    @Test
    public void clearTest() {
        fillList();
        assertEquals(list.size(), 3);
        list.clear();
        assertEquals(list.size(), 0);
    }

    @Test
    public void getTest() {
        fillList();
        assertEquals(list.get(1), "Test2");
    }

    private void fillList() {
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
    }
}