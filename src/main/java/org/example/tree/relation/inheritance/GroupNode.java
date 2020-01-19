package org.example.tree.relation.inheritance;

import org.immutables.value.Value;

import java.util.function.Function;
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

        public GroupNode.Builder child(Function<ObjectChild.Builder, ObjectChild.Builder> child) {
            this.addChildren(child.apply(new ObjectChild.Builder()).build());
            return this;
        }
    }
}
