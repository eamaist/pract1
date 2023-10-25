public class F_Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }

    public F_Circle(double radius) {
        this.radius = radius;
    }

    public void area(){
        System.out.println("Площадь: "+Math.PI*radius*radius);
    }
    public void length(){
        System.out.println("Длина окружности: "+2*Math.PI*radius);
    }

    public void compareWith(F_Circle c2){
        if (radius>c2.getRadius()){
            System.out.println("Первая окружность больше");
        }
        else if(radius<c2.getRadius()){
            System.out.println("Первая окружность меньше");
        }
        else if(radius==c2.getRadius()){
            System.out.println("Окружности равны");
        }
    }
}
