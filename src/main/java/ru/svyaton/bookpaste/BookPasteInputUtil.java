package ru.svyaton.bookpaste;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.input.KeyEvent;

public final class BookPasteInputUtil {
    private BookPasteInputUtil() {
    }

    public static boolean isPasteShortcutPressed(Minecraft client) {
        if (client == null) {
            return false;
        }

        return (isControlDown() && InputConstants.isKeyDown(InputConstants.KEY_V))
                || (isShiftDown() && InputConstants.isKeyDown(InputConstants.KEY_INSERT));
    }

    public static boolean isPasteShortcut(KeyEvent input) {
        return input.isPaste() || (input.key() == InputConstants.KEY_INSERT && input.hasShiftDown());
    }

    private static boolean isControlDown() {
        return InputConstants.isKeyDown(InputConstants.KEY_LCONTROL)
                || InputConstants.isKeyDown(InputConstants.KEY_RCONTROL);
    }

    private static boolean isShiftDown() {
        return InputConstants.isKeyDown(InputConstants.KEY_LSHIFT)
                || InputConstants.isKeyDown(InputConstants.KEY_RSHIFT);
    }
}
