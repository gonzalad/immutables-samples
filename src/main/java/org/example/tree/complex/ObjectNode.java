package org.example.tree.complex;

import org.immutables.value.Value;

import java.util.function.Function;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface ObjectNode extends Node {
    String type();

    class Builder extends ImmutableObjectNode.Builder {

        public ObjectNode.Builder object(Function<Builder, ObjectNode.Builder> objectNode) {
            this.addNodes(objectNode.apply(new ObjectNode.Builder()).build());
            return this;
        }
    }
}
