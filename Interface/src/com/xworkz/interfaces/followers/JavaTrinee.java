package com.xworkz.interfaces.followers;

import com.xworkz.interfaces.rules.XworkzRule;

public class JavaTrinee extends Person implements XworkzRule {
	
	public JavaTrinee(String name, int age, long contactNo, String address, String state) {
		super(name, age, contactNo, address, state);
	}

	public void Training() {
		System.out.println("Trining Executed");
	}

	public void ExecuteProgram() {
		System.out.println("Executable program running");
	}

	@Override
	public boolean uploadTask() {
		System.out.println("Upload task running");
		return false;
	}

	@Override
	public boolean completeProgran() {
		System.out.println("Complete Program Running...");
		return false;
	}

	@Override
	public void eat() {
		System.out.println("Eating Running");
	}

	@Override
	public void sleep() {
		System.out.println("Sleep running");
	}

}
