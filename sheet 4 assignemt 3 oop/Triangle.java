public class Triangle extends GeometricObjects{
    double sidex;
    double sidey;
    double sidez;
    public Triangle(String color, boolean filled sidex, double sidey , double sidez)
    {
        super(color , filled);
        this.sidex=sidex;
        this.sidey=sidey;
        this.sidez=sidez;
    }
    public double getSidex(){
        return sidex;

    }

    public double getSidey() {
        return sidey;
    }

    public double getSidez() {
        return sidez;
    }

    public void setSidex(double sidex) {
        this.sidex = sidex;
    }

    public void setSidey(double sidey) {
        this.sidey = sidey;
    }

    public void setSidez(double sidez) {
        this.sidez = sidez;
    }

    public double getArea(){
        return(sidex*sidey)/2;
    }
    public double getPerimeter(){
        return sidex+sidey+sidez;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
