package org.example.tree.complex;

import org.immutables.value.Value;

import java.util.function.Function;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface GroupNode extends Node {
    int min();

    int max();

    class Builder extends ImmutableGroupNode.Builder {

        public GroupNode.Builder object(Function<ObjectNode.Builder, ObjectNode.Builder> objectNode) {
            this.addNodes(objectNode.apply(new ObjectNode.Builder()).build());
            return this;
        }
    }
}
