
import java.util.*;
import java.lang.*;
import java.io.*;


class AlernateSort
{
	public static void main (String[] args) throws java.lang.Exception
	{

		int []a = {1, 2, 3, 4, 5, 6, 7};
		int n = a.length/2;
		int b[] = new int[n];
		int m = a.length - n;
		int c[]= new int[m];
		Arrays.sort(a);
		int k=0,j=0;
		for(int i=0;i<n;i++)
		{	b[i]=a[i];
			a[i]=-1;
		}
		for(int i=a.length-1;i>=n;i--)
			{
				c[k] = a[i];
				k++;
			}
			k=0;
		for(int i=0; i<a.length;i++){
			if(k<c.length)
				a[i]= c[k]; k++;
			if(j<b.length)
				a[++i] = b[j];j++;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	} 
}
