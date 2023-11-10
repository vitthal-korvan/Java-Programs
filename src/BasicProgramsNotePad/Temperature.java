import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	float ct,ft,kt,it;
        char choice;

        System.out.println("******* TEMP CONVERSIONS *******");
        System.out.println("F: FAHRENHEIT TEMPRATURE");
        System.out.println("C: CELSIUS TEMPRATURE");
        System.out.println("K: KELVIN TEMPRATURE");
        System.out.println("Enter the initial temperature:");
        it = sc.nextFloat();
        System.out.println("Enter the Choice:");
        choice =sc.next().charAt(0);

        switch (choice){
            case 'F': ft=it;
                      ct=(ft-32.0f)+5/9;
                      kt=ct+273.03f;
                System.out.println("F: FAHRENHEIT TEMPRATURE is: "+ft);
                System.out.println("C: CELSIUS TEMPRATURE is: "+ct);
                System.out.println("K: KELVIN TEMPRATURE is: "+kt);
                      break;
            case 'C': ct=it;
                      ft=(ct*9)/5+32.0f;
                      kt=ct+273.03f;
                System.out.println("F: FAHRENHEIT TEMPRATURE is: "+ft);
                System.out.println("C: CELSIUS TEMPRATURE is: "+ct);
                System.out.println("K: KELVIN TEMPRATURE is: "+kt);
                      break;
            case 'K': kt=it;
                      ct=kt-273.03f;
                      ft=(ct*9)/5+32.0f;
                System.out.println("F: FAHRENHEIT TEMPRATURE is: "+ft);
                System.out.println("C: CELSIUS TEMPRATURE is: "+ct);
                System.out.println("K: KELVIN TEMPRATURE is: "+kt);
                      break;
            default:
                System.out.println("Invalid Option");

        }
    }
}