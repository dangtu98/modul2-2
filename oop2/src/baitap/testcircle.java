package baitap;

import javafx.scene.shape.Circle;

public class testcircle {
    public static void main(String[] args) {
        Circles circles1 = new Circles();
        System.out.println("chu vi hinh tron");
        System.out.println(circles1.getRadius());
        System.out.println("dien tich hinh tron");
        System.out.println(circles1.getArea());

        System.out.println("thay doi");
        circles1.change();

        System.out.println("chu vi :" + circles1.getRadius());
        System.out.println("dien tich :" + circles1.getArea());
    }
}
