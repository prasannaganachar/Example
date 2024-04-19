package com.retention;

import java.lang.annotation.*;
import java.lang.reflect.*;
// An annotation type declaration.
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnno {
	String str();
	int val();
}
