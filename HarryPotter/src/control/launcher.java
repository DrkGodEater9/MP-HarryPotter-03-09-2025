/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

import model.Wizard;
import spell.ExpectoPatronum;
import spell.Expelliarmus;
import spell.ISpellBehavior;
import spell.OculusReparo;
import spell.WingardiumLeviosa;

/**
 *
 * @author Estudiantes
 */
public class launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ISpellBehavior ExpectoPatronum = new ExpectoPatronum();
        ISpellBehavior Expelliarmus = new Expelliarmus();
        ISpellBehavior OculusReparo = new OculusReparo();
        ISpellBehavior WingardiumLeviosa = new WingardiumLeviosa();
        
        Wizard Harry = new Wizard("HarryPotter", ExpectoPatronum);
        Wizard Ron = new Wizard("RonWeasly", Expelliarmus);
        Wizard Hermione = new Wizard("HermioneGranger", WingardiumLeviosa);
        
    }
    
}
