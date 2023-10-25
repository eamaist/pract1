import java.util.ArrayList;

class Computer {
    String name;
    int price;

    public Computer(String name, int price ) {
        this.price = price;
        this.name = name;
    }
}

public class D_Shop {
    ArrayList<Computer> computers = new ArrayList<Computer>();
    public void addComputer(String name, int price) {
        computers.add(new Computer(name,price));
    }


    public void delComputer(String name){
        for (Computer object: computers) {
            if(object.name.equals(name)){
                computers.remove(object);
                break;
            }
        }
    }

    public void find(String name){
        for (Computer object: computers){
            if (object.name.equals(name)){
                System.out.println("Название: "+object.name+" "+"цена: "+object.price);

            }
        }
    }

    public void find(int minPrice,int maxPrice){
        for (Computer object: computers) {
            if(object.price>=minPrice && object.price<=maxPrice){
                System.out.println("Название: "+object.name+" "+"цена: "+object.price);
            }
        }
    }

    public void showComputers(){
        System.out.println("Компьютеры в магазине: ");
        for (Computer object: computers) {
            System.out.println("Название: "+object.name+" "+"цена: "+object.price);
        }
    }

}

