package Tree;

public class BSTSuccessor {

    static class Node {
        int key;
        Node left, right, parent;

        Node(int key) {
            this.key = key;
        }
    }

    private Node root;

    private Node minimum(Node x) {
        while (x.left != null) {
            x = x.left;
        }
        return x;
    }

    private Node maximum(Node x) {
        while (x.right != null) {
            x = x.right;
        }
        return x;
    }

    // 노드 x의 successor : key[x]보다 크면서 가장 작은 키를 가진 노드
    private Node successor(Node x) {

        // 오른쪽 부트리가 있으면, 그 부트리의 최솟값
        if (x.right != null) {
            return minimum(x.right);
        }

        // 오른쪽 부트리가 없으면, 부모를 따라 올라가면서 처음으로 왼쪽 자식이 되는 노드의 부모를 찾음
        Node y = x.parent;
        while (y != null && x == y.right) {
            x = y;
            y = y.parent;
        }

        // Case 3: y가 null이면 x가 최대값이므로 successor 없음
        return y;

    }

    // 노드 x의 predecessor: key[x]보다 작으면서 가장 큰 키를 가진 노드
    private Node predecessor(Node x) {
        // Case 1: 왼쪽 부트리가 있으면, 그 부트리의 최댓값
        if (x.left != null) {
            return maximum(x.left);
        }
        // Case 2: 왼쪽 부트리가 없으면,
        // 부모를 따라 올라가면서 "처음으로 오른쪽 자식이 되는 노드"의 부모를 찾음
        Node y = x.parent;
        while (y != null && x == y.left) {
            x = y;
            y = y.parent;
        }

        // Case 3: y가 null이면 x가 최솟값이므로 predecessor 없음
        return y;

    }

    private Node search(Node x, int key) {
        while (x != null && x.key != key) {
            if (x.key > key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return x;
    }

    public Integer successor(int key) {
        Node x = search(root, key);
        if (x == null) {
            return null;
        }
        Node s = successor(x);

        if (s == null) {
            return null;
        } else {
            return s.key;
        }

    }

    public Integer predecessor(int key) {
        Node x = search(root, key);
        if (x == null) {
            return null;
        }
        Node p = predecessor(x);
        if (p == null) {
            return null;
        } else {
            return p.key;
        }
    }

    public void insert(int key) {
        Node z = new Node(key);
        Node y = null;
        Node x = root;

        while (x != null) {
            y = x;
            if (key < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        z.parent = y;
        if (y == null) {
            root = z;
        } else if (z.key < y.key) {
            y.left = z;
        } else {
            y.right = z;
        }
    }

    public static void main(String[] args) {
        BSTSuccessor tree = new BSTSuccessor();
        int[] keys = { 15, 6, 18, 3, 7, 17, 20, 13, 9 };

        for (int key : keys) {
            tree.insert(key);
        }

        System.out.println(tree.successor(6));
        System.out.println(tree.successor(13));
        System.out.println(tree.successor(20));

        System.out.println(tree.predecessor(6));
        System.out.println(tree.predecessor(15));
        System.out.println(tree.predecessor(3));
    }
}
