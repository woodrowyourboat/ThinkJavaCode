import java.util.Objects;

public class Rectangle
{
    int height;
    int width;
    //int area = height * width;


    private Rectangle()
    {
        height = 1;
        width = 1;
    }

    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle)
    {
        height = rectangle.getHeight();
        width = rectangle.getWidth();
    }

    public int getArea()
    {
        this.height = height;
        this.width = width;

        return height * width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height &&
                width == rectangle.width;
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(height, width);
    }

    public String toString()
    {
        return "The rectangle has a height of " + height + " and a width of " + width + " and an area of " +
                "" + getArea() + ".";
    }


}
