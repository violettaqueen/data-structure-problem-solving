package java1;

public class Apartment {

    public String name;
    public String shape;

    public Apartment(String name, String shape) {
        this.name = name;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public static void main(String[] args) {

        Apartment apart = new Apartment("Top Towers", "Circle");

        System.out.println(apart.getName() + ", " + apart.getShape());

        Apartment dreamApart = apart;

        System.out.println(dreamApart.name);
        System.out.println(apart.name);

        dreamApart.setName("Hop Towers");
        System.out.println(dreamApart.name);
        System.out.println(apart.getName());

        resetApartmentName(apart);
        System.out.println(apart.name);

    }
    public static void resetApartmentName(Apartment apartment){
        apartment.setName("");
    }
}
