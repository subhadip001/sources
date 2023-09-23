package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import f.h.b.b.g2.t;
import f.h.b.b.y1.w;

/* loaded from: classes.dex */
public abstract class TagPayloadReader {
    public final w a;

    /* loaded from: classes.dex */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    public TagPayloadReader(w wVar) {
        this.a = wVar;
    }

    public final boolean a(t tVar, long j2) {
        return b(tVar) && c(tVar, j2);
    }

    public abstract boolean b(t tVar);

    public abstract boolean c(t tVar, long j2);
}
