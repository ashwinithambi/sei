package com.demo.service.impl;

import java.util.stream.IntStream;

import com.demo.service.ArrayFilterService;

public class AscOrderArrayFilterService implements ArrayFilterService {

    /**
     * 
     * @param input The int[] from which to remove duplicate values
     * @return Integer[]
     * This method is used to filter out duplicate values from an int[] and return an array of unique numbers in Ascending order in an Integer[]
     */
    @Override
    public Integer[] getDistinctValues(int[] input) {
	if (input == null) {
	    return null;
	}
	return IntStream.of(input).distinct().sorted().boxed().toArray(Integer[]::new);
    }

}
