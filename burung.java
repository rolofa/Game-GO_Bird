import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peli here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class burung extends Objek
 {
 /**
 * Act - do whatever burung wants to do. This method is called whenever
 * the 'Act' or 'Run' button gets pressed in the environment.
 */
 public void act() //method act

{
 moveburung(); //method movepeli
 objectDisappear(); //method objectDisappear
 }
 public void objectDisappear() //method objectDisappear
 {
 if (canSee(strawberry.class)) //bila melihat kelas objek strawberry
 {
 eat(strawberry.class); //eat kelas objek strawberry
 ((counter)getWorld().getObjects(counter.class).get(0)).Counting(10); // kelas counter ditambah sebanyak 10 poin
 Greenfoot.playSound("score.wav"); // mainkan sound score.wav
 }

}
 public void moveburung() //method moveburung
 {
 if (Greenfoot.isKeyDown("left")) //bila arah panah ke kiri ditekan
 {
 move(-7); //bergerak ke -7
 }
 if (Greenfoot.isKeyDown("right")) //bila arah panah ke kanan ditekan
 {
 move(7); //bergerak ke 7
 }
 }
 }