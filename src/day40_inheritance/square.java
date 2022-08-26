package day40_inheritance;

public class square extends shape{

    double side;

    public square(double side){
        super("Square");
        this.side = side;
    }

    @Override
    public double area(){
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }
        public String toString(){
         return super.toString() + "\n Side: " + side;
         //calling the super class implementation and adding some part to it
    }

}
