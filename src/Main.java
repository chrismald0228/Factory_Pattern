class X{
    private int _x;

    public X(){
        _x = 5;
    }
    public int getX(){
        return _x;
    }
}
class Y{
    private int _y;

    public Y(){
        _y = 6;
    }
    public int getY(){
        return _y;
    }
}

interface Factory{
    Object createObj();
}
class ObjXFactory implements Factory{
    public Object createObj(){
        return new X();
    }
}
class ObjYFactory implements Factory{
    public Object createObj(){
        return new Y();
    }
}

public class Main {
    public static void main(String[] args) {
        Factory fac;
        fac = new ObjXFactory();
        X myX = (X) fac.createObj();
        System.out.println(myX.getX());
    }
}