package com.training;

import com.training.model.PalindromeChecker;

public class TestPalindromeChecker{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeChecker palStr = (str) -> {
			return new StringBuffer(str).reverse().toString().equals(str);
		};
		System.out.println("The Given String is Palindrome ? -> " + palStr.isPalindrome("deep"));
	}

}
