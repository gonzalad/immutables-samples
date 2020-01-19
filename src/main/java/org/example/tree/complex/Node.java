package org.example.tree.complex;

import org.immutables.value.Value;

import java.util.List;
import java.util.function.Function;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Node {
    String id();

    String label();

    List<Node> nodes();

    class Builder extends ImmutableNode.Builder {

        public Builder object(Function<ObjectNode.Builder, ObjectNode.Builder> objectNode) {
            this.addNodes(objectNode.apply(new ObjectNode.Builder()).build());
            return this;
        }

        public Builder group(Function<GroupNode.Builder, GroupNode.Builder> group) {
            this.addNodes(group.apply(new GroupNode.Builder()).build());
            return this;
        }
    }
}
