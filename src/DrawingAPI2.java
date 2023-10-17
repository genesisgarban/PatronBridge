// Implementación concreta de dibujo en blanco y negro
class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("Dibujando círculo en blanco y negro en (%.2f,%.2f) con radio %.2f%n", x, y, radius);
    }
}