public class Rectangle {

    int length;
    int breadth;
    public Rectangle(int length , int breadth)//parametrise
    {
        super();
        this.length = length;
        this.breadth = breadth;
    }
    public void area()
    {
        int a = length*breadth;
        System.out.println("Area"+" "+a);
    }
    
}
