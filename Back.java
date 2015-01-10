import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Boton
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         regresa();
    }
    
    /**Metodo que te regresa al menu*/
   public void regresa()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Paper());
        }
    }
    
}
