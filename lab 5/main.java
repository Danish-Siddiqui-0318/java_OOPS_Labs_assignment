public class main {
    public static void main(String[] args) {

        // Default Constructor
        Triangle triangle1 = new Triangle();
        System.out.println("Testing default constructor " + triangle1);
        System.out.println("Perimeter: " + triangle1.perimeter());
        System.out.println("Is right Angled triangle : " + triangle1.isRightAngled());

        // one parameter constructor
        Triangle triangle2 = new Triangle(7.5);
        System.out.println("Testing one perameter constructor: " + triangle2);
        System.out.println("Perimeter: " + triangle2.perimeter());
        System.out.println("Is right Angled triangle :" + triangle2.isRightAngled());

        // two parameter constructor
        Triangle triangle3 = new Triangle(7.5, 8);
        System.out.println("Testing two perameter constructor: " + triangle3);
        System.out.println("Perimeter: " + triangle3.perimeter());
        System.out.println("Is right Angled triangle :" + triangle3.isRightAngled());

        // three parameter constructor
        Triangle triangle4 = new Triangle(7.5, 8, 10);
        System.out.println("Testing three perameter constructor: " + triangle4);
        System.out.println("Perimeter: " + triangle4.perimeter());
        System.out.println("Is right Angled triangle :" + triangle4.isRightAngled());

        // Copy constructor
        Triangle triangle5 = new Triangle(triangle4);
        System.out.println("Testing copy  constructor: " + triangle5);
        System.out.println("Perimeter: " + triangle5.perimeter());
        System.out.println("Is right Angled triangle :" + triangle5.isRightAngled());

        // object count method
        System.out.println("Total object is " + Triangle.objectCount());


        // Trying setters
        triangle5.setSideA(10);
        triangle5.setSideB(15);
        triangle5.setSideC(20);
        System.out.println("after using setter " + triangle5);
        System.out.println("is right angled triangle : " + triangle5.isRightAngled());


        // Trying getters
        System.out.println("Side A :"+triangle5.getSideA());
        System.out.println("Side B :"+triangle5.getSideB());
        System.out.println("Side C :"+triangle5.getSideC());

        // trying toString method
        System.out.println(triangle5.toString());
    }
}