package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import e.p.c.e0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f369f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<String> f370g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f371h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f372i;

    /* renamed from: j  reason: collision with root package name */
    public final int f373j;

    /* renamed from: k  reason: collision with root package name */
    public final String f374k;

    /* renamed from: l  reason: collision with root package name */
    public final int f375l;

    /* renamed from: m  reason: collision with root package name */
    public final int f376m;
    public final CharSequence n;
    public final int o;
    public final CharSequence p;
    public final ArrayList<String> q;
    public final ArrayList<String> r;
    public final boolean s;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    }

    public BackStackState(e.p.c.a aVar) {
        int size = aVar.a.size();
        this.f369f = new int[size * 5];
        if (aVar.f2694g) {
            this.f370g = new ArrayList<>(size);
            this.f371h = new int[size];
            this.f372i = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                e0.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.f369f[i3] = aVar2.a;
                ArrayList<String> arrayList = this.f370g;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f369f;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f2701d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f2702e;
                iArr[i7] = aVar2.f2703f;
                this.f371h[i2] = aVar2.f2704g.ordinal();
                this.f372i[i2] = aVar2.f2705h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f373j = aVar.f2693f;
            this.f374k = aVar.f2696i;
            this.f375l = aVar.s;
            this.f376m = aVar.f2697j;
            this.n = aVar.f2698k;
            this.o = aVar.f2699l;
            this.p = aVar.f2700m;
            this.q = aVar.n;
            this.r = aVar.o;
            this.s = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f369f);
        parcel.writeStringList(this.f370g);
        parcel.writeIntArray(this.f371h);
        parcel.writeIntArray(this.f372i);
        parcel.writeInt(this.f373j);
        parcel.writeString(this.f374k);
        parcel.writeInt(this.f375l);
        parcel.writeInt(this.f376m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeStringList(this.q);
        parcel.writeStringList(this.r);
        parcel.writeInt(this.s ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f369f = parcel.createIntArray();
        this.f370g = parcel.createStringArrayList();
        this.f371h = parcel.createIntArray();
        this.f372i = parcel.createIntArray();
        this.f373j = parcel.readInt();
        this.f374k = parcel.readString();
        this.f375l = parcel.readInt();
        this.f376m = parcel.readInt();
        this.n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.o = parcel.readInt();
        this.p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.q = parcel.createStringArrayList();
        this.r = parcel.createStringArrayList();
        this.s = parcel.readInt() != 0;
    }
}
