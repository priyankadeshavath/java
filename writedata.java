import java.io.FileOutputStream;
class FileOutputStreamExample{
public static void main(String args[]){
try{
FileOutputStream fout=new FileOutputStream("d:\\testout.txt");
fout.write(65);
fout.close();
System.out.println("SUCCESS BY TECHNOLAMROR");
}
catch(Exception e)
{
System.out.println(e);
}
}
}