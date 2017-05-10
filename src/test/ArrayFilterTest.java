package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.demo.factory.ArrayFilterFactory;


public class ArrayFilterTest {

    /**
     * This method is used to int[] filter logic that returns array of unique numbers in order of input
     */
    @Test
    public void testGetUniqueValuesInOrderOfInput() {
	int methodType=1;
	ArrayFilterFactory factory = new ArrayFilterFactory();
	int[] input = { 1, 2, 7, 6, 5, 4, 3, 2 };
	Integer[] expected = { 1, 2, 7, 6, 5, 4, 3 };
	assertEquals(factory.createFilter(methodType).getDistinctValues(input).length, expected.length);
	assertTrue(Arrays.equals(expected, factory.createFilter(methodType).getDistinctValues(input)));
    }

    /**
     * This method is used to int[] filter logic that returns array of unique numbers in ascending order
     */
    @Test
    public void testGetUniqueValuesInAscOrder() {
	int methodType=2;
	ArrayFilterFactory factory = new ArrayFilterFactory();
	int[] input = { 1, 2, 7, 6, 5, 4, 3, 2 };
	int[] ascending = { 1, 2, 3, 4, 5, 6, 7 };
	assertThat(factory.createFilter(methodType).getDistinctValues(input), is(ascending));
    }
   

    /**
     * This method is used to int[] filter logic that returns array of unique numbers in random order
     */
    @Test
    public void testGetUniqueValuesInRandomOrder() {
	int methodType=2;
	ArrayFilterFactory factory = new ArrayFilterFactory();
	int[] input = { 1, 2, 7, 6, 5, 4, 3, 2 };
	Integer[] expected = { 1, 2, 7, 6, 5, 4, 3 };
	assertEquals(factory.createFilter(methodType).getDistinctValues(input).length, expected.length);
    }

}
