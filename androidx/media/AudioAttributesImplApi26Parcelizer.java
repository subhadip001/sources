package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) versionedParcel.m(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = versionedParcel.k(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        AudioAttributes audioAttributes = audioAttributesImplApi26.a;
        versionedParcel.p(1);
        versionedParcel.u(audioAttributes);
        int i2 = audioAttributesImplApi26.b;
        versionedParcel.p(2);
        versionedParcel.t(i2);
    }
}
