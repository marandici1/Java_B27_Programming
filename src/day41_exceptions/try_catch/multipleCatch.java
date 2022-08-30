package day41_exceptions.try_catch;

public class multipleCatch {
    public static void main(String[] args) {

        try {
            System.out.println(1 / 5);
            String s = null;
            s.trim();
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("second catch block " );
            e.getMessage();
        }
        System.err.println("hello");
        System.out.println("END");
        // this has nothing to do with any try catch

//        try{

//        }catch (StringIndexOutOfBounds | ArrayIndexOutOfBounds e){
//            System.out.println(e.getMessage());
//        }

    }
}
