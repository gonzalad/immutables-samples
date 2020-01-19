package org.example.tree.complex;

import org.immutables.value.Value;

import java.util.function.Supplier;

@Value.Immutable
public interface Container extends Node {
    String name();
}
