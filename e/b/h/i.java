package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import com.video_converter.video_compressor.R;
import e.b.h.p0;

/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class i {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static i c;
    public p0 a;

    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public class a implements p0.f {
        public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1788d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1789e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1790f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i2) {
            int c = u0.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{u0.b, u0.f1846d, u0.c, u0.f1848f}, new int[]{u0.b(context, R.attr.colorButtonNormal), e.i.d.a.b(c, i2), e.i.d.a.b(c, i2), i2});
        }

        public final LayerDrawable c(p0 p0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable f2 = p0Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f3 = p0Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) f2;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f2.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((f3 instanceof BitmapDrawable) && f3.getIntrinsicWidth() == dimensionPixelSize && f3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public ColorStateList d(Context context, int i2) {
            if (i2 == R.drawable.abc_edit_text_material) {
                return e.i.c.a.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                return e.i.c.a.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i2 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d2 = u0.d(context, R.attr.colorSwitchThumbNormal);
                if (d2 != null && d2.isStateful()) {
                    iArr[0] = u0.b;
                    iArr2[0] = d2.getColorForState(iArr[0], 0);
                    iArr[1] = u0.f1847e;
                    iArr2[1] = u0.c(context, R.attr.colorControlActivated);
                    iArr[2] = u0.f1848f;
                    iArr2[2] = d2.getDefaultColor();
                } else {
                    iArr[0] = u0.b;
                    iArr2[0] = u0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = u0.f1847e;
                    iArr2[1] = u0.c(context, R.attr.colorControlActivated);
                    iArr[2] = u0.f1848f;
                    iArr2[2] = u0.c(context, R.attr.colorSwitchThumbNormal);
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, u0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i2 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i2 == R.drawable.abc_btn_colored_material) {
                    return b(context, u0.c(context, R.attr.colorAccent));
                }
                if (i2 != R.drawable.abc_spinner_mtrl_am_alpha && i2 != R.drawable.abc_spinner_textfield_background_material) {
                    if (a(this.b, i2)) {
                        return u0.d(context, R.attr.colorControlNormal);
                    }
                    if (a(this.f1789e, i2)) {
                        return e.i.c.a.getColorStateList(context, R.color.abc_tint_default);
                    }
                    if (a(this.f1790f, i2)) {
                        return e.i.c.a.getColorStateList(context, R.color.abc_tint_btn_checkable);
                    }
                    if (i2 == R.drawable.abc_seekbar_thumb_material) {
                        return e.i.c.a.getColorStateList(context, R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }
                return e.i.c.a.getColorStateList(context, R.color.abc_tint_spinner);
            }
        }

        public final void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.b;
            }
            drawable.setColorFilter(i.c(i2, mode));
        }
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (c == null) {
                e();
            }
            iVar = c;
        }
        return iVar;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter h2;
        synchronized (i.class) {
            h2 = p0.h(i2, mode);
        }
        return h2;
    }

    public static synchronized void e() {
        synchronized (i.class) {
            if (c == null) {
                i iVar = new i();
                c = iVar;
                iVar.a = p0.d();
                p0 p0Var = c.a;
                a aVar = new a();
                synchronized (p0Var) {
                    p0Var.f1826g = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, x0 x0Var, int[] iArr) {
        PorterDuff.Mode mode = p0.f1820h;
        if (e0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = x0Var.f1856d;
        if (!z && !x0Var.c) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? x0Var.a : null;
            PorterDuff.Mode mode2 = x0Var.c ? x0Var.b : p0.f1820h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = p0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable b(Context context, int i2) {
        return this.a.f(context, i2);
    }

    public synchronized ColorStateList d(Context context, int i2) {
        return this.a.i(context, i2);
    }
}
