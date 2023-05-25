import java.util.*;
class TreeSet_Technolamror{
public static void main(String args[]){
TreeSet<String> al=new TreeSet<String>(); //Creating and adding elements 
al.add("kin");
al.add("sipp");
al.add("kill");
al.add("hipp");
 //Traversing elements 
Iterator<String> itr=al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}