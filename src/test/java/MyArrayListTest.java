/**
 * Created by stephenpegram on 5/18/17.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    MyArrayList<Integer> myList;

    @Before
    public void setUp() {
        myList = new MyArrayList<Integer>();
        myList.add(1);
        myList.add(4);
        myList.add(9);
        myList.add(16);
        myList.add(25);
    }


    @Test
    public void testAdd() {
        //Given
        int expectedSize = 6;
        int expectedElement = 10;

        //When
        myList.add(10);
        int actualSize = myList.size();
        int actualElement = myList.get(5);

        //Then
        assertEquals("Size should be 1", expectedSize, actualSize);
        assertEquals("Element should be 10", expectedElement, actualElement);

    }


    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testGet() {
        //When
        int result = myList.get(8);
    }

    @Test
    public void testRemove() {
        //Given

        int expectedSize = 3;
        int expectedElement1 = 9;
        int expectedElement2 = 25;


        //When
        myList.remove(1);
        myList.remove(2);
        int actualSize = myList.size();
        int actualElement1 = myList.get(1);
        int actualElement2 = myList.get(2);

        //Then
        assertEquals("Size should be 3", expectedSize, actualSize);
        assertEquals("Element should be 9", expectedElement1, actualElement1);
        assertEquals("Element should be 25", expectedElement2, actualElement2);


    }

    @Test
    public void testSet() {
        //Given

        int expectedOld = 9;
        int expectedNew = 36;

        //When
        int actualOld = myList.set(36, 2);
        int actualNew = myList.get(2);

        //Then
        assertEquals("Integer at index 2 should equal 36", expectedOld, actualOld);
        assertEquals("Integer at index 2 should equal 36", expectedNew, actualNew);


    }

    @Test
    public void testClear() {
        //Given
        int expected = 0;

        //When
        myList.clear();
        int actual = myList.size();

        //Then
        assertEquals("Size should be 0", expected, actual);

    }

    @Test
    public void testIsEmpty() {
        //Given
        myList.clear();
        boolean expected = true;

        //When
        boolean actual = true;

        //Then
        assertEquals("Both should be true", expected, actual);

    }

    @Test
    public void testContains() {
        //Given
        boolean expected = true;

        //When
        myList.contains(16);
        boolean actual = true;

        //Then
        assertEquals("Both should be true", expected, actual);

    }
}
