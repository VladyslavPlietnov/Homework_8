public class ShapePrinter {
    public static void printName(Shape shape){
        System.out.println(shape.getName());
    }
    public static void main(String[] args){

        printName(new Circle());
    }
}
