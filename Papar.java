import greenfoot.*;  // import World, Actor, GreenfootImage, Greenfoot

/**
 * Write a description of class Papar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Papar extends World
 {

/**
 * Constructor untuk objects dari class Papar.
 */
 public Papar()
 {
 // Buat world dengan ukuran 720x480 cells dengan cell size 1x1 pixels
 super(400, 450, 1);
 strawberryAppear(); //method strawberryAppear
 prepare(); //method prepare
 bomAppear(); //method bomAppear
 }
 public void act() //method act
 {
 if (getObjects(strawberry.class).isEmpty()) strawberryAppear();
 if (getObjects(bom.class).isEmpty()) bomAppear();
 }
 private void prepare() //method prepare untuk menentukan posisi dari kelas objek masing-masing
 {
 burung burung = new burung ();
 addObject(burung, 648, 403);
 counter counter = new counter();
 addObject(counter, 57, 69);
 score score = new score();
 addObject(score, 64, 44);
 score.setLocation(59, 44);
 burung.setLocation(373, 403);
 }
 public void strawberryAppear() //method strawberryAppear
 {
 if(Greenfoot.getRandomNumber(2) < 50)
 {
 addObject(new strawberry(), Greenfoot.getRandomNumber(519),20);//jumlah objeknya
}
 }

public void  bomAppear() //method bomAppear
 {
 if(Greenfoot.getRandomNumber(2) < 50)
 {
 addObject(new bom(), Greenfoot.getRandomNumber(519),21);//jumlah objeknya
 }
 }
 }
 