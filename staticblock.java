class staticBlock{
public static void main(String[] args){

System.out.println("Main method executed");
}
static{
System.out.println("Static block executed before main method");
}
class StaticBlock{
public static void main(String[] args){
System.out.println("you are using windows_NT operating system");
}
static{
String os=System.getenv("OS");
if(os.equals("Windows_NT")!=true)
{
System.exit(1);
}
}
}
}