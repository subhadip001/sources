package android.support.v4.media.session;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public final MediaDescriptionCompat f14f;

        /* renamed from: g  reason: collision with root package name */
        public final long f15g;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i2) {
                return new QueueItem[i2];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f14f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f15g = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("MediaSession.QueueItem {Description=");
            A.append(this.f14f);
            A.append(", Id=");
            A.append(this.f15g);
            A.append(" }");
            return A.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f14f.writeToParcel(parcel, i2);
            parcel.writeLong(this.f15g);
        }
    }

    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public ResultReceiver f16f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f16f = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f16f.writeToParcel(parcel, i2);
        }
    }

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public final Object f18g;

        /* renamed from: f  reason: collision with root package name */
        public final Object f17f = new Object();

        /* renamed from: h  reason: collision with root package name */
        public d.a.b.b.a.a f19h = null;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i2) {
                return new Token[i2];
            }
        }

        public Token(Object obj) {
            this.f18g = obj;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Token) {
                Token token = (Token) obj;
                Object obj2 = this.f18g;
                if (obj2 == null) {
                    return token.f18g == null;
                }
                Object obj3 = token.f18g;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f18g;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable((Parcelable) this.f18g, i2);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static Bundle b(Bundle bundle) {
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
}
