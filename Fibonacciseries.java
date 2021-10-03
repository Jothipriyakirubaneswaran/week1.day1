package week1.day1.assignment;

public class Fibonacciseries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,n=8;    //
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b); 
        for(int i=2;i<n;i++)//since 0 and 1 already printed starting i value from 2
	    {	
             c=a+b;
             a=b;
             b=c;
	       System.out.println(c); 
          } 
		 }  
	}


