//GAME:

public class Monster {


    public final String TOMBSTONE = "Here Lies a Dead monster";

    private int health =500;
    private int attack =20;
    private int movement =2;
    private int xposition =0;
    private int yposition =0;
    private boolean alive = true;

    public String name = "Big Monster";

    public  int getAttack()
    {

       return attack;
    }


    public  int getMovement(){
           return movement;
}

    public int getHealth(){
            return health;
}
    public void setHealth(int decreaseHealth){

        health =health -decreaseHealth;
if(health < 0){
    alive =false;
}
    }

    public void setHealth(double decrease){

        int intDecreaseHealth = (int) decrease;
        health = health - intDecreaseHealth;
        if(health < 0){
            alive =false;
        }

    }

    public Monster (int newHealth, int newAttack, int newMovement){
        health = newHealth;
        attack =newAttack;
        movement=newMovement;

    }



    //Default Constructor -->If you didnt define any consructor
    // a default construct is created automatically
    public Monster(){

    }

    public static void main(String[] args) {
        Monster Frank = new Monster();

        System.out.println(Frank.attack);

        System.out.println(Frank.movement);
    }

}


///IT Continues JavaLessonSeven Class To test the hpw private works.