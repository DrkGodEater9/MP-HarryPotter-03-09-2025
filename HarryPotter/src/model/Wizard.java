package model;

import spell.ISpellBehavior;

/**
 *
 * @author Estudiantes
 */
public class Wizard {
    
    private String name;
    private ISpellBehavior spell;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ISpellBehavior getSpell() {
        return spell;
    }

    public void setSpell(ISpellBehavior spell) {
        this.spell = spell;
    }
    
    public Wizard(String name, ISpellBehavior spell){
        this.name = name;
        this.spell = spell;  
    }
    
    public void castSpell(){
        spell.spell();
    }
    
    public void displayInfo(){
        System.out.println("Nombre: " + name);
        System.out.println("Hechizo principal: "+spell);
    }
    
}
