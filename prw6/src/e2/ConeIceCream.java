package e2;

public class ConeIceCream extends IceCream {
    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    protected String eat() {
        return "The " + getFlavor()+ " ice-cream with " +  getTopping() + " is licked";
    }
}
