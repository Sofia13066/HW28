package telran.fibonacci.controller;

import java.util.Iterator;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci(8);
        Iterator<Integer> iterator = fibonacci.iterator();
		for (Integer num : fibonacci) {
            int curNum = 0;
			// TODO print all numbers 1,1,2,3,5,8,13,21
            while(iterator.hasNext()) {
                curNum = iterator.next();
                
            }
            System.out.println(curNum+",");
		}
		// TODO print sum of all numbers 1,1,2,3,5,8,13,21 = 54

	}

}