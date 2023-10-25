public class B_Atel {
    public enum clothesSize{
        XXS(32),
        XS(34),
        S(36),
        M(38),
        L(40);

        public int euroSize;
        clothesSize(int euroSize){
            this.euroSize = euroSize;
        }
        public void getDescription(clothesSize cur) {
            if (cur == clothesSize.XXS)
                System.out.println("Детский размер");
            else
                System.out.println("Взрослый размер");
        }
    }

    void dressMan(B_Clothes[] clothes) {
        for(B_Clothes c: clothes) {
            if (c instanceof B_MenClothing) {
                ((B_MenClothing) c).dressMan();
            }
        }
    }
    void dressWomen(B_Clothes[] clothes) {
        for(B_Clothes c: clothes) {
            if (c instanceof B_WomenClothing) {
                ((B_WomenClothing) c).dressWomen();
            }
        }
    }
    public void test(){
        B_Clothes[] clothes = {
                new B_TShirt(clothesSize.XXS, 749, "зеленый"),
                new B_Pants(clothesSize.M, 1499, "белый"),
                new B_Tie(clothesSize.L, 8499, "белый с голубым"),
                new B_Skirt(clothesSize.S, 3999, "коричневый")
        };
        B_Atel attele = new B_Atel();
        attele.dressMan(clothes);
        System.out.println();
        attele.dressWomen(clothes);
    }
}


