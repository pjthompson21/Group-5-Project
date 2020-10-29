import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * find the players location.
     * turn the enemy towards the player
     * if 
     */
    public void act() 
    {
        setLocation(100,200);
        
        int health = 10;
        
        while (lives != 0) {
        int differenceX = player.getX() - getX();
        if (difference > 0) {
            int setX = getX() + 1;
        }
        else if (difference < 0) {
            int setX = getX() - 1;
        }
        
        int differenceY = player.getY() - getY();
        if (difference > 0) {
            int setY = getY() + 1;
        }
        else if (difference < 0) {
            int setY = getY() - 1;
        }
        
        setLocation(setX, setY);
        turnTowards(player.getX(), player.getY());
        if (isTouching(player)) {
            HealthBar.loseHealth();
        }
    }
        
    }    
}
