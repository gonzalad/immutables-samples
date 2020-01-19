package org.example.simple;

import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Immutable
@Value.Style(visibility = ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface ValueObject {
    String name();

    class Builder extends ImmutableValueObject.Builder {
    }
}
