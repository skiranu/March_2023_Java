abstract class AbstractModVehicle{
    abstract public int getNumberOfWheels();
    final public int getNumberOfSeats(){
        return 2;
    };
    public static void main(String[] args){
        Auto a = new Auto();
        System.out.println(a.getNumberOfWheels());
        Bus b = new Bus();
        System.out.println(b.getNumberOfWheels());
        System.out.println(b.getNumberOfSeats());
    }
}
// child class
class Bus extends AbstractModVehicle{
    public int getNumberOfWheels() {
        return 7;
    }
    public int getNumberofSeats(){
        return 222;
    }
}

class Auto extends AbstractModVehicle{
    public int getNumberOfWheels() {
        return 3;
    }
}

