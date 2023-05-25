import java.awt.*;//importing AWT class
class TextAreaExample{
TextAreaExample(){// constructor to initialize 
Frame f=new Frame();// creating a frame
TextArea area=new TextArea("welcome technolamror");// creating a text area 
area.setBounds(10,30,300,300);// setting location of text area in frame 
f.add(area);// adding text area to frame
// setting size, layout and visibility of frame 
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}

public static void main(String args[]){// main method
new TextAreaExample();
}
}