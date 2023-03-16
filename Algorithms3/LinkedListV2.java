package Algorithms3;

public class LinkedListV2<T> {

    public NodeV2 head;
    public NodeV2 tail;
    public int count;

    public class NodeV2 {
        public T value;
        public NodeV2 next;
        public NodeV2 prev;
    }

    public NodeV2 addFirst(T value) {
        NodeV2 node = new NodeV2();
        node.value = value;
        if (head == null)
            tail = node;
        else {
            node.next = head;
            head.prev = node;
        }
        head = node;
        count++;
        return node;
    }

    public void RemoveFirst() {
        if (head != null && head.next != null) {
            NodeV2 node = head;
            node.next.prev = null;
            head = head.next;
            count--;
        } else {
            head = null;
            tail = null;
            count = 0;
        }
    }

    public NodeV2 reverse(NodeV2 head) {
        NodeV2 prev = null;
        NodeV2 curr = head;

        while (curr != null) {
            swap(curr);
            prev = curr;
            curr = curr.prev;
        }
        if (prev != null) {
            head = prev;
        }
        return head;
    }

    public void swap(NodeV2 node) {
        NodeV2 prev = node.prev;
        node.prev = node.next;
        node.next = prev;
    }
}
