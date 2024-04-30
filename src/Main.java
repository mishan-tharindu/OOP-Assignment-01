import com.shapes.Circle;
import com.shapes.Rectangle;
import com.shapes.Square;
import com.shapes.Triangle;
import com.whiteboard.Whiteboard;

public class Main {


    public static void main(String[] args) {

        Whiteboard whiteboard = new Whiteboard();

//        whiteboard.createPolygons(new Circle(4));
        whiteboard.createPolygons(new Circle(4, 2));

//        whiteboard.createPolygons(new Square(4));
        whiteboard.createPolygons(new Square(4,2));




        System.out.println("Shape All Area ::: "+whiteboard.getAllShapesArea());;

        System.out.println("Shape All Area with Boder :: "+whiteboard.getAllPolygonsAreawithBorder());

        System.out.println("All Shape Border Area :: "+whiteboard.getBorderArea());





    }

}
