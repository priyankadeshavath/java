import javax.swing.*;//importing swing class
class FirstSwingExample{
public static void main(String[] args){
JFrame f =new JFrame();//creating instance of Jframe
JButton b =new JButton("click");//creating instance of Jbutton
b.setBounds(130,100,100,40);//setting bounds
f.add(b);//adding button in JFrame
f.setSize(400,500);//400 width and 500 height
f.setLayout(null);//using no layout managers
f.setVisible(true);//making frame visible
}
}