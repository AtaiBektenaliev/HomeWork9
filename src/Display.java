public class Display {
    private double diagonal;
    private String manufacturer;
    private double matrixType;

    public Display(double diagonal, String manufacturer, double matrixType) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                ", matrixType=" + matrixType +
                '}';
    }
}
