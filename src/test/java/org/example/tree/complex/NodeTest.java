package org.example.tree.complex;

import org.junit.Test;

public class NodeTest {

    @Test
    public void test() {
        Node tree = new Node.Builder()
                .id("<root>>")
                .label("root")
                .group(() -> new GroupNode.Builder()
                        .id("1")
                        .label("child1")
                        .min(0)
                        .max(5)
                        .object(() -> new ObjectNode.Builder()
                                .id("1.1")
                                .label("child1.1")
                                .type("UE")
                                .build()
                        )
                        .build()
                )
                .object(() -> new ObjectNode.Builder()
                        .id("2")
                        .label("child2")
                        .type("UE")
                        .build()
                )
                .build();
        System.out.println(tree);
    }
}
