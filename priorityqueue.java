import java.util.*;
class PriorityQueue_technolamror{
public static void main(String args[]){ // Main Method
PriorityQueue<String> queue=new PriorityQueue<String>();// Creating empty priority queue
queue.add("jimmi");// Adding items to the pQueue using add()
queue.add("gihhh");
queue.add("vinnn");
queue.add("kimuu");
queue.add("chimm");
System.out.println("head"+queue.element());
System.out.println("head"+queue.peek());
System.out.println("iteratng queue elements");
//traversing the queue elements
Iterator itr=queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
// Printing the top element and removing it
        // from the PriorityQueue container
queue.remove();
queue.poll();
System.out.println("after removing two elements");
Iterator<String> itr2=queue.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}
}}