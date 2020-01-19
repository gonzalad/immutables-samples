package org.example.tree.complex;

import org.immutables.value.Value;

@Value.Immutable
public interface Container extends Node {
    String name();
}
