package be.cegeka.battle;

import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private String name;
    private Weapon weapon;
    private int id;


    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.weapon = new BareFist();
        this.name = name;
    }

    public Soldier(String name, Weapon weapon) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        this.weapon = weapon;
    }


    String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public Soldier fight(Soldier soldier) {
        if (soldier.getWeapon().getDamage() > this.getWeapon().getDamage()) {
            return soldier;
        }

        return this;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
