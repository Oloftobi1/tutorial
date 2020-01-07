package FirstProjekt;

import java.util.Random;
import java.util.Scanner;

public class DiesRun {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        //ArmorHead
        Armorhead emptyHelmet = new Armorhead("Empty",0);
        Armorhead leaderHelmet = new Armorhead("Leaderhelmet",1);
        Armorhead ironHelmet = new Armorhead("Ironhelmet",2);
        Armorhead[] randomArmorHead = {leaderHelmet,ironHelmet,emptyHelmet};
        int ran_armorHead = generator.nextInt(randomArmorHead.length);
        //ArmorBreastplate
        ArmorBreastplate  emptyBreastplate = new ArmorBreastplate("Empty",0);
        ArmorBreastplate  leaderBreastplate = new ArmorBreastplate("LeaderBreastplate",1);
        ArmorBreastplate  ironBreastplate = new ArmorBreastplate("Ironbreastplate",2);
        ArmorBreastplate[] randomArmorBreastplate = {leaderBreastplate,ironBreastplate,emptyBreastplate};
        int ran_armorBreastplate = generator.nextInt(randomArmorHead.length);
        //ArmorTrouser
        ArmorTrousers  emptyTrousers= new ArmorTrousers("Empty",0);
        ArmorTrousers  leaderTrousers= new ArmorTrousers("leaderTrousers",1);
        ArmorTrousers  ironTrousers = new ArmorTrousers("Irontrousers",2);
        ArmorTrousers[] randomArmorTrousers = {leaderTrousers,ironTrousers,emptyTrousers};
        int ran_armorTrousers = generator.nextInt(randomArmorHead.length);
        //ArmorShoes
        ArmorShoes  emptyShoes = new ArmorShoes("Empty", 0);
        ArmorShoes  leaderShoes = new ArmorShoes("leaderShoes",1);
        ArmorShoes  ironShoes= new ArmorShoes("Ironshoes",2);
        ArmorShoes[] randomArmorShoes = {leaderShoes,ironShoes,emptyShoes};
        int ran_armorShoes = generator.nextInt(randomArmorHead.length);
        //Armorshield
        ArmorShield  emptyShield = new ArmorShield("Empty",0);
        ArmorShield  woodShield = new ArmorShield("Woodshield",2);
        ArmorShield  ironShield = new ArmorShield("Ironshield",3);
        ArmorShield[] randomArmorShield = {woodShield,ironShield,emptyShield};
        int ran_armorShield = generator.nextInt(randomArmorHead.length);



        Weapon shortSword = new Weapon("Shortsword","slash",generator.nextInt(6)+5);
        Weapon longSword = new Weapon("Longsword","slash",generator.nextInt(6)+7);
        Weapon woodMace = new Weapon("woodMace","hit",generator.nextInt(6)+3);
        Weapon riskStick = new Weapon("Riskstick","hit",generator.nextInt(21)+1);
        Weapon magicStick = new Weapon("Magicstick","cast",generator.nextInt(6)+12);
        Weapon halbeard = new Weapon("Halbeard","hit",generator.nextInt(4)+7);
        Weapon claws = new Weapon("Claws","hit",generator.nextInt(4)+4);
        Weapon ogresClub = new Weapon("OgresClub","slash",generator.nextInt(3)+8);
        Weapon warhammer = new Weapon("Warhammer","slash",generator.nextInt(6)+10);
        Weapon daggers = new Weapon("Daggers","slash",generator.nextInt(3)+6);
        Weapon koboldSkimmitar = new Weapon("Koboldskimmitar","slash",generator.nextInt(3)+5);
        Weapon weapon[] = {shortSword,longSword,woodMace,riskStick,magicStick,halbeard,claws,ogresClub,warhammer,daggers,koboldSkimmitar};
        int ran_weapon = generator.nextInt(weapon.length) ;


