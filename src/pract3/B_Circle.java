import java.util.Random;

public class B_Circle {
    Random rand = new Random();
    private B_Point center;
    public int radius = rand.nextInt();
    public double len_circ = 2*3.14*radius;

    public B_Circle(double x, double y) {
        this.center = new B_Point(x,y);
    }

    public B_Point getPosition() {
        return center;
    }

    public double getX() {
        return center.getX();
    }

    public double getY() {
        return center.getY();
    }

    public void setX(double x) {
        center.setX(x);
    }

    public void setY(double y) {
        center.setY(y);
    }

    public void setXY(double x, double y){
        center.setX(x);
        center.setY(y);
    }

    public void move(double xDisp, double yDisp){
        center.setX(center.getX()+xDisp);
        center.setY(center.getY()+yDisp);

    }

    @Override
    public String toString() {
        return "B_Circle{" +
                "rand=" + rand +
                ", center=" + center +
                ", radius=" + radius +
                ", len_circ=" + len_circ +
                '}';
    }
}
