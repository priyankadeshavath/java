interface Info{

static final String language = "Java";
public void display();
}
class simple implements Info{
public static void main (String[] args){
simple obj = new simple();
obj.display();
}
public void display(){
System.out.println(language + "is awesome");
}
}
