package com.example.shreesha.basecode.CustomScope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by shreesha on 4/1/17.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomComponent {
}
