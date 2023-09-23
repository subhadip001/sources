package e.n.a;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder.java */
/* loaded from: classes.dex */
public final class o extends SpannableStringBuilder {

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f2642f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f2643g;

    /* compiled from: SpannableBuilder.java */
    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: f  reason: collision with root package name */
        public final Object f2644f;

        /* renamed from: g  reason: collision with root package name */
        public final AtomicInteger f2645g = new AtomicInteger(0);

        public a(Object obj) {
            this.f2644f = obj;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2644f).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f2644f).beforeTextChanged(charSequence, i2, i3, i4);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f2645g.get() <= 0 || !(obj instanceof l)) {
                ((SpanWatcher) this.f2644f).onSpanAdded(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
            if (this.f2645g.get() <= 0 || !(obj instanceof l)) {
                ((SpanWatcher) this.f2644f).onSpanChanged(spannable, obj, i2, i3, i4, i5);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f2645g.get() <= 0 || !(obj instanceof l)) {
                ((SpanWatcher) this.f2644f).onSpanRemoved(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f2644f).onTextChanged(charSequence, i2, i3, i4);
        }
    }

    public o(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f2643g = new ArrayList();
        e.i.a.i(cls, "watcherClass cannot be null");
        this.f2642f = cls;
    }

    public final void a() {
        for (int i2 = 0; i2 < this.f2643g.size(); i2++) {
            this.f2643g.get(i2).f2645g.incrementAndGet();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public void b() {
        f();
        for (int i2 = 0; i2 < this.f2643g.size(); i2++) {
            ((TextWatcher) this.f2643g.get(i2).f2644f).onTextChanged(this, 0, length(), length());
        }
    }

    public final a c(Object obj) {
        for (int i2 = 0; i2 < this.f2643g.size(); i2++) {
            a aVar = this.f2643g.get(i2);
            if (aVar.f2644f == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean d(Class<?> cls) {
        return this.f2642f == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    public final boolean e(Object obj) {
        return obj != null && d(obj.getClass());
    }

    public final void f() {
        for (int i2 = 0; i2 < this.f2643g.size(); i2++) {
            this.f2643g.get(i2).f2645g.decrementAndGet();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a c;
        if (e(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a c;
        if (e(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a c;
        if (e(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        if (this.f2642f == cls) {
            a[] aVarArr = (a[]) super.getSpans(i2, i3, a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                tArr[i4] = aVarArr[i4].f2644f;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0009, code lost:
        if ((r1.f2642f == r4) != false) goto L10;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class<?> r0 = r1.f2642f
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<e.n.a.o$a> r4 = e.n.a.o.a.class
        Ld:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.n.a.o.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (e(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2643g.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public Editable replace(int i2, int i3, CharSequence charSequence) {
        a();
        super.replace(i2, i3, charSequence);
        f();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (e(obj)) {
            a aVar = new a(obj);
            this.f2643g.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return new o(this.f2642f, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        a();
        super.replace(i2, i3, charSequence);
        f();
        return this;
    }

    public o(Class<?> cls, CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        this.f2643g = new ArrayList();
        e.i.a.i(cls, "watcherClass cannot be null");
        this.f2642f = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public Editable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        a();
        super.replace(i2, i3, charSequence, i4, i5);
        f();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        a();
        super.replace(i2, i3, charSequence, i4, i5);
        f();
        return this;
    }
}
