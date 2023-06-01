import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double length;
        double width;
        double height;
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Enter the following dimensions of a cube: ");

        System.out.println("Length: ");
        length=keyboard.nextDouble();

        System.out.println("Width: ");
        width=keyboard.nextDouble();

        System.out.println("Height: ");
        height=keyboard.nextDouble();

        Cube myCube=new Cube(length, width, height);

        System.out.println("Here are the cube's properties: ");
        System.out.println("Length: "+myCube.getLength());
        System.out.println("Width: "+myCube.getWidth());
        System.out.println("Height: "+myCube.getHeight());
        System.out.println("Area: "+myCube.getArea());
        System.out.println("Surface Area: "+myCube.getSurfaceArea());
        System.out.println("Volume: "+myCube.getVolume());

    }
}
