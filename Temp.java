package tempConver;
import java.util.Scanner;
public class Temp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		System.out.println("Enter a temperature and its unit (e.g., 100C or 212F): ");
		String temp = scnr.nextLine();
if( temp.charAt(temp.length()-1)== 'C') {
    double celsius =Double.parseDouble(temp.substring(0, temp.length()-1));
    double fahrenheit = (celsius * 9 / 5) + 32;
   double kelvin = celsius + 273.15;
    System.out.println( celsius + "°C is equal to " + fahrenheit + "°F and " + kelvin + "K");
	}
else if( temp.charAt(temp.length()-1)== 'F') {
    double fahrenheit =Double.parseDouble(temp.substring(0, temp.length()-1));
    double celsius = (fahrenheit - 32) * 5 / 9;
   double kelvin = celsius + 273.15;
    System.out.println( fahrenheit + "°F is equal to " + celsius + "°C and " + kelvin + "K");
	}
else if( temp.charAt(temp.length()-1)== 'K') {
    double kelvin =Double.parseDouble(temp.substring(0, temp.length()-1));
   double celsius = kelvin - 273.15;
   double fahrenheit = (celsius * 9 / 5) + 32;
    System.out.println( kelvin + "K is equal to " + celsius + "°C and " + fahrenheit + "°F");
	}else {
		 System.out.println("Invalid input. Please enter a temperature followed by its unit (C, F, or K).");
	}
	}
}
