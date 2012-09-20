package CarBusiness;


public class TestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("//check creation of default data");
		//check creation of default data  *******************************
		CarControl con = new CarControl();
		String key;
		con.load();
		System.out.println("number of Car elements " + con.getSize());
		System.out.println(con.getShortList().toString());
		System.out.println("//check that we can fetch a car by a correct key value");
		//check that we can fetch a car by a correct key value
		key = "4711Tekno";
		ComCar car = con.getCarByKey(key);
		System.out.println(car.toString());
		System.out.println("// check what happens if we use a non-existing key");
		// check what happens if we use a non-existing key
		key = "4712Tekno";
		car = con.getCarByKey(key);
		if (car==null){
			System.out.println("car not found");
		}
		else
			System.out.println(car.toString());
		System.out.println("//check the insertion of a new car");
		//check the insertion of a new car
		Car busCar = new Car(50055,"Victoria","VW","Kübelwagen","Closed",1942,43,298,"ng");
		car = new ComCar(busCar);
		con.insertCar(car);
		System.out.println("see new car in this list: \n" +  con.getFullList().toString());
		System.out.println("number of Car elements " + con.getSize());
		System.out.println("//check that we can fetch this new car");
		//check that we can fetch this new car
		key = "50055Victoria";
		car = con.getCarByKey(key);
		if (car==null){
			System.out.println("car not found");
		}
		else
			System.out.println(car.toString());

		
	}
		
	}


