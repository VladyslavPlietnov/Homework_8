public class Test {
    public static void alsoPrintName(Shape shape){
        System.out.println(shape.shape);
    }
    public static void main(String[] args){
        new Oval().printName();
        new Square().printName();
        alsoPrintName(new Circle());
    }
}
