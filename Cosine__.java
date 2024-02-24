public class Cosine {
    public static void main(String[] args) {
        double angleInDegrees = 45.0;
        double angleInRadians = Math.toRadians(angleInDegrees);
        double cosineValue = Math.cos(angleInRadians);
        System.out.println("Cosine of " + angleInDegrees + " degrees: " + cosineValue);
    }
}

