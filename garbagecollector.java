import java.util.*;
class GarbageCollection
{
public static void main(String s[])throws Exception
{
Runtime rs = Runtime.getRuntime();
System.out.println("free memory in jvm before garbade collector = "+rs.freeMemory());
rs.gc();
System.out.println("free memory in jvm after garbage collector ="+rs.freeMemory());
}
}