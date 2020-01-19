package org.example.tree.relation.inheritance;

import org.immutables.value.Value;

import java.util.function.Function;

/**
 * Root of a tree
 */
@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Tree extends Node {
    String name();

    class Builder extends ImmutableTree.Builder {

        public Builder object(Function<ObjectChild.Builder, ObjectChild.Builder> child) {
            this.addChildren(child.apply(new ObjectChild.Builder()).build());
            return this;
        }

        public Builder group(Function<GroupChild.Builder, GroupChild.Builder> groupChild) {
            this.addChildren(groupChild.apply(new GroupChild.Builder()).build());
            return this;
        }
    }
}
