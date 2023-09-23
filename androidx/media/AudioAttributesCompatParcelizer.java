package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import e.c0.b;
import java.util.Objects;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        b bVar = audioAttributesCompat.a;
        if (versionedParcel.i(1)) {
            bVar = versionedParcel.o();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) bVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        versionedParcel.p(1);
        versionedParcel.w(audioAttributesImpl);
    }
}