        //Creatures
        // TOTAL ARMOR EDITIEREN
        Charakter smallGoblin = new Charakter("Smallgoblin ",weapon[ran_weapon],10,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        Charakter largeGoblin = new Charakter("Largegoblin ",weapon[ran_weapon],15,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield],);
        Charakter bossGoblin = new Charakter("Bossgoblin ",weapon[ran_weapon],30,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        Charakter thieves = new Charakter("Thieves ",weapon[ran_weapon],15,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        Charakter kobold = new Charakter("Kobold ",weapon[ran_weapon],30,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        Charakter koboldBoss = new Charakter("KoboldBoss ",weapon[ran_weapon],20,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);

        Charakter emil = new Charakter("Emil ",weapon[ran_weapon],20,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        Charakter hans = new Charakter("Hans ",weapon[ran_weapon],18,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        Charakter hartmund = new Charakter("Hartmund ",weapon[ran_weapon],25,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        Charakter gottfried = new Charakter("Gottfried ",weapon[ran_weapon],20,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        Charakter theodor = new Charakter("Theodor ",weapon[ran_weapon],15,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        Charakter wilhelm = new Charakter("Wilhelm ",weapon[ran_weapon],18,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);

        Charakter yourCharakter = new Charakter(" ",weapon[ran_weapon],20,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);



        System.out.print("Enter Charakter :\n Emil : 1\n Hans : 2\n Hartmud : 3\n Gottfried : 4\n Theodor :5\n Wilhelm : 6\n ");
        int char1 = input.nextInt();
        switch (char1) {
            case 1:
                yourCharakter = new Charakter("Emil ",weapon[ran_weapon],20,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                        randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
                break;
            case 2:
                yourCharakter = new Charakter("Hans ",weapon[ran_weapon],18,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                        randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
                break;
            case 3:
                yourCharakter = new Charakter("Hartmund ",weapon[ran_weapon],25,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                        randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
                break;
            case 4:
                yourCharakter = new Charakter("Gottfried ",weapon[ran_weapon],20,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                        randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
                break;
            case 5:
                yourCharakter = new Charakter("Theodor ",weapon[ran_weapon],15,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                        randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
                break;
            case 6:
                yourCharakter = new Charakter("Wilhelm ",weapon[ran_weapon],18,randomArmorHead[ran_armorHead],randomArmorBreastplate[ran_armorBreastplate],
                        randomArmorTrousers[ran_armorTrousers],randomArmorShoes[ran_armorShoes],randomArmorShield[ran_armorShield]);
        }

   //     Armor totalArmor = new Armor("Armorset",randomArmorBreastplat[ran_armorBreastplate]);

// Monster Drops Random armor the armor the monster has equipt or empty armor

        while(true){
            System.out.printf("%s\n Damage : %d\n",yourCharakter.name,yourCharakter.weapon.damage);
            System.out.printf("%s\n Armor :  %d\n",largeGoblin.name,largeGoblin.);
            System.out.printf("%s\n Health :  %d\n",largeGoblin.name,largeGoblin.leben);
            int piercedamage = yourCharakter.weapon.getDamage()- largeGoblin.;
            System.out.printf("%s\n pierce Damage :  %d \n",yourCharakter.name,piercedamage);
            largeGoblin.leben = largeGoblin.leben - piercedamage;
            System.out.printf("%s\n Health left : %d\n",largeGoblin.name,largeGoblin.getLeben());
            if (largeGoblin.getLeben()<=0){
                System.out.printf("%s is Dead\n",largeGoblin.name);
                break;
                System.out.printf("%s dropped %s\n",largeGoblin.name,largeGoblin);
                System.out.printf("You can Take one item. 1= %s\n 2=%s\n3= %s\n4= %s\n 5= %s 6 = nothing\n ",largeGoblin.armorHead.armorheadname,largeGoblin.armorBreastplate.armorBreastplatename,);
                int item = input.nextInt();
                if (item==1){
                    yourCharakter.armorHead = largeGoblin.armorHead;
                    System.out.printf("Congratulations you have a new Item : %s ",yourCharakter.armorHead.armorheadname);
                }
                else if (item==2){
                    yourCharakter.armorBreastplate = largeGoblin.armorBreastplate;
                    System.out.printf("Congratulations you have a new Item : %s ",yourCharakter.armorBreastplate.armorBreastplatename);
                }
                else if (item==3){
                    yourCharakter.armorTrousers = largeGoblin.armorTrousers;
                    System.out.printf("Congratulations you have a new Item : %s ",yourCharakter.armorTrousers.armorTrousersname);
                }
                else if (item==4){
                    yourCharakter.armorShoes = largeGoblin.armorShoes;
                    System.out.printf("Congratulations you have a new Item : %s ",yourCharakter.armorShoes.armorShoesname);
                }
               else if (item==5){
                    yourCharakter.armorShield = largeGoblin.armorShield;
                    System.out.printf("Congratulations you have a new Item : %s ",yourCharakter.armorShield.armorShieldname);
                }

            }else if (yourCharakter.getLeben()<=0){
                System.out.printf("%s is Dead",yourCharakter.name);
                break;
            }
        }

    }

}