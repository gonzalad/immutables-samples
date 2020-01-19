package org.example.tree.relation.inheritance;

import org.junit.Test;

public class NodeTest {

    @Test
    public void test() {
        Node tree = new Tree.Builder()
                .id("<root>>")
                .name("<root>")
                .label("root")
                .group(() -> new Node.GroupChild.Builder()
                        .someData(12)
                        .id("1")
                        .label("child1")
                        .min(0)
                        .max(5)
                        .object(() -> new Node.ObjectChild.Builder()
                                .id("1.1")
                                .label("child1.1")
                                .type("UE")
                                .build()
                        )
                        .build()
                )
                .object(() -> new Node.ObjectChild.Builder()
                        .id("2")
                        .label("child2")
                        .required(false)
                        .type("UE")
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

        Node.Child child = new Node.ObjectChild.Builder()
                .from(objectNode)
                .required(false)
                .build();

        Node tree = new Tree.Builder()
                .id("<root>>")
                .name("<root>")
                .label("root")
                .addChildren(child)
                .build();
        System.out.println(tree);

    }
}


