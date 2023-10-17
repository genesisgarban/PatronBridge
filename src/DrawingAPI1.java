// Implementación concreta de dibujo en color
class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("Dibujando círculo en color en (%.2f,%.2f) con radio %.2f%n", x, y, radius);
    }
}