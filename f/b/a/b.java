package f.b.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.video_converter.video_compressor.R;
import f.n.a.v.u.d;
import f.n.a.v.u.h;
import java.util.ArrayList;

/* compiled from: VideoTimelineView.java */
/* loaded from: classes.dex */
public class b extends View {
    public static final Object V = new Object();
    public boolean A;
    public Rect B;
    public Rect C;
    public long D;
    public long E;
    public int F;
    public ArrayList<Bitmap> G;
    public boolean H;
    public Paint I;
    public Paint J;
    public Paint K;
    public Bitmap L;
    public Bitmap M;
    public RectF N;
    public RectF O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;

    /* renamed from: f  reason: collision with root package name */
    public long f3094f;

    /* renamed from: g  reason: collision with root package name */
    public float f3095g;

    /* renamed from: h  reason: collision with root package name */
    public float f3096h;

    /* renamed from: i  reason: collision with root package name */
    public float f3097i;

    /* renamed from: j  reason: collision with root package name */
    public Paint f3098j;

    /* renamed from: k  reason: collision with root package name */
    public Paint f3099k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f3100l;

    /* renamed from: m  reason: collision with root package name */
    public Paint f3101m;
    public boolean n;
    public boolean o;
    public float p;
    public MediaMetadataRetriever q;
    public c r;
    public ArrayList<Bitmap> s;
    public AsyncTask<Integer, Integer, Bitmap> t;
    public AsyncTask<Void, Void, Void> u;
    public long v;
    public int w;
    public int x;
    public int y;
    public float z;

