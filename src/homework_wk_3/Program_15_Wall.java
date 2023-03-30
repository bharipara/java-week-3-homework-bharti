package homework_wk_3;

public class Program_15_Wall {

    //Instance variables

    double width;
    double height;

    //Default constructor

    public Program_15_Wall(){

    }
    //parameterized constructor

    public Program_15_Wall(double width,double height){

        if (width<0){
            this.width =0;
        }else {
            this.width = width;
        }
        if (height<0){
            this.height=0;
        }else {
            this.height=height;
        }
    }
    //get width Method
    public double getWidth(){
        return width;
    }
    //get height method
    public double getHeight(){
        return height;
    }
    //set width Method
    public void setWidth(double width){
        if (width<0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }
    //set height Method
    public void setHeight(double height){
        if (height<0){
            this.height =0;
        }else {
            this.height =height;
        }
    }
    //get Area Method
    public double getArea(){
        return (getHeight()*getWidth());
    }
    //main method
    public static void main(String[] args){
        Program_15_Wall wall = new Program_15_Wall(5,4);
        System.out.println("area ="+ wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width ="+ wall.getWidth());
        System.out.println("height ="+ wall.getArea());
    }
}
