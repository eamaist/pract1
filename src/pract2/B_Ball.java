public class B_Ball {
    private double x = 0.0;
    private double y = 0.0;
    public B_Ball(double x, double y){
    }

    public B_Ball() {
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
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        if (this.x != xDisp && this.y != yDisp){
            this.setXY(this.x + xDisp, this.y + yDisp);
            return;
        }
        if (this.x != xDisp){
            this.setX(this.x + xDisp);
            return;
        }
        if (this.y != yDisp){
            this.setY(this.y + yDisp);
            return;
        }
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
