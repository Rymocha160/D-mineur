/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author Guesmia
 */
import javax.swing.*;
import java.awt.*;
public class DButton extends JButton{
int x,y;
public DButton(int i, int j){
super();
x = i;
y = j;
}
public int getX(){
return x;
}
public int getY(){
return y;
}
}