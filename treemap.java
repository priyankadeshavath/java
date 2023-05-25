import java.util.*;
class TreeMap_Technolamror{
public static void main(String args[]){//main method
TreeMap<Integer,String> hm=new TreeMap<Integer,String>();//creating treemap
hm.put(100,"amit");//putting elements
hm.put(101,"lalli");
hm.put(102,"shiva");
hm.put(103,"bujji");
//traversing map
for(Map.Entry m:hm.entrySet()){
System.out.println(m.getKey()+ " "+m.getValue());
}
}
}