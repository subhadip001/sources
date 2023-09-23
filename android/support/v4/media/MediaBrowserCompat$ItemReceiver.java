package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes.dex */
public class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public void b(int i2, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.b(bundle);
        }
        if (i2 == 0 && bundle != null && bundle.containsKey("media_item")) {
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                throw null;
            }
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
