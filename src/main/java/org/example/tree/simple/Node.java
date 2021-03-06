package org.example.tree.simple;

import org.immutables.value.Value;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Node {
    String id();

    String label();

    List<Node> nodes();

    class Builder extends ImmutableNode.Builder {

        public Builder node(Function<Node.Builder, Node.Builder> node) {
            this.addNodes(node.apply(new Builder()).build());
            return this;
        }
    }
}
