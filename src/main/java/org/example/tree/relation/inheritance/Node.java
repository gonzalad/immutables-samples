package org.example.tree.relation.inheritance;

import org.immutables.value.Value;

import java.util.List;
import java.util.function.Supplier;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Node {
    String id();
    String label();
    List<Child> children();

    /**
     * Represents a node inside a tree.
     *
     * Only subclasses from Child are meant to be instanciated
     */
    @Value.Immutable
    @Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
    interface Child extends Node {
    }

    @Value.Immutable
    @Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
    interface ObjectChild extends Child, ObjectNode {
        @Value.Default
        default boolean required() {
            return true;
        }

        class Builder extends ImmutableObjectChild.Builder {
        }
    }

    @Value.Immutable
    @Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
    interface GroupChild extends Child, GroupNode {
        int someData();

        class Builder extends ImmutableGroupChild.Builder {

            public Builder object(Supplier<Child> supplier) {
                this.addChildren(supplier.get());
                return this;
            }
        }
    }
}
