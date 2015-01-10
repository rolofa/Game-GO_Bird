import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class bom extends Objek
 {
 /**
 * Act - do whatever the Bomb wants to do. This method is called whenever
 * the 'Act' or 'Run' button gets pressed in the environment.
 */
 public void act()
 {
 setLocation(getX(), getY()+6); //mengatur kecepatan
 boming();
 }
 public void boming() //method Boming
 {
 if (canSee(burung.class)) //bila melihat kelas burung
 {
 ((counter)getWorld().getObjects(counter.class).get(0)).Counting(-1); //kelas Count dikurangi sebanyak 1 poin
 Greenfoot.playSound("boom.wav"); //Mainkan sound boom.wav
 }
 if (atWorldEdge())  //bila objek berada di bawah world
 {
 getWorld().removeObject(this); //remove object
 }
 }
 }