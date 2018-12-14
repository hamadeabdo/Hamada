package e2;

public abstract class IceCream {
    private String flavor;
    private String topping;

    public String getFlavor() { return flavor; }


    public String getTopping() {return topping; }



    public IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }

    protected abstract String eat();

}
