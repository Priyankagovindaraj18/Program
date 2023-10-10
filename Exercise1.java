package Std;

interface Searchable {
	boolean search(String keyword);
}

class Document implements Searchable {
	String s1;

	Document(String s1) {
		this.s1 = s1;
	}

	public boolean search(String keyword) {
		System.out.println(s1.contains(keyword));
		return true;
	}
}

class WebPage implements Searchable {
	String s1;

	WebPage(String s1) {
		this.s1 = s1;
	}

	public boolean search(String keyword) {
		System.out.println(s1.contains(keyword));
		return true;
	}
}

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document ob = new Document("ever use the keyword");
		WebPage eb = new WebPage("never use the keyword");
		System.out.println("The output is " + ob.search("ever"));
		System.out.println("The output is " + eb.search("never"));
	}
}
