package In28Minutes_Java_Lecture_Programs;

public class ClassObjectMethod {
    public static void main(String[] args) {
        class Planet{
            void revolve(){
                System.out.println("Revolving...");
            }
        }
        Planet earth = new Planet();
        Planet mars = new Planet();
        earth.revolve();
    }
}
