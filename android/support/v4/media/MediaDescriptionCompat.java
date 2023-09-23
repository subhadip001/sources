package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f2f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f3g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f4h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f5i;

    /* renamed from: j  reason: collision with root package name */
    public final Bitmap f6j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f7k;

    /* renamed from: l  reason: collision with root package name */
    public final Bundle f8l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f9m;
    public MediaDescription n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.b(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2f = str;
        this.f3g = charSequence;
        this.f4h = charSequence2;
        this.f5i = charSequence3;
        this.f6j = bitmap;
        this.f7k = uri;
        this.f8l = bundle;
        this.f9m = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat b(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L63
            int r1 = android.os.Build.VERSION.SDK_INT
            android.media.MediaDescription r14 = (android.media.MediaDescription) r14
            java.lang.String r3 = r14.getMediaId()
            java.lang.CharSequence r4 = r14.getTitle()
            java.lang.CharSequence r5 = r14.getSubtitle()
            java.lang.CharSequence r6 = r14.getDescription()
            android.graphics.Bitmap r7 = r14.getIconBitmap()
            android.net.Uri r8 = r14.getIconUri()
            android.os.Bundle r2 = r14.getExtras()
            if (r2 == 0) goto L29
            android.os.Bundle r2 = android.support.v4.media.session.MediaSessionCompat.b(r2)
        L29:
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L34
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L35
        L34:
            r10 = r0
        L35:
            if (r10 == 0) goto L4e
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L48
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L48
            r9 = r0
            goto L4f
        L48:
            r2.remove(r9)
            r2.remove(r11)
        L4e:
            r9 = r2
        L4f:
            if (r10 == 0) goto L52
            goto L5b
        L52:
            r2 = 23
            if (r1 < r2) goto L5a
            android.net.Uri r0 = r14.getMediaUri()
        L5a:
            r10 = r0
        L5b:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.n = r14
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.b(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f3g) + ", " + ((Object) this.f4h) + ", " + ((Object) this.f5i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.n;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f2f);
            builder.setTitle(this.f3g);
            builder.setSubtitle(this.f4h);
            builder.setDescription(this.f5i);
            builder.setIconBitmap(this.f6j);
            builder.setIconUri(this.f7k);
            Bundle bundle = this.f8l;
            if (i3 < 23 && this.f9m != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f9m);
            }
            builder.setExtras(bundle);
            if (i3 >= 23) {
                builder.setMediaUri(this.f9m);
            }
            mediaDescription = builder.build();
            this.n = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i2);
    }
}
