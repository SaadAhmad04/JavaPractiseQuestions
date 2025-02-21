class Rectangle{
    int x,y,width,height;
    Rectangle(int x, int y, int width,int height){
        this.height=height;
        this.width=width;
        this.x=x;
        this.y=y; 
    }
    public String toString(){
        return "Rectangle[ height=" +height+" width= "+width+" x= "+ x+" y= "+y+" ]";
    }
    public Rectangle intersection(Rectangle r1){
        int newX =Math.max(this.x, r1.x);
        int newY =Math.max(this.y, r1.y);
        int newWidth=Math.min(this.x+this.width, r1.x+ r1.width)-newX;
        int newHeight=Math.min(this.y+this.height, r1.y+ r1.height)-newY;
        if(newHeight<=0 || newWidth<=0){
            return new Rectangle(0,0,0,0);
        }
        return new Rectangle(newX, newY, newWidth, newHeight);
    }
}
public class RectangleIntersection {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(5,2,4,8);
        Rectangle r2= new Rectangle(-2,-6,7,1);
        System.out.println("Rectangle r1= "+r1);
        System.out.println("Rectangle r2= "+r2);
        Rectangle r3= r1.intersection(r2);
        if(r3.height==0 || r3.width==0){
            System.out.println("Do not overlap");
        }
        else{
            System.out.println("Intersection= "+ r3);
        }
    }
}
