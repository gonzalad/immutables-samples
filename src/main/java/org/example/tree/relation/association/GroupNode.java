package org.example.tree.relation.association;

import org.immutables.value.Value;

import java.util.function.Supplier;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface GroupNode extends Node {
    @Value.Default
    default int min() {
        return -1;
    }

    @Value.Default
    default int max() {
        return -1;
    }

    class Builder extends ImmutableGroupNode.Builder {

        public GroupNode.Builder object(Supplier<Edge> supplier) {
            this.addEdges(supplier.get());
            return this;
        }
    }
}