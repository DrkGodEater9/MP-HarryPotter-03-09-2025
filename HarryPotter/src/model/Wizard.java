package model;

import spell.ISpellBehavior;

/**
 *
 * @author Estudiantes
 */
public class Wizard {
    
    private String name;
    private ISpellBehavior spell;

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
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
    
    
}
