package reflection6;

public class CarApplication {
    public static void main(String[] args) {
        Hansel hansel =new Hansel();
        Cars cars = new Cars();
        Car audi =cars.getNextCar(" Audi");
        Car mercedes = cars.getNextCar(" Mercedes");
        Car Seat= cars.getNextCar(" Seat");
        Car Skoda = cars.getNextCar(" Skoda");
        Car Tesla = cars.getNextCar(" Tesla");
        Car Bmw = cars.getNextCar(" Bmw");
        Car Peugeot =cars.getNextCar(" Peugeot");
        Car Citroen = cars.getNextCar(" Citroen");
        Car Jeep =cars.getNextCar(" Jeep");
        Car Ferrari = cars.getNextCar(" Ferrari");
        hansel.haveATry(audi);
        hansel.haveATry(mercedes);
        hansel.haveATry(Seat);
        hansel.haveATry(Skoda);
        hansel.haveATry(Tesla);
        hansel.haveATry(Bmw);
        hansel.haveATry(Peugeot);
        hansel.haveATry(Citroen);
        hansel.haveATry(Jeep);
        hansel.haveATry(Ferrari);







    }
}
