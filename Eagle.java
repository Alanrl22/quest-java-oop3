public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void takeOff() {
            if (!this.flying && this.altitude == 0) {
                this.flying = true;
                System.out.println( this.getName() + " take off in the sky ");
        }
    }

    public void ascend(int meters) {
        if (this.flying) {
            this.altitude += meters;
            System.out.println(this.getName() + " flies upward, altitude : " + this.altitude);
        }
    }

    public void descend(int meters) {
        if (this.flying) {
            this.altitude -= meters;
            System.out.println(this.getName() + " flies downward, altitude : " + this.altitude);
        }
    }

    public void land() {
        if (this.flying && this.altitude == 0) {
            System.out.println(this.getName() + " lands on the ground.");
        } else {
            System.out.println(this.getName() + "is too high, it can't lands");
        }
    }

    public void glide() {
            System.out.println("It glides into the air.");
    }
}

