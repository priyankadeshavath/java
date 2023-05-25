import java.awt.*;//importing a awt class
class ChoiceExample{
ChoiceExample(){//class constructor
Frame f=new Frame();//creating a new frame
Choice c=new Choice();//creating a new choice component
c.setBounds(100,100,75,75);//setting bounds of choice menu
c.add("item 1 by rajendra");//adding items to choice menu
c.add("item 2 by lamror");
c.add("item 3 by technolamror");
c.add("item 4");
c.add("item 5");
f.add(c);//adding choice menu to frame
//setting size,layout and visibility of frame
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[])//main method
{
new ChoiceExample();
}
}

