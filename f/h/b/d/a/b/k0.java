package f.h.b.d.a.b;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class k0 {
    public final f.h.b.d.a.e.u a;

    public k0(f.h.b.d.a.e.u uVar) {
        this.a = uVar;
    }

    public final InputStream a(int i2, String str, String str2, int i3) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) f.h.b.c.a.i(((u3) this.a.zza()).b(i2, str, str2, i3));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new y0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i2), str, str2, Integer.valueOf(i3)), i2);
        } catch (InterruptedException e2) {
            throw new y0("Extractor was interrupted while waiting for chunk file.", e2, i2);
        } catch (ExecutionException e3) {
            throw new y0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i2), str, str2, Integer.valueOf(i3)), e3, i2);
        }
    }
}
