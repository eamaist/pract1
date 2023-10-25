public class H {
    public void sort_reversed(){
        String temp = new String();
        String[] a = {"abra", "barbara", "city", "delfi", "fact"};
        for (int i = 0; i < a.length; i++){
            a[i] = "" + i;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length/2; i++){
            temp = a[a.length-i-1];
            a[a.length-i-1] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
