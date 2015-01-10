 import greenfoot.*;  // import World, Actor, GreenfootImage, Greenfoot

/**
 * Write a description of class Paper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Paper extends World
 {

/**
 * Constructor untuk objects dari class Paper.
 */
 public Paper()
 {
 // Buat world dengan ukuran 720x480 cells dengan cell size 1x1 pixels
 super(400, 450, 1);

 prepare(); //method prepare
 
 }
 public void act() //method act
 {

 }
 private void prepare() //method prepare untuk menentukan posisi dari kelas objek masing-masing
 {
   Logo logo = new Logo ();
   addObject(logo, 55, 48); // mengatur posisi
   Play play = new Play();
   addObject(play, 197, 160); // mengatur posisi
   Help help = new Help();
   addObject(help, 197, 269);  // mengatur posisi
 }
 
 }
 
 