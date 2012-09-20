package CarBusiness;
import java.util.HashMap;
import java.util.Set;
import java.util.Date;

public class CarList {
	HashMap <String, Car> map;
	public CarList(){
	map = new HashMap <String, Car>();
		
	}
	public void insertCar(Car car){
		map.put(car.getSerialNumber().toString()+ car.getModelManufacturer(),car);
	}

	public Car getCarByKey(String number){
		if (map.containsKey(number)){
			return map.get(number);
			}
		else return null;
	}
	public Integer getNumberOfCars(){
		return map.size();
	}
	/**
	 * 
	 * @return  hashmap with a key value which is the combined key used to fetch
	 * items from the map object and in connection with this key a value string 
	 * containing basic information about the car. This list could be used to build a web page
	 * from which to select a car about which the customer wants full information  
	 */
	
	public HashMap <String, String > getBasicList(){
		HashMap <String, String> resultList = new HashMap <String,String>();
		Set <String> keys = map.keySet();
		for (String key : keys){
			Car dyt = map.get(key);
			String carString = dyt.getCarmake()+" " + dyt.getType()+ " " + dyt.getYear();
			resultList.put(key,carString);
			}	
		return resultList.isEmpty()? null: resultList;

		}
	
	public void showAllCars(){
		Set <String> keys = map.keySet();
		for (String key : keys){
			Car person = map.get(key);
			System.out.println(person.toString());
			}						
	}
	public void showBasicList(){
		HashMap <String, String> basic = this.getBasicList(); 
		Set <String> keys = basic.keySet();
		for (String key : keys){
			System.out.println( basic.get(key));
			}						
	}
	public HashMap<String,Car> getTheFullMointy(){
		return map;
	}
	/* in the test phase it's used to create test items
	 * remark the way we construct the key value 
	 */
	public void restore(){
		Car t = new Car(4711,"Tekno","VW","Oldbeetle","Sedan",1958,43,600,"ng");
        insertCar(t);
		t = new Car(9562,"Tekno","VW","Type2","Transporter",1962,43,3500,"ng");
        insertCar(t);
		t = new Car(4711,"Dinkey","VW","Oldbeetle","Sedan",1951,43,170,"pp");
        insertCar(t);
		t = new Car(50050,"Minichamps","VW","Schwimmwagen","Sedan",1943,43,1100,"ng");
        insertCar(t);
	}
}


