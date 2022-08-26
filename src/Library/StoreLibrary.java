package Library;

import day39_inheritance.Library.AudioBook;
import day39_inheritance.Library.EBook;
import day39_inheritance.Library.Library;

public class StoreLibrary {
    public static void main(String[] args) {

        day39_inheritance.Library.Library book1 = new Library();
        book1.author = "James Clear";
        book1.title = "Atomic Habits";

        day39_inheritance.Library.AudioBook book2 = new AudioBook();
        book2.duration =45.40;
        book2.hasMovie = true;
        book2.narrator ="James Bon";

        day39_inheritance.Library.EBook book3 = new EBook();
        book3.size = 24.12;
        book3.onKindle= true;


    }
}
