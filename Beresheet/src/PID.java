public class PID {

    private double P;
    private double I;
    private double D;
    private double dt;
    private double lastError;
    


    public PID(double p, double i, double d){
        this.P = p;
        this.I = i;
        this.D = d;

    }

}
