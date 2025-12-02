package recursion.medium;

public class ExponentiationBySquaring {
    public static int method1(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return base * method1(base, (power - 1));
        }

    }

    public static int method2(int base, int power) {
        if (Math.signum(base) == -1.0 && Math.signum(power) == -1.0) {
            return 0;
        }
        Boolean even = power % 2 == 0;
        if (even) {
            power = (power / 2);
        } else {
            power = ((power - 1) / 2);
        }
        int result = method1(base, power);
        return result * result;
    }

    public static int method3(int base, int power) {
        if (Math.signum(base) == -1.0 && Math.signum(power) == -1.0) {
            return 0;
        }
        if (power == 0) {
            return 1;
        }
        Boolean even = power % 2 == 0;
        if (even) {
            power = (power / 2);
            return method3(base, power) * method3(base, power);
        } else {
            power = ((power - 1) / 2);
            return base * method3(base, power) * method3(base, power);
        }
    }

    public static void main(String[] args) {
        System.out.println("Exponentiation Output");
        System.out.println(method3(2, 78));
    }
}
