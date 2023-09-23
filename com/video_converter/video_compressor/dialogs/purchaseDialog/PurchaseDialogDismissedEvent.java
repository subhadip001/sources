package com.video_converter.video_compressor.dialogs.purchaseDialog;

import f.n.a.k.c.c;

/* loaded from: classes2.dex */
public class PurchaseDialogDismissedEvent extends c {
    public final ClickedButton b;

    /* loaded from: classes2.dex */
    public enum ClickedButton {
        POSITIVE,
        NEGATIVE,
        NEUTRAL
    }

    public PurchaseDialogDismissedEvent(String str, ClickedButton clickedButton) {
        super(str);
        this.b = clickedButton;
    }
}
