package org.example.tree.relation.association;

import org.immutables.value.Value;

import java.util.function.Function;

/**
 * Root of a tree
 */
@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Tree extends Node {
    String name();

    class Builder extends ImmutableTree.Builder {

        public Builder object(Function<Edge.Builder, Edge.Builder> edge) {
            this.addEdges(edge.apply(new Edge.Builder()).build());
            return this;
        }

        public Builder group(Function<GroupEdge.Builder, GroupEdge.Builder> groupEdge) {
            this.addEdges(groupEdge.apply(new GroupEdge.Builder()).build());
            return this;
        }
    }
}
