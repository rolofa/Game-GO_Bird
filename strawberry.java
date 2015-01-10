 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class strawberry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class strawberry extends Objek
 {
 /**
 * Act - do whatever the Banana wants to do. This method is called whenever
 * the 'Act' or 'Run' button gets pressed in the environment.
 */
 //private int timer=0;
 public void act() //method act
 {
 setLocation(getX(), getY()+5); //posisi objek strawberry, kecepatan strawberry = +15
 strawberryFall(); //lakukan method strawberryFall
 }
 public void strawberryFall() //method strawberryFall
 {
 if (atWorldEdge()) //jika objek strawberry berada di bawah world
 {
 getWorld().removeObject(this); // remove objek strawberry
 Greenfoot.playSound("strawberryfall.wav"); // mainkan sound strawberryFall.wav
 }
 }
 }