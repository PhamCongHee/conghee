package Object;

import java.util.Random;

public class test {
    public static double identity_pi(long n) {
        long num_point_circle = 0;
        long num_point_total = 0;

        Random rd = new Random();
        for (int i = 0; i <=n; i++) {
            double x = rd.nextDouble();
            double y = rd.nextDouble();
            double distance = x * x + y * y;
            if (distance < 1) {
                num_point_circle ++;
            }
            num_point_total ++;
        }

        return (double) 4 * num_point_circle / num_point_total;
    }
    public static int findDuplicate(int[] nums) {
        int tortoies = nums[0];
        int hare = nums[0];
        while (true) {
            tortoies = nums[tortoies];
            hare = nums[nums[hare]];
            if (tortoies == hare) {
                break;
            }
        }

        int prt1 = nums[0];
        int prt2 = tortoies;
        while (prt1 != prt2) {
            prt1 = nums[prt1];
            prt2 = nums[prt2];
        }

        return prt1;
    }
    public static void main(String[] args) {
        System.out.println(identity_pi(100000000));
        System.out.println(findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }
}
