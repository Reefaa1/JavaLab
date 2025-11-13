public class objc{
   static int count = 0;

 
    objc() {
        count++;
    }

    // static method to display count
    static void displayCount() {
        System.out.println("Total number of objects created: " + count);
    }

    public static void main(String[] args) {
        // create objects
         objc obj1 = new  objc();
         objc obj2 = new objc();
         objc obj3 = new  objc();

        // display total number of objects
         objc.displayCount();
    }
}


    