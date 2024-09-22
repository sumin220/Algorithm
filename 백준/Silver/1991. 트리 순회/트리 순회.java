import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        char left, right;

        Node(char left, char right) {
            this.left = left;
            this.right = right;
        }
    }

    static Map<Character, Node> tree = new HashMap<>();

    public static void preorder(char node) {
        if (node == '.') return;  // 자식 노드가 없는 경우
        System.out.print(node);    // 루트
        preorder(tree.get(node).left);  // 왼쪽 자식
        preorder(tree.get(node).right); // 오른쪽 자식
    }

    public static void inorder(char node) {
        if (node == '.') return;
        inorder(tree.get(node).left);   // 왼쪽 자식
        System.out.print(node);         // 루트
        inorder(tree.get(node).right);  // 오른쪽 자식
    }

    public static void postorder(char node) {
        if (node == '.') return;
        postorder(tree.get(node).left);   // 왼쪽 자식
        postorder(tree.get(node).right);  // 오른쪽 자식
        System.out.print(node);           // 루트
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // 노드의 개수

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            tree.put(root, new Node(left, right));
        }

        preorder('A');
        System.out.println();

        inorder('A');
        System.out.println();

        postorder('A');
        System.out.println();
    }
}