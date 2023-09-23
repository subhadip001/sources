package androidx.media;

import android.util.SparseIntArray;
import e.c0.b;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements b {
    public static final SparseIntArray b;
    public AudioAttributesImpl a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
            AudioAttributesImpl audioAttributesImpl = this.a;
            if (audioAttributesImpl == null) {
                return audioAttributesCompat.a == null;
            }
            return audioAttributesImpl.equals(audioAttributesCompat.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
