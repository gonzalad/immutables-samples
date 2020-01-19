package org.example.tree.relation.inheritance;

import org.immutables.value.Value;

import java.util.function.Supplier;

/**
 * Root of a tree
 */
@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Tree extends Node {
    String name();

    class Builder extends ImmutableTree.Builder {

        public Builder object(Supplier<Child> supplier) {
            this.addChildren(supplier.get());
            return this;
        }

        public Builder group(Supplier<GroupChild> supplier) {
            this.addChildren(supplier.get());
            return this;
        }
    }
}
