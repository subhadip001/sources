package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import f.h.b.b.z1.s;

/* loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public MediaCodecVideoDecoderException(Throwable th, s sVar, Surface surface) {
        super(th, sVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
