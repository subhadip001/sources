package f.n.a.v.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: CustomOptionsScreenView.java */
/* loaded from: classes2.dex */
public class g extends f.n.a.v.c.d.a<b> {

    /* renamed from: h  reason: collision with root package name */
    public View f7146h;

    /* renamed from: i  reason: collision with root package name */
    public View f7147i;

    /* renamed from: j  reason: collision with root package name */
    public View f7148j;

    /* renamed from: k  reason: collision with root package name */
    public View f7149k;

    /* renamed from: l  reason: collision with root package name */
    public View f7150l;

    /* renamed from: m  reason: collision with root package name */
    public AppCompatTextView f7151m;
    public AppCompatTextView n;
    public AppCompatTextView o;
    public AppCompatTextView p;
    public AppCompatTextView q;

    /* compiled from: CustomOptionsScreenView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Event f7152f;

        public a(Event event) {
            this.f7152f = event;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g gVar = g.this;
            Event event = this.f7152f;
            for (b bVar : gVar.c()) {
                switch (event.ordinal()) {
                    case 44:
                        bVar.e();
                        break;
                    case 45:
                        bVar.f();
                        break;
                    case 46:
                        bVar.c();
                        break;
                    case 47:
                        bVar.d();
                        break;
                    case 48:
                        bVar.a();
                        break;
                }
            }
        }
    }

    public g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_custom_options, viewGroup, false);
        this.f7146h = a(R.id.view_container_resolution);
        this.f7147i = a(R.id.view_container_codec);
        this.f7148j = a(R.id.view_container_quality);
        this.f7149k = a(R.id.view_container_frame_rate);
        this.f7150l = a(R.id.view_container_delete_audio);
        this.f7151m = (AppCompatTextView) a(R.id.tv_resolution);
        this.n = (AppCompatTextView) a(R.id.tv_codec);
        this.o = (AppCompatTextView) a(R.id.tv_quality);
        this.p = (AppCompatTextView) a(R.id.tv_frame_rate);
        this.q = (AppCompatTextView) a(R.id.preset_TV);
        d(this.f7146h, Event.ON_RESOLUTION_CONTAINER_CLICKED);
        d(this.f7147i, Event.ON_CODEC_CONTAINER_CLICKED);
        d(this.f7148j, Event.ON_QUALITY_CONTAINER_CLICKED);
        d(this.f7149k, Event.ON_FRAME_RATE_CONTAINER_CLICKED);
        d(this.f7150l, Event.ON_DELETE_AUDIO_CONTAINER_CLICKED);
    }

    public final void d(View view, Event event) {
        view.setOnClickListener(new a(event));
    }
}
