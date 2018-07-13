public class TemperatureConverter {
	
	public static double convertTemp(double temperature, char convertTo){
		if(convertTo=='F'){
			temperature = temperature*1.8+32;
		}
		else if(convertTo=='C'){
			temperature = (temperature-32)/1.8;
		}
		else{
			System.out.println("Ошибка");
		}
		return temperature;
	}
	
	public static void main(String[] args) {
		
		double temperature = convertTemp(0 ,'F');
		System.out.println(temperature);
	}
}
	

