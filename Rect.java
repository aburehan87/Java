public class Rect {
    int length;
    int breadth;

    Rect() {
        System.out.println("This is a default Rect Const");
    }

    Rect(int len, int bre) {
        this.length = len;
        this.breadth = bre;
    }

    void display() {
        System.out.println("The length is: " + length);
        System.out.println("The breadth is: " + breadth);
        System.out.println("The perimeter is: " + 2 * length * breadth);
        System.out.println("The area is: " + length * breadth);
    }

    public static void main(String args[]) {
        Rect r1 = new Rect();
        Rect r2 = new Rect(10, 20);
        r1.display();
        r2.display();

    }

}