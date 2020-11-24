package com.proglab3.entity;

import com.proglab3.impl.Declinable;

public abstract class Entity implements Declinable {
    public abstract String getName();

    public abstract boolean canFly();
}
