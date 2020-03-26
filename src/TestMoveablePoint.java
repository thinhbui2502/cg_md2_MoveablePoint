public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1 = new MoveablePoint(1.1f, 2.6f, 15.6f, 14.9f);
        System.out.println("Starting Point: " + moveablePoint1);
        System.out.println("Endpoint: " + moveablePoint1.move());

    }
}
