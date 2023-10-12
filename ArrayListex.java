package Std;
import java.util.*;
 class Product{
	 String id, name;
	 int price;
	 Product (String id,String name, int price)
	 {
		 this.id=id;
		 this.name=name;
		 this.price=price;
	 }
	
}
public class ArrayListex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List <Product> p1= new ArrayList<Product>();
       Product i1= new Product("10F","curd",20);
       Product i2= new Product("11F","milk",30);
       p1.add(i1);
       p1.add(i2);
       System.out.println("Items are");
       for(Product s:p1) {
    	   System.out.println(s.id+"--- "+s.name+" --- "+s.price);
       }
       

  
	}

}
