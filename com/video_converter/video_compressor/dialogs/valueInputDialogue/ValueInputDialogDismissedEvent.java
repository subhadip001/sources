package com.video_converter.video_compressor.dialogs.valueInputDialogue;

import f.n.a.k.c.c;

/* loaded from: classes2.dex */
public class ValueInputDialogDismissedEvent extends c {
    public final ClickedButton b;
    public final String c;

    /* loaded from: classes2.dex */
    public enum ClickedButton {
        POSITIVE,
        NEGATIVE,
        NEUTRAL
    }

    public ValueInputDialogDismissedEvent(String str, ClickedButton clickedButton, String str2) {
        super(str);
        this.b = clickedButton;
        this.c = str2;
    }
}
