class Laptop{       // BY default it will inherit the 'object' class
    String model;
    int price;
    // public String toString(){
    //     return model + " " + price;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public boolean equals(Laptop that){           // To check the values present in two object belongs to same class.
    //     return this.model.equals(that.model) && this.price == that.price;
    // }

    
}

public class ObjectClass {
    public static void main(String[] args) {
      Laptop obj = new Laptop();
      obj.model = "Lenovo Yoga";
      obj.price = 22000;
      System.out.println(obj.toString());   // By default it will call toString method. If we don't mention also it will call toString()
    
      Laptop obj1 = new Laptop();
      obj1.model = "Lenovo Yoga";
      obj1.price = 22000;

      System.out.println(obj.equals(obj1));
    }
}
