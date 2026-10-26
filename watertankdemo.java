package p1;

 	class watertank {
	private String name;
	private int[] buckets;
	private int top;
	
	public watertank() {
		this.name = "Standard Tank";
		this.buckets = new int[5];
		this.top = -1;
		System.out.println(name +"created no argument constructor");
		
	}
	
	public watertank(String name, int capacity) {
	this.name = name;
	this.buckets = new int[capacity];
	this.top = -1;
	System.out.println(name + ": Holds "+ capacity + "buckets.");
	
	}
	
	public void pour(int liters) {
		
		if (top == buckets.length -1 ) {
		System.out.println("Overflow! " + name + " is full " + liters + " L spilled on the floor ");
		return;
		}
	top++;
	buckets[top] = liters;
	System.out.println("Poured" + liters + "L into " + name);
	
	}
	
	public int drain() {
		
		if(isEmpty()) {
			System.out.println("Drain");
			return 0;
			
		}
		
		int liters = buckets[top];
		top--;
		System.out.println("drained" + "L from " + name);
		return liters;
	}
	
	public int checkTop() {
		
		if (isEmpty()) {
			System.out.println(name + " is Empty.");
		}
		return buckets[top];
	}
	
	public boolean isEmpty() { return top == -1; }

	public int bucketCount() { return top + 1; }
	
	public int totalLiters() {
		int total = 0;
		for (int i = 0; i <= top; i++) {
			total += buckets[i];
			}
		return total;
		}
	}

	public class watertankdemo {
		
		public static void main(String[] args) {
			watertank tank1 = new watertank(); {
			tank1.pour(10);
			tank1.pour(20);
			tank1.pour(15);
			System.out.println("top bucket: " + tank1.checkTop() + "L");
			tank1.drain();
			System.out.println("buckets left: " + tank1.bucketCount() + "| total water: "+ tank1.bucketCount());
			
			watertank tank2 = new watertank("mini tank", 3); 
			tank2.pour(5);
			tank2.pour(10);
			tank2.pour(15);
			tank2.pour(20);
			tank2.drain();
			tank2.drain();
			tank2.drain();
			tank2.drain();
			System.out.println("Is the tank empty? " + tank2.isEmpty());
			
			
			}
		}
	}


