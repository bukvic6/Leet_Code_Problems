public class insertPosition {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 6;
        int lenght = nums.length-1;
        if(target == 0 || target < 0){
            System.out.println("0");
            return;
        }
        while(nums[lenght]>=target){
            if (nums[lenght] == target) {
                break;
            }
            lenght--;
        }

        System.out.println(lenght);
    }
}
