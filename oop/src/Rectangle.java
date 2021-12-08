import java.util.Scanner;

public class Rectangle {
    double width , height ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài");
        double width = scanner.nextDouble();
        System.out.println("nhập vào chiều cao");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("your Rectangle \n" + rectangle.display());
        System.out.println("Chu vi hình chữ nhật " + rectangle.getPerimeter());
        System.out.println("diện tích hình chữ nhật " + rectangle.getArea());

    }


    public Rectangle(){
    }
    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
       return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height) * 2 ;
    }

    public String display(){
        return "Rectangle{" + "width=" + width + "height=" + height + "}";
    }

}
