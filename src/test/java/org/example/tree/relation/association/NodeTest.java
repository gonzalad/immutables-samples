package org.example.tree.relation.association;

import org.junit.Test;

public class NodeTest {

    @Test
    public void test() {
        Node tree = new Tree.Builder()
                .id("<root>>")
                .name("<root>")
                .label("root")
                .group(() -> new Node.GroupEdge.Builder()
                        .someData(12)
                        .node(new GroupNode.Builder()
                                .id("1")
                                .label("child1")
                                .min(0)
                                .max(5)
                                .build()
                        )
                        .build()

                )
                .object(() -> new Node.Edge.Builder()
                        .required(false)
                        .node(new ObjectNode.Builder()
                                .id("1.1")
                                .label("child1.1")
                                .type("UE")
                                .build())
                        .build()
                )
                .build();
        System.out.println(tree);
    }

    @Test
    public void addExistingObjectNodeToTree() {
        ObjectNode objectNode = new ObjectNode.Builder()
                .id("01")
                .label("detachedObject")
                .type("UE")
                .build();

        Node tree = new Tree.Builder()
                .id("<root>>")
                .name("<root>")
                .label("root")
                .object(() -> new Node.Edge.Builder()
                        .required(false)
                        .node(objectNode)
                        .build()
                )
                .build();
        System.out.println(tree);

    }
}


