package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.display.dagger.Module;
import com.google.firebase.inappmessaging.display.dagger.Provides;
import com.google.firebase.inappmessaging.display.dagger.multibindings.IntoMap;
import com.google.firebase.inappmessaging.display.dagger.multibindings.StringKey;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.injection.keys.LayoutConfigKey;
import com.google.firebase.inappmessaging.model.MessageType;

@Module
/* loaded from: classes2.dex */
public class InflaterConfigModule {
    public static int DISABLED_BG_FLAG = 327938;
    public static int DISMISSIBLE_DIALOG_FLAG = 327970;
    private int ENABLED_BG_FLAG = 65824;

    /* renamed from: com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$inappmessaging$model$MessageType;

        static {
            MessageType.values();
            int[] iArr = new int[5];
            $SwitchMap$com$google$firebase$inappmessaging$model$MessageType = iArr;
            try {
                MessageType messageType = MessageType.MODAL;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$inappmessaging$model$MessageType;
                MessageType messageType2 = MessageType.CARD;
                iArr2[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$google$firebase$inappmessaging$model$MessageType;
                MessageType messageType3 = MessageType.IMAGE_ONLY;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$google$firebase$inappmessaging$model$MessageType;
                MessageType messageType4 = MessageType.BANNER;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String configFor(MessageType messageType, int i2) {
        if (i2 == 1) {
            int ordinal = messageType.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            return null;
                        }
                        return LayoutConfigKey.CARD_PORTRAIT;
                    }
                    return LayoutConfigKey.BANNER_PORTRAIT;
                }
                return LayoutConfigKey.IMAGE_ONLY_PORTRAIT;
            }
            return LayoutConfigKey.MODAL_PORTRAIT;
        }
        int ordinal2 = messageType.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    if (ordinal2 != 4) {
                        return null;
                    }
                    return LayoutConfigKey.CARD_LANDSCAPE;
                }
                return LayoutConfigKey.BANNER_LANDSCAPE;
            }
            return LayoutConfigKey.IMAGE_ONLY_LANDSCAPE;
        }
        return LayoutConfigKey.MODAL_LANDSCAPE;
    }

    @IntoMap
    @Provides
    @StringKey(LayoutConfigKey.BANNER_LANDSCAPE)
    public InAppMessageLayoutConfig providesBannerLandscapeLayoutConfig(DisplayMetrics displayMetrics) {
        InAppMessageLayoutConfig.Builder builder = InAppMessageLayoutConfig.builder();
        Float valueOf = Float.valueOf(0.3f);
        InAppMessageLayoutConfig.Builder windowHeight = builder.setMaxImageHeightWeight(valueOf).setMaxImageWidthWeight(valueOf).setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).setViewWindowGravity(48).setWindowFlag(Integer.valueOf(this.ENABLED_BG_FLAG)).setWindowWidth(-1).setWindowHeight(-2);
        Boolean bool = Boolean.TRUE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    @IntoMap
    @Provides
    @StringKey(LayoutConfigKey.BANNER_PORTRAIT)
    public InAppMessageLayoutConfig providesBannerPortraitLayoutConfig(DisplayMetrics displayMetrics) {
        InAppMessageLayoutConfig.Builder builder = InAppMessageLayoutConfig.builder();
        Float valueOf = Float.valueOf(0.3f);
        InAppMessageLayoutConfig.Builder windowHeight = builder.setMaxImageHeightWeight(valueOf).setMaxImageWidthWeight(valueOf).setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).setViewWindowGravity(48).setWindowFlag(Integer.valueOf(this.ENABLED_BG_FLAG)).setWindowWidth(-1).setWindowHeight(-2);
        Boolean bool = Boolean.TRUE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    @IntoMap
    @Provides
    @StringKey(LayoutConfigKey.CARD_LANDSCAPE)
    public InAppMessageLayoutConfig providesCardLandscapeConfig(DisplayMetrics displayMetrics) {
        InAppMessageLayoutConfig.Builder windowHeight = InAppMessageLayoutConfig.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).setMaxDialogWidthPx(Integer.valueOf(displayMetrics.widthPixels)).setMaxImageHeightWeight(Float.valueOf(1.0f)).setMaxImageWidthWeight(Float.valueOf(0.5f)).setViewWindowGravity(17).setWindowFlag(Integer.valueOf(DISMISSIBLE_DIALOG_FLAG)).setWindowWidth(-2).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    @IntoMap
    @Provides
    @StringKey(LayoutConfigKey.CARD_PORTRAIT)
    public InAppMessageLayoutConfig providesCardPortraitConfig(DisplayMetrics displayMetrics) {
        InAppMessageLayoutConfig.Builder windowHeight = InAppMessageLayoutConfig.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).setMaxImageHeightWeight(Float.valueOf(0.6f)).setMaxImageWidthWeight(Float.valueOf(1.0f)).setMaxBodyHeightWeight(Float.valueOf(0.1f)).setMaxBodyWidthWeight(Float.valueOf(0.9f)).setViewWindowGravity(17).setWindowFlag(Integer.valueOf(DISMISSIBLE_DIALOG_FLAG)).setWindowWidth(-2).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    @Provides
    public DisplayMetrics providesDisplayMetrics(Application application) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    @IntoMap
    @Provides
    @StringKey(LayoutConfigKey.IMAGE_ONLY_LANDSCAPE)
    public InAppMessageLayoutConfig providesLandscapeImageLayoutConfig(DisplayMetrics displayMetrics) {
        InAppMessageLayoutConfig.Builder maxDialogWidthPx = InAppMessageLayoutConfig.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        InAppMessageLayoutConfig.Builder windowHeight = maxDialogWidthPx.setMaxImageWidthWeight(valueOf).setMaxImageHeightWeight(valueOf).setViewWindowGravity(17).setWindowFlag(Integer.valueOf(DISABLED_BG_FLAG)).setWindowWidth(-2).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    @IntoMap
    @Provides
    @StringKey(LayoutConfigKey.MODAL_LANDSCAPE)
    public InAppMessageLayoutConfig providesModalLandscapeConfig(DisplayMetrics displayMetrics) {
        InAppMessageLayoutConfig.Builder maxImageHeightWeight = InAppMessageLayoutConfig.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).setMaxDialogWidthPx(Integer.valueOf(displayMetrics.widthPixels)).setMaxImageHeightWeight(Float.valueOf(1.0f));
        Float valueOf = Float.valueOf(0.4f);
        InAppMessageLayoutConfig.Builder windowHeight = maxImageHeightWeight.setMaxImageWidthWeight(valueOf).setMaxBodyHeightWeight(Float.valueOf(0.6f)).setMaxBodyWidthWeight(valueOf).setViewWindowGravity(17).setWindowFlag(Integer.valueOf(DISABLED_BG_FLAG)).setWindowWidth(-1).setWindowHeight(-1);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    @IntoMap
    @Provides
    @StringKey(LayoutConfigKey.MODAL_PORTRAIT)
    public InAppMessageLayoutConfig providesModalPortraitConfig(DisplayMetrics displayMetrics) {
        InAppMessageLayoutConfig.Builder maxBodyHeightWeight = InAppMessageLayoutConfig.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).setMaxImageHeightWeight(Float.valueOf(0.6f)).setMaxBodyHeightWeight(Float.valueOf(0.1f));
        Float valueOf = Float.valueOf(0.9f);
        InAppMessageLayoutConfig.Builder windowHeight = maxBodyHeightWeight.setMaxImageWidthWeight(valueOf).setMaxBodyWidthWeight(valueOf).setViewWindowGravity(17).setWindowFlag(Integer.valueOf(DISABLED_BG_FLAG)).setWindowWidth(-1).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    @IntoMap
    @Provides
    @StringKey(LayoutConfigKey.IMAGE_ONLY_PORTRAIT)
    public InAppMessageLayoutConfig providesPortraitImageLayoutConfig(DisplayMetrics displayMetrics) {
        InAppMessageLayoutConfig.Builder maxDialogWidthPx = InAppMessageLayoutConfig.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        InAppMessageLayoutConfig.Builder windowHeight = maxDialogWidthPx.setMaxImageWidthWeight(valueOf).setMaxImageHeightWeight(valueOf).setViewWindowGravity(17).setWindowFlag(Integer.valueOf(DISABLED_BG_FLAG)).setWindowWidth(-2).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }
}
