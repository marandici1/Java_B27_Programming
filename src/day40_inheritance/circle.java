package day40_inheritance;

public class circle extends shape{

        double radius;

    public circle(double radius){
            super("Circle");
            this.radius = radius;
        }

        @Override
        public double area(){
            return radius * radius * Math.PI;
        } // Math.pow(radius, 2) * Math.PI;
        // // Math.pow(radius, 2) // radius^2

        @Override
        public double perimeter(){
            return 2 * Math.PI * radius;
        }
        public String toString(){
        return super.toString() + "\nRadius: " + radius;
        }
}
