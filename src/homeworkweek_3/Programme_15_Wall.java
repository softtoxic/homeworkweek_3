package homeworkweek_3;

public class Programme_15_Wall {
    public double width;
    public double height;
    public static void main(String[] args) {
        Programme_15_Wall wall = new Programme_15_Wall(5.0, 4.0);
        System.out.println("Width: " + wall.getWidth());
        wall.setHeight(-1.5);
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());
    }
    public Programme_15_Wall(){

    }
    public Programme_15_Wall(double width, double height){
        if (width < 0){
            this.width= 0;
        }else {
            this.width = width;
        }
        if (height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
float area = (float) (width * height);
        System.out.println("Area is : " + area);
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;

    }
}

