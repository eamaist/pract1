public class B_Point {
    public double x = 0.0;
    public double y = 0.0;

    public B_Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){

        return this.y;
    }
    public void setY(double y){

        this.y = y;
    }
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }

    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

