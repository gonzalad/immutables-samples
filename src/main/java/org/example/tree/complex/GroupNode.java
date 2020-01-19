package org.example.tree.complex;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface GroupNode extends Node {
    int min();

    int max();

    class Builder extends ImmutableGroupNode.Builder {

        public GroupNode.Builder object(ObjectNode objectNode) {
            this.addNodes(objectNode);
            return this;
        }
    }
}
