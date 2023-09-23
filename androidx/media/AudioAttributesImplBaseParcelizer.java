package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = versionedParcel.k(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = versionedParcel.k(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = versionedParcel.k(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.f455d = versionedParcel.k(audioAttributesImplBase.f455d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        int i2 = audioAttributesImplBase.a;
        versionedParcel.p(1);
        versionedParcel.t(i2);
        int i3 = audioAttributesImplBase.b;
        versionedParcel.p(2);
        versionedParcel.t(i3);
        int i4 = audioAttributesImplBase.c;
        versionedParcel.p(3);
        versionedParcel.t(i4);
        int i5 = audioAttributesImplBase.f455d;
        versionedParcel.p(4);
        versionedParcel.t(i5);
    }
}
