import java.util.*;
class MapInterfaceExample{
public static void main(String args[]){
Map<Integer,String> map=new HashMap<Integer,String>();//creating hashmap
map.put(100,"pichuka");//put elements in map
map.put(101,"chiluka");
map.put(102,"lollipop");
for(Map.Entry m:map.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}
}
}
