package game;

import game.Moves;

public class Player implements Moves ,Powers{


    @Override
    public void moveRight() {
        System.out.println("move Right");
    }

    @Override
    public void moveLeft() {
        System.out.println("move Left");
    }



    @Override
    public void jump() {
        System.out.println("Jump");

    }

    @Override
    public void turnAround() {
        System.out.println("Turn Around");

    }

    @Override
    public void punch() {
        System.out.println(" Badir Moneer Punch");
    }


    @Override
    public String actions() {
        return " dance ";
    }

    @Override
    public void fly() {
        System.out.println(" fly to sky");
    }

    @Override
    public void fight() {
        System.out.println(" Fight like a hero");
    }

    @Override
    public void disappear() {
        System.out.println(" You can not see me now");
    }
}
