package baitap;

public class Circles {
    private double radius = 1.0;
    private String color = "red";

     public Circles(){

    }

    public Circles(double r) {
       this.radius = r;
    }

    public double getRadius(){
        return (2 * 3.14 * this.radius);
    }

    public double getArea(){
         return (3.14 * Math.pow(this.radius,2));
    }

    public void change(){
          radius = 8.0;
    }
}
