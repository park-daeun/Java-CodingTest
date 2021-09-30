public class binary_search {
    public static void main(String[] args){
        int[] arr = {0,2,4,6,8,10,12,14,16,18};
        int target = 4;

        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }
}