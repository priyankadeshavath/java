import java.io.FileInputStream;
class DataStream{
public static void main(String args[]){
try{
FileInputStream fin=new FileInputStream("C:\Users\priya\Downloads\samplefilehub.txt");
int i=fin.read();
System.out.print((char)i);
fin.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}