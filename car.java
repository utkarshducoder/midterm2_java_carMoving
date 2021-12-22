import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class car extends Applet implements ActionListener{
Button b1=new Button("Right");
Button b2=new Button("Left");
Button b3=new Button("Up");
Button b4=new Button("Down");
int x=100,y=100;
public void init(){

add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
x=x+10;
}
if(e.getSource()==b2){
x=x-10;}
if(e.getSource()==b3){
y=y-10;}
if(e.getSource()==b4){
y=y+10;}
repaint();
}
public void paint(Graphics g){
g.setColor(Color.YELLOW);
g.fillRoundRect(x,y,100,50,5,5);
g.setColor(Color.BLUE);
g.fillRoundRect(x+10,y-28,65,30,2,2);
g.setColor(Color.BLACK);
g.fillOval(x+10,y+30,30,30);
g.fillOval(x+60,y+30,30,30);
g.setColor(Color.WHITE);
g.fillOval(x+70,y+40,10,10);
g.fillOval(x+20,y+40,10,10);
g.setColor(Color.GREEN);
g.fillOval(x+90,y,10,10);
}}
/*<applet code="car.class" width=700 height=700>
</applet>*/