package com.training;

import java.io.File;
import java.io.FilenameFilter;

public class TestFilenameFilter {

	public static void main(String[] args) {
		
		FilenameFilter fileFilter = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				System.out.println("FileName Filter is inside Anonymous Inner Class");
				return false;
			}
		};

		
	}

}
