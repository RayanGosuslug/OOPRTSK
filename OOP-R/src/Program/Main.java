package Program;

public class Main {
    public static void main(String[] args) {
        BookcaseWithLivadniy vrn = new BookcaseWithLivadniy("Современная библиотека", "Борт 618");

        BookHandler handler = new BookHandler();

        try{
            handler.book(vrn);
            vrn.info();
        } catch(LibraryException | ShelfException e){
            System.out.println(e.getMessage());
        }
    }
}