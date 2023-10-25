public abstract class B_Clothes {
    public String color;
    public int cost;
    public B_Atel.clothesSize size;
}
class B_TShirt extends B_Clothes implements B_MenClothing, B_WomenClothing {

    public B_TShirt(B_Atel.clothesSize size, int cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Надеваем мужскую футболку размера " + this.size + ", стоимостью " + this.cost + " руб., цвет футболки: " + this.color );
    }

    @Override
    public void dressWomen() {
        System.out.println("Надеваем женскую футболку размера " + this.size + ", стоимостью " + this.cost + " руб., цвет футболки: " + this.color );
    }
}

class B_Pants extends B_Clothes implements B_MenClothing, B_WomenClothing {
    public B_Pants(B_Atel.clothesSize size, int cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
    @Override
    public void dressMan() {
        System.out.println("Надеваем мужские штаны размера " + this.size + ", стоимостью " + this.cost + " руб., цвет штанов: " + this.color );
    }

    @Override
    public void dressWomen() {
        System.out.println("Надеваем женские штаны размера " + this.size + ", стоимостью " + this.cost + " руб., цвет штанов: " + this.color );
    }
}

class B_Skirt extends B_Clothes implements B_WomenClothing {
    public B_Skirt(B_Atel.clothesSize size, int cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public void dressWomen() {
        System.out.println("Надеваем юбку размера " + this.size + ", стоимостью " + this.cost + " руб., цвет юбки: " + this.color );
    }
}

class B_Tie extends B_Clothes implements B_MenClothing {
    public B_Tie(B_Atel.clothesSize size, int cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
    @Override
    public void dressMan() {
        System.out.println("Надеваем галстук размера " + this.size + ", стоимостью " + this.cost + " руб., цвет галстука: " + this.color );
    }
}