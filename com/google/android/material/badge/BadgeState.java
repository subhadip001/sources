package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.video_converter.video_compressor.R;
import f.a.b.a.a;
import f.h.b.c.b;
import f.h.b.c.s.r;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class BadgeState {
    public final State a;
    public final State b = new State();
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1061d;

    /* renamed from: e  reason: collision with root package name */
    public final float f1062e;

    public BadgeState(Context context, int i2, int i3, int i4, State state) {
        AttributeSet attributeSet;
        int i5;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        Locale locale;
        int next;
        state = state == null ? new State() : state;
        if (i2 != 0) {
            state.f1063f = i2;
        }
        int i6 = state.f1063f;
        if (i6 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i6);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        attributeSet = Xml.asAttributeSet(xml);
                        i5 = attributeSet.getStyleAttribute();
                    } else {
                        throw new XmlPullParserException("Must have a <badge> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e2) {
                StringBuilder A = a.A("Can't load badge resource ID #0x");
                A.append(Integer.toHexString(i6));
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(A.toString());
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i5 = 0;
        }
        i4 = i5 != 0 ? i5 : i4;
        int[] iArr = b.c;
        r.a(context, attributeSet, i3, i4);
        r.b(context, attributeSet, iArr, i3, i4, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
        Resources resources = context.getResources();
        this.c = obtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f1062e = obtainStyledAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f1061d = obtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        State state2 = this.b;
        int i7 = state.f1066i;
        state2.f1066i = i7 == -2 ? 255 : i7;
        CharSequence charSequence = state.f1070m;
        state2.f1070m = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state3 = this.b;
        int i8 = state.n;
        state3.n = i8 == 0 ? R.plurals.mtrl_badge_content_description : i8;
        int i9 = state.o;
        state3.o = i9 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i9;
        Boolean bool = state.q;
        state3.q = Boolean.valueOf(bool == null || bool.booleanValue());
        State state4 = this.b;
        int i10 = state.f1068k;
        state4.f1068k = i10 == -2 ? obtainStyledAttributes.getInt(8, 4) : i10;
        int i11 = state.f1067j;
        if (i11 != -2) {
            this.b.f1067j = i11;
        } else if (obtainStyledAttributes.hasValue(9)) {
            this.b.f1067j = obtainStyledAttributes.getInt(9, 0);
        } else {
            this.b.f1067j = -1;
        }
        State state5 = this.b;
        Integer num = state.f1064g;
        if (num == null) {
            intValue = f.h.b.c.a.n0(context, obtainStyledAttributes, 0).getDefaultColor();
        } else {
            intValue = num.intValue();
        }
        state5.f1064g = Integer.valueOf(intValue);
        Integer num2 = state.f1065h;
        if (num2 != null) {
            this.b.f1065h = num2;
        } else if (obtainStyledAttributes.hasValue(3)) {
            this.b.f1065h = Integer.valueOf(f.h.b.c.a.n0(context, obtainStyledAttributes, 3).getDefaultColor());
        } else {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(com.arthenica.ffmpegkit.R.style.TextAppearance_MaterialComponents_Badge, b.H);
            obtainStyledAttributes2.getDimension(0, 0.0f);
            ColorStateList n0 = f.h.b.c.a.n0(context, obtainStyledAttributes2, 3);
            f.h.b.c.a.n0(context, obtainStyledAttributes2, 4);
            f.h.b.c.a.n0(context, obtainStyledAttributes2, 5);
            obtainStyledAttributes2.getInt(2, 0);
            obtainStyledAttributes2.getInt(1, 1);
            int i12 = obtainStyledAttributes2.hasValue(12) ? 12 : 10;
            obtainStyledAttributes2.getResourceId(i12, 0);
            obtainStyledAttributes2.getString(i12);
            obtainStyledAttributes2.getBoolean(14, false);
            f.h.b.c.a.n0(context, obtainStyledAttributes2, 6);
            obtainStyledAttributes2.getFloat(7, 0.0f);
            obtainStyledAttributes2.getFloat(8, 0.0f);
            obtainStyledAttributes2.getFloat(9, 0.0f);
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(com.arthenica.ffmpegkit.R.style.TextAppearance_MaterialComponents_Badge, b.x);
            obtainStyledAttributes3.hasValue(0);
            obtainStyledAttributes3.getFloat(0, 0.0f);
            obtainStyledAttributes3.recycle();
            this.b.f1065h = Integer.valueOf(n0.getDefaultColor());
        }
        State state6 = this.b;
        Integer num3 = state.p;
        if (num3 == null) {
            intValue2 = obtainStyledAttributes.getInt(1, 8388661);
        } else {
            intValue2 = num3.intValue();
        }
        state6.p = Integer.valueOf(intValue2);
        State state7 = this.b;
        Integer num4 = state.r;
        if (num4 == null) {
            intValue3 = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
        } else {
            intValue3 = num4.intValue();
        }
        state7.r = Integer.valueOf(intValue3);
        State state8 = this.b;
        if (state.r == null) {
            intValue4 = obtainStyledAttributes.getDimensionPixelOffset(10, 0);
        } else {
            intValue4 = state.s.intValue();
        }
        state8.s = Integer.valueOf(intValue4);
        State state9 = this.b;
        Integer num5 = state.t;
        if (num5 == null) {
            intValue5 = obtainStyledAttributes.getDimensionPixelOffset(7, state9.r.intValue());
        } else {
            intValue5 = num5.intValue();
        }
        state9.t = Integer.valueOf(intValue5);
        State state10 = this.b;
        Integer num6 = state.u;
        if (num6 == null) {
            intValue6 = obtainStyledAttributes.getDimensionPixelOffset(11, state10.s.intValue());
        } else {
            intValue6 = num6.intValue();
        }
        state10.u = Integer.valueOf(intValue6);
        State state11 = this.b;
        Integer num7 = state.v;
        state11.v = Integer.valueOf(num7 == null ? 0 : num7.intValue());
        State state12 = this.b;
        Integer num8 = state.w;
        state12.w = Integer.valueOf(num8 != null ? num8.intValue() : 0);
        obtainStyledAttributes.recycle();
        Locale locale2 = state.f1069l;
        if (locale2 == null) {
            State state13 = this.b;
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            state13.f1069l = locale;
        } else {
            this.b.f1069l = locale2;
        }
        this.a = state;
    }

    /* loaded from: classes.dex */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f1063f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f1064g;

        /* renamed from: h  reason: collision with root package name */
        public Integer f1065h;

        /* renamed from: i  reason: collision with root package name */
        public int f1066i;

        /* renamed from: j  reason: collision with root package name */
        public int f1067j;

        /* renamed from: k  reason: collision with root package name */
        public int f1068k;

        /* renamed from: l  reason: collision with root package name */
        public Locale f1069l;

        /* renamed from: m  reason: collision with root package name */
        public CharSequence f1070m;
        public int n;
        public int o;
        public Integer p;
        public Boolean q;
        public Integer r;
        public Integer s;
        public Integer t;
        public Integer u;
        public Integer v;
        public Integer w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State() {
            this.f1066i = 255;
            this.f1067j = -2;
            this.f1068k = -2;
            this.q = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1063f);
            parcel.writeSerializable(this.f1064g);
            parcel.writeSerializable(this.f1065h);
            parcel.writeInt(this.f1066i);
            parcel.writeInt(this.f1067j);
            parcel.writeInt(this.f1068k);
            CharSequence charSequence = this.f1070m;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.n);
            parcel.writeSerializable(this.p);
            parcel.writeSerializable(this.r);
            parcel.writeSerializable(this.s);
            parcel.writeSerializable(this.t);
            parcel.writeSerializable(this.u);
            parcel.writeSerializable(this.v);
            parcel.writeSerializable(this.w);
            parcel.writeSerializable(this.q);
            parcel.writeSerializable(this.f1069l);
        }

        public State(Parcel parcel) {
            this.f1066i = 255;
            this.f1067j = -2;
            this.f1068k = -2;
            this.q = Boolean.TRUE;
            this.f1063f = parcel.readInt();
            this.f1064g = (Integer) parcel.readSerializable();
            this.f1065h = (Integer) parcel.readSerializable();
            this.f1066i = parcel.readInt();
            this.f1067j = parcel.readInt();
            this.f1068k = parcel.readInt();
            this.f1070m = parcel.readString();
            this.n = parcel.readInt();
            this.p = (Integer) parcel.readSerializable();
            this.r = (Integer) parcel.readSerializable();
            this.s = (Integer) parcel.readSerializable();
            this.t = (Integer) parcel.readSerializable();
            this.u = (Integer) parcel.readSerializable();
            this.v = (Integer) parcel.readSerializable();
            this.w = (Integer) parcel.readSerializable();
            this.q = (Boolean) parcel.readSerializable();
            this.f1069l = (Locale) parcel.readSerializable();
        }
    }
}
