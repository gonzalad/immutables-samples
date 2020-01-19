package org.example.tree.complex;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Node {
    String id();

    String label();

    List<Node> nodes();

    class Builder extends ImmutableNode.Builder {

        public Builder object(ObjectNode objectNode) {
            this.addNodes(objectNode);
            return this;
        }

        public Builder group(GroupNode group) {
            this.addNodes(group);
            return this;
        }
    }
}
