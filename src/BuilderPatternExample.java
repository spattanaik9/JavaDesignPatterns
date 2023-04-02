class Vehicl {
    //required parameter
    private String engine;
    private int wheel;

    //optional parameter
    private int airbags;

    //public getters, no setters
    public String getEngine(){
        return engine;
    }

    public int getWheel(){
        return wheel;
    }

    public int getAirbags(){
        return airbags;
    }

    //private constructor
    private Vehicl(VehiclBuilder vehiclBuilder){
        this.engine = vehiclBuilder.engine;
        this.wheel = vehiclBuilder.wheel;
        this.airbags = vehiclBuilder.airbags;
    }

    public static class VehiclBuilder {
        private String engine;
        private int wheel;

        //optional param
        private int airbags;

        //constructor with only required parameter
        public VehiclBuilder(String engine, int wheel){
            this.engine = engine;
            this.wheel = wheel;
        }

        //setter of optional parameter
        public VehiclBuilder setAirbags(int airbags){
            this.airbags = airbags;
            return this;
        }

        public Vehicl build(){
            return new Vehicl(this);
        }

    }
}
public class BuilderPatternExample {
    public static void main(String[] args){
        Vehicl car = new Vehicl.VehiclBuilder("1500cc", 4).setAirbags(4).build();
        Vehicl bike = new Vehicl.VehiclBuilder("150cc", 2).build();

        System.out.println(car.getEngine());
        System.out.println(car.getAirbags());

        System.out.println(bike.getEngine());
        System.out.println(bike.getAirbags());
    }
}
