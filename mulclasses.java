class Computer{
Computer(){
System.out.println("constructor of computer class");
}
void Computer_method(){
System.out.println("shut down your PC please");
}
public static void main (String[] args){
Computer c = new Computer();
Laptop l = new Laptop();
c.Computer_method();
l.Laptop_method(); 
}
}
class Laptop{
Laptop(){
System.out.println("constructor of laptop class");
}
void Laptop_method() {
System.out.println("battery is dieing");
}
}