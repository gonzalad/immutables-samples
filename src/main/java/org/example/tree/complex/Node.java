package org.example.tree.complex;

import org.immutables.value.Value;

import java.util.List;
import java.util.function.Supplier;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface Node {
    String id();
    String label();
    List<Node> nodes();

    class Builder extends ImmutableNode.Builder {

        public Builder node(Supplier<Node> supplier) {
            this.addNodes(supplier.get());
            return this;
        }

        public Builder object(Supplier<ObjectNode> supplier) {
            this.addNodes(supplier.get());
            return this;
        }

        public Builder group(Supplier<GroupNode> supplier) {
            this.addNodes(supplier.get());
            return this;
        }
    }
}
