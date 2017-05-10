package com.demo.factory;

import com.demo.service.ArrayFilterService;
import com.demo.service.impl.AscOrderArrayFilterService;
import com.demo.service.impl.InputOrderArrayFilterService;
import com.demo.service.impl.RandomOrderArrayFilterService;
import com.demo.util.IConstants;

public class ArrayFilterFactory {

    /**
     * 
     * @param type the int value to define an implementation type
     * @return Implementation of ArrayFilterService
     *  This method returns an instance of ArrayFilterService based on the implementation type
     */
    public ArrayFilterService createFilter(int type) {

	switch (type) {
	case IConstants.ORIGINAL_ORDER_METHOD:
	    return new InputOrderArrayFilterService();
	case IConstants.ASCENDING_ORDER_METHOD:
	    return new AscOrderArrayFilterService();
	case IConstants.RANDOM_ORDER_METHOD:
	    return new RandomOrderArrayFilterService();
	default:
	    return null;
	}
    }
}
