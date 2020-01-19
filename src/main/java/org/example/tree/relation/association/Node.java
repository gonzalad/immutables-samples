package org.example.tree.relation.association;

import org.immutables.value.Value;

import java.util.List;
import java.util.function.Function;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Node {
    String id();

    String label();

    List<Edge> edges();

    @Value.Immutable
    @Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
    interface Edge {
        @Value.Default
        default boolean required() {
            return true;
        }

        Node node();

        class Builder extends ImmutableEdge.Builder {
            public Builder node(Function<ObjectNode.Builder, ObjectNode.Builder> node) {
                this.node(node.apply(new ObjectNode.Builder()).build());
                return this;
            }
        }
    }

    @Value.Immutable
    @Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
    interface GroupEdge extends Edge {
        int someData();

        @Value.Check
        default void check() {
            if (!(node() instanceof GroupNode)) {
                throw new IllegalArgumentException("node must be an instance of GroupNode");
            }
        }

        class Builder extends ImmutableGroupEdge.Builder {
            public Builder node(Function<GroupNode.Builder, GroupNode.Builder> node) {
                this.node(node.apply(new GroupNode.Builder()).build());
                return this;
            }
        }
    }
}
