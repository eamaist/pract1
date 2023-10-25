public class G_BookShelf {
    G_Book[] books;
    int size;
    int elems=0;
    public G_BookShelf(int size) {
        this.size=size;
        books = new G_Book[size];
    }

    public void add(G_Book b){
        if (elems<size){
            books[elems]=b;
            elems++;
        }
        else{
            System.out.println("Полка заполнена");
        }
    }

    public void firstLast(){
        sort();
        System.out.println("Книга с самым ранним годом издания: "+ books[0]+"\nКнига с самым поздним годом издания: "+ books[elems-1]);
    }

    public void sort(){
        for (int i = 0; i <= elems; i++) {
            for (int j = 0; j < elems-1; j++) {
                if(books[j].year> books[j+1].year){
                    G_Book temp= books[j];
                    books[j]= books[j+1];
                    books[j+1]=temp;
                }
            }
        }

    }
}
