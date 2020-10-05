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
public class DImageur{
private DPartie partie;
public String repertoire = "./Images/Classic";
public DImageur(DPartie p){
partie = p;
}
public String getRepertoire(){
return repertoire;
}
public void setRepertoire(String s){
repertoire = s;
}
ImageIcon getImage(int i, int j){
if(!partie.perdu() && !partie.gagne()){
if(partie.getMatrice().getCase(i,j).yaDrapreau())
return new ImageIcon(repertoire+"/Drapeau.PNG");
if(!partie.getMatrice().getCase(i,j).estDecouverte()){
if(partie.getMatrice().getCase(i,j).select())
return new ImageIcon(repertoire+"/Select.PNG");
else
return new ImageIcon(repertoire+"/Inconnue.PNG");
}
switch(partie.getMatrice().getCase(i,j).getMinesAlentour()){
case 0: return new ImageIcon(repertoire+"/Vide.PNG");
case 1: return new ImageIcon(repertoire+"/1.PNG");
case 2: return new ImageIcon(repertoire+"/2.PNG");
case 3: return new ImageIcon(repertoire+"/3.PNG");
case 4: return new ImageIcon(repertoire+"/4.PNG");
case 5: return new ImageIcon(repertoire+"/5.PNG");
case 6: return new ImageIcon(repertoire+"/6.PNG");
case 7: return new ImageIcon(repertoire+"/7.PNG");
case 8: return new ImageIcon(repertoire+"/8.PNG");
default : return new ImageIcon(repertoire+"/Mine.PNG");
}
}
else{
if(partie.perdu()){
if((partie.getMatrice().getCase(i,j).yaDrapreau())
&& !(partie.getMatrice().getCase(i,j).estMine() ))
return new ImageIcon(repertoire+"/Croix.PNG");
if(partie.getMatrice().getCase(i,j).estMine())
return new ImageIcon(repertoire+"/Mine.PNG");
if(!partie.getMatrice().getCase(i,j).estDecouverte())
return new ImageIcon(repertoire+"/Inconnue.PNG");
switch(partie.getMatrice().getCase(i,j).getMinesAlentour()){
case 0: return new ImageIcon(repertoire+"/Vide.PNG");
case 1: return new ImageIcon(repertoire+"/1.PNG");
case 2: return new ImageIcon(repertoire+"/2.PNG");
case 3: return new ImageIcon(repertoire+"/3.PNG");
case 4: return new ImageIcon(repertoire+"/4.PNG");
case 5: return new ImageIcon(repertoire+"/5.PNG");
case 6: return new ImageIcon(repertoire+"/6.PNG");
case 7: return new ImageIcon(repertoire+"/7.PNG");
case 8: return new ImageIcon(repertoire+"/8.PNG");
default : return new ImageIcon(repertoire+"/Mine.PNG");
}
}
else {switch(partie.getMatrice().getCase(i,j).getMinesAlentour()){
case 0: return new ImageIcon(repertoire+"/Vide.PNG");
case 1: return new ImageIcon(repertoire+"/1.PNG");
case 2: return new ImageIcon(repertoire+"/2.PNG");
case 3: return new ImageIcon(repertoire+"/3.PNG");
case 4: return new ImageIcon(repertoire+"/4.PNG");
case 5: return new ImageIcon(repertoire+"/5.PNG");
case 6: return new ImageIcon(repertoire+"/6.PNG");
case 7: return new ImageIcon(repertoire+"/7.PNG");
case 8: return new ImageIcon(repertoire+"/8.PNG");
default : return new ImageIcon(repertoire+"/Drapeau.PNG");
}
}
}
}
}