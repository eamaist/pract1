public class C_Circle {
    private C_Point center;

    public C_Circle(C_Point position) {
        this.center = position;
    }

    public C_Circle(double x, double y) {
        this.center = new C_Point(x,y);

    }

    public C_Point getPosition() {
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
        return "C_Circle{" +
                "center=" + center +
                '}';
    }
}
