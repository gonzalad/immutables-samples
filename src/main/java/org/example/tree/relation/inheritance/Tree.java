package org.example.tree.relation.inheritance;

import org.immutables.value.Value;

/**
 * Root of a tree
 */
@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Tree extends Node {
    String name();

    class Builder extends ImmutableTree.Builder {

        public Builder object(Child child) {
            this.addChildren(child);
            return this;
        }

        public Builder group(GroupChild groupChild) {
            this.addChildren(groupChild);
            return this;
        }
    }
}
