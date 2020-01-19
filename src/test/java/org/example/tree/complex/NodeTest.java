package org.example.tree.complex;

import org.junit.Test;

public class NodeTest {

    @Test
    public void test() {
        Node tree = new Node.Builder()
                .id("<root>>")
                .label("root")
                .group(g ->
                        g.id("1")
                                .label("child1")
                                .min(0)
                                .max(5)
                                .object(o ->
                                        o.id("1.1")
                                                .label("child1.1")
                                                .type("UE")
                                )
                )
                .object(o ->
                        o.id("2")
                                .label("child2")
                                .type("UE")
                )
                .build();
        System.out.println(tree);
    }
}
