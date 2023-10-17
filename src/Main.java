public class Main {
    public static void main(String[] args) {
        DrawingAPI api1 = new DrawingAPI1();
        DrawingAPI api2 = new DrawingAPI2();

        Shape redCircle = new Circle(100, 100, 10, api1);
        Shape greenCircle = new Circle(200, 200, 20, api2);

        redCircle.draw();
        greenCircle.draw();
    }
}