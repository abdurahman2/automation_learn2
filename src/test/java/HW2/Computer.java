package HW2;

public class Computer {
    /*
2.	Design such Java class with name Computer and such properties as:
-	Brand
-	Screen size
-	Number of cores
-	Type (laptop,desktop,etc.)

•	Make `Brand` and `Screen size` properties required in order to create an object(instance).
•	Create two auxiliary objects of Computer class.
     */
    String brand;
    int screenSize;
    int numberOfCores;
    String type;

    public Computer(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public Computer(String brand, int screenSize, int numberOfCores, String type) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.numberOfCores = numberOfCores;
        this.type = type;
    }

    public Computer() {
    }

    public static void main(String[] args) {
        Computer computer = new Computer("dell", 17);
        Computer computer1 = new Computer("asus", 17, 2, "laptop");
        Computer computer2 = new Computer();

    }
}

//public class HW2_2 {
//    public static void main(String[] args) {
//        class Computer {
//            String brand;
//            int screenSize;
//            int numberOfCores;
//            String type;
//
//            Computer(String brand, int screenSize) {
//                Computer computer = new Computer("dell", 17);
//                computer.numberOfCores = 2;
//                computer.type = "laptop";
//            }
//
//            Computer() {
//            }
//
//            Computer computer1 = new Computer();
//            //Create two auxiliary objects of Computer class. - не понимаю, что нужно.
//        }
//    }
//}

