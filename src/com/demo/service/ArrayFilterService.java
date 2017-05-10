package com.demo.service;

public interface ArrayFilterService {

    /**
     * 
     * @param input The int[] from which to remove duplicate values
     * @return Integer[]
     * This method is used to filter out duplicate values from an int[] and an array of return unique numbers in Integer[]
     */
    public Integer[] getDistinctValues(final int[] input);

}
