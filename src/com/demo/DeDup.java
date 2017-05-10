package com.demo;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import com.demo.factory.ArrayFilterFactory;
import com.demo.service.ArrayFilterService;
import com.demo.util.IConstants;
/**
 * 
 * @author Ashwini
 * The purpose of this class is to demonstrate different methods to filter duplicate numbers from an int[]
 * You can select the following method options to test different implementations 
 * 1: return unique array values in original order of input
 * 2: return unique array values in the ascending order
 * 3: return unique array values in random order
 * 
 *
 */
public class DeDup {

    public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
	    18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
	    19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

    public static void main(String[] args) throws IOException {
	DeDup instance = new DeDup();
	Scanner scanner = new Scanner(System.in);
	PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out));
	String tryAgain = "";
	out.println(IConstants.MESSAGE_INPUT);
	out.println(Arrays.toString(instance.randomIntegers));
	do {
    	    out.println(IConstants.MESSAGE_ORIGINAL_ORDER);
    	    out.println(IConstants.MESSAGE_ASC_ORDER);
    	    out.println(IConstants.MESSAGE_RANDOM_ORDER);
    	    out.println(IConstants.MESSAGE_METHOD_OPTIONS);
    	    int methodNumber = scanner.nextInt();
    	    ArrayFilterFactory factory = new ArrayFilterFactory();
    	    out.println(IConstants.MESSAGE_OUTPUT);
    	    ArrayFilterService service = factory.createFilter(methodNumber);
    	    if (service == null) {
    		out.println(IConstants.ERROR_MESSAGE_WRONG_INPUT);
    	    } else {
    		out.println(Arrays.toString(service.getDistinctValues(instance.randomIntegers)));
    	    }
    	    out.println(IConstants.MESSAGE_CONTINUE);
    	    tryAgain = scanner.next();
	} while (tryAgain.equalsIgnoreCase(IConstants.OPTION_YES));
	out.flush();
    }
}
