package code.ibs;

public class TypesTriangle {
    /**
     * You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.
         * A triangle is called equilateral if it has all sides of equal length.
         * A triangle is called isosceles if it has exactly two sides of equal length.
         * A triangle is called scalene if all its sides are of different lengths.
     * Return a string representing the type of triangle that can be formed or "none" if it cannot form a triangle.
     * @param nums
     * @return
     */
    static String triangleType(int[] nums) {
        int side1 = nums[0] + nums[1], side2 = nums[0] + nums[2], side3 = nums[1] + nums[2];
        if(nums[0] + nums[1] <= nums[2] || nums[2] + nums[1] <= nums[0] || nums[0] + nums[2] <=  nums[1])
            return "none";
        if(side1 == side2 && side1 == side3)
            return "equilateral";
        else if(side1 != side2 && side1 != side3 && side2 != side3)
            return "scalene";
        else
            return "isosceles";
    }

    public static void main(String[] args) {
        int[] sides = {8,4,2};
        System.out.println(triangleType(sides));
    }
}
