/*Balance String/

import java.util.*;
import java.lang.*;
import java.io.*;

class BalanceString
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String s = "(((ab)";
	int un = 0;
	// char []a = s.toCharArray();
	Stack<Integer> left = new Stack<Integer>();
	Stack<Integer> right = new Stack<Integer>();
	for(int i=0; i<s.length();i++){
		char c = s.charAt(i);
		if(c == '(')
			left.push(i);
		else if(c == ')')
			{   if(left.isEmpty())
					right.push(i);
				else 
					left.pop();
			}
	}
		StringBuilder sb = new StringBuilder(s);
		if(!(left.isEmpty()) || !(right.isEmpty()))	{
			for(int j=0; j<left.size();j++)
				sb.deleteCharAt(j);
			for(int j=0; j<right.size();j++)
				sb.deleteCharAt(j);
		}
		
		s = sb.toString();
		System.out.println(s);
	
	} 
}
