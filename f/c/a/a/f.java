package f.c.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.TextSwitcher;
import java.util.Arrays;

/* compiled from: DurationAnimator.kt */
/* loaded from: classes.dex */
public final class f extends i.l.b.j implements i.l.a.a<Handler> {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f3106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(0);
        this.f3106g = gVar;
    }

    @Override // i.l.a.a
    public Handler c() {
        Looper mainLooper = Looper.getMainLooper();
        final g gVar = this.f3106g;
        return new Handler(mainLooper, new Handler.Callback() { // from class: f.c.a.a.b
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                g gVar2 = g.this;
                i.l.b.i.e(gVar2, "this$0");
                i.l.b.i.e(message, "it");
                TextSwitcher textSwitcher = gVar2.a;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(gVar2.f3108e)}, 1));
                i.l.b.i.d(format, "format(format, *args)");
                textSwitcher.setText(format);
                if (gVar2.f3108e == gVar2.f3109f) {
                    i.l.a.a<i.h> aVar = gVar2.f3107d;
                    if (aVar != null) {
                        aVar.c();
                    }
                } else {
                    gVar2.a().sendEmptyMessageDelayed(0, gVar2.b);
                }
                int i2 = gVar2.f3108e - 1;
                gVar2.f3108e = i2;
                i.l.a.l<Integer, i.h> lVar = gVar2.c;
                if (lVar != null) {
                    lVar.b(Integer.valueOf(i2));
                }
                return true;
            }
        });
    }
}
