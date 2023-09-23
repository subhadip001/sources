package f.h.b.b.a2.j;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import f.h.b.b.a2.d;
import f.h.b.b.a2.g;
import f.h.b.b.g2.b0;
import f.h.c.a.c;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: IcyDecoder.java */
/* loaded from: classes.dex */
public final class a extends g {
    public static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder a = c.c.newDecoder();
    public final CharsetDecoder b = c.b.newDecoder();

    @Override // f.h.b.b.a2.g
    public Metadata b(d dVar, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.b.decode(byteBuffer).toString();
                this.b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = c.matcher(str);
        String str3 = null;
        for (int i2 = 0; matcher.find(i2); i2 = matcher.end()) {
            String I = b0.I(matcher.group(1));
            String group = matcher.group(2);
            if (I != null) {
                if (I.equals("streamurl")) {
                    str3 = group;
                } else if (I.equals("streamtitle")) {
                    str2 = group;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}
