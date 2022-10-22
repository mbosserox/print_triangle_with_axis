import javax.xml.transform.stream.StreamSource;

public class Main {
    /*[19:04] Ronald Hernandez Cisneros
    Write a program that given a 2D point in Euclidean space and a scalar integer value representing the height value,
    will render a triangle to the command line output.

Please notice that when plotting the triangle you must obey the following:
-- A point inside the triangle should be represented by the 'H' (uppercase h) character.
-- The only exception would be if a point is part of the triangle but lies in either the X or Y axis of the 2D space,
then it should be render with the '*' (asterisk / star).
-- Any other point in the 2D space (the quadrant where the triangle "lives") should be render with a space.
Here are some test cases:
-- Apex: (2,2) and height 3 - see screenshot "Test case #1.jpg"

-- Apex (0,2) and height 4 - see screenshot "Test case #2.jpg"

-- Apex (10,10) and height 5 - see screenshot "Test case #3.jpg"

-- Apex (-5,-3) and height 15 - see screenshot "Test case #4.jpg"

-- Apex (-5,5) and height 20 - see screenshot "Test case #5.jpg"

-- Apex (10,15) and height 30 - see screenshot "Test case #6.jpg"
*/
    public static void main(String[] args) {
        int xCoordenater = -5 ;
        int yCoordinater = -5 ;
        int height =20 ;
        //create testeable method
        printTriangle(xCoordenater, yCoordinater, height);
    }

    private static void printTriangle(int xCoordenater, int yCoordinater, int height) {
        int totalWidth= (height *2)-1;
        int nroOfHToprint =0;
        int asterixToReplaceInX = (height -1)- xCoordenater;
        for (int currentPosition = 0; currentPosition < height; currentPosition++) {
            nroOfHToprint = (currentPosition*2)+1 ;
            String  emptySpace = generateBlackSpaces(totalWidth, nroOfHToprint);
            String  linetoPrint  = generateLinetoPrint(nroOfHToprint, emptySpace);
            linetoPrint = replaceAsterixInXAxis(yCoordinater, totalWidth, currentPosition, linetoPrint);
            linetoPrint = replaceAsterixInYAxis(asterixToReplaceInX, linetoPrint);
            System.out.println(linetoPrint);
        }
    }

    private static String replaceAsterixInYAxis(int asterixToReplaceInX, String linetoPrint) {
        if(asterixToReplaceInX >=0){
            linetoPrint = linetoPrint.substring(0, asterixToReplaceInX)+ "*" + linetoPrint.substring(asterixToReplaceInX +1);
        }
        return linetoPrint;
    }

    private static String generateLinetoPrint(int nroOfHToprint, String emptySpace) {
        return emptySpace + "H".repeat(nroOfHToprint) + emptySpace;
    }

    private static String generateBlackSpaces(int totalWidth, int nroOfHToprint) {
        return " ".repeat((totalWidth - nroOfHToprint) / 2);
    }

    private static String replaceAsterixInXAxis(int yCoordinater, int totalWidth, int currentPosition, String linetoPrint) {
        if(yCoordinater == currentPosition){
            linetoPrint = "*".repeat(totalWidth);
        }
        return linetoPrint;
    }
}