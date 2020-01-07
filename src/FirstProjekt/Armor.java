package FirstProjekt;

public class Armor {
    public String armorname;
    public int armor;

    // creat armorhead... add them up to int armor.

    public Armor(String armorname, Armorhead head, int armor) {
        this.armorname = armorname;
        //  head.getArmorhead() = armor;
    }
    public String setArmorname(String armorname) {
        this.armorname = armorname;
        return armorname;
    }

    public String getArmorname() {
        return armorname;
    }
}
     class Totalarmor {
        public Armorhead kopf;
        public ArmorBreastplate Brust;
        public ArmorTrousers Hosen;
        public ArmorShoes schuhe;
        public ArmorShield schild;

        public int setTotalArmor(Armorhead kopf, ArmorBreastplate Brust, ArmorTrousers Hosen, ArmorShoes schuhe, ArmorShield schild) {
            this.kopf = kopf;
            this.Brust = Brust;
            this.Hosen = Hosen;
            this.schuhe = schuhe;
            this.schild = schild;
            int totalarmor = kopf.getArmorhead() + Brust.getArmorBreastplate() + Hosen.getArmorTrousers() + schuhe.getArmorShoes() + schild.getArmorShield();
            return totalarmor;
        }

        public int getTotalArmor() {
            int totalarmor = kopf.getArmorhead() + Brust.getArmorBreastplate() + Hosen.getArmorTrousers() + schuhe.getArmorShoes() + schild.getArmorShield();
            return totalarmor;
        }

    }


    class  Armorhead {
        public String armorheadname;
        public int armorhead;

        public Armorhead(String armorheadname,int armorhead) {
            this.armorheadname = armorheadname;
            this.armorhead = armorhead;
        }
        public int setArmorhead(int armor) {
            this.armorhead = armor;
            return armor;
        }public int getArmorhead() {
            return armorhead;
        }

        public  String setArmorheadname(String armorname) {
            this.armorheadname = armorname;
            return armorname;
        }public String getArmorheadname() {
            return armorheadname;
        }
    }

    class  ArmorBreastplate {
        public String armorBreastplatename;
        public int armorBreastplate;

        public ArmorBreastplate(String armorBreastplatename,int armorBreastplate) {
            this.armorBreastplatename = armorBreastplatename;
            this.armorBreastplate = armorBreastplate;
        }
        public int setArmorBreastplate(int armorBreastplate) {
            this.armorBreastplate = armorBreastplate;
            return armorBreastplate;
        }public int getArmorBreastplate() {
            return armorBreastplate;
        }

        public  String setArmorBreastplatename(String armorBreastplatename) {
            this.armorBreastplatename = armorBreastplatename;
            return armorBreastplatename;
        }public String getArmorheadname() {
            return armorBreastplatename;
        }
    }
    class  ArmorTrousers {
        public String armorTrousersname;
        public int armorTrousers;

        public ArmorTrousers(String armorTrousersname,int armorTrousers) {
            this.armorTrousersname = armorTrousersname;
            this.armorTrousers = armorTrousers;
        }
        public int setArmorTrousers(int armorBTrousers) {
            this.armorTrousers = armorTrousers;
            return armorTrousers;
        }public int getArmorTrousers() {
            return armorTrousers;
        }

        public  String setArmorTrousers(String armorTrousers) {
            this.armorTrousersname = armorTrousers;
            return armorTrousers;
        }public String getArmorTrousersname() {
            return armorTrousersname;
        }
    }
    class  ArmorShoes {
        public String armorShoesname;
        public int armorShoes;

        public ArmorShoes(String armorShoesname,int armorShoes) {
            this.armorShoesname = armorShoesname;
            this.armorShoes = armorShoes;
        }
        public int setArmorShoes(int armorShoes) {
            this.armorShoes = armorShoes;
            return armorShoes;
        }public int getArmorShoes() {
            return armorShoes;
        }

        public  String setArmorShoesname(String armorShoesname) {
            this.armorShoesname = armorShoesname;
            return armorShoesname;
        }public String getArmorheadname() {
            return armorShoesname;
        }
    }
    class  ArmorShield {
        public String armorShieldname;
        public int armorShield;

        public ArmorShield(String armorShieldname, int armorShield) {
            this.armorShieldname = armorShieldname;
            this.armorShield = armorShield;
        }

        public int setArmorShield(int armorShield) {
            this.armorShield = armorShield;
            return armorShield;
        }

        public int getArmorShield() {
            return armorShield;
        }

        public String setArmorShieldsname(String armorShieldname) {
            this.armorShieldname = armorShieldname;
            return armorShieldname;
        }

        public String getArmorShieldname() {
            return armorShieldname;
        }
    }



