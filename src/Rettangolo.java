public class Rettangolo implements Forma {

    private double base = 0;
    private double height = 0;

    public Rettangolo (double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcolaArea() {
        System.out.println("L'area del rettangolo é: ");
        return base * height;
    }
}
