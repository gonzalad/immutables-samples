package org.example.tree.relation.association;

import org.immutables.value.Value;

/**
 * Root of a tree
 */
@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Tree extends Node {
    String name();

    class Builder extends ImmutableTree.Builder {

        public Builder object(Edge edge) {
            this.addEdges(edge);
            return this;
        }

        public Builder group(GroupEdge groupEdge) {
            this.addEdges(groupEdge);
            return this;
        }
    }
}
