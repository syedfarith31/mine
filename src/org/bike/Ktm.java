package org.bike;

public class Ktm implements Bike{
	public void cost() {
		float rs=170000.00f;
		System.out.println("Cost of bike is:"+rs);
		
	}

	public void speed() {
		String sp="150KMPH";
				System.out.println("Speed of bike is:"+sp);
		
	}
	public static void main(String[] args) {
		Ktm b=new Ktm();
		b.cost();
		b.speed();
	}
}

