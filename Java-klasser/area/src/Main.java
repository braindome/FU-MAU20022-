public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setLength(5.00);
        rect1.setWidth(2.00);
        System.out.println(rect1.calculatePerimeter());
        System.out.println(rect1.calculateArea());

        rect1.setWidth(6.00);
        System.out.println(rect1.calculatePerimeter());
        System.out.println(rect1.calculateArea());

    }
}