import java.awt.*;
class LabelExample
{
public static void main(String args[]){ 
Frame f=new Frame("Label example");//creating the object of Frame class
Label l1,l2; //creating the object of Label class  
l1=new Label("First Label"); // initializing the labels 
l1.setBounds(50,100,100,30);  // set the location of label 
l2=new Label("second Label");
l2.setBounds(50,150,100,30);
f.add(l1);f.add(l2);    // adding labels to the frame 
  // setting size, layout and visibility of frame 
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
}