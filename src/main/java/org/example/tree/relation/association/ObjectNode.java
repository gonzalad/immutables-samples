package org.example.tree.relation.association;

import org.immutables.value.Value;

import java.util.function.Function;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface ObjectNode extends Node {
    String type();

    class Builder extends ImmutableObjectNode.Builder {

        public ObjectNode.Builder object(Function<Edge.Builder, Edge.Builder> edge) {
            this.addEdges(edge.apply(new Edge.Builder()).build());
            return this;
        }
    }
}
