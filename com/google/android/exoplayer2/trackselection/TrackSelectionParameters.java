package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import f.h.b.b.g2.b0;
import f.h.c.b.m0;
import f.h.c.b.q;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;

    /* renamed from: l  reason: collision with root package name */
    public static final TrackSelectionParameters f927l;

    /* renamed from: f  reason: collision with root package name */
    public final q<String> f928f;

    /* renamed from: g  reason: collision with root package name */
    public final int f929g;

    /* renamed from: h  reason: collision with root package name */
    public final q<String> f930h;

    /* renamed from: i  reason: collision with root package name */
    public final int f931i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f932j;

    /* renamed from: k  reason: collision with root package name */
    public final int f933k;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<TrackSelectionParameters> {
        @Override // android.os.Parcelable.Creator
        public TrackSelectionParameters createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TrackSelectionParameters[] newArray(int i2) {
            return new TrackSelectionParameters[i2];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public q<String> a;
        public q<String> b;
        public int c;

        @Deprecated
        public b() {
            f.h.c.b.a<Object> aVar = q.f5981g;
            q qVar = m0.f5954j;
            this.a = qVar;
            this.b = qVar;
            this.c = 0;
        }

        public b a(Context context) {
            CaptioningManager captioningManager;
            String locale;
            int i2 = b0.a;
            if (i2 >= 19 && ((i2 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
                this.c = 1088;
                Locale locale2 = captioningManager.getLocale();
                if (locale2 != null) {
                    if (i2 >= 21) {
                        locale = locale2.toLanguageTag();
                    } else {
                        locale = locale2.toString();
                    }
                    this.b = q.r(locale);
                }
            }
            return this;
        }
    }

    static {
        f.h.c.b.a<Object> aVar = q.f5981g;
        q<Object> qVar = m0.f5954j;
        f927l = new TrackSelectionParameters(qVar, 0, qVar, 0, false, 0);
        CREATOR = new a();
    }

    public TrackSelectionParameters(q<String> qVar, int i2, q<String> qVar2, int i3, boolean z, int i4) {
        this.f928f = qVar;
        this.f929g = i2;
        this.f930h = qVar2;
        this.f931i = i3;
        this.f932j = z;
        this.f933k = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return this.f928f.equals(trackSelectionParameters.f928f) && this.f929g == trackSelectionParameters.f929g && this.f930h.equals(trackSelectionParameters.f930h) && this.f931i == trackSelectionParameters.f931i && this.f932j == trackSelectionParameters.f932j && this.f933k == trackSelectionParameters.f933k;
    }

    public int hashCode() {
        return ((((((this.f930h.hashCode() + ((((this.f928f.hashCode() + 31) * 31) + this.f929g) * 31)) * 31) + this.f931i) * 31) + (this.f932j ? 1 : 0)) * 31) + this.f933k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f928f);
        parcel.writeInt(this.f929g);
        parcel.writeList(this.f930h);
        parcel.writeInt(this.f931i);
        boolean z = this.f932j;
        int i3 = b0.a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f933k);
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f928f = q.m(arrayList);
        this.f929g = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.f930h = q.m(arrayList2);
        this.f931i = parcel.readInt();
        int i2 = b0.a;
        this.f932j = parcel.readInt() != 0;
        this.f933k = parcel.readInt();
    }
}
