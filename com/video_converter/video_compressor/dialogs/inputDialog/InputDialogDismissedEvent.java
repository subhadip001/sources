package com.video_converter.video_compressor.dialogs.inputDialog;

import f.n.a.k.c.c;
import f.n.a.o.h;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class InputDialogDismissedEvent extends c {
    public final ClickedButton b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1362d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1363e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<h> f1364f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<h> f1365g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<h> f1366h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1367i;

    /* loaded from: classes2.dex */
    public enum ClickedButton {
        POSITIVE,
        NEGATIVE,
        NEUTRAL
    }

    public InputDialogDismissedEvent(String str, ClickedButton clickedButton, String str2, boolean z, boolean z2, int i2, ArrayList<h> arrayList, ArrayList<h> arrayList2, ArrayList<h> arrayList3) {
        super(str);
        this.b = clickedButton;
        this.c = str2;
        this.f1362d = z;
        this.f1363e = i2;
        this.f1364f = arrayList;
        this.f1365g = arrayList2;
        this.f1366h = arrayList3;
        this.f1367i = z2;
    }
}
