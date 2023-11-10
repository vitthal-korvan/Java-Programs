package In28Minutes_Java_Coding_Exercise1;//Coding Exercise: Time Converter
//In Java, you have been given a partially implemented TimeConverter class that aims to convert time
// from hours or days to minutes. The TimeConverter class has two static methods that need to be completed:
//convertHoursToMinutes(int hours): This method should take an integer value representing hours and return
// the equivalent value in minutes.
//convertDaysToMinutes(int days): This method should take an integer value representing days and return
// the equivalent value in minutes.
//Instructions ::
//Task 1: Complete the convertHoursToMinutes method in the TimeConverter class so that it accurately converts
// hours into minutes. The method should return an integer value representing the total number of minutes.
//Task 2: Complete the convertDaysToMinutes method in the TimeConverter class so that it accurately converts
// days into minutes. The method should return an integer value representing the total number of minutes.
//NOTE: Return -1 for invalid cases (days and hours less than 0).

public class Udemy_Ex1_TimeConverter {
    public static void main(String[] args) {
        convertDaysToMinutes(20);
        convertHoursToMinutes(20);
    }
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        int minutes;
        minutes = hours *60;
        System.out.println(minutes);
        if(hours<0){
            return -1;
        }
        return minutes;
    }

    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        int minutes;
        minutes = days * 24 * 60;
        System.out.println(minutes);
        if(days<0){
            return -1;
        }

        return minutes;
    }
}
