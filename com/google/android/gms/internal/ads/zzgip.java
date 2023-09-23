package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgio;
import com.google.android.gms.internal.ads.zzgip;
import f.a.b.a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgip<MessageType extends zzgip<MessageType, BuilderType>, BuilderType extends zzgio<MessageType, BuilderType>> implements zzgly {
    public int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzar(Iterable iterable, List list) {
        zzgky.zze(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                int size2 = list.size();
                StringBuilder A = a.A("Element at index ");
                A.append(size2 - size);
                A.append(" is null.");
                String sb = A.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    }
                    list.remove(size3);
                }
                throw new NullPointerException(sb);
            }
            list.add(obj);
        }
    }

    public int zzap() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final zzgjg zzaq() {
        try {
            int zzav = zzav();
            zzgjg zzgjgVar = zzgjg.zzb;
            byte[] bArr = new byte[zzav];
            zzgjv zzG = zzgjv.zzG(bArr);
            zzaO(zzG);
            zzG.zzI();
            return new zzgjc(bArr);
        } catch (IOException e2) {
            throw new RuntimeException(a.q("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e2);
        }
    }

    public void zzas(int i2) {
        throw null;
    }

    public final void zzat(OutputStream outputStream) {
        zzgjv zzH = zzgjv.zzH(outputStream, zzgjv.zzB(zzav()));
        zzaO(zzH);
        zzH.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final byte[] zzau() {
        try {
            byte[] bArr = new byte[zzav()];
            zzgjv zzG = zzgjv.zzG(bArr);
            zzaO(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(a.q("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
        }
    }
}
