package e2;

public class IceCreamApplication {
    public static void main(String[] args) {
        IceCream cone = new ConeIceCream("Chocolate","Oreo");
        String coneMessage = cone.eat();
        System.out.println(coneMessage);
        IceCream cupe = new ConeIceCream("Vanilla","Cookies");
        String cupMessage=cupe.eat();
        System.out.println(cupMessage);
    }
}
