package com.video_converter.video_compressor.dialogs.promptdialog;

import f.n.a.k.c.c;

/* loaded from: classes2.dex */
public class PromptDialogDismissedEvent extends c {
    public final ClickedButton b;

    /* loaded from: classes2.dex */
    public enum ClickedButton {
        POSITIVE,
        NEGATIVE
    }

    public PromptDialogDismissedEvent(String str, ClickedButton clickedButton) {
        super(str);
        this.b = clickedButton;
    }
}
