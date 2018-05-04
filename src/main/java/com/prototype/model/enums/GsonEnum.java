package com.prototype.model.enums;

public interface GsonEnum<E> {

	int serialize();

    E deserialize(int ordinal);
}
