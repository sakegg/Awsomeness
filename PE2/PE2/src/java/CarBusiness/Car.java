package CarBusiness;
import java.util.Date;

public class Car {
	// Attributes:
	Integer serialNumber; //model manufactures snr
	String modelManufacturer;
	String carMake;  //could be "Volkswagen"
	String carModel;  // could be  "Beetle"
	String type; //could be "cabriolet" or "waggon"
	Integer year; //year of car
	Date dateCreated;
    String creatorInitials; //initials of person who inserted this into CarData
	Integer scale; // if this value is 43 it means that scale is 1:43
	Integer price;  //prices are always integers we hate this 9.99 stuff

	public  Car( Integer serialNumber, String modelManufacturer,String carMake,
			String carModel,String type,Integer year,Integer scale){
	
	}
	public Car(Integer serialNumber, String modelManufacturer,String carMake,
			String carModel,String type,Integer year,Integer scale, Integer price, String creatorInitials){
		this.serialNumber= serialNumber;
		this.modelManufacturer = modelManufacturer;
		this.carMake = carMake;
		this.carModel = carModel;
		this.type = type;
		this.year = year;
		this.scale = scale;
		this.price = price;
		this.creatorInitials = creatorInitials;
	
	}


	public Car(){
		
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getModelManufacturer() {
		return modelManufacturer;
	}
	public void setModelManufacturer(String modelManufacturer) {
		this.modelManufacturer = modelManufacturer;
	}
	public String getCarmake() {
		return carMake;
	}
	public void setCarmake(String carMake) {
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
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getScale() {
		return scale;
	}
	public void setScale(Integer scale) {
		this.scale = scale;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", carMake=" + carMake
				+ ", modelManufacturer=" + modelManufacturer + ", price="
				+ price + ", scale=" + scale + ", serialNumber=" + serialNumber
				+ ", type=" + type + ", year=" + year + "]";
	}
	
}