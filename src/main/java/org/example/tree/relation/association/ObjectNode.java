package org.example.tree.relation.association;

import org.immutables.value.Value;

import java.util.function.Supplier;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface ObjectNode extends Node {
    String type();

    class Builder extends ImmutableObjectNode.Builder {

        public ObjectNode.Builder object(Supplier<Edge> supplier) {
            this.addEdges(supplier.get());
            return this;
        }
    }
}
