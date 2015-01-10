 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Boton
{
    /**
     * Act - do whatever the help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        botonHelp();
    }
    
    /**Metodo para que si se clickea el boton de help te envia a lo ayuda*/
    public void botonHelp()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new burungHelp());
        }
    }
}
