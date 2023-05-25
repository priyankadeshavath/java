import java.awt.*;        // importing Java AWT class
class First extends Frame{  // extending Frame class to our class first
First(){                  // initializing using constructor
Button b=new Button("click me");  // creating a button 
b.setBounds(30,100,80,30);      //setting button position
add(b);                    //adding button into frame
setSize(300,300);   //frame size 300 width and 300 height
setLayout(null);   //no layout manager
setVisible(true);   //now frame will be visible,by default not visible
}
public static void main(String args[]){  // main method
First f=new First();                    // creating instance of Frame class    
}
}