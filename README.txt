> The application has been designed using Factory Method Pattern. 
> Interface ArrayFilterService has been defined to get unique values from an int[]
> Current the implementation solves 3 use-cases:
	1. Remove duplicate and sort array in ascending order
	2. Remove duplicates and sort array in input order
	3. Remove duplicate and sort array in random order: For high performance filtering use-cases where order or elements is not critical.
		
Positive of this implementation:
1. The application is easily scalable to other array manipulation use-cases.
2. The application has been been developed with 2 different approaches: Use-Case #1 is implemented using java.util.Stream whereas the other implementations use Collection API. The different implementations can be used to compare the performance of the 2 approaches.

************************************************************************************************

