import java.util.Scanner;
class Division{

public static void main(String[] args){
int a,b,result;
Scanner input = new Scanner(System.in);
System.out.println("input two integers");
a= input.nextInt();
b= input.nextInt();
try{
result=a/b;
System.out.println("result=" +result);
}
catch(ArithmeticException e){
System.out.println("Exception caught:Division by Zero");
}
}
}