package day38_tasks;

public class pizza {
    private String size;
    private int numberOfTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equals("small") || size.equals("medium") || size.equals("large")) {
            this.size = size;
        }else {
            this.size = "";
        }
    }

    public int getNumberOfTopping() {
        return numberOfTopping;
    }

    public void setNumberOfTopping(int numberOfTopping) {
        if (numberOfTopping > 0) {
            this.numberOfTopping = numberOfTopping;
        }
    }

    public pizza(String size, int numberOfTopping) {
        setSize(size);
        if (! this.size.equals("")) {
            setNumberOfTopping(numberOfTopping);
        }
    }

    public double calculatePrice() {
        double finalPrice = 0;
        switch (size) {
            case "small":
                finalPrice += 4;
                break;
            case "medium":
                finalPrice += 6;
                break;
            case "large":
                finalPrice += 8;
                break;
        }
        return finalPrice+=numberOfTopping *0.75;
    }

    @Override
    public String toString() {
        if ( this.size.equals("")) {
            return "Not valid Pizza size";
        }
        return "pizza{" +
                "size='" + size + '\'' +
                ", numberOfTopping=" + numberOfTopping +
                " price=" + calculatePrice() +
                '}';
    }
}
