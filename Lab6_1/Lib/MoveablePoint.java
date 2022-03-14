package Lib;

public class MoveablePoint extends Point{
    protected double xSpeed;
    protected double ySpeed;

    public MoveablePoint(){
        super();
        this.xSpeed = 10;
        this.ySpeed = 10 ;
    }
    public MoveablePoint(double x , double y , double xSpeed , double ySpeed){
        super(x,y);
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }

    public void forward(){
        x += xSpeed ;
        y += ySpeed ;
    } 
    public void backward(){
        x -= xSpeed ;
        y -= ySpeed ;
    }

    public double[] getXY(){
        double tmp[] = {this.xSpeed,this.ySpeed};
        return tmp ;
    }
    public void setXY(double xSpeed , double ySpeed){
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }
   
    public String toString(){
        return "( "+x+" , "+y+" ),SPD( "+this.xSpeed+" , "+this.ySpeed+" )" ;
    }

    public double getX(){
        return xSpeed;
    }
    public void setX(double xSpeed){
        this.xSpeed = xSpeed;
    }

    public double getY(){   
        return ySpeed;
    }
    public void setY(double ySpeed){
    this.ySpeed = ySpeed;
    }
    
    
}
