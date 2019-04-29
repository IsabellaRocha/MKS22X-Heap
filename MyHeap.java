public class MyHeap {
  private static void pushDown(int[] data, int size, int idx) {
    while (data[idx] > data[2 * idx + 1]) {
      swap(data, idx, 2 * idx + 1);
      idx++;
    }
    while (data[idx] > data[2 * idx + 2]) {
      swap(data, idx, 2 * idx + 2);
      idx++;
    }
  }
  private static void pushUp(int[] data, int idx) {

  }
  public static void heapify(int[] data) {
    for(int idx = 0; idx < data.length; idx++) {
      pushDown(data, data.length, idx);
    }
  }
  public static void heapsort(int[] data) {

  }
  private static void swap(int[] data, int x, int y) {
    int temp = data[x];
    data[x] = data[y];
    data[y] = temp;
  }
}
