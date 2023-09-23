package com.google.firebase.inappmessaging.display.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.load.DecodeFormat;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import com.google.firebase.inappmessaging.display.internal.injection.scopes.FirebaseAppScope;
import f.e.a.g;
import f.e.a.h;
import f.e.a.l.r.i;
import f.e.a.l.r.j;
import f.e.a.l.s.c.k;
import f.e.a.p.j.c;
import f.e.a.p.k.b;
import f.e.a.r.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@FirebaseAppScope
/* loaded from: classes2.dex */
public class FiamImageLoader {
    private final h requestManager;
    private final Map<String, Set<c>> tags = new HashMap();

    /* loaded from: classes2.dex */
    public static abstract class Callback extends c<Drawable> {
        private ImageView imageView;

        private void setImage(Drawable drawable) {
            ImageView imageView = this.imageView;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }

        public abstract void onError(Exception exc);

        @Override // f.e.a.p.j.h
        public void onLoadCleared(Drawable drawable) {
            Logging.logd("Downloading Image Cleared");
            setImage(drawable);
            onSuccess();
        }

        @Override // f.e.a.p.j.c, f.e.a.p.j.h
        public void onLoadFailed(Drawable drawable) {
            Logging.logd("Downloading Image Failed");
            setImage(drawable);
            onError(new Exception("Image loading failed!"));
        }

        @Override // f.e.a.p.j.h
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, b bVar) {
            onResourceReady((Drawable) obj, (b<? super Drawable>) bVar);
        }

        public abstract void onSuccess();

        public void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        public void onResourceReady(Drawable drawable, b<? super Drawable> bVar) {
            Logging.logd("Downloading Image Success!!!");
            setImage(drawable);
            onSuccess();
        }
    }

    /* loaded from: classes2.dex */
    public class FiamImageRequestCreator {
        private final g<Drawable> requestBuilder;
        private String tag;
        private Callback target;

        public FiamImageRequestCreator(g<Drawable> gVar) {
            this.requestBuilder = gVar;
        }

        private void checkAndTag() {
            Set hashSet;
            if (this.target == null || TextUtils.isEmpty(this.tag)) {
                return;
            }
            synchronized (FiamImageLoader.this.tags) {
                if (FiamImageLoader.this.tags.containsKey(this.tag)) {
                    hashSet = (Set) FiamImageLoader.this.tags.get(this.tag);
                } else {
                    hashSet = new HashSet();
                    FiamImageLoader.this.tags.put(this.tag, hashSet);
                }
                if (!hashSet.contains(this.target)) {
                    hashSet.add(this.target);
                }
            }
        }

        public void into(ImageView imageView, Callback callback) {
            Logging.logd("Downloading Image Callback : " + callback);
            callback.setImageView(imageView);
            g<Drawable> gVar = this.requestBuilder;
            gVar.x(callback, null, gVar, e.a);
            this.target = callback;
            checkAndTag();
        }

        public FiamImageRequestCreator placeholder(int i2) {
            this.requestBuilder.i(i2);
            Logging.logd("Downloading Image Placeholder : " + i2);
            return this;
        }

        public FiamImageRequestCreator tag(Class cls) {
            this.tag = cls.getSimpleName();
            checkAndTag();
            return this;
        }
    }

    public FiamImageLoader(h hVar) {
        this.requestManager = hVar;
    }

    public void cancelTag(Class cls) {
        String simpleName = cls.getSimpleName();
        synchronized (simpleName) {
            if (this.tags.containsKey(simpleName)) {
                for (c cVar : this.tags.get(simpleName)) {
                    if (cVar != null) {
                        this.requestManager.b(cVar);
                    }
                }
            }
        }
    }

    public boolean containsTag(String str) {
        Map<String, Set<c>> map = this.tags;
        return map != null && map.containsKey(str) && this.tags.get(str) != null && this.tags.get(str).size() > 0;
    }

    public FiamImageRequestCreator load(String str) {
        Logging.logd("Starting Downloading Image : " + str);
        j.a aVar = new j.a();
        j.b bVar = new j.b("image/*");
        aVar.a();
        List<i> list = aVar.b.get(DefaultSettingsSpiCall.HEADER_ACCEPT);
        if (list == null) {
            list = new ArrayList<>();
            aVar.b.put(DefaultSettingsSpiCall.HEADER_ACCEPT, list);
        }
        list.add(bVar);
        aVar.a = true;
        g<Drawable> z = this.requestManager.a().z(new f.e.a.l.r.g(str, new j(aVar.b)));
        DecodeFormat decodeFormat = DecodeFormat.PREFER_ARGB_8888;
        Objects.requireNonNull(z);
        Objects.requireNonNull(decodeFormat, "Argument must not be null");
        return new FiamImageRequestCreator((g) z.l(k.f3456f, decodeFormat).l(f.e.a.l.s.g.i.a, decodeFormat));
    }
}
