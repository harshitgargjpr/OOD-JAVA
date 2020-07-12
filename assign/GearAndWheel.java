package assign;

class Gear{
    private int chainring, cog;

    public Gear(int chainring, int cog){
        this.chainring = chainring;
        this.cog = cog;
    }

    public double ratio(){
        return chainring/(double)cog;
    }
}

public class GearAndWheel{
    public static void main(String[] args){
        Gear gear1 = new Gear(52,11);
        Gear gear2 = new Gear(30,27);

        System.out.println(gear1.ratio());
        System.out.println(gear2.ratio());
    }
}