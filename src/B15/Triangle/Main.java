package B15.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle a;

        {
            try {
                a = new Triangle (2,3,4);
            } catch (IllegalTriangleException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

