package prototype;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle(){
        this.vehicleList = new ArrayList<String>();
    }

    public Vehicle(List<String> list){
        this.vehicleList = list;
    }

    public void insertData(){
        vehicleList.add("Honda Amaze");
        vehicleList.add("Hinda City");
        vehicleList.add("Hyundai Verna New");
    }

    public List<String> getVehicleList(){
        return vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> tempList = new ArrayList<>();

        //if copied like this a nd b will point to the same list object
        //tempList = this.getVehicleList();

        for(String s : this.getVehicleList()){
            tempList.add(s);
        }

        return new Vehicle(tempList);
    }

}

public class PrototypePatternExample {
    public static void main(String[] args) throws CloneNotSupportedException{
        Vehicle a = new Vehicle();
        a.insertData();

        Vehicle b = (Vehicle) a.clone();
        List<String> list = b.getVehicleList();

        list.add("bmw");

        System.out.println(a.getVehicleList());
        System.out.println(b.getVehicleList());
        System.out.println(list);

        b.getVehicleList().remove("Honda Amaze");

        System.out.println(b.getVehicleList());
        System.out.println(list);
        System.out.println(a.getVehicleList());

    }
}
