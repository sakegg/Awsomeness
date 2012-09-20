package CarBusiness;
import java.util.HashMap;

public class CarControl {
	CarList carData;
	public CarControl(){
		carData = new CarList();
	}
	/* this list will return a hashmap with the most basic information about the cars
	 * 
	 */
	public Integer load(){
		carData.restore();
		return carData.getNumberOfCars();
	}
	public Integer getSize(){
		return carData.getNumberOfCars();
	}
	/* returns a limited set of info as a hashmap
	 *  
	 */
	public HashMap <String,String> getShortList(){
		return carData.getBasicList();			
		}
	/* returns a Full set of info as a hashmap
	 *  
	 */
	public HashMap <String,Car> getFullList(){
		return carData.getTheFullMointy();			
	}
		
	/* getCarByKey will return a Car from the CarList. The key to find it is
	 * the concatenated String serialnumber + modelManufacturerName
	 * @@param  key the concatenated String serialnumber + modelManufacturerName
	 * @@return The Car if Found
	 */
	public ComCar getCarByKey(String key){
		Car car = null;
		car = carData.getCarByKey(key);
        ComCar comCar = null;
		if (!(car == null))
			return new ComCar(car);  //nice and easy when the basic work is done
		return comCar;
	}
	/*this method will receive a Car Communication object and from this create a Car object that
	 * will be added to the Car base
	 * note that Strings must be converted to Integers in the cases where integer attributes
	 * are defined in the Car Class
	 */
	public void insertCar(ComCar comCar){
		Car newCar  = new Car();
		newCar.setSerialNumber(Integer.parseInt(comCar.getSerialNumber()));
		newCar.setYear(Integer.parseInt(comCar.getYear()));
		newCar.setScale(Integer.parseInt(comCar.getScale()));
		newCar.setPrice(Integer.parseInt(comCar.getPrice()));
		newCar.setCarmake(comCar.getCarMake());		
		newCar.setCarModel(comCar.getCarModel());
		newCar.setType(comCar.getType());
		newCar.setModelManufacturer(comCar.getModelManufacturer());
		carData.insertCar(newCar);
		} 
}
