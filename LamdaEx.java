package Std;
import java.util.*;

interface Test{
	String display(String s);
}
interface Test1{
	int facto( int c);
}
interface Largest{
	int large(int a,int b);
}
public class LamdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob1=(s)->{return s;};
	    System.out.println(ob1.display("Hiii"));
	    
    Largest a1 = (a,b)->{
    	if(a>b)
    	{
    		return a;
    	}
    	else 
    	{
    		return b;

    	}
    };    	
    	Test1 b1=(c)->{
    		int fact=1;
    		
    	
    		 
    		for(int i=1;i<=c;i++) {
    			fact*=i;
    			
    			
    		}
    		c=fact;
    		return c;
    		};    		
    		
    		System.out.println("The factorial of the no is "+b1.facto(5));
    
	System.out.println("The largest no is "+a1.large(5,10));

    }         		
    	}   		
    
	
	


