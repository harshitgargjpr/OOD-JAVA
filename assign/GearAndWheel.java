package assign;

class Wheel{
    private double rim, tire;
    public Wheel(double rim, double tire){
        this.rim = rim;
        this.tire = tire;
    }

    public double circumference(){
        return Math.PI * diameter();
    }

    public double diameter(){
        return rim + 2*tire;
    }
}

class Gear{
    private int chainring, cog;
    private Wheel wheel;

    public Gear(int chainring, int cog){
        this(chainring, cog, null);    
    }

    public Gear(int chainring, int cog, double rim, double tire){
        this(chainring, cog, new Wheel(rim,tire));
    }

    public Gear(int chainring, int cog, Wheel wheel){
        this.chainring = chainring;
        this.cog = cog;
        this.wheel = wheel;
    }

    public double ratio(){
        return chainring/(double)cog;
    }

    public double gearInches(){
        return ratio() * wheel.diameter();
    }
}

public class GearAndWheel{
    public static void main(String[] args){
        Gear gear1 = new Gear(52,11);
        Gear gear2 = new Gear(30,27);

        System.out.println(gear1.ratio());
        System.out.println(gear2.ratio());

        Gear gear3 = new Gear(52, 11 ,26, 1.5);
        System.out.println(gear3.gearInches());

        Wheel wheel = new Wheel(26, 1.5);
        System.out.println(wheel.circumference());
        Gear gear4 = new Gear(52, 11, wheel);

        System.out.println(gear4.gearInches());
    }
}