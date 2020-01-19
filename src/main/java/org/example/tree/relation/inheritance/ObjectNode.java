package org.example.tree.relation.inheritance;

import org.immutables.value.Value;

import java.util.function.Supplier;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface ObjectNode extends Node {
    String type();

    class Builder extends ImmutableObjectNode.Builder {

        public ObjectNode.Builder object(Supplier<Child> supplier) {
            this.addChildren(supplier.get());
            return this;
        }
    }
}
