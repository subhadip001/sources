package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public void b(int i2, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.b(bundle);
        }
        if (i2 == 0 && bundle != null && bundle.containsKey("search_results")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            Objects.requireNonNull(parcelableArray);
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
            throw null;
        }
        throw null;
    }
}
