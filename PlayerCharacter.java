import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerCharacter extends Actor
{
    /**
     * Act - do whatever the PlayerCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      keyInput(); 
    }    
    
    public PlayerCharacter() {
        GreenfootImage man = new GreenfootImage("man01.png");
        setRotation(0);
        setImage(man);
    }
    
    public void keyInput() {
        checkLeft();
        checkRight();
        checkUp();
        checkDown(); 
    }
    
    public void checkLeft() {
        if (Greenfoot.isKeyDown("left")){
            setRotation(0);
            move(-5);
        }
    }
    
    public void checkRight() {
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(5);
        }
    }
    
    public void checkUp() {
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(5);
            setRotation(0);
        }
    }
    
    public void checkDown() {
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(5);
            setRotation(0);
        }
    }
}
