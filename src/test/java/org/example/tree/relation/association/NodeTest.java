package org.example.tree.relation.association;

import org.junit.Test;

public class NodeTest {

    @Test
    public void test() {
        Node tree = new Tree.Builder()
                .id("<root>>")
                .name("<root>")
                .label("root")
                .group(e -> e
                        .someData(12)
                        .node(g -> g
                                .id("1")
                                .label("child1")
                                .min(0)
                                .max(5)
                        )
                )
                .object(e -> e
                        .required(false)
                        .node(o -> o
                                .id("1.1")
                                .label("child1.1")
                                .type("UE")
                        )
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
                .object(e -> e
                        .required(false)
                        .node(objectNode)
                )
                .build();
        System.out.println(tree);

    }
}


