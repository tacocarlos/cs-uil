public class Main {

    public static void RawStringConcat() {
        System.out.println("Raw " + "String");
    }

    public static void VariableStringConcat() {
        String s = "String ";
        String v = "Variable";
        System.out.println(s + v + "!");
    }

    // Java will automatically convert a value to a string
    // when doing string concatenation
    public static void PrimitiveStringConcat() {
        String intMsg = "[int] x = ";
        int x = 10;
        System.out.println(intMsg + x);

        String doubleMsg = "[double] y = ";
        double y = 3.14;
        System.out.println(doubleMsg + y); 

        String booleanMsg = "[bool] z = ";
        boolean z = false;
        System.out.println(booleanMsg + z);
    }

    public static void main(String[] args) {
        RawStringConcat();
        VariableStringConcat();   
        PrimitiveStringConcat();
    }
}