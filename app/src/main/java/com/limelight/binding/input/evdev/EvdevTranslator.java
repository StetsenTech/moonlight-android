package com.limelight.binding.input.evdev;

import android.view.KeyEvent;

public class EvdevTranslator {

	private static final short[] EVDEV_KEY_CODES = {
		0, //KeyEvent.VK_RESERVED
		KeyEvent.KEYCODE_ESCAPE,
		KeyEvent.KEYCODE_1,
		KeyEvent.KEYCODE_2,
		KeyEvent.KEYCODE_3,
		KeyEvent.KEYCODE_4,
		KeyEvent.KEYCODE_5,
		KeyEvent.KEYCODE_6,
		KeyEvent.KEYCODE_7,
		KeyEvent.KEYCODE_8,
		KeyEvent.KEYCODE_9,
		KeyEvent.KEYCODE_0,
		KeyEvent.KEYCODE_MINUS,
		KeyEvent.KEYCODE_EQUALS,
		KeyEvent.KEYCODE_DEL,
		KeyEvent.KEYCODE_TAB,
		KeyEvent.KEYCODE_Q,
		KeyEvent.KEYCODE_W,
		KeyEvent.KEYCODE_E,
		KeyEvent.KEYCODE_R,
		KeyEvent.KEYCODE_T,
		KeyEvent.KEYCODE_Y,
		KeyEvent.KEYCODE_U,
		KeyEvent.KEYCODE_I,
		KeyEvent.KEYCODE_O,
		KeyEvent.KEYCODE_P,
		KeyEvent.KEYCODE_LEFT_BRACKET,
		KeyEvent.KEYCODE_RIGHT_BRACKET,
		KeyEvent.KEYCODE_ENTER,
		KeyEvent.KEYCODE_CTRL_LEFT,
		KeyEvent.KEYCODE_A,
		KeyEvent.KEYCODE_S,
		KeyEvent.KEYCODE_D,
		KeyEvent.KEYCODE_F,
		KeyEvent.KEYCODE_G,
		KeyEvent.KEYCODE_H,
		KeyEvent.KEYCODE_J,
		KeyEvent.KEYCODE_K,
		KeyEvent.KEYCODE_L,
		KeyEvent.KEYCODE_SEMICOLON,
		KeyEvent.KEYCODE_APOSTROPHE,
		KeyEvent.KEYCODE_GRAVE,
		KeyEvent.KEYCODE_SHIFT_LEFT,
		KeyEvent.KEYCODE_BACKSLASH,
		KeyEvent.KEYCODE_Z,
		KeyEvent.KEYCODE_X,
		KeyEvent.KEYCODE_C,
		KeyEvent.KEYCODE_V,
		KeyEvent.KEYCODE_B,
		KeyEvent.KEYCODE_N,
		KeyEvent.KEYCODE_M,
		KeyEvent.KEYCODE_COMMA,
		KeyEvent.KEYCODE_PERIOD,
		KeyEvent.KEYCODE_SLASH,
		KeyEvent.KEYCODE_SHIFT_RIGHT,
		KeyEvent.KEYCODE_NUMPAD_MULTIPLY,
		KeyEvent.KEYCODE_ALT_LEFT,
		KeyEvent.KEYCODE_SPACE,
		KeyEvent.KEYCODE_CAPS_LOCK,
		KeyEvent.KEYCODE_F1,
		KeyEvent.KEYCODE_F2,
		KeyEvent.KEYCODE_F3,
		KeyEvent.KEYCODE_F4,
		KeyEvent.KEYCODE_F5,
		KeyEvent.KEYCODE_F6,
		KeyEvent.KEYCODE_F7,
		KeyEvent.KEYCODE_F8,
		KeyEvent.KEYCODE_F9,
		KeyEvent.KEYCODE_F10,
		KeyEvent.KEYCODE_NUM_LOCK,
		KeyEvent.KEYCODE_SCROLL_LOCK,
		KeyEvent.KEYCODE_NUMPAD_7,
		KeyEvent.KEYCODE_NUMPAD_8,
		KeyEvent.KEYCODE_NUMPAD_9,
		KeyEvent.KEYCODE_NUMPAD_SUBTRACT,
		KeyEvent.KEYCODE_NUMPAD_4,
		KeyEvent.KEYCODE_NUMPAD_5,
		KeyEvent.KEYCODE_NUMPAD_6,
		KeyEvent.KEYCODE_NUMPAD_ADD,
		KeyEvent.KEYCODE_NUMPAD_1,
		KeyEvent.KEYCODE_NUMPAD_2,
		KeyEvent.KEYCODE_NUMPAD_3,
		KeyEvent.KEYCODE_NUMPAD_0,
		KeyEvent.KEYCODE_NUMPAD_DOT,
		0,
		0, //KeyEvent.VK_ZENKAKUHANKAKU,
		0, //KeyEvent.VK_102ND,
		KeyEvent.KEYCODE_F11,
		KeyEvent.KEYCODE_F12,
		0, //KeyEvent.VK_RO,
		0, //KeyEvent.VK_KATAKANA,
		0, //KeyEvent.VK_HIRAGANA,
		0, //KeyEvent.VK_HENKAN,
		0, //KeyEvent.VK_KATAKANAHIRAGANA,
		0, //KeyEvent.VK_MUHENKAN,
		0, //KeyEvent.VK_KPJPCOMMA,
		KeyEvent.KEYCODE_NUMPAD_ENTER,
		KeyEvent.KEYCODE_CTRL_RIGHT,
		KeyEvent.KEYCODE_NUMPAD_DIVIDE,
		KeyEvent.KEYCODE_SYSRQ,
		KeyEvent.KEYCODE_ALT_RIGHT,
		0, //KeyEvent.VK_LINEFEED,
		KeyEvent.KEYCODE_HOME,
		KeyEvent.KEYCODE_DPAD_UP,
		KeyEvent.KEYCODE_PAGE_UP,
		KeyEvent.KEYCODE_DPAD_LEFT,
		KeyEvent.KEYCODE_DPAD_RIGHT,
		KeyEvent.KEYCODE_MOVE_END,
		KeyEvent.KEYCODE_DPAD_DOWN,
		KeyEvent.KEYCODE_PAGE_DOWN,
		KeyEvent.KEYCODE_INSERT,
		KeyEvent.KEYCODE_FORWARD_DEL,
		0, //KeyEvent.VK_MACRO,
		0, //KeyEvent.VK_MUTE,
		0, //KeyEvent.VK_VOLUMEDOWN,
		0, //KeyEvent.VK_VOLUMEUP,
		0, //KeyEvent.VK_POWER, /* SC System Power Down */
		KeyEvent.KEYCODE_NUMPAD_EQUALS,
		0, //KeyEvent.VK_KPPLUSMINUS,
		KeyEvent.KEYCODE_BREAK,
		0, //KeyEvent.VK_SCALE, /* AL Compiz Scale (Expose) */
	};
	
	public static short translateEvdevKeyCode(short evdevKeyCode) {
		if (evdevKeyCode < EVDEV_KEY_CODES.length) {
			return EVDEV_KEY_CODES[evdevKeyCode];
		}
		
		return 0;
	}

}
