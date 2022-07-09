package telran.fibonacci.controller;

import java.util.Iterator;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci(8);
        Iterator<Integer> iterator = fibonacci.iterator();
        int sum = 0;
		for (Integer num : fibonacci) {
            int curNum = 0;
            
                curNum = iterator.next();
                sum += curNum;
                System.out.print(curNum+",");
                
                
                
		}
        System.out.println(" = " + sum);
		// TODO print sum of all numbers 1,1,2,3,5,8,13,21 = 54


	}

}