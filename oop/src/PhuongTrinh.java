public class PhuongTrinh {
    private double a;
    private double b;
    private double c;

    public PhuongTrinh(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

   public double getDelta(){
        return (Math.pow(this.b,2) - 4 * this.a * this.c);
   }

   public double getRoot1(){
        return (-this.b + Math.sqrt(getDelta()) / 2 * this.a);
   }

   public double getRoot2(){
        return (-this.b - Math.sqrt(getDelta()) / 2 * this.a);
   }

   public double getRoot3(){
        return (-this.c / this.b);
   }
}

