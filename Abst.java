package Std;

import java.util.Scanner;

abstract class Operation {
	float a, b, c;

	Operation() {
		System.out.println("Welcome to perform the operations");
	}

	abstract float add(float a, float b);

	abstract float implement(float a, float b, float c);

}

class Sum extends Operation {

	float add(float a, float b) {

		return a + b;
	}

	float implement(float a, float b, float c) {
		return a + b + c;
	}
}

public class Abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation ob = new Sum();
		float val = ob.add(10, 20);
		System.out.println("The addition of two number is " + val);
		float value = ob.implement(10, 20, 30);

		System.out.println("The addition of three number is " + value);

	}

}
