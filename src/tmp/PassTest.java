public class PassTest {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        Ball ball = new Ball(10);
        System.out.println(ball.size);
        setSize(ball, 100);
        System.out.println(ball.size);
        setBall(ball);
        System.out.println(ball.size);
    }

    static class Ball{
        public int size = 1;
        Ball(int s){
            size = s;
        }
    }
    // Object reference are passed by value
    static void setSize(Ball b, int s){
        b.size = s;
    }
    // java is pass by value
    static void setBall(Ball b){
        Ball bb = new Ball(7);
        b = bb;
    }
}
