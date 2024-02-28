public class Box {
    private int length;
    private int breadth;
    private int height;

    public int getLen(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public int getHeight(){
        return height;
    }

    public void Volume() {
        int volume = length * breadth * height;
        System.out.println("Volume of the box: " + volume);
    }

    public static void main (String[] args){
        Box box = new Box();
        box.breadth = 12;
        box.height = 11;
        box.length = 15;

        System.out.println("Dimensions of the box are:");
        System.out.println(" ");

        System.out.println("Length of the box: " + box.getLen());
        System.out.println("Breadth of the box: " + box.getBreadth());
        System.out.println("Height of the box: " + box.getHeight());
        System.out.println(" ");

        box.Volume();

    }
}
