package FirstProjekt;

class  Weapon {
    public String weaponname;
    public String attackmove;
    public int damage;


    public Weapon(String weaponname, String attackmove,int damage) {
        this.weaponname = weaponname;
        this.attackmove = attackmove;
        this.damage = damage;
    }

    public int setdamage(int damage) {
        this.damage = damage;
        return damage;
    }public int getDamage() {
        return damage;
    }


    public  String setWeaponname(String weaponname) {
        this.weaponname = weaponname;
        return weaponname;
    }public String getWeaponname() {
        return weaponname;
    }
}
