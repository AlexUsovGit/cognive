package com.cognive.core.util;

public class BitFlags {
	public static boolean isFlagSet(byte value, byte flags) {
		return (flags & value) == value;
	}

	public static byte setFlag(byte value, byte flags) {
		return (byte) (flags | value);
	}

	public static byte unsetFlag(byte value, byte flags) {
		return (byte) (flags & ~value);
	}

	public static boolean isFlagSet(short value, short flags) {
		return (flags & value) == value;
	}

	public static short setFlag(short value, short flags) {
		return (short) (flags | value);
	}

	public static short unsetFlag(short value, short flags) {
		return (short) (flags & ~value);
	}
	
	public static boolean isFlagSet(int value, int flags) {
		return (flags & value) == value;
	}

	public static int setFlag(int value, int flags) {
		return (flags | value);
	}

	public static int unsetFlag(int value, int flags) {
		return (flags & ~value);
	}
}
