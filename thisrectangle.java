class Rectangle{
    int lenght,width;
 Rectangle(){
    this(5,5);
 }   
 Rectangle(int l,int w){
    lenght=l;
    width=w;
 }
 void area(){
    System.out.println("area"+(lenght*width));
     }
}
public class thisrectangle{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.area();
    
    }
}