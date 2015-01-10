import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class burungHelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class burungHelp extends World
{

    /**
     * Constructor donde se marca el tamaño de la pantalla y se genera el boton de regreso
     * 
     */    
    public burungHelp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 450, 1);
        helped helped = new helped ();
        addObject(helped, 205, 200); // mengatur posisi gambar
        Back back = new Back();
        addObject(back, 334, 425); // mengatur posisi button back
    }

}
