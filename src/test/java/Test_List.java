import com.java.List.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.ThreadLocalRandom;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class Test_List {

    List<Integer> list;
    List<Integer> list2;
    final int SIZE = 10;
    int randomNum;
    int randomIndex;

    @Before
    public void before() {
        list = new List<Integer>();
        for (int i = 0; i < 10; i++)
            list.add(i);
    }

    @Test
    public void add() {
        list2 = new List<Integer>();
        for (int i = 0; i < 10; i++)
            list2.add(i, i);
        Assert.assertEquals(list.get(0), list2.get(0));
    }

    @Test
    public void clear() {
        list.clear();
        Assert.assertEquals(list.size(), 0);
    }

    @Test
    public void contains() {
        list.add(3, 100);
        Assert.assertEquals(list.contains(100), true);
    }

    @Test
    public void equals( ){
        list2 = new List<Integer>();
        for (int i = 0; i < 10; i++)
            list2.add(i);
        Assert.assertEquals(list.equals(list2), true);
    }

    @Test
    public void get() {
        list.add(3, 100);
        Assert.assertEquals(list.get(3), (Integer) 100);
    }

    @Test
    public void indexOf() {
        list.add(3, 100);
        Assert.assertEquals(list.indexOf(100), 3);
    }

    @Test
    public void isEmpty() {
        list.clear();
        Assert.assertEquals(list.isEmpty(), true);
    }

    @Test
    public void remove() {
        int size = list.size();
        list.remove(1);
        Assert.assertEquals(size-1, list.size());

    }


    @Test
    public void set() {
        list.set(3, 100);
        Assert.assertEquals(list.indexOf(100), 3);
    }

    @Test
    public void size() {
        Assert.assertEquals(list.size(), 10);
    }
}
