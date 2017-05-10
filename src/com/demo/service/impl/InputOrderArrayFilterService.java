package com.demo.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import com.demo.service.ArrayFilterService;

public class InputOrderArrayFilterService implements ArrayFilterService {

    /**
     * 
     * @param input The int[] from which to remove duplicate values
     * @return Integer[]
     * This method is used to filter out duplicate values from an int[] and return an array of unique numbers in the order of the input in an Integer[]
     */
    @Override
    public Integer[] getDistinctValues(int[] input) {
	if (input == null){
	    return null;
	}
	Set<Integer> uniqueNumbers = new LinkedHashSet<Integer>();
	for (int element : input)
	    uniqueNumbers.add(element);
	return uniqueNumbers.toArray(new Integer[uniqueNumbers.size()]);
    }

}
