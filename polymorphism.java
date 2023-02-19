public class polymorphism{
    static abstract class shape{
        abstract void numberofsides();
    }
    public static class Triangle extends shape{
        void numberofsides(){
            System.out.println("number of sides in triangle is 3");

        }
    }
    public static class Rectangle extends shape{
        void numberofsides(){
            System.out.println("number of sides in Rectangle is 4");

        }
    }
    public static class Hexagon extends shape{
        void numberofsides(){
            System.out.println("number of sides in Hexagon is 6");

        }
    }
    public static void main(String[] args) {
        Triangle tri=new Triangle();
        Rectangle rect=new Rectangle();
        Hexagon hex=new Hexagon();
        tri.numberofsides();
        rect.numberofsides();
        hex.numberofsides();

    }

}