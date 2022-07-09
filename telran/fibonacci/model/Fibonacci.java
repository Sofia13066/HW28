package telran.fibonacci.model;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{
	private int quantity;

	public Fibonacci(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
            int counter = 0;
            int lastNum1 = 0;
            int lastNum2 = 1;
            int current = 0;

			@Override
			public boolean hasNext() {
				return counter < quantity;
			}

			@Override
			public Integer next() {
                if(counter == 0){
                    counter++;
                    return 1;
                }
                current = lastNum1+lastNum2;
                lastNum1 = lastNum2;
                lastNum2 = current;
                counter++;

				return current;
			}

            
		};
	}

    
}