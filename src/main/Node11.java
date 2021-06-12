package main;

import java.util.Arrays;
import java.util.List;

public class Node11 {
    //    static class Node {
//        int id;
//        int parentId;
//        String name;
//
//        public Node(int id, int parentId, String name) 				{
//            this.id = id;
//            this.parentId = parentId;
//            this.name = name;
//        }
//    }
    static List<Node0> nodeList0 = Arrays.asList(
            new Node0(1, "AA"),//0
            new Node0(2, "BB"),
            new Node0(3, "CC"),
            new Node0(4, "DD"),
            new Node0(5, "EE"),
            new Node0(6, "FF"),
            new Node0(7, "GG"),
            new Node0(8, "HH"),
            new Node0(9, "II"),
            new Node0(10, "JJ"),
            new Node0(11, "KK"),
            new Node0(12, "LL"),
            new Node0(13, "MM"),
            new Node0(14, "NN"),
            new Node0(15, "OO")
    );

    static class Node0 {
        int id;
        String name;
        int[] childs;
        int size;

        public Node0(int id, String name) {
            this.id = id;
            this.name = name;
            childs = new int[10];
            size = 0;
        }

        public void setChilds(int child) {
            this.childs[size] = child;
            this.size++;
        }
    }




    public static void travel(int id,int count) {
        Node0 root = nodeList0.get(id - 1);
        for(int i=0;i<count;i++)System.out.print("  ");
        System.out.println(root.name);
        for (int i = 0; i < root.size; i++) {
            travel(root.childs[i],count+1);
        }
    }

    public static void main(String[] args) {
//        List<Node> nodeList = Arrays.asList(
//                new Node(1, 0, "AA"),
//                new Node(2, 1, "BB"),
//                new Node(3, 1, "CC"),
//                new Node(4, 3, "DD"),
//                new Node(5, 3, "EE"),
//                new Node(6, 2, "FF"),
//                new Node(7, 2, "GG"),
//                new Node(8, 4, "HH"),
//                new Node(9, 5, "II"),
//                new Node(10, 0, "JJ"),
//                new Node(11, 10, "KK"),
//                new Node(12, 10, "LL"),
//                new Node(13, 12, "MM"),
//                new Node(14, 13, "NN"),
//                new Node(15, 14, "OO")
//        );
//        print(nodeList);

        nodeList0.get(0).setChilds(2);
        nodeList0.get(0).setChilds(3);
        nodeList0.get(2).setChilds(4);
        nodeList0.get(2).setChilds(5);
        nodeList0.get(1).setChilds(6);
        nodeList0.get(1).setChilds(7);
        nodeList0.get(3).setChilds(8);
        nodeList0.get(4).setChilds(9);
        nodeList0.get(9).setChilds(11);
        nodeList0.get(9).setChilds(12);
        nodeList0.get(11).setChilds(13);
        nodeList0.get(12).setChilds(14);
        nodeList0.get(13).setChilds(15);

        travel(1,0);
        travel(10,0);
    }

//    public static void print(List<Node> nodeList) {
//        //todo
//
//    }
}
