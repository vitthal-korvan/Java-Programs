package ArrayPrograms;
/*
Write a JAVA program to accept the temperature of any 10 cities in degrees Fahrenheit.
Convert temperature to degree centigrade using the given formula:
Centigrade =(Fahrenheit - 32) X 5/9
Display the information in the given format. Also at the end print the total number of
cities where the temperature is more than 35 degree centigrade and the city name with
maximum temperature. City Name Fahrenheit Temperature Centigrade Temperature
--------- ---------------------- ----------------------
Number of cities more than 35-degree centigrade temperature:
Name of the city with maximum temperature:
 */
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cityNames = new String[10];
        double[] fahrenheitTemperatures = new double[10];
        double[] centigradeTemperatures = new double[10];

        int countCitiesAbove35 = 0;
        double maxTemperature = Double.MIN_VALUE;
        String cityWithMaxTemperature = "";

        System.out.println("Enter temperature data for 10 cities:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter city name: ");
            cityNames[i] = scanner.next();
            System.out.print("Enter Fahrenheit temperature: ");
            fahrenheitTemperatures[i] = scanner.nextDouble();

            centigradeTemperatures[i] = (fahrenheitTemperatures[i] - 32) * 5 / 9;

            System.out.println("City Name: " + cityNames[i] +
                    ", Fahrenheit Temperature: " + fahrenheitTemperatures[i] +
                    ", Centigrade Temperature: " + centigradeTemperatures[i]);

            if (centigradeTemperatures[i] > 35) {
                countCitiesAbove35++;
            }

            if (centigradeTemperatures[i] > maxTemperature) {
                maxTemperature = centigradeTemperatures[i];
                cityWithMaxTemperature = cityNames[i];
            }
        }

        System.out.println("\nNumber of cities with more than 35-degree centigrade temperature: " + countCitiesAbove35);
        System.out.println("City with maximum temperature: " + cityWithMaxTemperature);
    }
}

