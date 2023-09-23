package e.n.b;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import e.n.a.h;
import java.util.Objects;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {
    public final b a;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: e.n.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0051a extends b {
        public final EditText a;
        public final g b;

        public C0051a(EditText editText, boolean z) {
            this.a = editText;
            g gVar = new g(editText, z);
            this.b = gVar;
            editText.addTextChangedListener(gVar);
            if (e.n.b.b.b == null) {
                synchronized (e.n.b.b.a) {
                    if (e.n.b.b.b == null) {
                        e.n.b.b.b = new e.n.b.b();
                    }
                }
            }
            editText.setEditableFactory(e.n.b.b.b);
        }

        @Override // e.n.b.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new e(keyListener);
        }

        @Override // e.n.b.a.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.a, inputConnection, editorInfo);
        }

        @Override // e.n.b.a.b
        public void c(boolean z) {
            g gVar = this.b;
            if (gVar.f2650i != z) {
                if (gVar.f2649h != null) {
                    e.n.a.h a = e.n.a.h.a();
                    h.e eVar = gVar.f2649h;
                    Objects.requireNonNull(a);
                    e.i.a.i(eVar, "initCallback cannot be null");
                    a.a.writeLock().lock();
                    try {
                        a.b.remove(eVar);
                    } finally {
                        a.a.writeLock().unlock();
                    }
                }
                gVar.f2650i = z;
                if (z) {
                    g.a(gVar.f2647f, e.n.a.h.a().b());
                }
            }
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }
    }

    public a(EditText editText, boolean z) {
        e.i.a.i(editText, "editText cannot be null");
        this.a = new C0051a(editText, z);
    }
}
