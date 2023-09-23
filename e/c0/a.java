package e.c0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
public class a extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f1950d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f1951e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1952f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1953g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1954h;

    /* renamed from: i  reason: collision with root package name */
    public int f1955i;

    /* renamed from: j  reason: collision with root package name */
    public int f1956j;

    /* renamed from: k  reason: collision with root package name */
    public int f1957k;

    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e.f.a(), new e.f.a(), new e.f.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i2 = this.f1955i;
        if (i2 >= 0) {
            int i3 = this.f1950d.get(i2);
            int dataPosition = this.f1951e.dataPosition();
            this.f1951e.setDataPosition(i3);
            this.f1951e.writeInt(dataPosition - i3);
            this.f1951e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel b() {
        Parcel parcel = this.f1951e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1956j;
        if (i2 == this.f1952f) {
            i2 = this.f1953g;
        }
        return new a(parcel, dataPosition, i2, f.a.b.a.a.u(new StringBuilder(), this.f1954h, "  "), this.a, this.b, this.c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean f() {
        return this.f1951e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] g() {
        int readInt = this.f1951e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1951e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1951e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean i(int i2) {
        while (this.f1956j < this.f1953g) {
            int i3 = this.f1957k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f1951e.setDataPosition(this.f1956j);
            int readInt = this.f1951e.readInt();
            this.f1957k = this.f1951e.readInt();
            this.f1956j += readInt;
        }
        return this.f1957k == i2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int j() {
        return this.f1951e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T l() {
        return (T) this.f1951e.readParcelable(a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String n() {
        return this.f1951e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void p(int i2) {
        a();
        this.f1955i = i2;
        this.f1950d.put(i2, this.f1951e.dataPosition());
        this.f1951e.writeInt(0);
        this.f1951e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q(boolean z) {
        this.f1951e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void r(byte[] bArr) {
        if (bArr != null) {
            this.f1951e.writeInt(bArr.length);
            this.f1951e.writeByteArray(bArr);
            return;
        }
        this.f1951e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1951e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t(int i2) {
        this.f1951e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void u(Parcelable parcelable) {
        this.f1951e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v(String str) {
        this.f1951e.writeString(str);
    }

    public a(Parcel parcel, int i2, int i3, String str, e.f.a<String, Method> aVar, e.f.a<String, Method> aVar2, e.f.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1950d = new SparseIntArray();
        this.f1955i = -1;
        this.f1956j = 0;
        this.f1957k = -1;
        this.f1951e = parcel;
        this.f1952f = i2;
        this.f1953g = i3;
        this.f1956j = i2;
        this.f1954h = str;
    }
}