    /* compiled from: VideoTimelineView.java */
    /* loaded from: classes.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ Uri a;

        public a(Uri uri) {
            this.a = uri;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            Object obj = b.V;
            synchronized (b.V) {
                b.this.q = new MediaMetadataRetriever();
                b bVar = b.this;
                bVar.f3097i = -1.0f;
                try {
                    bVar.q.setDataSource(bVar.getContext(), this.a);
                    String extractMetadata = b.this.q.extractMetadata(9);
                    b.this.f3094f = Long.parseLong(extractMetadata);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r1) {
            super.onPostExecute(r1);
            if (isCancelled()) {
                return;
            }
            b.this.invalidate();
        }
    }

    /* compiled from: VideoTimelineView.java */
    /* renamed from: f.b.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class AsyncTaskC0065b extends AsyncTask<Integer, Integer, Bitmap> {
        public int a = 0;

        public AsyncTaskC0065b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
            if (isCancelled() == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
            if (r2 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
            r14 = r13.b;
            r14 = android.graphics.Bitmap.createBitmap(r14.w, r14.x, r2.getConfig());
            r3 = new android.graphics.Canvas(r14);
            r4 = java.lang.Math.max(r13.b.w / r2.getWidth(), r13.b.x / r2.getHeight());
            r5 = (int) (r2.getWidth() * r4);
            r4 = (int) (r2.getHeight() * r4);
            r7 = new android.graphics.Rect(0, 0, r2.getWidth(), r2.getHeight());
            r8 = r13.b;
            r3.drawBitmap(r2, r7, new android.graphics.Rect((r8.w - r5) / 2, (r8.x - r4) / 2, r5, r4), (android.graphics.Paint) null);
            r2.recycle();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
            return r14;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ba -> B:22:0x00bb). Please submit an issue!!! */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Bitmap doInBackground(java.lang.Integer[] r14) {
            /*
                r13 = this;
                java.lang.Integer[] r14 = (java.lang.Integer[]) r14
                r0 = 0
                r14 = r14[r0]
                int r14 = r14.intValue()
                r13.a = r14
                boolean r14 = r13.isCancelled()
                r1 = 0
                if (r14 == 0) goto L14
                goto Lbd
            L14:
                java.lang.Object r14 = f.b.a.b.V     // Catch: java.lang.Exception -> Lbd
                java.lang.Object r14 = f.b.a.b.V     // Catch: java.lang.Exception -> Lbd
                monitor-enter(r14)     // Catch: java.lang.Exception -> Lbd
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lba
                r3 = 27
                r4 = 1000(0x3e8, double:4.94E-321)
                r6 = 2
                if (r2 < r3) goto L39
                f.b.a.b r2 = f.b.a.b.this     // Catch: java.lang.Throwable -> Lba
                android.media.MediaMetadataRetriever r7 = r2.q     // Catch: java.lang.Throwable -> Lba
                long r2 = r2.v     // Catch: java.lang.Throwable -> Lba
                int r8 = r13.a     // Catch: java.lang.Throwable -> Lba
                long r8 = (long) r8     // Catch: java.lang.Throwable -> Lba
                long r2 = r2 * r8
                long r8 = r2 * r4
                r10 = 2
                r11 = 250(0xfa, float:3.5E-43)
                r12 = 250(0xfa, float:3.5E-43)
                android.graphics.Bitmap r2 = r7.getScaledFrameAtTime(r8, r10, r11, r12)     // Catch: java.lang.Throwable -> Lba
                goto L4a
            L39:
                f.b.a.b r2 = f.b.a.b.this     // Catch: java.lang.Throwable -> Lba
                android.media.MediaMetadataRetriever r3 = r2.q     // Catch: java.lang.Throwable -> Lba
                long r7 = r2.v     // Catch: java.lang.Throwable -> Lba
                int r2 = r13.a     // Catch: java.lang.Throwable -> Lba
                long r9 = (long) r2     // Catch: java.lang.Throwable -> Lba
                long r7 = r7 * r9
                long r7 = r7 * r4
                android.graphics.Bitmap r2 = r3.getFrameAtTime(r7, r6)     // Catch: java.lang.Throwable -> Lba
            L4a:
                monitor-exit(r14)     // Catch: java.lang.Throwable -> Lb7
                boolean r14 = r13.isCancelled()     // Catch: java.lang.Exception -> Lb5
                if (r14 == 0) goto L52
                goto Lbd
            L52:
                if (r2 == 0) goto Lb5
                f.b.a.b r14 = f.b.a.b.this     // Catch: java.lang.Exception -> Lb5
                int r3 = r14.w     // Catch: java.lang.Exception -> Lb5
                int r14 = r14.x     // Catch: java.lang.Exception -> Lb5
                android.graphics.Bitmap$Config r4 = r2.getConfig()     // Catch: java.lang.Exception -> Lb5
                android.graphics.Bitmap r14 = android.graphics.Bitmap.createBitmap(r3, r14, r4)     // Catch: java.lang.Exception -> Lb5
                android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Exception -> Lb5
                r3.<init>(r14)     // Catch: java.lang.Exception -> Lb5
                f.b.a.b r4 = f.b.a.b.this     // Catch: java.lang.Exception -> Lb5
                int r4 = r4.w     // Catch: java.lang.Exception -> Lb5
                float r4 = (float) r4     // Catch: java.lang.Exception -> Lb5
                int r5 = r2.getWidth()     // Catch: java.lang.Exception -> Lb5
                float r5 = (float) r5     // Catch: java.lang.Exception -> Lb5
                float r4 = r4 / r5
                f.b.a.b r5 = f.b.a.b.this     // Catch: java.lang.Exception -> Lb5
                int r5 = r5.x     // Catch: java.lang.Exception -> Lb5
                float r5 = (float) r5     // Catch: java.lang.Exception -> Lb5
                int r7 = r2.getHeight()     // Catch: java.lang.Exception -> Lb5
                float r7 = (float) r7     // Catch: java.lang.Exception -> Lb5
                float r5 = r5 / r7
                float r4 = java.lang.Math.max(r4, r5)     // Catch: java.lang.Exception -> Lb5
                int r5 = r2.getWidth()     // Catch: java.lang.Exception -> Lb5
                float r5 = (float) r5     // Catch: java.lang.Exception -> Lb5
                float r5 = r5 * r4
                int r5 = (int) r5     // Catch: java.lang.Exception -> Lb5
                int r7 = r2.getHeight()     // Catch: java.lang.Exception -> Lb5
                float r7 = (float) r7     // Catch: java.lang.Exception -> Lb5
                float r7 = r7 * r4
                int r4 = (int) r7     // Catch: java.lang.Exception -> Lb5
                android.graphics.Rect r7 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lb5
                int r8 = r2.getWidth()     // Catch: java.lang.Exception -> Lb5
                int r9 = r2.getHeight()     // Catch: java.lang.Exception -> Lb5
                r7.<init>(r0, r0, r8, r9)     // Catch: java.lang.Exception -> Lb5
                android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lb5
                f.b.a.b r8 = f.b.a.b.this     // Catch: java.lang.Exception -> Lb5
                int r9 = r8.w     // Catch: java.lang.Exception -> Lb5
                int r9 = r9 - r5
                int r9 = r9 / r6
                int r8 = r8.x     // Catch: java.lang.Exception -> Lb5
                int r8 = r8 - r4
                int r8 = r8 / r6
                r0.<init>(r9, r8, r5, r4)     // Catch: java.lang.Exception -> Lb5
                r3.drawBitmap(r2, r7, r0, r1)     // Catch: java.lang.Exception -> Lb5
                r2.recycle()     // Catch: java.lang.Exception -> Lb5
                r1 = r14
                goto Lbd
            Lb5:
                r1 = r2
                goto Lbd
            Lb7:
                r0 = move-exception
                r1 = r2
                goto Lbb
            Lba:
                r0 = move-exception
            Lbb:
                monitor-exit(r14)     // Catch: java.lang.Throwable -> Lba
                throw r0     // Catch: java.lang.Exception -> Lbd
            Lbd:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f.b.a.b.AsyncTaskC0065b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (isCancelled()) {
                return;
            }
            b.this.s.add(bitmap2);
            b.this.invalidate();
            int i2 = this.a;
            b bVar = b.this;
            if (i2 < bVar.y) {
                bVar.j(i2 + 1);
            } else {
                bVar.H = true;
            }
        }
    }

    /* compiled from: VideoTimelineView.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    public b(Context context) {
        super(context);
        this.f3095g = 0.0f;
        this.f3096h = 1.0f;
        this.f3097i = -1.0f;
        this.s = new ArrayList<>();
        this.z = 1.0f;
        this.D = 0L;
        this.E = 0L;
        this.F = 1;
        this.G = new ArrayList<>();
        this.I = new Paint(1);
        this.J = new Paint(1);
        this.K = new Paint(4);
        this.N = null;
        this.O = null;
        f.b.a.a.a(24.0f);
        this.P = 120;
        this.Q = 20;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = false;
        this.U = false;
        f.b.a.a.a = context.getResources().getDisplayMetrics().density;
        Paint paint = new Paint(1);
        this.f3098j = paint;
        paint.setColor(-1);
        Paint paint2 = new Paint();
        this.f3099k = paint2;
        paint2.setColor(2130706432);
        Paint paint3 = new Paint();
        this.f3100l = paint3;
        paint3.setColor(-16711936);
        this.f3100l.setStrokeWidth(f.b.a.a.a * 3.0f);
        this.f3100l.setStrokeJoin(Paint.Join.ROUND);
        this.f3100l.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f3101m = new Paint();
        this.I.setColor(Color.parseColor("#E06A50"));
        this.I.setStrokeWidth(f.b.a.a.a * 3.0f);
        this.I.setStyle(Paint.Style.STROKE);
        this.I.setStrokeCap(Paint.Cap.ROUND);
        this.f3101m.setColor(-16777216);
        this.J.setColor(-16711936);
        this.L = f(context, R.drawable.ic_trim_arrow_l);
        this.M = f(context, R.drawable.ic_trim_arrow_r);
    }

    public static Bitmap f(Context context, int i2) {
        Drawable drawable = e.i.c.a.getDrawable(context, i2);
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static boolean g(long j2, long j3, float f2, float f3) {
        double d2 = j2 * 1.0d;
        return ((long) (d2 * ((double) f3))) - ((long) (((double) f2) * d2)) >= j3;
    }

    public final void a(Canvas canvas, int i2, int i3, int i4) {
        if (this.F == 1) {
            e(canvas, i2, i3, i4);
            c(canvas, i2, i3, i4);
            return;
        }
        d(canvas, i2, i3, i4);
        b(canvas, i2, i3, i4);
    }

    public final void b(Canvas canvas, int i2, int i3, int i4) {
        float f2 = i4 + 2;
        canvas.drawRect(0.0f, f2, i2, (getMeasuredHeight() - i4) - 2, this.I);
        canvas.drawRect(i3, f2, getMeasuredWidth(), (getMeasuredHeight() - i4) - 2, this.I);
        int measuredHeight = (getMeasuredHeight() - (i4 * 2)) / 2;
        int i5 = this.Q;
        this.N = new RectF(i2 - i5, measuredHeight - i5, i2 + i5, i5 + measuredHeight);
        int i6 = this.Q;
        this.O = new RectF(i3 - i6, measuredHeight - i6, i3 + i6, measuredHeight + i6);
        canvas.drawBitmap(this.L, (Rect) null, this.N, this.K);
        canvas.drawBitmap(this.M, (Rect) null, this.O, this.K);
    }

    public final void c(Canvas canvas, int i2, int i3, int i4) {
        canvas.drawRect(i2, i4 + 2, i3, (getMeasuredHeight() - i4) - 2, this.I);
        int measuredHeight = (getMeasuredHeight() - (i4 * 2)) / 2;
        int i5 = this.Q;
        this.N = new RectF(i2 - i5, measuredHeight - i5, i2 + i5, i5 + measuredHeight);
        int i6 = this.Q;
        this.O = new RectF(i3 - i6, measuredHeight - i6, i3 + i6, measuredHeight + i6);
        canvas.drawBitmap(this.M, (Rect) null, this.N, this.K);
        canvas.drawBitmap(this.L, (Rect) null, this.O, this.K);
    }

    public final void d(Canvas canvas, int i2, int i3, int i4) {
        canvas.drawRect(i2, i4, i3, getMeasuredHeight() - i4, this.f3099k);
    }

    public final void e(Canvas canvas, int i2, int i3, int i4) {
        float f2 = i4;
        canvas.drawRect(0.0f, f2, i2, getMeasuredHeight() - i4, this.f3099k);
        canvas.drawRect(i3, f2, getMeasuredWidth(), getMeasuredHeight() - i4, this.f3099k);
    }

    public float getLeftProgress() {
        return this.f3095g;
    }

    public float getRightProgress() {
        return this.f3096h;
    }

    public boolean h(Float f2) {
        if (this.n) {
            c cVar = this.r;
            if (cVar != null) {
                ((h) cVar).a();
            }
            this.n = false;
            invalidate();
            return true;
        } else if (this.o) {
            c cVar2 = this.r;
            if (cVar2 != null) {
                ((h) cVar2).a();
            }
            this.o = false;
            invalidate();
            return true;
        } else {
            if (this.r != null) {
                int leftProgress = (int) (getLeftProgress() * getMeasuredWidth());
                int rightProgress = (int) (getRightProgress() * getMeasuredWidth());
                if (this.F == 1) {
                    if (f2.floatValue() >= leftProgress && f2.floatValue() < rightProgress) {
                        float floatValue = f2.floatValue() / getMeasuredWidth();
                        ((h) this.r).b(floatValue * 100.0f);
                    }
                } else if (f2.floatValue() <= leftProgress || f2.floatValue() >= rightProgress) {
                    float floatValue2 = f2.floatValue() / getMeasuredWidth();
                    ((h) this.r).b(floatValue2 * 100.0f);
                }
            }
            return false;
        }
    }

    public void i() {
        this.f3095g = 0.0f;
        this.f3096h = 1.0f;
        AsyncTask<Integer, Integer, Bitmap> asyncTask = this.t;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.t = null;
        }
        AsyncTask<Void, Void, Void> asyncTask2 = this.u;
        if (asyncTask2 != null) {
            asyncTask2.cancel(true);
            this.u = null;
        }
        synchronized (V) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.q;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.q = null;
                }
            } catch (Exception unused) {
            }
        }
        int i2 = 0;
        if (!this.G.isEmpty()) {
            while (i2 < this.G.size()) {
                Bitmap bitmap = this.G.get(i2);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                i2++;
            }
        } else {
            while (i2 < this.s.size()) {
                Bitmap bitmap2 = this.s.get(i2);
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                i2++;
            }
        }
        this.G.clear();
        this.s.clear();
    }

    public final void j(int i2) {
        if (this.q == null) {
            return;
        }
        if (i2 == 0) {
            if (this.A) {
                int i3 = this.P;
                this.w = i3;
                this.x = i3;
                this.y = Math.max(1, (int) Math.ceil((getMeasuredWidth() - f.b.a.a.a(16.0f)) / (this.x / 2.0f)));
            } else {
                this.x = this.P;
                this.y = Math.max(1, (getMeasuredWidth() - f.b.a.a.a(16.0f)) / this.x);
                this.w = (int) Math.ceil((getMeasuredWidth() - f.b.a.a.a(16.0f)) / this.y);
            }
            this.v = this.f3094f / this.y;
            if (!this.G.isEmpty()) {
                float size = this.G.size() / this.y;
                float f2 = 0.0f;
                for (int i4 = 0; i4 < this.y; i4++) {
                    this.s.add(this.G.get((int) f2));
                    f2 += size;
                }
                return;
            }
        }
        this.H = false;
        AsyncTaskC0065b asyncTaskC0065b = new AsyncTaskC0065b();
        this.t = asyncTaskC0065b;
        asyncTaskC0065b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i2), null, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        float measuredWidth2 = getMeasuredWidth();
        int i2 = (int) (this.f3095g * measuredWidth2);
        int i3 = (int) (measuredWidth2 * this.f3096h);
        if (this.s.isEmpty() && this.t == null) {
            j(0);
        }
        if (!this.s.isEmpty()) {
            if (!this.H) {
                canvas.drawRect(0.0f, 0, getMeasuredWidth(), getMeasuredHeight() - 0, this.f3101m);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.s.size(); i5++) {
                Bitmap bitmap = this.s.get(i5);
                if (bitmap != null) {
                    boolean z = this.A;
                    int i6 = this.w;
                    if (z) {
                        i6 /= 2;
                    }
                    int i7 = i6 * i4;
                    if (z) {
                        this.C.set(i7, 0, f.b.a.a.a(28.0f) + i7, f.b.a.a.a(32.0f) + 0);
                        canvas.drawBitmap(bitmap, this.B, this.C, (Paint) null);
                    } else {
                        canvas.drawBitmap(bitmap, i7, 0, (Paint) null);
                    }
                }
                i4++;
            }
        }
        float a2 = (f.b.a.a.a(0) + measuredWidth) * this.f3097i;
        canvas.drawLine(a2, 0.0f, a2, getMeasuredHeight(), this.f3100l);
        a(canvas, i2, i3, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        double d2;
        double d3;
        float f2;
        if (motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int measuredWidth = getMeasuredWidth() - f.b.a.a.a(24.0f);
        float f3 = measuredWidth;
        int a2 = f.b.a.a.a(12.0f) + ((int) (this.f3095g * f3));
        int a3 = f.b.a.a.a(12.0f) + ((int) (f3 * this.f3096h));
        if (motionEvent.getAction() == 0) {
            Integer valueOf = Integer.valueOf(a2);
            Integer valueOf2 = Integer.valueOf(a3);
            Float valueOf3 = Float.valueOf(x);
            Float valueOf4 = Float.valueOf(y);
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.q == null) {
                return false;
            }
            this.R = valueOf3.floatValue();
            this.S = valueOf4.floatValue();
            this.T = false;
            this.U = false;
            f.b.a.a.a(24.0f);
            this.N = new RectF(valueOf.intValue() - (this.Q * 2), 0.0f, valueOf.intValue() + this.Q, getMeasuredHeight());
            this.O = new RectF(valueOf2.intValue() - this.Q, 0.0f, (this.Q * 2) + valueOf2.intValue(), getMeasuredHeight());
            StringBuilder A = f.a.b.a.a.A("onTouchDownTEST: L->");
            A.append(this.N);
            A.append(" ");
            A.append(this.N.contains(valueOf3.floatValue(), valueOf4.floatValue()));
            A.append(" R->");
            A.append(this.O);
            A.append(" ");
            A.append(this.O.contains(valueOf3.floatValue(), valueOf4.floatValue()));
            A.append(" xy");
            A.append(valueOf3);
            A.append(" ");
            A.append(valueOf4);
            Log.d("TAG", A.toString());
            if (this.N.contains(valueOf3.floatValue(), valueOf4.floatValue()) && this.O.contains(valueOf3.floatValue(), valueOf4.floatValue())) {
                this.U = true;
            }
            StringBuilder A2 = f.a.b.a.a.A("onTouchDownTEST: L->");
            A2.append(this.N);
            A2.append(" ");
            A2.append(this.N.contains(valueOf3.floatValue(), valueOf4.floatValue()));
            A2.append(" R->");
            A2.append(this.O);
            A2.append(" ");
            A2.append(this.O.contains(valueOf3.floatValue(), valueOf4.floatValue()));
            A2.append(" xy");
            A2.append(valueOf3);
            A2.append(" ");
            A2.append(valueOf4);
            Log.d("TAG", A2.toString());
            if (this.N.contains(valueOf3.floatValue(), valueOf4.floatValue())) {
                c cVar = this.r;
                if (cVar != null) {
                    h hVar = (h) cVar;
                }
                this.n = true;
                this.p = (int) (valueOf3.floatValue() - valueOf.intValue());
                invalidate();
            } else if (this.O.contains(valueOf3.floatValue(), valueOf4.floatValue())) {
                c cVar2 = this.r;
                if (cVar2 != null) {
                    h hVar2 = (h) cVar2;
                }
                this.o = true;
                this.p = (int) (valueOf3.floatValue() - valueOf2.intValue());
                invalidate();
            }
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                Integer valueOf5 = Integer.valueOf(a2);
                Integer valueOf6 = Integer.valueOf(a3);
                Float valueOf7 = Float.valueOf(x);
                Float valueOf8 = Float.valueOf(y);
                Integer valueOf9 = Integer.valueOf(measuredWidth);
                boolean z = this.T;
                if (!z) {
                    float floatValue = valueOf7.floatValue();
                    float floatValue2 = valueOf8.floatValue();
                    float f4 = this.R - floatValue;
                    float f5 = this.S - floatValue2;
                    this.T = (((float) Math.sqrt((double) ((f5 * f5) + (f4 * f4)))) >= 2.0f) | z;
                } else {
                    if (this.U) {
                        Log.d("TAG", "onActionMove: " + valueOf5 + " " + valueOf6 + " " + valueOf7);
                        this.n = false;
                        this.o = false;
                        if (valueOf7.floatValue() < this.R) {
                            this.n = true;
                            this.p = (int) (f2 - valueOf5.intValue());
                        } else {
                            this.o = true;
                            this.p = (int) (f2 - valueOf6.intValue());
                        }
                        this.U = false;
                    }
                    if (this.n) {
                        float intValue = (Integer.valueOf((int) (valueOf7.floatValue() - this.p)).intValue() - f.b.a.a.a(12.0f)) / valueOf9.intValue();
                        this.f3095g = intValue;
                        long j2 = this.F == 1 ? this.D : this.E;
                        if (intValue < 0.0f) {
                            this.f3095g = 0.0f;
                        }
                        float f6 = this.f3096h;
                        float f7 = this.f3095g;
                        float f8 = this.z;
                        if (f6 - f7 > f8) {
                            this.f3096h = f7 + f8;
                        } else if (!g(this.f3094f, j2, f7, f6)) {
                            this.f3095g = (float) (((((long) (this.f3096h * d3)) - j2) * 1.0d) / (this.f3094f * 1.0d));
                        }
                        if (this.f3095g < 0.0f) {
                            this.f3095g = 0.0f;
                        }
                        if (this.F == 2) {
                            this.f3095g = Math.max((float) ((100 * 1.0d) / (this.f3094f * 1.0d)), this.f3095g);
                        }
                        c cVar3 = this.r;
                        if (cVar3 != null) {
                            h hVar3 = (h) cVar3;
                            Log.d("customTag", "onLeftProgressChanged: " + this.f3095g);
                            for (d dVar : hVar3.a.c()) {
                                dVar.e(hVar3.a.t.getLeftProgress() * 100.0f, hVar3.a.t.getRightProgress() * 100.0f, true);
                            }
                        }
                        invalidate();
                    } else if (!this.o) {
                        return false;
                    } else {
                        float intValue2 = (Integer.valueOf((int) (valueOf7.floatValue() - this.p)).intValue() - f.b.a.a.a(12.0f)) / valueOf9.intValue();
                        this.f3096h = intValue2;
                        long j3 = this.F == 1 ? this.D : this.E;
                        if (intValue2 > 1.0f) {
                            this.f3096h = 1.0f;
                        }
                        float f9 = this.f3096h;
                        float f10 = this.f3095g;
                        float f11 = this.z;
                        if (f9 - f10 > f11) {
                            this.f3095g = f9 - f11;
                        } else if (!g(this.f3094f, j3, f10, f9)) {
                            this.f3096h = (float) (((((long) (this.f3095g * d2)) + j3) * 1.0d) / (this.f3094f * 1.0d));
                        }
                        if (this.F == 2) {
                            this.f3096h = Math.min(1.0f - ((float) ((100 * 1.0d) / (this.f3094f * 1.0d))), this.f3096h);
                        }
                        if (this.f3096h > 1.0f) {
                            this.f3096h = 1.0f;
                        }
                        c cVar4 = this.r;
                        if (cVar4 != null) {
                            h hVar4 = (h) cVar4;
                            for (d dVar2 : hVar4.a.c()) {
                                dVar2.e(hVar4.a.t.getLeftProgress() * 100.0f, hVar4.a.t.getRightProgress() * 100.0f, false);
                            }
                        }
                        invalidate();
                    }
                }
                return true;
            }
            return false;
        } else {
            return h(Float.valueOf(x));
        }
    }

    public void setColor(int i2) {
        this.f3098j.setColor(i2);
        invalidate();
    }

    public void setCurrentMode(int i2) {
        this.F = i2;
        invalidate();
    }

    public void setCurrentProgress(float f2) {
        this.f3097i = f2;
        invalidate();
    }

    public void setCutTimeDif(long j2) {
        this.E = j2;
    }

    public void setDelegate(c cVar) {
        this.r = cVar;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        this.G.clear();
        this.G.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f2) {
        this.z = f2;
        float f3 = this.f3096h;
        float f4 = this.f3095g;
        if (f3 - f4 > f2) {
            this.f3096h = f4 + f2;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f2) {
    }

    public void setProgressLeft(float f2) {
        this.f3095g = f2;
    }

    public void setProgressRight(float f2) {
        this.f3096h = f2;
    }

    public void setRoundFrames(boolean z) {
        this.A = z;
        if (z) {
            this.B = new Rect(f.b.a.a.a(14.0f), f.b.a.a.a(14.0f), f.b.a.a.a(42.0f), f.b.a.a.a(42.0f));
            this.C = new Rect();
        }
    }

    public void setTimelineHeight(int i2) {
        this.P = i2;
        invalidate();
    }

    public void setTrimTimeDif(long j2) {
        this.D = j2;
    }

    public void setVideoPath(Uri uri) {
        i();
        a aVar = new a(uri);
        this.u = aVar;
        aVar.execute(new Void[0]);
    }
}
