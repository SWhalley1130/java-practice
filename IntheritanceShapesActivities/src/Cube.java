public class Cube extends Rectangle
{
    private double height;

    public Cube(double len, double wid, double hei)
    {
        super(len, wid);
        height=hei;
    }

    public double getHeight()
    {
        return height;
    }

    public double getSurfaceArea()
    {
        return getArea()*6;
    }

    public double getVolume()
    {
        return getArea()*height;
    }



}
