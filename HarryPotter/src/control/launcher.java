package control;

import model.Wizard;
import spell.ExpectoPatronum;
import spell.Expelliarmus;
import spell.ISpellBehavior;
import spell.OculusReparo;
import spell.WingardiumLeviosa;

public class launcher {

    public static void main(String[] args) {
        // Create spell instances
        ISpellBehavior expectoPatronum = new ExpectoPatronum();
        ISpellBehavior expelliarmus = new Expelliarmus();
        ISpellBehavior oculusReparo = new OculusReparo();
        ISpellBehavior wingardiumLeviosa = new WingardiumLeviosa();
        
        // Create wizards with their initial spells
        Wizard harry = new Wizard("Harry Potter", expectoPatronum);
        Wizard ron = new Wizard("Ron Weasley", expelliarmus);
        Wizard hermione = new Wizard("Hermione Granger", wingardiumLeviosa);
        
        System.out.println("=== HOGWARTS MAGIC SIMULATION ===\n");
        
        // Show each wizard's spell and cast it
        System.out.println("--- Each wizard shows and casts their spell ---");
        
        System.out.println("Harry Potter's spell: ");
        harry.castSpell();
        System.out.println();
        
        System.out.println("Ron Weasley's spell: ");
        ron.castSpell();
        System.out.println();
        
        System.out.println("Hermione Granger's spell: ");
        hermione.castSpell();
        System.out.println();
        
        // Time passes message
        System.out.println("Some time later...\n");
        System.out.println("--- The situation has changed, wizards change their spells ---\n");
        
        // Change spells and show new ones
        harry.setSpell(expelliarmus);
        System.out.println("Harry Potter's new spell: ");
        harry.castSpell();
        System.out.println();
        
        ron.setSpell(oculusReparo);
        System.out.println("Ron Weasley's new spell: ");
        ron.castSpell();
        System.out.println();
        
        hermione.setSpell(expectoPatronum);
        System.out.println("Hermione Granger's new spell: ");
        hermione.castSpell();
        System.out.println();
        
        System.out.println("=== END OF SIMULATION ===");
    }
}