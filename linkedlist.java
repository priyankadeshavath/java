import java.util.*;
class LinkedList_technolamror{
public static void main(String args[]){

 Linkedal<String> al=new Linkedal<String>();
 al.add("Rajendra");//Adding object in LinkedList
 al.add("Mahendra");
 al.add("Raja");
 al.add("Technolamror");
 Iterator<String> itr=al.iterator();
 while(itr.hasNext()){
 System.out.println(itr.next());
 }
}
} 