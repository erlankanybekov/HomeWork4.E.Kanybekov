
package com.company;
import java.util.Random;
public class Main {

    public static int ThankHealth = 400;
    public static int ThankDamage = 30;
    public static int TricksterHealth = 200;
    public static int TricksterDamage = 50;
    public static int BerserkHealth = 200;
    public static int BerserkDamage = 50;
    public static int ThorHealth = 200;
    public static int ThorDamage = 60;
    public static int BossHealth = 450;
    public static int BossDamage = 140;

    public static void main(String[] args) {
        fightInfo();
        while (!isFinished()) {
            round();
        }

    }

    public static void round() {
        BossHit();
        ThankHit();
        TricksterHit();
        BerserkHit();
        ThorHit();
        fightInfo();
    }


    public static boolean isFinished() {
        if (BossHealth <= 0) {
            System.out.println("Heroes won");
            return true;
        }
        if (ThankHealth <= 0 && TricksterHealth <= 0 && BerserkHealth <=0 & ThorHealth <=0) {
            System.out.println("Boss won!");
            return true;
        }
        return false;

    }


    public static void BossHit() {
        if (ThankHealth - BossDamage < 0) {
            ThankHealth = 0;

        } else {
            ThankHealth = ThankHealth - BossDamage;
        }
        if (TricksterHealth - BossDamage < 0) {
            TricksterHealth = 0;
            Random random = new Random();
            int agility = random.nextInt(2);
            if (TricksterHealth > 0 && agility > 0) {
                System.out.println("Trickster уклонился");
                if (agility > 0 && TricksterHealth > 200) {
                    TricksterHealth = 200;
                }
            }
            if (TricksterHealth > 0 && agility == 0) {
                TricksterHealth = TricksterHealth - BossDamage;
            }
        }
        if (BerserkHealth - BossDamage < 0) {
            BerserkHealth = 0;
        } else {
            BerserkHealth = BerserkHealth - (BossDamage) / 2;
        }
        if (ThorHealth - BossDamage < 0) {
            ThorHealth = 0;
        }
        Random random = new Random();
        int Discombobulate = random.nextInt(2);
        if (ThorHealth > 0 && Discombobulate > 0){
            System.out.println("Thor оглушвет");
            if (ThorHealth > 200 && Discombobulate > 0){
                ThorHealth = 200;
            }
        }
        if (ThorHealth > 0 && Discombobulate == 0 ){
            ThorHealth = ThorHealth - BossDamage;
        }
        }




    public static void ThankHit() {
        if (ThankHealth > 0) {
            BossHealth = BossHealth - ThankDamage ;
            System.out.println("Thank берет на себя удар");
            if (BossHealth - ThankDamage < 0) {
                BossHealth = 0;

                }
            }
        }



    public static void TricksterHit() {
        if (TricksterHealth > 0) {
            BossHealth = BossHealth - TricksterDamage;
            if (BossHealth - TricksterDamage < 0) {
                BossHealth = 0;
            }
            }
            Random random = new Random();
            int agility = random.nextInt(2);
            if (TricksterHealth > 0 && agility > 0){
                System.out.println("Trickster уклонился");
                if (TricksterHealth > 200 && agility > 0){
                    TricksterHealth = 200;
                }
            }
            if (TricksterHealth > 0 && agility == 0 ){
                TricksterHealth = TricksterHealth - BossDamage;
            }
        }


    public static void BerserkHit() {
        if (BerserkHealth > 0) {
            BossHealth = BossHealth - BerserkDamage * 2;
            System.out.println("Berserk бьет 2х");
            if (BossHealth - BerserkDamage < 0) {
                BossHealth = 0;

                }
            }
        }
        public static  void  ThorHit() {
            if (ThorHealth > 0) {
                BossHealth = BossHealth - ThorDamage;
                if (BossHealth - ThorDamage < 0) {
                    BossHealth = 0;
                    Random random = new Random();
                    int Discombobulate = random.nextInt(2);
                    if (ThorHealth > 0 && Discombobulate > 0){
                        System.out.println("Thor оглушвет");
                        if (ThorHealth > 200 && Discombobulate > 0){
                            ThorHealth = 200;
                        }
                    }
                    if (ThorHealth > 0 && Discombobulate == 0 ){
                        ThorHealth = ThorHealth - BossDamage;
                    }

                    }

                }
            }

                public static void fightInfo () {
                    System.out.println("________________________________");
                    System.out.println("Boss Health: " + BossHealth);
                    System.out.println("Thank health: " + ThankHealth);
                    System.out.println("Trickster health: " + TricksterHealth);
                    System.out.println("Berserk health: " + BerserkHealth);
                    System.out.println("Thor health: " + ThorHealth);
                    System.out.println("________________________________");


                }




}
