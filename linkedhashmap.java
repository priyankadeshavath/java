import java.util.*;
class LinkedHashMap_Technolamror{
public static void main(String args[]){
LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
hm.put(100,"sumitha");//putting elements
hm.put(101,"kikiii");
hm.put(102,"Technolamror");
for(Map.Entry m:hm.entrySet()){//traversing map
System.out.println(m.getKey()+" "+m.getValue());//fetching key and values
}
}
}