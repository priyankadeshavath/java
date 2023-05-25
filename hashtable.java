import java.util.*;
class Hashtable_Technolamror{
public static void main(String args[]){//main method
Hashtable<Integer,String> hm=new Hashtable<Integer,String>();//creating hashtable
hm.put(100,"grandmomther");//putting elements
hm.put(102,"grandfather");
hm.put(103,"sister-in-law");
hm.put(104,"brother-in-law");
//traversing map
for(Map.Entry m:hm.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}
}
}