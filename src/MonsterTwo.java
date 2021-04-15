import java.util.Arrays;
public class MonsterTwo {

    static char[][] battleBoard =new char[10][10];

    public  static void buildBattleBoard(){

    for(char[] row : battleBoard) {

Arrays.fill(row,'*');

    }

    }
    public static void redrawBoard(){

        int k=1;
        while (k<=30){ System.out.print('-');k++; }
        System.out.println();

    for (int i =0; i < battleBoard.length; i++)
    {

        for (int j =0; j < battleBoard[i].length; j++ ){

            System.out.println("|" +battleBoard[i][j]+ "|");
        }
        System.out.println();
    }

        k=1;
        while (k<=30){ System.out.print('-');k++; }
        System.out.println();

    }

    // Class Variables or Fields
    // You declare constants with final

    public final String TOMBSTONE = "Here Lies a Dead monster";

    // private fields are not visible outside of the class
    private int health =500;
    private int attack =20;
    private int movement =2;

    private boolean alive = true;

    // public variables are visible outside of the class
    // You should have as few as possible public field

    public String name = "Big Monster";
    public char nameChar1 ='B';
    public int xposition =0;
    public int yposition =0;
    public static int numOfMonsters =0;





    // Class Methods
    // Accessor Methods are used to get and set the values of private fields

    public  int getAttack()
    {

        return attack;
    }


    public  int getMovement(){
        return movement;
    }

    public int getHealth() {
        return health;

    }


//    public int getAlive() {
//        return alive;
//
//    }


    // You can create multiple versions using the same method name
        // Now setHealth can except an attack that contains decimals
        // When overloading a method you can't just change the return type
        // Focus on creating methods that except different parameters

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


     /* The Constructor
      * Code that is executed when an object is created from this class definition
      * The method name is the same as the class
      * The constructor is only executed once per object
      * The constructor can't return a value
      */

    public MonsterTwo (int health, int attack, int movement , String name){
        this.health = health;
        this.attack =attack;
        this.movement=movement;
        this.name=name;

         /* If the attributes had the same names as the class health, attack, movement
         * You could refer to the objects fields by proceeding them with this
         * this.health = health;
         * this.attack = attack;
         * objectFieldName = attributeFieldName;
         */

     int maxXBoardSpace = battleBoard.length -1;
     int maxYBoardSpace = battleBoard[0].length -1;

    int randNumX, randNumY;

    do {
     randNumX=(int)(Math.random() * maxXBoardSpace);
     randNumY=(int)(Math.random() * maxYBoardSpace);
    }while (battleBoard[randNumX][randNumY] != '*' );

    this.xposition= randNumX;
    this.yposition= randNumY;

    this.nameChar1 =this.name.charAt(0);

            battleBoard[this.yposition][this.xposition]= this.nameChar1;
            numOfMonsters++;

    }





        // You can overload constructors like any other method
        // The following constructor is the one provided by default if you don't create any other constructors
        // Default Constructor
    public MonsterTwo(){
        numOfMonsters++;
    }




    // You can overload constructors like any other method
    // The following constructor is the one provided by default if you don't create any other constructors
    // Default Constructor

    public static void main(String[] args)
    {

    }

}
