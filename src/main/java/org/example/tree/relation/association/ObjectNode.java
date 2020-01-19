package org.example.tree.relation.association;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface ObjectNode extends Node {
    String type();

    class Builder extends ImmutableObjectNode.Builder {

        public ObjectNode.Builder object(Edge edge) {
            this.addEdges(edge);
            return this;
        }
    }
}
