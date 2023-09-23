package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.MessagesProto;
import com.google.firebase.inappmessaging.internal.Logging;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.BannerMessage;
import com.google.firebase.inappmessaging.model.Button;
import com.google.firebase.inappmessaging.model.CardMessage;
import com.google.firebase.inappmessaging.model.ImageOnlyMessage;
import com.google.firebase.inappmessaging.model.ModalMessage;
import com.google.firebase.inappmessaging.model.Text;
import f.h.b.c.a;
import java.util.Map;

/* loaded from: classes2.dex */
public class ProtoMarshallerClient {

    /* renamed from: com.google.firebase.inappmessaging.model.ProtoMarshallerClient$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase;

        static {
            MessagesProto.Content.MessageDetailsCase.values();
            int[] iArr = new int[5];
            $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase = iArr;
            try {
                MessagesProto.Content.MessageDetailsCase messageDetailsCase = MessagesProto.Content.MessageDetailsCase.BANNER;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase;
                MessagesProto.Content.MessageDetailsCase messageDetailsCase2 = MessagesProto.Content.MessageDetailsCase.IMAGE_ONLY;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase;
                MessagesProto.Content.MessageDetailsCase messageDetailsCase3 = MessagesProto.Content.MessageDetailsCase.MODAL;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase;
                MessagesProto.Content.MessageDetailsCase messageDetailsCase4 = MessagesProto.Content.MessageDetailsCase.CARD;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static Button decode(MessagesProto.Button button) {
        Button.Builder builder = Button.builder();
        if (!TextUtils.isEmpty(button.getButtonHexColor())) {
            builder.setButtonHexColor(button.getButtonHexColor());
        }
        if (button.hasText()) {
            builder.setText(decode(button.getText()));
        }
        return builder.build();
    }

    private static ModalMessage.Builder from(MessagesProto.ModalMessage modalMessage) {
        ModalMessage.Builder builder = ModalMessage.builder();
        if (!TextUtils.isEmpty(modalMessage.getBackgroundHexColor())) {
            builder.setBackgroundHexColor(modalMessage.getBackgroundHexColor());
        }
        if (!TextUtils.isEmpty(modalMessage.getImageUrl())) {
            builder.setImageData(ImageData.builder().setImageUrl(modalMessage.getImageUrl()).build());
        }
        if (modalMessage.hasAction()) {
            builder.setAction(decode(modalMessage.getAction(), modalMessage.getActionButton()));
        }
        if (modalMessage.hasBody()) {
            builder.setBody(decode(modalMessage.getBody()));
        }
        if (modalMessage.hasTitle()) {
            builder.setTitle(decode(modalMessage.getTitle()));
        }
        return builder;
    }

    private static Action decode(MessagesProto.Action action, MessagesProto.Button button) {
        Action.Builder decode = decode(action);
        if (!button.equals(MessagesProto.Button.getDefaultInstance())) {
            Button.Builder builder = Button.builder();
            if (!TextUtils.isEmpty(button.getButtonHexColor())) {
                builder.setButtonHexColor(button.getButtonHexColor());
            }
            if (button.hasText()) {
                Text.Builder builder2 = Text.builder();
                MessagesProto.Text text = button.getText();
                if (!TextUtils.isEmpty(text.getText())) {
                    builder2.setText(text.getText());
                }
                if (!TextUtils.isEmpty(text.getHexColor())) {
                    builder2.setHexColor(text.getHexColor());
                }
                builder.setText(builder2.build());
            }
            decode.setButton(builder.build());
        }
        return decode.build();
    }

    private static ImageOnlyMessage.Builder from(MessagesProto.ImageOnlyMessage imageOnlyMessage) {
        ImageOnlyMessage.Builder builder = ImageOnlyMessage.builder();
        if (!TextUtils.isEmpty(imageOnlyMessage.getImageUrl())) {
            builder.setImageData(ImageData.builder().setImageUrl(imageOnlyMessage.getImageUrl()).build());
        }
        if (imageOnlyMessage.hasAction()) {
            builder.setAction(decode(imageOnlyMessage.getAction()).build());
        }
        return builder;
    }

    private static BannerMessage.Builder from(MessagesProto.BannerMessage bannerMessage) {
        BannerMessage.Builder builder = BannerMessage.builder();
        if (!TextUtils.isEmpty(bannerMessage.getBackgroundHexColor())) {
            builder.setBackgroundHexColor(bannerMessage.getBackgroundHexColor());
        }
        if (!TextUtils.isEmpty(bannerMessage.getImageUrl())) {
            builder.setImageData(ImageData.builder().setImageUrl(bannerMessage.getImageUrl()).build());
        }
        if (bannerMessage.hasAction()) {
            builder.setAction(decode(bannerMessage.getAction()).build());
        }
        if (bannerMessage.hasBody()) {
            builder.setBody(decode(bannerMessage.getBody()));
        }
        if (bannerMessage.hasTitle()) {
            builder.setTitle(decode(bannerMessage.getTitle()));
        }
        return builder;
    }

    private static Action.Builder decode(MessagesProto.Action action) {
        Action.Builder builder = Action.builder();
        if (!TextUtils.isEmpty(action.getActionUrl())) {
            builder.setActionUrl(action.getActionUrl());
        }
        return builder;
    }

    private static Text decode(MessagesProto.Text text) {
        Text.Builder builder = Text.builder();
        if (!TextUtils.isEmpty(text.getHexColor())) {
            builder.setHexColor(text.getHexColor());
        }
        if (!TextUtils.isEmpty(text.getText())) {
            builder.setText(text.getText());
        }
        return builder.build();
    }

    private static CardMessage.Builder from(MessagesProto.CardMessage cardMessage) {
        CardMessage.Builder builder = CardMessage.builder();
        if (cardMessage.hasTitle()) {
            builder.setTitle(decode(cardMessage.getTitle()));
        }
        if (cardMessage.hasBody()) {
            builder.setBody(decode(cardMessage.getBody()));
        }
        if (!TextUtils.isEmpty(cardMessage.getBackgroundHexColor())) {
            builder.setBackgroundHexColor(cardMessage.getBackgroundHexColor());
        }
        if (cardMessage.hasPrimaryAction() || cardMessage.hasPrimaryActionButton()) {
            builder.setPrimaryAction(decode(cardMessage.getPrimaryAction(), cardMessage.getPrimaryActionButton()));
        }
        if (cardMessage.hasSecondaryAction() || cardMessage.hasSecondaryActionButton()) {
            builder.setSecondaryAction(decode(cardMessage.getSecondaryAction(), cardMessage.getSecondaryActionButton()));
        }
        if (!TextUtils.isEmpty(cardMessage.getPortraitImageUrl())) {
            builder.setPortraitImageData(ImageData.builder().setImageUrl(cardMessage.getPortraitImageUrl()).build());
        }
        if (!TextUtils.isEmpty(cardMessage.getLandscapeImageUrl())) {
            builder.setLandscapeImageData(ImageData.builder().setImageUrl(cardMessage.getLandscapeImageUrl()).build());
        }
        return builder;
    }

    public static InAppMessage decode(MessagesProto.Content content, String str, String str2, boolean z, Map<String, String> map) {
        a.x(content, "FirebaseInAppMessaging content cannot be null.");
        a.x(str, "FirebaseInAppMessaging campaign id cannot be null.");
        a.x(str2, "FirebaseInAppMessaging campaign name cannot be null.");
        Logging.logd("Decoding message: " + content.toString());
        CampaignMetadata campaignMetadata = new CampaignMetadata(str, str2, z);
        int ordinal = content.getMessageDetailsCase().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return new InAppMessage(new CampaignMetadata(str, str2, z), MessageType.UNSUPPORTED, map) { // from class: com.google.firebase.inappmessaging.model.ProtoMarshallerClient.1
                            @Override // com.google.firebase.inappmessaging.model.InAppMessage
                            public Action getAction() {
                                return null;
                            }
                        };
                    }
                    return from(content.getCard()).build(campaignMetadata, map);
                }
                return from(content.getImageOnly()).build(campaignMetadata, map);
            }
            return from(content.getModal()).build(campaignMetadata, map);
        }
        return from(content.getBanner()).build(campaignMetadata, map);
    }
}
