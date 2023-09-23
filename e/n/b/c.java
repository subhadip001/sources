package e.n.b;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: EmojiInputConnection.java */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {
    public final TextView a;
    public final a b;

    /* compiled from: EmojiInputConnection.java */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x007c, code lost:
            if (r12 != false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0089, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L66;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.view.inputmethod.InputConnection r8, android.text.Editable r9, int r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.n.b.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.a = textView;
        this.b = aVar;
        if (e.n.a.h.c()) {
            e.n.a.h a2 = e.n.a.h.a();
            if (!a2.d() || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a2.f2617e.c(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        return this.b.a(this, this.a.getEditableText(), i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return this.b.a(this, this.a.getEditableText(), i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
