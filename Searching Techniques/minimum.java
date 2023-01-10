public class minimum {

  public static int minimum_element(int arr[]) {

    int min = Integer.MAX_VALUE;

    for (int i : arr) {
      if (i < min) {
        min = i;
      }
    }

    return min;
  }

  public static void main(String[] args) {
    int arr[] = { 18, 12, -7, 3, 14, 28 };
    System.out.println("Minimum element is " + minimum_element(arr));
  }
}
