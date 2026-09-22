class Solution {
public int[] productExceptSelf(int[] nums) {
int temp[] = new int[nums.length];


    int product = 1;

    // Product of elements to the left
    for(int i = 0; i < nums.length; i++) {
        temp[i] = product;
        product = product * nums[i];
    }

    product = 1;

    // Product of elements to the right
    for(int i = nums.length - 1; i >= 0; i--) {
        temp[i] = temp[i] * product;
        product = product * nums[i];
    }

    return temp;
}


}
