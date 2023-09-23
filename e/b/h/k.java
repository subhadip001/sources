package e.b.h;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.Objects;

/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
public class k {
    public final EditText a;
    public final e.n.b.a b;

    public k(EditText editText) {
        this.a = editText;
        this.b = new e.n.b.a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? this.b.a.a(keyListener) : keyListener;
    }

    public void b(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, e.b.b.f1463i, i2, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        e.n.b.a aVar = this.b;
        Objects.requireNonNull(aVar);
        if (inputConnection == null) {
            return null;
        }
        return aVar.a.b(inputConnection, editorInfo);
    }

    public void d(boolean z) {
        this.b.a.c(z);
    }
}
