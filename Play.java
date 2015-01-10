import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Boton
{
    /**
     * Act - do whatever the play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        jugar();
    }
    
    /**Metodo para poder acceder al juego*/
    public void jugar()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Papar());
        }
    }
}
