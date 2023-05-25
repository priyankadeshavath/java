import java.util.*;
class TestCollection{
public static void main(String args[]){
HashSet<String> set=new HashSet<String>();
set.add("priyaa");
set.add("maggie");
set.add("harika");
set.add("java");
Iterator<String> itr=set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}