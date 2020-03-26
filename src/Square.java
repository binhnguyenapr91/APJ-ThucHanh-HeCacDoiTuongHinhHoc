public class Square extends Rectangle {

    Square(){
        super.setWidth(1);
        super.setLength(1);
    }

    Square(double side){
        super(side,side);
    }

    Square(String color,boolean filled, double side){
        super.setColor(color);
        super.setFilled(filled);
        super.setLength(side);
        super.setWidth(side);
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}