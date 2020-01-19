package org.example.tree.complex;

import org.immutables.value.Value;

import java.util.function.Supplier;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface ObjectNode extends Node {
    String type();

    class Builder extends ImmutableObjectNode.Builder {

        public ObjectNode.Builder object(Supplier<ObjectNode> supplier) {
            this.addNodes(supplier.get());
            return this;
        }
    }
}
