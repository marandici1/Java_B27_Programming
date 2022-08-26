package day40_inheritance.Rules;

public class Rules {
}
class A{
    public int getNum(){
        return 5;
    }
    String getName(){ //default access
        return "James";
    }
}

class B extends A{
    // can not change name or parameters
    public int getNum(){
        return 5;
    }

}

class C extends A{
    //we are able to change the access modifier to more accessible if we want, in this example public or protected
    protected String getName(){  //default access
        return "James";
    }

}