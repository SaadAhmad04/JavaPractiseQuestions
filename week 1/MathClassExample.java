public class MathClassExample {
    public static void main(String[] args) {
        // 1. Absolute value
        int absolute = Math.abs(-10);
        System.out.println("Math.abs(-10) = " + absolute);
        
        // 2. Maximum of two values
        double max = Math.max(10.5, 20.7);
        System.out.println("Math.max(10.5, 20.7) = " + max);
        
        // 3. Minimum of two values
        double min = Math.min(10.5, 20.7);
        System.out.println("Math.min(10.5, 20.7) = " + min);
        
        // 4. Square root
        double squareRoot = Math.sqrt(16);
        System.out.println("Math.sqrt(16) = " + squareRoot);
        
        // 5. Power of a number
        double power = Math.pow(2, 3);
        System.out.println("Math.pow(2, 3) = " + power);
        
        // 6. Random value between 0 (inclusive) and 1 (exclusive)
        double randomValue = Math.random();
        System.out.println("Math.random() = " + randomValue);
        
        // 7. Rounding to nearest integer
        double roundValue = Math.round(2.5); 
        System.out.println("Math.round(2.5) = " + roundValue);
        
        // 8. Sine of an angle (in radians)
        double sinValue = Math.sin(Math.toRadians(30));
        System.out.println("Math.sin(30 degrees) = " + sinValue);
        
        // 9. Logarithm (base e)
        double log = Math.log(10); // Natural logarithm (base e)
        System.out.println("Math.log(10) = " + log);
        
        // 10. Ceiling value (next integer greater than or equal to the argument)
        double ceilValue = Math.ceil(4.3);
        System.out.println("Math.ceil(4.3) = " + ceilValue);
    }
}
