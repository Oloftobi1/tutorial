package FirstProjekt;
public class Charakter {
   public String name;
    public int leben;
    public  Weapon weapon;
    public int schaden;
    public Armorhead armorHead;
    public ArmorBreastplate armorBreastplate;
    public ArmorTrousers armorTrousers;
    public ArmorShoes armorShoes;
    public ArmorShield armorShield;
    public Totalarmor totalarmor;

   public Charakter(String Namen, Weapon weapon,int leben,Armorhead armorHead,ArmorBreastplate armorBreastplate,ArmorTrousers armorTrousers,ArmorShoes armorShoes,ArmorShield armorShield,Totalarmor totalarmor ){
       this.name = Namen;
       this.weapon = weapon;
       this.leben = leben;
       this.armorHead = armorHead;
       this.armorBreastplate = armorBreastplate;
       this.armorTrousers = armorTrousers;
       this.armorShoes = armorShoes;
       this.armorShield = armorShield;
       this.totalarmor=totalarmor;

   }

    public int setLeben(int health)  {
     this.leben=health;
     return this.leben;
    }public int getLeben(){
       return leben;
    }


    public int setSchaden(int schaden)  {
        this.schaden=schaden;
        return this.schaden;
   } public int getSchaden(){
        return this.schaden;
    }




}


