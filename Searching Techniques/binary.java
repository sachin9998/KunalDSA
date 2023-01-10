public class binary {

  public static int binarySearch(int arr[], int key) {

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] == key) {
        return mid;
      }

      if (arr[mid] > key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }

    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 4, 6, 8, 11, 15, 18, 23, 45, 76, 887, 1111, 3432 };

    int arr2[] = { 90, 75, 18, 12, 6, 4, 3, 1 };

    // System.out.println(binarySearch(arr, 8));
    System.out.println(binarySearch(arr2, 6));
  }
}
