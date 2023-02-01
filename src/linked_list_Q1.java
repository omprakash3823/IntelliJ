import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Scanner;

public class linked_list_Q1 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

//        llist.Head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
        SLLnode r = new SLLnode();
        r.value = 8;
        SLLnode h = r;
        Scanner scn = new Scanner(System.in);
        for (int i = 2; i <= 5; i++) {

            r.next = new SLLnode();
            r = r.next;
            System.out.println("Enter value of node " + i);
            r.value = scn.nextInt();
        }

        SLLnode root = h;
        while (root != null) {
            System.out.println(root.value);
            root = root.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode root = head;


        while (root != null) {
            System.out.println(root.val);
            root = root.next;
        }

        SLLnode r = new SLLnode();
        r.value = 8;
        SLLnode h = r;
        for (int i = 0; i < 2; i++) {

            r.next = new SLLnode();
            r = r.next;
            r.value = 4;
        }
//        root = new ListNode(1,null);
        return root;
    }

}

class SLLnode {
    int value;
    SLLnode next;

    SLLnode() {
        value = 9999999;
        next = null;
    }
}