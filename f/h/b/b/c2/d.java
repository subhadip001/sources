package f.h.b.b.c2;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes.dex */
public abstract class d extends f.h.b.b.v1.g<i, j, SubtitleDecoderException> implements g {
    public d(String str) {
        super(new i[2], new j[2]);
        f.h.b.b.e2.j.g(this.f4632g == this.f4630e.length);
        for (DecoderInputBuffer decoderInputBuffer : this.f4630e) {
            decoderInputBuffer.q(1024);
        }
    }

    @Override // f.h.b.b.c2.g
    public void a(long j2) {
    }

    @Override // f.h.b.b.v1.g
    public SubtitleDecoderException e(i iVar, j jVar, boolean z) {
        i iVar2 = iVar;
        j jVar2 = jVar;
        try {
            ByteBuffer byteBuffer = iVar2.f752h;
            Objects.requireNonNull(byteBuffer);
            jVar2.q(iVar2.f754j, j(byteBuffer.array(), byteBuffer.limit(), z), iVar2.n);
            jVar2.f4610f &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return null;
        } catch (SubtitleDecoderException e2) {
            return e2;
        }
    }

    public abstract f j(byte[] bArr, int i2, boolean z);
}
