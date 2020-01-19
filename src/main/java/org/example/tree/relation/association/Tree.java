package org.example.tree.relation.association;

import org.immutables.value.Value;

import java.util.function.Supplier;

/**
 * Root of a tree
 */
@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Tree extends Node {
    String name();

    class Builder extends ImmutableTree.Builder {

        public Builder object(Supplier<Edge> supplier) {
            this.addEdges(supplier.get());
            return this;
        }

        public Builder group(Supplier<GroupEdge> supplier) {
            this.addEdges(supplier.get());
            return this;
        }
    }
}
