import java.util.Arrays;
public class OTPGenerator {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otpList = new int[10];
        for (int i = 0; i < 10; i++) {
            otpList[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otpList) {
            System.out.println(otp);
        }
        boolean unique = areOTPsUnique(otpList);
        System.out.println("All OTPs are unique :" + unique);
    }
}