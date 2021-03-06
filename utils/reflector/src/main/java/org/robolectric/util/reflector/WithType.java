package org.robolectric.util.reflector;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Parameters with types that can't be resolved at compile time may be annotated @WithType. */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface WithType {

  /**
   * The class name intended for this parameter.
   *
   * Use the value as returned from {@link Class#getName()}, not {@link Class#getCanonicalName()};
   * e.g. `Foo$Bar` instead of `Foo.Bar`.
   */
  String value();
}
