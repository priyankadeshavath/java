import java.io.*;
import java.net.*;
class InetDemo{
public static void main(String[] args){
try{
InetAddress ip=InetAddress.getByName("www.google.com");
System.out.println("Host Name:" + ip.getHostName());
// To get and print InetAddress of Local Host
System.out.println("IP Address:" + ip.getHostAddress());
// To get and print InetAddress of Named Host
}
catch(Exception e)
{
System.out.println(e);
}
}
}
