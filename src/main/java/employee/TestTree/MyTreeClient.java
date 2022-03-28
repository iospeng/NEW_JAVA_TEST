package main.java.employee.TestTree;

import java.util.Arrays;

public class MyTreeClient {
    public void treeClient(){
        Node<String> root = new Node<String>("A",-1);
        MyTree<String> tree = new MyTree<String>(root);
        System.out.println("初始化后：" + Arrays.toString(tree.getNodes()));
        Node<String> b = new Node<String>("B");
        Node<String> c = new Node<String>("C");
        Node<String> d = new Node<String>("D");
        Node<String> e = new Node<String>("E");
        Node<String> f = new Node<String>("F");
        Node<String> g = new Node<String>("G");
        tree.add(b,root);
        System.out.println("调用add方法后" + Arrays.toString(tree.getNodes()));
        tree.add(c,root);
        tree.add(d,root);

        tree.add(e,b);
        tree.add(f,b);
        tree.add(g,f);


        System.out.println(tree.getSize());
        System.out.println(tree.getRoot().getData());
        System.out.println(tree.getAllNodes());
        System.out.println(tree.getDepth());
        tree.add(new Node<String>("H"),g);
        System.out.println(tree.getDepth());
        tree.enlarge();
    }
}
