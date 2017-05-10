package com.demo.util;

public interface IConstants {

    int ORIGINAL_ORDER_METHOD = 1;
    int ASCENDING_ORDER_METHOD = 2;
    int RANDOM_ORDER_METHOD = 3;
    String MESSAGE_ORIGINAL_ORDER = String.format("Method %s: returns unique array values in original order of input",
	    ORIGINAL_ORDER_METHOD);
    String MESSAGE_ASC_ORDER = String.format("Method %s: returns unique array values in the ascending order",
	    ASCENDING_ORDER_METHOD);
    String MESSAGE_RANDOM_ORDER = String.format("Method %s: returns unique array values in random order",
	    RANDOM_ORDER_METHOD);

    String MESSAGE_METHOD_OPTIONS = String.format("Which method would you like to run? %s/%s/%s", ORIGINAL_ORDER_METHOD,
	    ASCENDING_ORDER_METHOD, RANDOM_ORDER_METHOD);

    String MESSAGE_INPUT = "***************** Input Array *****************";
    String MESSAGE_OUTPUT = "***************** Output *****************";
    String ERROR_MESSAGE_WRONG_INPUT = "Incorrect Method";
    String OPTION_YES = "Y";
    String OPTION_NO = "N";
    String MESSAGE_CONTINUE = String.format("Would you like to test another method? %s / %s ", OPTION_YES, OPTION_NO);
}
