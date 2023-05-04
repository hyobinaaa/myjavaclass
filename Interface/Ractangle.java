package Interface;

public class Ractangle implements Comparable{
    public int width = 0;
    public int height = 0;

    @Override
    public String toString(){
        return "Rangtangle [width = " + width + ", height=" + height + "]";
    }
    
    public Ractangle (int w, int h){
        width = w;
        height = h;
        System.out.println(this);
    }

    public int getArea(){
        return width*height;
    }

    @Override
    public int ComparableTo(Object other){
        Ractangle otherRect = (Ractangle) other;
        if(this.getArea() < otherRect.getArea())
                return -1;
        else if(this.getArea() > otherRect.getArea())
                return 1;
        else
            return 0;
    }
}
