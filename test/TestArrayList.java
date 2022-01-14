import ArrayList.Crew;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestArrayList {

    private Crew<String> list = new Crew<>();

    @Before
    public void cleanList() {
        list.clean();
    }

    @Test
    public void sortTest(){
        assertEquals(list.size(), 0);
        fillList();
        list.sort();
        assertEquals(list.get(0), "test5" );
        assertEquals(list.get(1), "test4" );
        assertEquals(list.get(2), "test3" );
        assertEquals(list.get(3), "test2" );
        assertEquals(list.get(4), "test1" );
    }
    @Test
    public void sizeTest() {
        assertEquals(list.size(), 0);
        fillList();
        assertEquals(list.size(), 5);
    }

    @Test
    public void addTest(){
        assertEquals(list.size(), 0);
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
        assertEquals(list.size(), 5);
    }

    @Test
    public void removeTest() {
        fillList();
        assertEquals(list.size(), 5);
        list.remove(1);
        assertEquals(list.size(), 4);
        list.remove("test3");
        assertEquals(list.size(), 3);
    }

    @Test
    public void clearTest() {
        fillList();
        assertEquals(list.size(), 5);
        list.clean();
        assertEquals(list.size(), 0);
    }

    @Test
    public void getTest() {
        fillList();
        assertEquals(list.get(1), "test2");
    }

    private void fillList() {
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
    }
}