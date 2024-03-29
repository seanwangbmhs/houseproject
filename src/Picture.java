public class Picture
{
    private Square wall;
    private Square window;

    private Square door;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        door = new Square();
        window = new Square();
        roof = new Triangle();

        sun = new Circle();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(400);
            wall.moveVertical(160);
            wall.changeSize(150);
            wall.makeVisible();

            window.changeColor("green");
            window.moveHorizontal(410);
            window.moveVertical(180);
            window.changeSize(60);
            window.makeVisible();

            roof.changeSize(60, 180);
            roof.moveHorizontal(30);
            roof.moveVertical(50);
            roof.makeVisible();

            sun.changeColor("red");
            sun.moveHorizontal(50);
            sun.moveVertical(-40);
            sun.changeSize(40);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
