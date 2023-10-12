package Std;

import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue <String> queue=new PriorityQueue<String>();
queue.add("Priyanka");
queue.add("sruthi");
queue.add("shalini");
queue.add("Kishor");
System.out.println("head:"+queue.peek());
System.out.println("head:"+queue.element());

System.out.println("iterating the elements");
for (String s:queue) {
	System.out.println(s);
}

queue.remove();
queue.poll();
System.out.println("After removing");
for (String s:queue) {
	System.out.println(s);
}


	}

}
