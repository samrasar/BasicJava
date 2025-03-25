package StringRelated;

public class StringOperation {
    public static void main(String[] args) {
        String nums = "011001001";
        String replaced = nums.replace('0', 'x') // Temporarily replace '0' with 'x'
                .replace('1', '0')  // Replace '1' with '0'
                .replace('x', '1'); // Replace 'x' with '1'
        System.out.println(nums);
        System.out.println(replaced);
    }
}
