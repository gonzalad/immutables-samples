package org.example.tree.simple;

import org.junit.Test;

public class NodeTest {

    @Test
    public void test() {
        Node tree = new Node.Builder()
                .id("<root>>")
                .label("root")
                .node(n -> n
                        .id("1")
                        .label("child1")
                )
                .node(n -> n
                        .id("2")
                        .label("child2")
                )
                .build();
        System.out.println(tree);
    }
}
