package org.robolectric.res.android;

import java.nio.ByteOrder;

class Util {

  static final int SIZEOF_SHORT = 2;
  static final int SIZEOF_INT = 4;
  private static boolean littleEndian = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;

  static short dtohs(short v) {
    return littleEndian
        ? v
        : (short) ((v << 8) | (v >> 8));
  }

  static int dtohl(int v) {
    return littleEndian
        ? v
        : (v << 24) | ((v << 8) & 0x00FF0000) | ((v >> 8) & 0x0000FF00) | (v >> 24);
  }

  static short htods(short v) {
    return littleEndian
        ? v
        : (short) ((v << 8) | (v >> 8));
  }

  static int htodl(int v) {
    return littleEndian
        ? v
        : (v << 24) | ((v << 8) & 0x00FF0000) | ((v >> 8) & 0x0000FF00) | (v >> 24);
  }

  static boolean isTruthy(int i) {
    return i != 0;
  }

  static boolean isTruthy(Object o) {
    return o != null;
  }

  static void ALOGW(String message, Object... args) {
    System.out.println(String.format(message, args));
  }

  static void ALOGV(String message, Object... args) {
    System.out.println(String.format(message, args));
  }

  static void ALOGI(String message, Object... args) {
    System.out.println(String.format(message, args));
  }

  static void LOG_FATAL_IF(boolean assertion, String message) {
    assert !assertion : message;
  }

  static void ATRACE_CALL() {
  }
}