import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

    @Test
    public void getSizeOfList() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfListEmpty() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        List<Integer> list = null;
        list.size();
    }

    @Test
    public void getSizeOfListWhenRemovingElements() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(4, list.size());

        list.remove(1);
        assertEquals(3, list.size());
    }

    @Test
    public void getClearSizeOfList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        assertEquals(0, list.size());
    }
	
    @Test
    public void addItem() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	list.add(5);
    	
    	list.add(6);
    }
    
    @Test
    public void addItemToEmpty() {
    	List<Integer> list = new ArrayList<>();
    	
    	list.add(1);
    }
    
    @Test(expected = NullPointerException.class)
    public void addItemToNull() {
    	List<Integer> list = null;
    	list.add(1);
    }
    
    @Test
    public void checkItem() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	
    	list.contains(3);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void checkItemOnEmpty() {
    	List<Integer> list = new ArrayList<>();
    	list.contains(3);
    }
    
    @Test(expected = NullPointerException.class)
    public void checkItemOnNull() {
    	List<Integer> list = null;
    	list.contains(3);
    }
    
    @Test
    public void getItem() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	
    	list.get(2);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void getItemOnEmpty() {
    	List<Integer> list = new ArrayList<>();
    	list.get(0);
    }

    @Test(expected = NullPointerException.class)
    public void getItemOnNull() {
    	List<Integer> list = null;
    	list.get(0);
    }

    @Test
    public void getItemIndex() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.indexOf(2);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void getItemIndexOnEmpty() {
    	List<Integer> list = new ArrayList<>();
    	list.indexOf(2);
    }
    
    @Test(expected = NullPointerException.class)
    public void getItemIndexOnNull() {
        List<Integer> list = null;
        list.indexOf(0);
    }

    @Test
    public void removeItem() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.remove(2);
    }
   
    @Test(expected = IndexOutOfBoundsException.class)
    public void removeItemOnEmpty() {
    	List<Integer> list = new ArrayList<>();
    	list.remove(0);
    }
   
    @Test(expected = NullPointerException.class)
    public void removeItemOnNull() {
    	List<Integer> list = null;
    	list.remove(2);
    }
}
