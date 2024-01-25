import java.awt.*;

public class HousePainter {
    private static void drawGrass(int x, int y) {
        // Draw the tree top
        Square trunk = new Square();
        trunk.changeSize(10);
        trunk.changeColor("green");
        trunk.moveVertical(y);
        trunk.moveHorizontal(x);
        trunk.makeVisible();
    }


    private static void drawRoad(int x, int y) {
        // Draw the tree top
        Square trunk = new Square();
        trunk.changeSize(10);
        trunk.changeColor("yellow");
        trunk.moveVertical(y);
        trunk.moveHorizontal(x);
        trunk.makeVisible();
    }


    private static void drawAppleTree(int x, int y) {
        // Draw the tree trunk
        Square trunk = new Square();
        trunk.changeSize(15);
        trunk.changeColor("blue");
        trunk.moveVertical(y-20);
        trunk.moveHorizontal(x-77);
        trunk.makeVisible();

        Square trunk2 = new Square();
        trunk2.changeSize(15);
        trunk2.changeColor("blue");
        trunk2.moveVertical(y-5);
        trunk2.moveHorizontal(x-77);
        trunk2.makeVisible();

        Square trunk3 = new Square();
        trunk3.changeSize(15);
        trunk3.changeColor("blue");
        trunk3.moveVertical(y+10);
        trunk3.moveHorizontal(x-77);
        trunk3.makeVisible();

        // Draw the tree leaves (circle)
        Circle leaves = new Circle();
        leaves.changeSize(60);
        leaves.changeColor("green");
        leaves.moveVertical(y -50);
        leaves.moveHorizontal(x -19);
        leaves.makeVisible();

        // Draw three apples (red circles)
        Circle apple1 = new Circle();
        apple1.changeSize(10);
        apple1.changeColor("red");
        apple1.moveVertical(y - 30);
        apple1.moveHorizontal(x + 20);
        apple1.makeVisible();

        Circle apple2 = new Circle();
        apple2.changeSize(10);
        apple2.changeColor("red");
        apple2.moveVertical(y - 52);
        apple2.moveHorizontal(x + 5);
        apple2.makeVisible();

        Circle apple3 = new Circle();
        apple3.changeSize(10);
        apple3.changeColor("red");
        apple3.moveVertical(y - 30);
        apple3.moveHorizontal(x - 12);
        apple3.makeVisible();
    }


    public static void main(String[] args) {
        // Create a canvas
        Canvas canvas = Canvas.getCanvas();

        // Draw the roof (triangle)
        Triangle roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(80, 190);
        roof.makeVisible();
        roof.moveHorizontal(190);
        roof.moveUp();

        // Draw the chimney
        Square chimney = new Square();
        chimney.changeSize(20);
        chimney.changeColor("gray");
        chimney.moveHorizontal(90);
        chimney.moveVertical(50);
        chimney.makeVisible();


        // Draw the walls (rectangle)
        Square walls = new Square();
        walls.changeSize(150);
        walls.changeColor("blue");
        walls.makeVisible();
        walls.moveHorizontal(20);
        walls.moveDown();walls.moveDown();walls.moveDown();walls.moveDown();


        // Draw the door (rectangle)
        Square door = new Square();
        //door.changeColor("");
        door.changeSize(40);
        door.makeVisible();
        door.moveHorizontal(80);
        door.moveVertical(160);
        door.moveDown();

        // Draw the windows (squares)
        Square window1 = new Square();
        window1.changeSize(30);
        window1.changeColor("yellow");
        window1.makeVisible();
        window1.moveHorizontal(50);
        window1.moveVertical(100);
        window1.moveDown();

        Square window2 = new Square();
        window2.changeSize(30);
        window2.changeColor("yellow");
        window2.makeVisible();
        window2.moveHorizontal(120);
        window2.moveVertical(100);
        window2.moveDown();

        // Draw the sun (circle)
        Circle sun = new Circle();
        sun.changeSize(60);
        sun.changeColor("red");
        sun.makeVisible();
        sun.moveHorizontal(20);
        sun.moveUp();

        Person person = new Person();
        person.makeVisible();
        person.moveRight(); // Adjust the position as needed
        int y=240;
        for(int i=0; i<200; i+=20){
            drawGrass(i, y);

        }
        y= 290;
        for(int i=0,j=0; i<65; i+=15){
            j+=10;
            drawRoad(i,y-j);

        }


        // Draw two apple trees
        drawAppleTree(-50, 220);
        drawAppleTree(30, 220);


        // Draw two apple trees
        drawAppleTree(420, 220);
        drawAppleTree(350, 220);
        // Add some delay to see the drawing
        canvas.wait(1000);
    }
}
