import java.util.Scanner;
class LinearSearch
{
public static void main(String args[])
{
int c,n,search,array[];
Scanner in = new Scanner(System.in);
System.out.println("enter number of elements");
n = in.nextInt();
array = new int[n];
System.out.println("enter"+n+"integers");
for(c=0;c<n;c++)
array[c] = in.nextInt();
System.out.println("enter value to find");
search = in.nextInt();
for(c=0;c<n;c++)
{
if(array[c] == search)
{
System.out.println(search + " is present at location");
break;
}
}
if(c==n)
System.out.println(search + " is not present in array");
}
} 