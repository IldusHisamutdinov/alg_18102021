package lesson6;

import java.util.NoSuchElementException;

public class MyTreeMap<K extends Comparable<K>, V> {
    private Node root;
    int balanced = 0;
    int unbalanced = 0;

    private class Node {
        K key;
        V value;
        Node left;
        Node right;
        int size;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.size = 1;
        }
    }

    public Node deleteAll() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return delete(root);
    }

    private Node delete(Node node) {
        node.left = null;
        node.right = null;
        root = null;
        return node;
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.size;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private void checkKeyNotNull(K key) {
        if (key == null) {
            throw new IllegalArgumentException("key null");
        }
    }

    public boolean contains(K key) {
        return get(key) != null;
    }

    public V get(K key) {
        checkKeyNotNull(key);
        return get(root, key);
    }

    private V get(Node node, K key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node.value;
        } else if (cmp < 0) {
            return get(node.left, key);
        } else {
            return get(node.right, key);
        }
    }

    public void put(K key, V value) {
        checkKeyNotNull(key);
        if (value == null) {
            // delete(key)
            return;
        }
        root = put(root, key, value);
    }

    private Node put(Node node, K key, V value) {
        if (node == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            node.value = value;
        } else if (cmp < 0) {
            node.left = put(node.left, key, value);
        } else {
            node.right = put(node.right, key, value);
        }
        node.size = 1 + size(node.left) + size(node.right);
        return node;
    }

    public K minKey() {
        return min(root).key;
    }

    private Node min(Node node) {
        if (node.left == null) {
            return node;
        }
        return min(node.left);
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        deleteMin(root);
    }

    private Node deleteMin(Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        node.size = 1 + size(node.left) + size(node.right);
        return node;
    }

    public void delete(K key) {
        checkKeyNotNull(key);
        root = delete(root, key);
    }

    private Node delete(Node node, K key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = delete(node.left, key);
        } else if (cmp > 0) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node temp = node;
            node = min(node.right);
            node.right = deleteMin(temp.right);
            node.left = temp.left;
        }
        node.size = 1 + size(node.left) + size(node.right);
        return node;
    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }
        return toString(node.left) + " " +
                node.key + " = " + node.value + " " +
                toString(node.right);
    }

// далее домашнее задание

    // глубина дерева
    private int heightTree(Node node) {
        int heightLeft = 0;
        int heightRight = 0;
        if (node.left != null)
            heightLeft = heightTree(node.left);
        if (node.right != null)
            heightRight = heightTree(node.right);
        if (heightLeft > heightRight) {
            return heightLeft + 1;
        } else {
            return heightRight + 1;
        }
    }

    public int heightTree() {
        if (this.isEmpty()) {
            return 0;
        } else {
            Node node = root;
            return heightTree(node);
        }
    }
    // сбалансированность дерева
    private int isBalanced(Node node) {
        if (node == null) {
            return -1;
        }
        int leftSubtree = isBalanced(node.left);
        int rightSubtree = isBalanced(node.right);
        int isBalanced = Math.abs(leftSubtree - rightSubtree);
        if (isBalanced <= 1) {
            return isBalanced;
        }
        return -10;
    }

    public int isBalanced() {
        if (this.isEmpty()) {
            return 0;
        } else {
            Node node = root;
            return isBalanced(node);
        }
    }
    // % несбалансированных деревьев
    public int unbalanced() {
        int unbalancedPercentage;
        if (isBalanced() == 1 || isBalanced() == 0) {
            balanced++;
        } else unbalanced++;
        unbalancedPercentage = unbalanced * 100 / (unbalanced + balanced);
        return unbalancedPercentage;
    }
}
