class Recursion_Technolamror{
//method to find factorial of a given number
static int factorial(int n){
if(n==1)
return 1;
else
return(n*factorial(n-1));
}
//driver code
public static void main(String args[]){
System.out.println("fact of 5 is : " +factorial(5));
}
}