package assign;

abstract class Bicycle{
    private String size, chain;
    protected double tireSize;

    public Bicycle(String size, String chain, double tireSize){
        this.size = size;
        this.chain = chain == null ? default_chain() : chain;
        this.tireSize = Double.isNaN(tireSize) ? default_tire_size() : tireSize;
    }

    public void showSpares(){
        System.out.println("chain: " + chain);
        System.out.println("tireSize: " + tireSize);
    }

    protected String default_chain(){
        return "10-speed";
    }

    abstract protected double default_tire_size();
}

class RoadBike extends Bicycle{
    private String tapeColor;

    public RoadBike(String tapeColor, String chain, String size, double tireSize){
        super(size, chain, tireSize);
        this.tapeColor = tapeColor;
    }

    public void showSpares(){
        super.showSpares();
        System.out.println("tapeColor: " + tapeColor);
    }

    protected double default_tire_size(){
        return 23;
    }
}

class MountainBike extends Bicycle{
    private String front_shock, rear_shock;

    public MountainBike(String front_shock, String rear_shock, String chain, String size, double tireSize){
        super(size, chain, tireSize);
        this.front_shock = front_shock;
        this.rear_shock = rear_shock;
    }

    public void showSpares(){
        super.showSpares();
        System.out.println("rear_shock: " + rear_shock);
    }

    protected double default_tire_size(){
        return 2.1;
    }

    protected String default_chain(){
        return "15-speed";
    }
}

public class FastFeet {
    public static void main(String[] args){
        MountainBike m1 = new MountainBike("f1", "r1", null, "L", Double.NaN);
        m1.showSpares();

        RoadBike r1 = new RoadBike("purple", "20-speed", "M", 53.26);
        r1.showSpares();
    }
}