package day40_inheritance.Exam;

public class UsingFinal  extends Test{
    public static void main(String[] args) {

        FinalExamples obj1 = new FinalExamples(20);
        System.out.println(obj1.a);
        System.out.println(obj1.b);


        System.out.println(FinalExamples.PLANET);

       // FinalExamples.PLANET ="MARS";

        Test obj2 = new Test();
        obj2.helloWorld();

    }

 //   public void helloWorld(){     } cannot override final methods
}


class Test{
    public final void helloWorld(){
        System.out.println("Hello World");
    }
}