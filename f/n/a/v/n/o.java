package f.n.a.v.n;

import androidx.viewpager2.widget.ViewPager2;
import java.util.TimerTask;

/* compiled from: PurchaseScreenView.java */
/* loaded from: classes2.dex */
public class o extends TimerTask {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7349f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ p f7350g;

    /* compiled from: PurchaseScreenView.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int currentItem = o.this.f7350g.f7352h.getCurrentItem();
            o oVar = o.this;
            if (currentItem == oVar.f7349f - 1) {
                oVar.f7350g.f7352h.c(0, false);
                return;
            }
            ViewPager2 viewPager2 = oVar.f7350g.f7352h;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    }

    public o(p pVar, int i2) {
        this.f7350g = pVar;
        this.f7349f = i2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f7350g.f7352h.post(new a());
    }
}
