package e.b.g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class c extends ContextWrapper {
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f1579d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f1580e;

    public c() {
        super(null);
    }

    public void a(Configuration configuration) {
        if (this.f1580e == null) {
            if (this.f1579d == null) {
                this.f1579d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1580e == null) {
            Configuration configuration = this.f1579d;
            if (configuration == null) {
                this.f1580e = super.getResources();
            } else {
                this.f1580e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f1580e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = 2131952218;
        }
        b();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.a != i2) {
            this.a = i2;
            b();
        }
    }

    public c(Context context, int i2) {
        super(context);
        this.a = i2;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}
