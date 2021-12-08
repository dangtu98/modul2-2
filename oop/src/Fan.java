public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    int speed = 1;
    boolean on = false;
    double radius = 5.0;
    String color = "blue";

    public Fan(){
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn() {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    //    public String toString(){
//        if(on){
//            return this.color + " " + this.speed + " " + this.radius + " " +"fan is on";
//        }else {
//            return this.color + " " + this.speed + " " + this.radius + "  " +"fan is off";
//        }
//    }
}

class Fan123{
    public static void main(String[] args) {
         Fan fan1 = new Fan();
         fan1.setColor("yellow");
         fan1.setSpeed(3);
         fan1.setRadius(10);
         fan1.turnOn();
        System.out.println("Fan 1  " + fan1);

         Fan fan2 = new Fan();
         fan2.setColor("blue");
         fan2.setSpeed(2);
         fan2.setRadius(5);
        System.out.println("Fan 2 " + fan2);

    }
}

