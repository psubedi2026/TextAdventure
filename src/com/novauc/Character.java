package com.novauc;

/**
 * Created by psubedi2020 on 2/14/17.
 */
public class Character {

    String name;
    int health;
    int damage;


    public void battle(Character enemy) {
       System.out.printf("%s appears!\n", enemy.name);

       while (health > 0 && enemy.health > 0) {
            health -= enemy.damage;
            enemy.health -= damage;

           System.out.printf("%s's Health: %d\n", name, health);
           System.out.printf("%s's HEALTH: %d\n", enemy.name, enemy.health);
       }


       String message = "%s has DIED.\n";

       if (health <= 0)  {
           System.out.printf(message, name);
       }

       if (enemy.health <= 0 ) {
           System.out.printf(message, enemy.name);
       }


    }


}
