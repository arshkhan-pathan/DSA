/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import static java.lang.System.out;

class GFG {

	
	static int countDigits(int x)
	{
		int res = 0;

		while(x > 0)
		{
				x = x / 10;

				res++;
		}	

		return res;
	}

	public static void main (String[] args) {
		
		int number = 789;

		System.out.println(countDigits(number));

	}
}