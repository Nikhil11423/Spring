package com.xworkz.testing;

public class JUnit {
	
	public int square(int x) {
		return x*x;	
	}

	public int count(String word) {
		int count = 0;
		for(int i=0;i<word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}
	
}
