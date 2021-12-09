package baitap2;

public class Topstuden {
     private String name = "john";
     private String classes = "C02";

     Topstuden(){

     }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Topstuden{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

