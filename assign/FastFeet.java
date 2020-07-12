package assign;

class Bicycle{
    private String size, tapeColor;

    public Bicycle(String size, String tapeColor){
        this.size = size;
        this.tapeColor = tapeColor;
    }

    public void showSpares(){
        System.out.println("chain: 10-speed");
        System.out.println("tire size: 23");
        System.out.println("tapeColor: " + tapeColor);
    }

    public String getSize(){
        return size;
    }
}

public class FastFeet {
    public static void main(String[] args){
        Bicycle myBike = new Bicycle("M", "Red");
        System.out.println(myBike.getSize());
        myBike.showSpares();
    }
}