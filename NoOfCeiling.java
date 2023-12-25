import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] arr = {1,2,3,5,9,14,16,18};
    int target = 15;
    int ans = ceiling(arr, target);
    System.out.println(ans);
  }
  // Ceiling is smallest no >= target 
  // Floor is largest no. <= target 

  static int ceiling(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid; // Target found, return the index
      }
    }

    return start; // Return start for ceiling 
    // Return end for floor
  }
}
