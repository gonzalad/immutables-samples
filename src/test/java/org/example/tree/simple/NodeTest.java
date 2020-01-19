package org.example.tree.simple;

import org.junit.Test;

public class NodeTest {

    @Test
    public void test() {
        Node tree = new Node.Builder()
                .id("<root>>")
                .label("root")
                .addNodes(new Node.Builder()
                        .id("1")
                        .label("child1")
                        .build()
                )
                .addNodes(new Node.Builder()
                        .id("2")
                        .label("child2")
                        .build()
                )
                .build();
        System.out.println(tree);
    }
}
