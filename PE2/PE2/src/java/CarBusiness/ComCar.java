package CarBusiness;


/*this class is used for communication between the controlClass and the bpresentation layer.
 * it will hold most of the attributes of a Car objekt, but not those reserved for internal use
 * in the Business layer - and it will create independence of future changes to the
 * Business layer
 * I've decided only to store Strings in these objects 
 */
public class ComCar {
	String serialNumber; //model manufactures snr
	String modelManufacturer;
	String carMake;  //could be "Volkswagen"
	String carModel;  // could be  "Beetle"
	String type; //could be "cabriolet" or "waggon"
	String year; //year of car
	String scale; // if this value is 43 it means that scale is 1:43
	String price;  //prices are always integers we hate this 9.99 stuff
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	//constructor to create ComCar object with individual settings
	public ComCar(Integer serialNumber, String modelManufacturer,String carmake,
			String carModel,String type,Integer year,Integer scale){
		// under construction
	}
	@Override
	public String toString() {
		return "ComCar [carMake=" + carMake + ", carModel=" + carModel
				+ ", modelManufacturer=" + modelManufacturer + ", price="
				+ price + ", scale=" + scale + ", serialNumber=" + serialNumber
				+ ", type=" + type + ", year=" + year + "]";
	}
	public ComCar(Car busCar){
		serialNumber = busCar.getSerialNumber().toString();
		modelManufacturer = busCar.getModelManufacturer();
		this.carMake = busCar.getCarmake();
		this.carModel = busCar.getCarModel();
		this.type = busCar.getType();
		this.year = busCar.getYear().toString();
		this.scale = busCar.getScale().toString();
		this.price =  busCar.getPrice().toString();
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getModelManufacturer() {
		return modelManufacturer;
	}
	public void setModelManufacturer(String modelManufacturer) {
		this.modelManufacturer = modelManufacturer;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
