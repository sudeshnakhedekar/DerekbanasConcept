public class Cats extends Animals {

    public String favToy = "Yarn";

    public Cats(String morris, String tuna, String rubber_mouse) {
    }

    public void playWith(){
        System.out.println("Yeah" + favToy);

    }

    public void walkAround(){
        System.out.println(this.getName() + "stalks around");
    }

    public String getToy(){
        return this.favToy;
    }

    public Cats(){

    }

    public Cats(String name, String favFood){

        super(name,favFood);
        this.favToy= favToy;

    }

}
