package Constructor;

/*
  A constructor in Java is a special method that is used to initialize objects.
  The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
*/

public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;

    /*
     Constructor name must be the same as its class name
     Constructor must have NO explicit RETURN TYPE
    */

    //  --------------------- Constructor Declaration and Type  ---------------------

            // NO-Arg Constructor
    public Product() {
        this.name = "no name";
        this.description = "no description";
        this.price = 0;
        this.quantity = 0;
        this.discount = 0;
    }

            // Parameterized Constructor
    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

            // Copy Constructor
    public Product(Product product){

//        this.name = product.name;
//        this.description = product.description;
//        this.price = product.price;
//        this.quantity = product.quantity;
//        this.discount = product.discount;
//        this.color = product.color;

        // OR
        // WE CAN USE THE CONSTRUCTOR CHAINING TOO IN THE COPY CONSTRUCTOR
        this (product.name,product.description,product.price,product.quantity,product.discount,product.color);
    }

           // DEFAULT Constructor
    // BOOLEAN --> FALSE (DEFAULT VALUE)
    // BYTE / SHORT / INT --> 0 (DEFAULT VALUE)
    // LONG --> 0L (DEFAULT VALUE)
    // CHAR --> \u0000 (DEFAULT VALUE)
    // FLOAT / DOUBLE --> 0.0F / 0.0D (DEFAULT VALUE)
    // OBJECT --> NULL (DEFAULT VALUE)


    //  --------------------- Constructor Chaining  ---------------------
        /* When a constructor calls another constructor of same class. */
    public Product(String name, String description, float price, int quantity, float discount, String color){
        this (name, description, price, quantity, discount);
        this.color = color;
    }


    // methods to display the attributes values
    public void Display() {
        System.out.printf("name : %s\t description : %s\t price : %f\t quantity : %d\t discount : %f\t color: %s \n",
                name,description,price,quantity,discount,color);
    }

    // Setters and Getters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public float getDiscount() {
            return discount;
        }

        public void setDiscount(float discount) {
            this.discount = discount;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

}
