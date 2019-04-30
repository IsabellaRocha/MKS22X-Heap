public class MyHeap {
  private static void pushDown(int[] data, int size, int idx) {
    while (idx * 2 < size - 1) {
      int max = 0;
      boolean check = false;
      int lChild = idx * 2 + 1;
      int rChild = idx * 2 + 2;
      if (rChild >= size || data[lChild] >= data[rChild]) {
        if (data[idx] < data[lChild]) {
          max = lChild;
          check = true;
        }
      }
      else if (rChild < size || data[lChild] < data[rChild]) {
        if (data[idx] < data[rChild]) {
          max = rChild;
          check = true;
        }
      }
      if (check) {
        swap(data, idx, max);
        idx = max;
      }
      else idx++;
    }
  }
  private static void pushUp(int[] data, int idx) {

  }
  public static void heapify(int[] data) {
    for(int idx = data.length - 1; idx >= 0; idx--) {
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
  public static void main(String[] args) {
    int[] data = {1, 6, 3, 6, 324, -5, 18, 30, 9, -4};
    heapify(data);
    HeapPrinter.print(data);
  }
}
