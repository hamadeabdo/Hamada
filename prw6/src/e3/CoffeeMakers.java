package e3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    public static List<CoffeeMaker> asList(){
        List<CoffeeMaker>coffeeMakers= Arrays.asList(new AutomaticCoffeeMachine(),new FrenchPress(),new AutoDrip());
        return coffeeMakers;



    }
    public static Optional<CoffeeMaker> get(String name){
        List<CoffeeMaker>coffeeMakers=CoffeeMakers.asList();{
            for (CoffeeMaker coffeeMaker : coffeeMakers) {
                if(coffeeMaker.getName().equalsIgnoreCase(name)){
                    return Optional.of(coffeeMaker);
                }
            }
        }return Optional.empty();
    }

}
