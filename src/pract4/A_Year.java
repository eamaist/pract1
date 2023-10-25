public class A_Year {
    public enum Times{
        Summer(24),
        Winter(-10),
        Autumn(6),
        Spring(10);

        private int temp;
        Times(int temp){
            this.temp = temp;
        }
        public void getDescription(Times time){
            if (time == Summer)
                System.out.println("Теплое время года");
            else
                System.out.println("Холодное время года");
        }
    }

    public void Ilove(Times time){
        System.out.print("Я люблю ");
        switch (time){
            case Summer:
                System.out.println("лето");
                break;
            case Winter:
                System.out.println("зима");
                break;
            case Autumn:
                System.out.println("осень");
                break;
            case Spring:
                System.out.println("весна");
                break;
        }
    }

    public void test(){
        Ilove(Times.Summer);
        for (Times time : Times.values()){
            System.out.print(time + " " + time.temp + " ");
            time.getDescription(time);
        }
    }
}
