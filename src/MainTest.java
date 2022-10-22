import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public  void testValidTriangle(){
        int  xCoordenater= -5 ;
        int yCoordinater = -5 ;
        int height =20 ;
        Main.printTriangle(xCoordenater,yCoordinater,height);
    }
}