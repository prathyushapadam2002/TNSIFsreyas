package com.tnsif.exception;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) {
		ThrowsDemo t=new ThrowDemo();
		try {
			t.display();
		}catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
