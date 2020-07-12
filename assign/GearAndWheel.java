package assign;

class Gear{
    private class Wheel{
        private double rim, tire;
        private Wheel(double rim, double tire){
            this.rim = rim;
            this.tire = tire;
        }

        private double diameter(){
            return rim + 2*tire;
        }
    }

    private int chainring, cog;
    private Wheel wheel;

    public Gear(int chainring, int cog){
        // assuming 50 and 2 are default values for rim and tire
        this(chainring, cog, 50, 2);    
    }

    public Gear(int chainring, int cog, double rim, double tire){
        this.chainring = chainring;
        this.cog = cog;
        wheel = new Wheel(rim, tire);
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
    }
}