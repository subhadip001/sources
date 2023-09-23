package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: AppCompatCheckedTextView.java */
/* loaded from: classes.dex */
public class f extends CheckedTextView {

    /* renamed from: f  reason: collision with root package name */
    public final g f1758f;

    /* renamed from: g  reason: collision with root package name */
    public final e f1759g;

    /* renamed from: h  reason: collision with root package name */
    public final y f1760h;

    /* renamed from: i  reason: collision with root package name */
    public l f1761i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:3:0x004a, B:5:0x0050, B:7:0x0056, B:11:0x0067, B:13:0x006d, B:15:0x0073, B:16:0x0080, B:18:0x0087, B:19:0x0090, B:21:0x0097), top: B:28:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:3:0x004a, B:5:0x0050, B:7:0x0056, B:11:0x0067, B:13:0x006d, B:15:0x0073, B:16:0x0080, B:18:0x0087, B:19:0x0090, B:21:0x0097), top: B:28:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            e.b.h.w0.a(r11)
            r0 = 2130968751(0x7f0400af, float:1.7546164E38)
            r10.<init>(r11, r12, r0)
            android.content.Context r11 = r10.getContext()
            e.b.h.u0.a(r10, r11)
            e.b.h.y r11 = new e.b.h.y
            r11.<init>(r10)
            r10.f1760h = r11
            r11.e(r12, r0)
            r11.b()
            e.b.h.e r11 = new e.b.h.e
            r11.<init>(r10)
            r10.f1759g = r11
            r11.d(r12, r0)
            e.b.h.g r11 = new e.b.h.g
            r11.<init>(r10)
            r10.f1758f = r11
            android.content.Context r1 = r10.getContext()
            int[] r4 = e.b.b.f1466l
            r9 = 0
            e.b.h.z0 r1 = e.b.h.z0.q(r1, r12, r4, r0, r9)
            android.widget.CheckedTextView r2 = r11.a
            android.content.Context r3 = r2.getContext()
            android.content.res.TypedArray r6 = r1.b
            r8 = 0
            r7 = 2130968751(0x7f0400af, float:1.7546164E38)
            r5 = r12
            e.i.j.z.v(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1
            boolean r3 = r1.o(r2)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L64
            int r3 = r1.l(r2, r9)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L64
            android.widget.CheckedTextView r4 = r11.a     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lb3
            android.content.Context r5 = r4.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lb3
            android.graphics.drawable.Drawable r3 = e.b.a.b(r5, r3)     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lb3
            r4.setCheckMarkDrawable(r3)     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lb3
            goto L65
        L64:
            r2 = 0
        L65:
            if (r2 != 0) goto L80
            boolean r2 = r1.o(r9)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L80
            int r2 = r1.l(r9, r9)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L80
            android.widget.CheckedTextView r3 = r11.a     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r4 = r3.getContext()     // Catch: java.lang.Throwable -> Lb3
            android.graphics.drawable.Drawable r2 = e.b.a.b(r4, r2)     // Catch: java.lang.Throwable -> Lb3
            r3.setCheckMarkDrawable(r2)     // Catch: java.lang.Throwable -> Lb3
        L80:
            r2 = 2
            boolean r3 = r1.o(r2)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L90
            android.widget.CheckedTextView r3 = r11.a     // Catch: java.lang.Throwable -> Lb3
            android.content.res.ColorStateList r2 = r1.c(r2)     // Catch: java.lang.Throwable -> Lb3
            r3.setCheckMarkTintList(r2)     // Catch: java.lang.Throwable -> Lb3
        L90:
            r2 = 3
            boolean r3 = r1.o(r2)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La6
            android.widget.CheckedTextView r11 = r11.a     // Catch: java.lang.Throwable -> Lb3
            r3 = -1
            int r2 = r1.j(r2, r3)     // Catch: java.lang.Throwable -> Lb3
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = e.b.h.e0.e(r2, r3)     // Catch: java.lang.Throwable -> Lb3
            r11.setCheckMarkTintMode(r2)     // Catch: java.lang.Throwable -> Lb3
        La6:
            android.content.res.TypedArray r11 = r1.b
            r11.recycle()
            e.b.h.l r11 = r10.getEmojiTextViewHelper()
            r11.a(r12, r0)
            return
        Lb3:
            r11 = move-exception
            android.content.res.TypedArray r12 = r1.b
            r12.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.f.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private l getEmojiTextViewHelper() {
        if (this.f1761i == null) {
            this.f1761i = new l(this);
        }
        return this.f1761i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f1760h;
        if (yVar != null) {
            yVar.b();
        }
        e eVar = this.f1759g;
        if (eVar != null) {
            eVar.a();
        }
        g gVar = this.f1758f;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e.i.a.k0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1759g;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1759g;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        g gVar = this.f1758f;
        if (gVar != null) {
            return gVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        g gVar = this.f1758f;
        if (gVar != null) {
            return gVar.c;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        e.b.a.c(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b.a.c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1759g;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1759g;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        g gVar = this.f1758f;
        if (gVar != null) {
            if (gVar.f1774f) {
                gVar.f1774f = false;
                return;
            }
            gVar.f1774f = true;
            gVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e.i.a.m0(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().b.a.d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1759g;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1759g;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        g gVar = this.f1758f;
        if (gVar != null) {
            gVar.b = colorStateList;
            gVar.f1772d = true;
            gVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        g gVar = this.f1758f;
        if (gVar != null) {
            gVar.c = mode;
            gVar.f1773e = true;
            gVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1760h;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(e.b.a.b(getContext(), i2));
    }
}
