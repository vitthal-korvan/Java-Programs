package In28Minutes_Java_Coding_Exercise1;

//Coding Exercise:: Is Right Angled Triangle
//You have been given a class TriangleValidator with an incomplete method
// isRightAngled(int side1, int side2, int side3). This method should take three integer values
// that represent the lengths of the sides of a triangle. Your task is to complete the method
// it can accurately determine if the triangle with the given sides is a right-angled triangle.
// The method should return true if the triangle is right-angled and false otherwise.
//In a right-angled triangle, the square of the length of the hypotenuse (the side opposite the
// right angle) is equal to the sum of the squares of the lengths of the other two sides.
// This is known as the Pythagorean theorem.
//If any side has a non-positive length, it's not considered a valid triangle.
//
//Instructions::
//
//Start with the TriangleValidator class. Inside this class, you'll find the method
// isRightAngled(int side1, int side2, int side3).
//Your first task is to validate the lengths of the sides. If any side length is less than or equal
// to zero, return false.
//Next, apply the Pythagorean theorem to determine if the triangle is right-angled. Remember to check
// all combinations of sides.
//If the theorem holds true for any combination of sides, return true. This indicates that the triangle
// is right-angled.
//If the theorem doesn't hold true for any combination of sides, return false. This indicates that the
// triangle is not right-angled.
public class Udemy_Ex4_RightAngleTriangle {
    public static void main(String[] args) {
        isRightAngled(3,4,5);

    }
    static void isRightAngled(int side1, int side2, int side3) {
        // write your code
        if(side1 <= 0 || side2 <= 0 || side3 <= 0){
            System.out.println("false");
        }
        //if side a is right angle triangle or not
        if (side1 * side1 == side2 * side2 + side3 * side3) {
            System.out.println("true");
        }

        if (side2 * side2 == side1 * side1 + side3 * side3) {
            System.out.println("true");
        }

        if (side3 * side3 == side1 * side1 + side2 * side2) {
            System.out.println("true");
        }
        else
            System.out.println(false);
    }
}
