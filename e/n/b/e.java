package e.n.b;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import e.n.a.k;
import java.util.Objects;

/* compiled from: EmojiKeyListener.java */
/* loaded from: classes.dex */
public final class e implements KeyListener {
    public final KeyListener a;
    public final a b;

    /* compiled from: EmojiKeyListener.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.a = keyListener;
        this.b = aVar;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i2) {
        this.a.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean a2;
        boolean z;
        Objects.requireNonNull(this.b);
        Object obj = e.n.a.h.f2614j;
        if (i2 != 67) {
            a2 = i2 != 112 ? false : k.a(editable, keyEvent, true);
        } else {
            a2 = k.a(editable, keyEvent, false);
        }
        if (a2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.a.onKeyDown(view, editable, i2, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i2, keyEvent);
    }
}
