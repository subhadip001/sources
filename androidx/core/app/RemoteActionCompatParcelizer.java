package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import e.c0.b;
import java.util.Objects;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        b bVar = remoteActionCompat.mIcon;
        if (versionedParcel.i(1)) {
            bVar = versionedParcel.o();
        }
        remoteActionCompat.mIcon = (IconCompat) bVar;
        CharSequence charSequence = remoteActionCompat.mTitle;
        if (versionedParcel.i(2)) {
            charSequence = versionedParcel.h();
        }
        remoteActionCompat.mTitle = charSequence;
        CharSequence charSequence2 = remoteActionCompat.mContentDescription;
        if (versionedParcel.i(3)) {
            charSequence2 = versionedParcel.h();
        }
        remoteActionCompat.mContentDescription = charSequence2;
        remoteActionCompat.mActionIntent = (PendingIntent) versionedParcel.m(remoteActionCompat.mActionIntent, 4);
        boolean z = remoteActionCompat.mEnabled;
        if (versionedParcel.i(5)) {
            z = versionedParcel.f();
        }
        remoteActionCompat.mEnabled = z;
        boolean z2 = remoteActionCompat.mShouldShowIcon;
        if (versionedParcel.i(6)) {
            z2 = versionedParcel.f();
        }
        remoteActionCompat.mShouldShowIcon = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        IconCompat iconCompat = remoteActionCompat.mIcon;
        versionedParcel.p(1);
        versionedParcel.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.mTitle;
        versionedParcel.p(2);
        versionedParcel.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.mContentDescription;
        versionedParcel.p(3);
        versionedParcel.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.mActionIntent;
        versionedParcel.p(4);
        versionedParcel.u(pendingIntent);
        boolean z = remoteActionCompat.mEnabled;
        versionedParcel.p(5);
        versionedParcel.q(z);
        boolean z2 = remoteActionCompat.mShouldShowIcon;
        versionedParcel.p(6);
        versionedParcel.q(z2);
    }
}
