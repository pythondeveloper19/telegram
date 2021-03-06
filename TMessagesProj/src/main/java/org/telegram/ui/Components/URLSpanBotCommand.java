/*
 * This is the source code of Telegram for Android v. 3.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2015.
 */

package org.telegram.ui.Components;

import android.text.TextPaint;

public class URLSpanBotCommand extends URLSpanNoUnderline {

    public static boolean enabled = true;

    public URLSpanBotCommand(String url) {
        super(url);
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        super.updateDrawState(ds);
        ds.setColor(enabled ? 0xff316f9f : 0xff000000);
        ds.setUnderlineText(false);
    }
}
