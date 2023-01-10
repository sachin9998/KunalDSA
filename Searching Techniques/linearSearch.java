public class linearSearch {

  public static int linear_search(int arr[], int key) {

    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {

    int arr[] = { 18, 12, -7, 3, 9, 14, 77, 50 };
    int key = 14;

    System.out.println("Element found at " + linear_search(arr, key) + "index");

  }
}
