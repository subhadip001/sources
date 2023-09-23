package androidx.media;

import android.media.AudioAttributes;
import f.a.b.a.a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.a.equals(((AudioAttributesImplApi21) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder A = a.A("AudioAttributesCompat: audioattributes=");
        A.append(this.a);
        return A.toString();
    }
}
