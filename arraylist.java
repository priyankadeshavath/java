import java.util.*;
class Arraylist_technolamror{
public static void main(String args[]){//main method
ArrayList<String> list=new ArrayList<String>();//creating arraylist
list.add("ppp");//adding object in arraylist
list.add("kkkk");
list.add("cccc");
list.add("bbbbb");
Iterator itr=list.iterator();//traversing list through iterator
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}