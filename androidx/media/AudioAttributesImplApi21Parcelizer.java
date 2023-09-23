package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) versionedParcel.m(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = versionedParcel.k(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        versionedParcel.p(1);
        versionedParcel.u(audioAttributes);
        int i2 = audioAttributesImplApi21.b;
        versionedParcel.p(2);
        versionedParcel.t(i2);
    }
}
