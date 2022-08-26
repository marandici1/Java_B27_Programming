package day39_inheritance.Library;

public class StoreLibrary {
    public static void main(String[] args) {

        Library book1 = new Library();
        book1.author = "James Clear";
        book1.title = "Atomic Habits";

        AudioBook book2 = new AudioBook();
        book2.duration =45.40;
        book2.hasMovie = true;
        book2.narrator ="James Bon";

        EBook book3 = new EBook();
        book3.size = 24.12;
        book3.onKindle= true;


    }
}
