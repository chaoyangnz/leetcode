package _000_util;

public class ListUtil {
  public static ListNode buildLinkedList(int[] arr) {
    final int N = arr.length;
    if(N == 0) return null;

    ListNode root = new ListNode(arr[0]);
    ListNode tail = root;
    for(int i = 1; i < N; ++i) {
      if(tail == null) break;
      tail.next = new ListNode(arr[i]);
      tail = tail.next;
    }

    print(root);
    return root;
  }

  public static void print(ListNode head) {
    ListNode node = head;
    StringBuilder sb = new StringBuilder();
    while (node != null) {
      sb.append(node.val);
      if(node.next != null) {
        sb.append(" ➟ ");
      }
      node = node.next;
    }
    System.out.println(sb);
  }
}
