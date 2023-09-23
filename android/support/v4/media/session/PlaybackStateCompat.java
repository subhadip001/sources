package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f25f;

    /* renamed from: g  reason: collision with root package name */
    public final long f26g;

    /* renamed from: h  reason: collision with root package name */
    public final long f27h;

    /* renamed from: i  reason: collision with root package name */
    public final float f28i;

    /* renamed from: j  reason: collision with root package name */
    public final long f29j;

    /* renamed from: k  reason: collision with root package name */
    public final int f30k;

    /* renamed from: l  reason: collision with root package name */
    public final CharSequence f31l;

    /* renamed from: m  reason: collision with root package name */
    public final long f32m;
    public List<CustomAction> n;
    public final long o;
    public final Bundle p;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public final String f33f;

        /* renamed from: g  reason: collision with root package name */
        public final CharSequence f34g;

        /* renamed from: h  reason: collision with root package name */
        public final int f35h;

        /* renamed from: i  reason: collision with root package name */
        public final Bundle f36i;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f33f = parcel.readString();
            this.f34g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f35h = parcel.readInt();
            this.f36i = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("Action:mName='");
            A.append((Object) this.f34g);
            A.append(", mIcon=");
            A.append(this.f35h);
            A.append(", mExtras=");
            A.append(this.f36i);
            return A.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f33f);
            TextUtils.writeToParcel(this.f34g, parcel, i2);
            parcel.writeInt(this.f35h);
            parcel.writeBundle(this.f36i);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f25f = parcel.readInt();
        this.f26g = parcel.readLong();
        this.f28i = parcel.readFloat();
        this.f32m = parcel.readLong();
        this.f27h = parcel.readLong();
        this.f29j = parcel.readLong();
        this.f31l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.o = parcel.readLong();
        this.p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f30k = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f25f + ", position=" + this.f26g + ", buffered position=" + this.f27h + ", speed=" + this.f28i + ", updated=" + this.f32m + ", actions=" + this.f29j + ", error code=" + this.f30k + ", error message=" + this.f31l + ", custom actions=" + this.n + ", active item id=" + this.o + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f25f);
        parcel.writeLong(this.f26g);
        parcel.writeFloat(this.f28i);
        parcel.writeLong(this.f32m);
        parcel.writeLong(this.f27h);
        parcel.writeLong(this.f29j);
        TextUtils.writeToParcel(this.f31l, parcel, i2);
        parcel.writeTypedList(this.n);
        parcel.writeLong(this.o);
        parcel.writeBundle(this.p);
        parcel.writeInt(this.f30k);
    }
}
