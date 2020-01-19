package org.example.tree.relation.inheritance;

import org.immutables.value.Value;

import java.util.function.Function;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface ObjectNode extends Node {
    String type();

    class Builder extends ImmutableObjectNode.Builder {

        public ObjectNode.Builder object(Function<ObjectChild.Builder, ObjectChild.Builder> child) {
            this.addChildren(child.apply(new ObjectChild.Builder()).build());
            return this;
        }
    }
}
