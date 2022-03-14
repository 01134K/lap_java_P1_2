package Lib;

public class Point {
    protected double x ;
    protected double y ;
    
    public Point(){
        new Point(0,0);
    }

    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }
    
    public double Distance(Point des){
        double value = Math.sqrt((des.x-this.x)*(des.x-this.x)
                                +(des.y-this.y)*(des.y-this.y));
        return value ;
    }
    public double Distance(double x , double y){
        return Distance(new Point(x , y));
    }
    public double Distance(){
        return Distance(new Point(0 , 0));
    }

     public double[] getXY(){
        double tmp[] = {this.x,this.y};
        return tmp ;
    }
    public void setXY(double x , double y){
        this.x = x ;
        this.y = y ;
    }
   
    public String toString(){
        return "("+this.x+","+this.y+")" ;
    }

    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }

    public double getY(){   
        return y;
    }
    public void setY(double y){
    this.y = y;
    }
}

/*public double[] getXY(){
    double tmp[] = new double[2];
    tmp[0] = this.x ; 
    tmp[1] = this.y ;
    return tmp ;
}*/
