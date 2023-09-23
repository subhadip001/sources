package e.n.a;

import androidx.emoji2.text.EmojiCompatInitializer;
import e.n.a.h;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes.dex */
public class i extends h.AbstractC0050h {
    public final /* synthetic */ h.AbstractC0050h a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public i(EmojiCompatInitializer.b bVar, h.AbstractC0050h abstractC0050h, ThreadPoolExecutor threadPoolExecutor) {
        this.a = abstractC0050h;
        this.b = threadPoolExecutor;
    }

    @Override // e.n.a.h.AbstractC0050h
    public void a(Throwable th) {
        try {
            this.a.a(th);
        } finally {
            this.b.shutdown();
        }
    }

    @Override // e.n.a.h.AbstractC0050h
    public void b(n nVar) {
        try {
            this.a.b(nVar);
        } finally {
            this.b.shutdown();
        }
    }
}
