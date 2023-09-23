package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import f.h.b.a.i.s.d;
import f.h.b.a.i.s.g;
import f.h.b.a.i.s.l;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements d {
    @Override // f.h.b.a.i.s.d
    public l create(g gVar) {
        return new f.h.b.a.h.d(gVar.a(), gVar.d(), gVar.c());
    }
}
