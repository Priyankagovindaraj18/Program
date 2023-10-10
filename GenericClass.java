package Std;
class Box<B>
{
	B l,b ;
	public static <B> void get(B l,B b)
	{
		System.out.println("The lenght and breath are"+""+(l)+(b));
		
	}
	
	
	
}
public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box <Integer> obj1=new Box<Integer>();
		obj1.get(10, 20);
		Box <Double> obj2=new Box<Double>();
		obj1.get(10.5, 20.5);
		
		

	}

}
