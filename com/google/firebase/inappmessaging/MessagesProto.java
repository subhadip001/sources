package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.a;
import f.h.h.j;
import f.h.h.k;
import f.h.h.n0;
import f.h.h.o0;
import f.h.h.q;
import f.h.h.u0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class MessagesProto {

    /* renamed from: com.google.firebase.inappmessaging.MessagesProto$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            GeneratedMessageLite.MethodToInvoke.values();
            int[] iArr = new int[7];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Action extends GeneratedMessageLite<Action, Builder> implements ActionOrBuilder {
        public static final int ACTION_URL_FIELD_NUMBER = 1;
        private static final Action DEFAULT_INSTANCE;
        private static volatile u0<Action> PARSER;
        private String actionUrl_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<Action, Builder> implements ActionOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearActionUrl() {
                copyOnWrite();
                ((Action) this.instance).clearActionUrl();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ActionOrBuilder
            public String getActionUrl() {
                return ((Action) this.instance).getActionUrl();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ActionOrBuilder
            public j getActionUrlBytes() {
                return ((Action) this.instance).getActionUrlBytes();
            }

            public Builder setActionUrl(String str) {
                copyOnWrite();
                ((Action) this.instance).setActionUrl(str);
                return this;
            }

            public Builder setActionUrlBytes(j jVar) {
                copyOnWrite();
                ((Action) this.instance).setActionUrlBytes(jVar);
                return this;
            }

            private Builder() {
                super(Action.DEFAULT_INSTANCE);
            }
        }

        static {
            Action action = new Action();
            DEFAULT_INSTANCE = action;
            GeneratedMessageLite.registerDefaultInstance(Action.class, action);
        }

        private Action() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionUrl() {
            this.actionUrl_ = getDefaultInstance().getActionUrl();
        }

        public static Action getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Action parseDelimitedFrom(InputStream inputStream) {
            return (Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(ByteBuffer byteBuffer) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<Action> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionUrl(String str) {
            str.getClass();
            this.actionUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionUrlBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.actionUrl_ = jVar.n();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
                case 3:
                    return new Action();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<Action> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (Action.class) {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = u0Var;
                            }
                        }
                    }
                    return u0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ActionOrBuilder
        public String getActionUrl() {
            return this.actionUrl_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ActionOrBuilder
        public j getActionUrlBytes() {
            return j.d(this.actionUrl_);
        }

        public static Builder newBuilder(Action action) {
            return DEFAULT_INSTANCE.createBuilder(action);
        }

        public static Action parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Action parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Action parseFrom(j jVar) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Action parseFrom(j jVar, q qVar) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Action parseFrom(byte[] bArr) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Action parseFrom(byte[] bArr, q qVar) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Action parseFrom(InputStream inputStream) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(InputStream inputStream, q qVar) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Action parseFrom(k kVar) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Action parseFrom(k kVar, q qVar) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ActionOrBuilder extends o0 {
        String getActionUrl();

        j getActionUrlBytes();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class BannerMessage extends GeneratedMessageLite<BannerMessage, Builder> implements BannerMessageOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 4;
        public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final BannerMessage DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 3;
        private static volatile u0<BannerMessage> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private Action action_;
        private Text body_;
        private Text title_;
        private String imageUrl_ = "";
        private String backgroundHexColor_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<BannerMessage, Builder> implements BannerMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((BannerMessage) this.instance).clearAction();
                return this;
            }

            public Builder clearBackgroundHexColor() {
                copyOnWrite();
                ((BannerMessage) this.instance).clearBackgroundHexColor();
                return this;
            }

            public Builder clearBody() {
                copyOnWrite();
                ((BannerMessage) this.instance).clearBody();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((BannerMessage) this.instance).clearImageUrl();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((BannerMessage) this.instance).clearTitle();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public Action getAction() {
                return ((BannerMessage) this.instance).getAction();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public String getBackgroundHexColor() {
                return ((BannerMessage) this.instance).getBackgroundHexColor();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public j getBackgroundHexColorBytes() {
                return ((BannerMessage) this.instance).getBackgroundHexColorBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public Text getBody() {
                return ((BannerMessage) this.instance).getBody();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public String getImageUrl() {
                return ((BannerMessage) this.instance).getImageUrl();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public j getImageUrlBytes() {
                return ((BannerMessage) this.instance).getImageUrlBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public Text getTitle() {
                return ((BannerMessage) this.instance).getTitle();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public boolean hasAction() {
                return ((BannerMessage) this.instance).hasAction();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public boolean hasBody() {
                return ((BannerMessage) this.instance).hasBody();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
            public boolean hasTitle() {
                return ((BannerMessage) this.instance).hasTitle();
            }

            public Builder mergeAction(Action action) {
                copyOnWrite();
                ((BannerMessage) this.instance).mergeAction(action);
                return this;
            }

            public Builder mergeBody(Text text) {
                copyOnWrite();
                ((BannerMessage) this.instance).mergeBody(text);
                return this;
            }

            public Builder mergeTitle(Text text) {
                copyOnWrite();
                ((BannerMessage) this.instance).mergeTitle(text);
                return this;
            }

            public Builder setAction(Action action) {
                copyOnWrite();
                ((BannerMessage) this.instance).setAction(action);
                return this;
            }

            public Builder setBackgroundHexColor(String str) {
                copyOnWrite();
                ((BannerMessage) this.instance).setBackgroundHexColor(str);
                return this;
            }

            public Builder setBackgroundHexColorBytes(j jVar) {
                copyOnWrite();
                ((BannerMessage) this.instance).setBackgroundHexColorBytes(jVar);
                return this;
            }

            public Builder setBody(Text text) {
                copyOnWrite();
                ((BannerMessage) this.instance).setBody(text);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((BannerMessage) this.instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(j jVar) {
                copyOnWrite();
                ((BannerMessage) this.instance).setImageUrlBytes(jVar);
                return this;
            }

            public Builder setTitle(Text text) {
                copyOnWrite();
                ((BannerMessage) this.instance).setTitle(text);
                return this;
            }

            private Builder() {
                super(BannerMessage.DEFAULT_INSTANCE);
            }

            public Builder setAction(Action.Builder builder) {
                copyOnWrite();
                ((BannerMessage) this.instance).setAction(builder.build());
                return this;
            }

            public Builder setBody(Text.Builder builder) {
                copyOnWrite();
                ((BannerMessage) this.instance).setBody(builder.build());
                return this;
            }

            public Builder setTitle(Text.Builder builder) {
                copyOnWrite();
                ((BannerMessage) this.instance).setTitle(builder.build());
                return this;
            }
        }

        static {
            BannerMessage bannerMessage = new BannerMessage();
            DEFAULT_INSTANCE = bannerMessage;
            GeneratedMessageLite.registerDefaultInstance(BannerMessage.class, bannerMessage);
        }

        private BannerMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundHexColor() {
            this.backgroundHexColor_ = getDefaultInstance().getBackgroundHexColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBody() {
            this.body_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = null;
        }

        public static BannerMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAction(Action action) {
            action.getClass();
            Action action2 = this.action_;
            if (action2 != null && action2 != Action.getDefaultInstance()) {
                this.action_ = Action.newBuilder(this.action_).mergeFrom((Action.Builder) action).buildPartial();
            } else {
                this.action_ = action;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBody(Text text) {
            text.getClass();
            Text text2 = this.body_;
            if (text2 != null && text2 != Text.getDefaultInstance()) {
                this.body_ = Text.newBuilder(this.body_).mergeFrom((Text.Builder) text).buildPartial();
            } else {
                this.body_ = text;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTitle(Text text) {
            text.getClass();
            Text text2 = this.title_;
            if (text2 != null && text2 != Text.getDefaultInstance()) {
                this.title_ = Text.newBuilder(this.title_).mergeFrom((Text.Builder) text).buildPartial();
            } else {
                this.title_ = text;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BannerMessage parseDelimitedFrom(InputStream inputStream) {
            return (BannerMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerMessage parseFrom(ByteBuffer byteBuffer) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<BannerMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(Action action) {
            action.getClass();
            this.action_ = action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundHexColor(String str) {
            str.getClass();
            this.backgroundHexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundHexColorBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.backgroundHexColor_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBody(Text text) {
            text.getClass();
            this.body_ = text;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.imageUrl_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(Text text) {
            text.getClass();
            this.title_ = text;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005Ȉ", new Object[]{"title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
                case 3:
                    return new BannerMessage();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<BannerMessage> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (BannerMessage.class) {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = u0Var;
                            }
                        }
                    }
                    return u0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public Action getAction() {
            Action action = this.action_;
            return action == null ? Action.getDefaultInstance() : action;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public String getBackgroundHexColor() {
            return this.backgroundHexColor_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public j getBackgroundHexColorBytes() {
            return j.d(this.backgroundHexColor_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public Text getBody() {
            Text text = this.body_;
            return text == null ? Text.getDefaultInstance() : text;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public j getImageUrlBytes() {
            return j.d(this.imageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public Text getTitle() {
            Text text = this.title_;
            return text == null ? Text.getDefaultInstance() : text;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public boolean hasAction() {
            return this.action_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public boolean hasBody() {
            return this.body_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.BannerMessageOrBuilder
        public boolean hasTitle() {
            return this.title_ != null;
        }

        public static Builder newBuilder(BannerMessage bannerMessage) {
            return DEFAULT_INSTANCE.createBuilder(bannerMessage);
        }

        public static BannerMessage parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (BannerMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static BannerMessage parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static BannerMessage parseFrom(j jVar) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static BannerMessage parseFrom(j jVar, q qVar) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static BannerMessage parseFrom(byte[] bArr) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BannerMessage parseFrom(byte[] bArr, q qVar) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static BannerMessage parseFrom(InputStream inputStream) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerMessage parseFrom(InputStream inputStream, q qVar) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static BannerMessage parseFrom(k kVar) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BannerMessage parseFrom(k kVar, q qVar) {
            return (BannerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface BannerMessageOrBuilder extends o0 {
        Action getAction();

        String getBackgroundHexColor();

        j getBackgroundHexColorBytes();

        Text getBody();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        String getImageUrl();

        j getImageUrlBytes();

        Text getTitle();

        boolean hasAction();

        boolean hasBody();

        boolean hasTitle();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class Button extends GeneratedMessageLite<Button, Builder> implements ButtonOrBuilder {
        public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
        private static final Button DEFAULT_INSTANCE;
        private static volatile u0<Button> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String buttonHexColor_ = "";
        private Text text_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<Button, Builder> implements ButtonOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearButtonHexColor() {
                copyOnWrite();
                ((Button) this.instance).clearButtonHexColor();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((Button) this.instance).clearText();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ButtonOrBuilder
            public String getButtonHexColor() {
                return ((Button) this.instance).getButtonHexColor();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ButtonOrBuilder
            public j getButtonHexColorBytes() {
                return ((Button) this.instance).getButtonHexColorBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ButtonOrBuilder
            public Text getText() {
                return ((Button) this.instance).getText();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ButtonOrBuilder
            public boolean hasText() {
                return ((Button) this.instance).hasText();
            }

            public Builder mergeText(Text text) {
                copyOnWrite();
                ((Button) this.instance).mergeText(text);
                return this;
            }

            public Builder setButtonHexColor(String str) {
                copyOnWrite();
                ((Button) this.instance).setButtonHexColor(str);
                return this;
            }

            public Builder setButtonHexColorBytes(j jVar) {
                copyOnWrite();
                ((Button) this.instance).setButtonHexColorBytes(jVar);
                return this;
            }

            public Builder setText(Text text) {
                copyOnWrite();
                ((Button) this.instance).setText(text);
                return this;
            }

            private Builder() {
                super(Button.DEFAULT_INSTANCE);
            }

            public Builder setText(Text.Builder builder) {
                copyOnWrite();
                ((Button) this.instance).setText(builder.build());
                return this;
            }
        }

        static {
            Button button = new Button();
            DEFAULT_INSTANCE = button;
            GeneratedMessageLite.registerDefaultInstance(Button.class, button);
        }

        private Button() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonHexColor() {
            this.buttonHexColor_ = getDefaultInstance().getButtonHexColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = null;
        }

        public static Button getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeText(Text text) {
            text.getClass();
            Text text2 = this.text_;
            if (text2 != null && text2 != Text.getDefaultInstance()) {
                this.text_ = Text.newBuilder(this.text_).mergeFrom((Text.Builder) text).buildPartial();
            } else {
                this.text_ = text;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Button parseDelimitedFrom(InputStream inputStream) {
            return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Button parseFrom(ByteBuffer byteBuffer) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<Button> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonHexColor(String str) {
            str.getClass();
            this.buttonHexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonHexColorBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.buttonHexColor_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(Text text) {
            text.getClass();
            this.text_ = text;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"text_", "buttonHexColor_"});
                case 3:
                    return new Button();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<Button> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (Button.class) {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = u0Var;
                            }
                        }
                    }
                    return u0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ButtonOrBuilder
        public String getButtonHexColor() {
            return this.buttonHexColor_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ButtonOrBuilder
        public j getButtonHexColorBytes() {
            return j.d(this.buttonHexColor_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ButtonOrBuilder
        public Text getText() {
            Text text = this.text_;
            return text == null ? Text.getDefaultInstance() : text;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ButtonOrBuilder
        public boolean hasText() {
            return this.text_ != null;
        }

        public static Builder newBuilder(Button button) {
            return DEFAULT_INSTANCE.createBuilder(button);
        }

        public static Button parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Button parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Button parseFrom(j jVar) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Button parseFrom(j jVar, q qVar) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Button parseFrom(byte[] bArr) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Button parseFrom(byte[] bArr, q qVar) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Button parseFrom(InputStream inputStream) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Button parseFrom(InputStream inputStream, q qVar) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Button parseFrom(k kVar) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Button parseFrom(k kVar, q qVar) {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ButtonOrBuilder extends o0 {
        String getButtonHexColor();

        j getButtonHexColorBytes();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        Text getText();

        boolean hasText();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class CardMessage extends GeneratedMessageLite<CardMessage, Builder> implements CardMessageOrBuilder {
        public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final CardMessage DEFAULT_INSTANCE;
        public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
        private static volatile u0<CardMessage> PARSER = null;
        public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
        public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
        public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
        public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
        public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
        public static final int TITLE_FIELD_NUMBER = 1;
        private Text body_;
        private Button primaryActionButton_;
        private Action primaryAction_;
        private Button secondaryActionButton_;
        private Action secondaryAction_;
        private Text title_;
        private String portraitImageUrl_ = "";
        private String landscapeImageUrl_ = "";
        private String backgroundHexColor_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<CardMessage, Builder> implements CardMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBackgroundHexColor() {
                copyOnWrite();
                ((CardMessage) this.instance).clearBackgroundHexColor();
                return this;
            }

            public Builder clearBody() {
                copyOnWrite();
                ((CardMessage) this.instance).clearBody();
                return this;
            }

            public Builder clearLandscapeImageUrl() {
                copyOnWrite();
                ((CardMessage) this.instance).clearLandscapeImageUrl();
                return this;
            }

            public Builder clearPortraitImageUrl() {
                copyOnWrite();
                ((CardMessage) this.instance).clearPortraitImageUrl();
                return this;
            }

            public Builder clearPrimaryAction() {
                copyOnWrite();
                ((CardMessage) this.instance).clearPrimaryAction();
                return this;
            }

            public Builder clearPrimaryActionButton() {
                copyOnWrite();
                ((CardMessage) this.instance).clearPrimaryActionButton();
                return this;
            }

            public Builder clearSecondaryAction() {
                copyOnWrite();
                ((CardMessage) this.instance).clearSecondaryAction();
                return this;
            }

            public Builder clearSecondaryActionButton() {
                copyOnWrite();
                ((CardMessage) this.instance).clearSecondaryActionButton();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((CardMessage) this.instance).clearTitle();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public String getBackgroundHexColor() {
                return ((CardMessage) this.instance).getBackgroundHexColor();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public j getBackgroundHexColorBytes() {
                return ((CardMessage) this.instance).getBackgroundHexColorBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public Text getBody() {
                return ((CardMessage) this.instance).getBody();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public String getLandscapeImageUrl() {
                return ((CardMessage) this.instance).getLandscapeImageUrl();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public j getLandscapeImageUrlBytes() {
                return ((CardMessage) this.instance).getLandscapeImageUrlBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public String getPortraitImageUrl() {
                return ((CardMessage) this.instance).getPortraitImageUrl();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public j getPortraitImageUrlBytes() {
                return ((CardMessage) this.instance).getPortraitImageUrlBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public Action getPrimaryAction() {
                return ((CardMessage) this.instance).getPrimaryAction();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public Button getPrimaryActionButton() {
                return ((CardMessage) this.instance).getPrimaryActionButton();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public Action getSecondaryAction() {
                return ((CardMessage) this.instance).getSecondaryAction();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public Button getSecondaryActionButton() {
                return ((CardMessage) this.instance).getSecondaryActionButton();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public Text getTitle() {
                return ((CardMessage) this.instance).getTitle();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public boolean hasBody() {
                return ((CardMessage) this.instance).hasBody();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public boolean hasPrimaryAction() {
                return ((CardMessage) this.instance).hasPrimaryAction();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public boolean hasPrimaryActionButton() {
                return ((CardMessage) this.instance).hasPrimaryActionButton();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public boolean hasSecondaryAction() {
                return ((CardMessage) this.instance).hasSecondaryAction();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public boolean hasSecondaryActionButton() {
                return ((CardMessage) this.instance).hasSecondaryActionButton();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
            public boolean hasTitle() {
                return ((CardMessage) this.instance).hasTitle();
            }

            public Builder mergeBody(Text text) {
                copyOnWrite();
                ((CardMessage) this.instance).mergeBody(text);
                return this;
            }

            public Builder mergePrimaryAction(Action action) {
                copyOnWrite();
                ((CardMessage) this.instance).mergePrimaryAction(action);
                return this;
            }

            public Builder mergePrimaryActionButton(Button button) {
                copyOnWrite();
                ((CardMessage) this.instance).mergePrimaryActionButton(button);
                return this;
            }

            public Builder mergeSecondaryAction(Action action) {
                copyOnWrite();
                ((CardMessage) this.instance).mergeSecondaryAction(action);
                return this;
            }

            public Builder mergeSecondaryActionButton(Button button) {
                copyOnWrite();
                ((CardMessage) this.instance).mergeSecondaryActionButton(button);
                return this;
            }

            public Builder mergeTitle(Text text) {
                copyOnWrite();
                ((CardMessage) this.instance).mergeTitle(text);
                return this;
            }

            public Builder setBackgroundHexColor(String str) {
                copyOnWrite();
                ((CardMessage) this.instance).setBackgroundHexColor(str);
                return this;
            }

            public Builder setBackgroundHexColorBytes(j jVar) {
                copyOnWrite();
                ((CardMessage) this.instance).setBackgroundHexColorBytes(jVar);
                return this;
            }

            public Builder setBody(Text text) {
                copyOnWrite();
                ((CardMessage) this.instance).setBody(text);
                return this;
            }

            public Builder setLandscapeImageUrl(String str) {
                copyOnWrite();
                ((CardMessage) this.instance).setLandscapeImageUrl(str);
                return this;
            }

            public Builder setLandscapeImageUrlBytes(j jVar) {
                copyOnWrite();
                ((CardMessage) this.instance).setLandscapeImageUrlBytes(jVar);
                return this;
            }

            public Builder setPortraitImageUrl(String str) {
                copyOnWrite();
                ((CardMessage) this.instance).setPortraitImageUrl(str);
                return this;
            }

            public Builder setPortraitImageUrlBytes(j jVar) {
                copyOnWrite();
                ((CardMessage) this.instance).setPortraitImageUrlBytes(jVar);
                return this;
            }

            public Builder setPrimaryAction(Action action) {
                copyOnWrite();
                ((CardMessage) this.instance).setPrimaryAction(action);
                return this;
            }

            public Builder setPrimaryActionButton(Button button) {
                copyOnWrite();
                ((CardMessage) this.instance).setPrimaryActionButton(button);
                return this;
            }

            public Builder setSecondaryAction(Action action) {
                copyOnWrite();
                ((CardMessage) this.instance).setSecondaryAction(action);
                return this;
            }

            public Builder setSecondaryActionButton(Button button) {
                copyOnWrite();
                ((CardMessage) this.instance).setSecondaryActionButton(button);
                return this;
            }

            public Builder setTitle(Text text) {
                copyOnWrite();
                ((CardMessage) this.instance).setTitle(text);
                return this;
            }

            private Builder() {
                super(CardMessage.DEFAULT_INSTANCE);
            }

            public Builder setBody(Text.Builder builder) {
                copyOnWrite();
                ((CardMessage) this.instance).setBody(builder.build());
                return this;
            }

            public Builder setPrimaryAction(Action.Builder builder) {
                copyOnWrite();
                ((CardMessage) this.instance).setPrimaryAction(builder.build());
                return this;
            }

            public Builder setPrimaryActionButton(Button.Builder builder) {
                copyOnWrite();
                ((CardMessage) this.instance).setPrimaryActionButton(builder.build());
                return this;
            }

            public Builder setSecondaryAction(Action.Builder builder) {
                copyOnWrite();
                ((CardMessage) this.instance).setSecondaryAction(builder.build());
                return this;
            }

            public Builder setSecondaryActionButton(Button.Builder builder) {
                copyOnWrite();
                ((CardMessage) this.instance).setSecondaryActionButton(builder.build());
                return this;
            }

            public Builder setTitle(Text.Builder builder) {
                copyOnWrite();
                ((CardMessage) this.instance).setTitle(builder.build());
                return this;
            }
        }

        static {
            CardMessage cardMessage = new CardMessage();
            DEFAULT_INSTANCE = cardMessage;
            GeneratedMessageLite.registerDefaultInstance(CardMessage.class, cardMessage);
        }

        private CardMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundHexColor() {
            this.backgroundHexColor_ = getDefaultInstance().getBackgroundHexColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBody() {
            this.body_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLandscapeImageUrl() {
            this.landscapeImageUrl_ = getDefaultInstance().getLandscapeImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPortraitImageUrl() {
            this.portraitImageUrl_ = getDefaultInstance().getPortraitImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimaryAction() {
            this.primaryAction_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimaryActionButton() {
            this.primaryActionButton_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecondaryAction() {
            this.secondaryAction_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecondaryActionButton() {
            this.secondaryActionButton_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = null;
        }

        public static CardMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBody(Text text) {
            text.getClass();
            Text text2 = this.body_;
            if (text2 != null && text2 != Text.getDefaultInstance()) {
                this.body_ = Text.newBuilder(this.body_).mergeFrom((Text.Builder) text).buildPartial();
            } else {
                this.body_ = text;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePrimaryAction(Action action) {
            action.getClass();
            Action action2 = this.primaryAction_;
            if (action2 != null && action2 != Action.getDefaultInstance()) {
                this.primaryAction_ = Action.newBuilder(this.primaryAction_).mergeFrom((Action.Builder) action).buildPartial();
            } else {
                this.primaryAction_ = action;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePrimaryActionButton(Button button) {
            button.getClass();
            Button button2 = this.primaryActionButton_;
            if (button2 != null && button2 != Button.getDefaultInstance()) {
                this.primaryActionButton_ = Button.newBuilder(this.primaryActionButton_).mergeFrom((Button.Builder) button).buildPartial();
            } else {
                this.primaryActionButton_ = button;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSecondaryAction(Action action) {
            action.getClass();
            Action action2 = this.secondaryAction_;
            if (action2 != null && action2 != Action.getDefaultInstance()) {
                this.secondaryAction_ = Action.newBuilder(this.secondaryAction_).mergeFrom((Action.Builder) action).buildPartial();
            } else {
                this.secondaryAction_ = action;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSecondaryActionButton(Button button) {
            button.getClass();
            Button button2 = this.secondaryActionButton_;
            if (button2 != null && button2 != Button.getDefaultInstance()) {
                this.secondaryActionButton_ = Button.newBuilder(this.secondaryActionButton_).mergeFrom((Button.Builder) button).buildPartial();
            } else {
                this.secondaryActionButton_ = button;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTitle(Text text) {
            text.getClass();
            Text text2 = this.title_;
            if (text2 != null && text2 != Text.getDefaultInstance()) {
                this.title_ = Text.newBuilder(this.title_).mergeFrom((Text.Builder) text).buildPartial();
            } else {
                this.title_ = text;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CardMessage parseDelimitedFrom(InputStream inputStream) {
            return (CardMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CardMessage parseFrom(ByteBuffer byteBuffer) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<CardMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundHexColor(String str) {
            str.getClass();
            this.backgroundHexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundHexColorBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.backgroundHexColor_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBody(Text text) {
            text.getClass();
            this.body_ = text;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLandscapeImageUrl(String str) {
            str.getClass();
            this.landscapeImageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLandscapeImageUrlBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.landscapeImageUrl_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPortraitImageUrl(String str) {
            str.getClass();
            this.portraitImageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPortraitImageUrlBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.portraitImageUrl_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryAction(Action action) {
            action.getClass();
            this.primaryAction_ = action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryActionButton(Button button) {
            button.getClass();
            this.primaryActionButton_ = button;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondaryAction(Action action) {
            action.getClass();
            this.secondaryAction_ = action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondaryActionButton(Button button) {
            button.getClass();
            this.secondaryActionButton_ = button;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(Text text) {
            text.getClass();
            this.title_ = text;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t\b\t\t\t", new Object[]{"title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
                case 3:
                    return new CardMessage();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<CardMessage> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (CardMessage.class) {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = u0Var;
                            }
                        }
                    }
                    return u0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public String getBackgroundHexColor() {
            return this.backgroundHexColor_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public j getBackgroundHexColorBytes() {
            return j.d(this.backgroundHexColor_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public Text getBody() {
            Text text = this.body_;
            return text == null ? Text.getDefaultInstance() : text;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public String getLandscapeImageUrl() {
            return this.landscapeImageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public j getLandscapeImageUrlBytes() {
            return j.d(this.landscapeImageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public String getPortraitImageUrl() {
            return this.portraitImageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public j getPortraitImageUrlBytes() {
            return j.d(this.portraitImageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public Action getPrimaryAction() {
            Action action = this.primaryAction_;
            return action == null ? Action.getDefaultInstance() : action;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public Button getPrimaryActionButton() {
            Button button = this.primaryActionButton_;
            return button == null ? Button.getDefaultInstance() : button;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public Action getSecondaryAction() {
            Action action = this.secondaryAction_;
            return action == null ? Action.getDefaultInstance() : action;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public Button getSecondaryActionButton() {
            Button button = this.secondaryActionButton_;
            return button == null ? Button.getDefaultInstance() : button;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public Text getTitle() {
            Text text = this.title_;
            return text == null ? Text.getDefaultInstance() : text;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public boolean hasBody() {
            return this.body_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public boolean hasPrimaryAction() {
            return this.primaryAction_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public boolean hasPrimaryActionButton() {
            return this.primaryActionButton_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public boolean hasSecondaryAction() {
            return this.secondaryAction_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public boolean hasSecondaryActionButton() {
            return this.secondaryActionButton_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.CardMessageOrBuilder
        public boolean hasTitle() {
            return this.title_ != null;
        }

        public static Builder newBuilder(CardMessage cardMessage) {
            return DEFAULT_INSTANCE.createBuilder(cardMessage);
        }

        public static CardMessage parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (CardMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static CardMessage parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static CardMessage parseFrom(j jVar) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CardMessage parseFrom(j jVar, q qVar) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static CardMessage parseFrom(byte[] bArr) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CardMessage parseFrom(byte[] bArr, q qVar) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static CardMessage parseFrom(InputStream inputStream) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CardMessage parseFrom(InputStream inputStream, q qVar) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static CardMessage parseFrom(k kVar) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static CardMessage parseFrom(k kVar, q qVar) {
            return (CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface CardMessageOrBuilder extends o0 {
        String getBackgroundHexColor();

        j getBackgroundHexColorBytes();

        Text getBody();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        String getLandscapeImageUrl();

        j getLandscapeImageUrlBytes();

        String getPortraitImageUrl();

        j getPortraitImageUrlBytes();

        Action getPrimaryAction();

        Button getPrimaryActionButton();

        Action getSecondaryAction();

        Button getSecondaryActionButton();

        Text getTitle();

        boolean hasBody();

        boolean hasPrimaryAction();

        boolean hasPrimaryActionButton();

        boolean hasSecondaryAction();

        boolean hasSecondaryActionButton();

        boolean hasTitle();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class Content extends GeneratedMessageLite<Content, Builder> implements ContentOrBuilder {
        public static final int BANNER_FIELD_NUMBER = 1;
        public static final int CARD_FIELD_NUMBER = 4;
        private static final Content DEFAULT_INSTANCE;
        public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
        public static final int MODAL_FIELD_NUMBER = 2;
        private static volatile u0<Content> PARSER;
        private int messageDetailsCase_ = 0;
        private Object messageDetails_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<Content, Builder> implements ContentOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBanner() {
                copyOnWrite();
                ((Content) this.instance).clearBanner();
                return this;
            }

            public Builder clearCard() {
                copyOnWrite();
                ((Content) this.instance).clearCard();
                return this;
            }

            public Builder clearImageOnly() {
                copyOnWrite();
                ((Content) this.instance).clearImageOnly();
                return this;
            }

            public Builder clearMessageDetails() {
                copyOnWrite();
                ((Content) this.instance).clearMessageDetails();
                return this;
            }

            public Builder clearModal() {
                copyOnWrite();
                ((Content) this.instance).clearModal();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
            public BannerMessage getBanner() {
                return ((Content) this.instance).getBanner();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
            public CardMessage getCard() {
                return ((Content) this.instance).getCard();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
            public ImageOnlyMessage getImageOnly() {
                return ((Content) this.instance).getImageOnly();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
            public MessageDetailsCase getMessageDetailsCase() {
                return ((Content) this.instance).getMessageDetailsCase();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
            public ModalMessage getModal() {
                return ((Content) this.instance).getModal();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
            public boolean hasBanner() {
                return ((Content) this.instance).hasBanner();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
            public boolean hasCard() {
                return ((Content) this.instance).hasCard();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
            public boolean hasImageOnly() {
                return ((Content) this.instance).hasImageOnly();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
            public boolean hasModal() {
                return ((Content) this.instance).hasModal();
            }

            public Builder mergeBanner(BannerMessage bannerMessage) {
                copyOnWrite();
                ((Content) this.instance).mergeBanner(bannerMessage);
                return this;
            }

            public Builder mergeCard(CardMessage cardMessage) {
                copyOnWrite();
                ((Content) this.instance).mergeCard(cardMessage);
                return this;
            }

            public Builder mergeImageOnly(ImageOnlyMessage imageOnlyMessage) {
                copyOnWrite();
                ((Content) this.instance).mergeImageOnly(imageOnlyMessage);
                return this;
            }

            public Builder mergeModal(ModalMessage modalMessage) {
                copyOnWrite();
                ((Content) this.instance).mergeModal(modalMessage);
                return this;
            }

            public Builder setBanner(BannerMessage bannerMessage) {
                copyOnWrite();
                ((Content) this.instance).setBanner(bannerMessage);
                return this;
            }

            public Builder setCard(CardMessage cardMessage) {
                copyOnWrite();
                ((Content) this.instance).setCard(cardMessage);
                return this;
            }

            public Builder setImageOnly(ImageOnlyMessage imageOnlyMessage) {
                copyOnWrite();
                ((Content) this.instance).setImageOnly(imageOnlyMessage);
                return this;
            }

            public Builder setModal(ModalMessage modalMessage) {
                copyOnWrite();
                ((Content) this.instance).setModal(modalMessage);
                return this;
            }

            private Builder() {
                super(Content.DEFAULT_INSTANCE);
            }

            public Builder setBanner(BannerMessage.Builder builder) {
                copyOnWrite();
                ((Content) this.instance).setBanner(builder.build());
                return this;
            }

            public Builder setCard(CardMessage.Builder builder) {
                copyOnWrite();
                ((Content) this.instance).setCard(builder.build());
                return this;
            }

            public Builder setImageOnly(ImageOnlyMessage.Builder builder) {
                copyOnWrite();
                ((Content) this.instance).setImageOnly(builder.build());
                return this;
            }

            public Builder setModal(ModalMessage.Builder builder) {
                copyOnWrite();
                ((Content) this.instance).setModal(builder.build());
                return this;
            }
        }

        /* loaded from: classes2.dex */
        public enum MessageDetailsCase {
            BANNER(1),
            MODAL(2),
            IMAGE_ONLY(3),
            CARD(4),
            MESSAGEDETAILS_NOT_SET(0);
            
            private final int value;

            MessageDetailsCase(int i2) {
                this.value = i2;
            }

            public static MessageDetailsCase forNumber(int i2) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    return null;
                                }
                                return CARD;
                            }
                            return IMAGE_ONLY;
                        }
                        return MODAL;
                    }
                    return BANNER;
                }
                return MESSAGEDETAILS_NOT_SET;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageDetailsCase valueOf(int i2) {
                return forNumber(i2);
            }
        }

        static {
            Content content = new Content();
            DEFAULT_INSTANCE = content;
            GeneratedMessageLite.registerDefaultInstance(Content.class, content);
        }

        private Content() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBanner() {
            if (this.messageDetailsCase_ == 1) {
                this.messageDetailsCase_ = 0;
                this.messageDetails_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCard() {
            if (this.messageDetailsCase_ == 4) {
                this.messageDetailsCase_ = 0;
                this.messageDetails_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageOnly() {
            if (this.messageDetailsCase_ == 3) {
                this.messageDetailsCase_ = 0;
                this.messageDetails_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageDetails() {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModal() {
            if (this.messageDetailsCase_ == 2) {
                this.messageDetailsCase_ = 0;
                this.messageDetails_ = null;
            }
        }

        public static Content getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBanner(BannerMessage bannerMessage) {
            bannerMessage.getClass();
            if (this.messageDetailsCase_ == 1 && this.messageDetails_ != BannerMessage.getDefaultInstance()) {
                this.messageDetails_ = BannerMessage.newBuilder((BannerMessage) this.messageDetails_).mergeFrom((BannerMessage.Builder) bannerMessage).buildPartial();
            } else {
                this.messageDetails_ = bannerMessage;
            }
            this.messageDetailsCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCard(CardMessage cardMessage) {
            cardMessage.getClass();
            if (this.messageDetailsCase_ == 4 && this.messageDetails_ != CardMessage.getDefaultInstance()) {
                this.messageDetails_ = CardMessage.newBuilder((CardMessage) this.messageDetails_).mergeFrom((CardMessage.Builder) cardMessage).buildPartial();
            } else {
                this.messageDetails_ = cardMessage;
            }
            this.messageDetailsCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImageOnly(ImageOnlyMessage imageOnlyMessage) {
            imageOnlyMessage.getClass();
            if (this.messageDetailsCase_ == 3 && this.messageDetails_ != ImageOnlyMessage.getDefaultInstance()) {
                this.messageDetails_ = ImageOnlyMessage.newBuilder((ImageOnlyMessage) this.messageDetails_).mergeFrom((ImageOnlyMessage.Builder) imageOnlyMessage).buildPartial();
            } else {
                this.messageDetails_ = imageOnlyMessage;
            }
            this.messageDetailsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeModal(ModalMessage modalMessage) {
            modalMessage.getClass();
            if (this.messageDetailsCase_ == 2 && this.messageDetails_ != ModalMessage.getDefaultInstance()) {
                this.messageDetails_ = ModalMessage.newBuilder((ModalMessage) this.messageDetails_).mergeFrom((ModalMessage.Builder) modalMessage).buildPartial();
            } else {
                this.messageDetails_ = modalMessage;
            }
            this.messageDetailsCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Content parseDelimitedFrom(InputStream inputStream) {
            return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Content parseFrom(ByteBuffer byteBuffer) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<Content> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBanner(BannerMessage bannerMessage) {
            bannerMessage.getClass();
            this.messageDetails_ = bannerMessage;
            this.messageDetailsCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCard(CardMessage cardMessage) {
            cardMessage.getClass();
            this.messageDetails_ = cardMessage;
            this.messageDetailsCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageOnly(ImageOnlyMessage imageOnlyMessage) {
            imageOnlyMessage.getClass();
            this.messageDetails_ = imageOnlyMessage;
            this.messageDetailsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModal(ModalMessage modalMessage) {
            modalMessage.getClass();
            this.messageDetails_ = modalMessage;
            this.messageDetailsCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", BannerMessage.class, ModalMessage.class, ImageOnlyMessage.class, CardMessage.class});
                case 3:
                    return new Content();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<Content> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (Content.class) {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = u0Var;
                            }
                        }
                    }
                    return u0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
        public BannerMessage getBanner() {
            if (this.messageDetailsCase_ == 1) {
                return (BannerMessage) this.messageDetails_;
            }
            return BannerMessage.getDefaultInstance();
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
        public CardMessage getCard() {
            if (this.messageDetailsCase_ == 4) {
                return (CardMessage) this.messageDetails_;
            }
            return CardMessage.getDefaultInstance();
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
        public ImageOnlyMessage getImageOnly() {
            if (this.messageDetailsCase_ == 3) {
                return (ImageOnlyMessage) this.messageDetails_;
            }
            return ImageOnlyMessage.getDefaultInstance();
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
        public MessageDetailsCase getMessageDetailsCase() {
            return MessageDetailsCase.forNumber(this.messageDetailsCase_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
        public ModalMessage getModal() {
            if (this.messageDetailsCase_ == 2) {
                return (ModalMessage) this.messageDetails_;
            }
            return ModalMessage.getDefaultInstance();
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
        public boolean hasBanner() {
            return this.messageDetailsCase_ == 1;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
        public boolean hasCard() {
            return this.messageDetailsCase_ == 4;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
        public boolean hasImageOnly() {
            return this.messageDetailsCase_ == 3;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ContentOrBuilder
        public boolean hasModal() {
            return this.messageDetailsCase_ == 2;
        }

        public static Builder newBuilder(Content content) {
            return DEFAULT_INSTANCE.createBuilder(content);
        }

        public static Content parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Content parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Content parseFrom(j jVar) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Content parseFrom(j jVar, q qVar) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Content parseFrom(byte[] bArr) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Content parseFrom(byte[] bArr, q qVar) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Content parseFrom(InputStream inputStream) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Content parseFrom(InputStream inputStream, q qVar) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Content parseFrom(k kVar) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Content parseFrom(k kVar, q qVar) {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ContentOrBuilder extends o0 {
        BannerMessage getBanner();

        CardMessage getCard();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        ImageOnlyMessage getImageOnly();

        Content.MessageDetailsCase getMessageDetailsCase();

        ModalMessage getModal();

        boolean hasBanner();

        boolean hasCard();

        boolean hasImageOnly();

        boolean hasModal();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class ImageOnlyMessage extends GeneratedMessageLite<ImageOnlyMessage, Builder> implements ImageOnlyMessageOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final ImageOnlyMessage DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 1;
        private static volatile u0<ImageOnlyMessage> PARSER;
        private Action action_;
        private String imageUrl_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<ImageOnlyMessage, Builder> implements ImageOnlyMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((ImageOnlyMessage) this.instance).clearAction();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((ImageOnlyMessage) this.instance).clearImageUrl();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ImageOnlyMessageOrBuilder
            public Action getAction() {
                return ((ImageOnlyMessage) this.instance).getAction();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ImageOnlyMessageOrBuilder
            public String getImageUrl() {
                return ((ImageOnlyMessage) this.instance).getImageUrl();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ImageOnlyMessageOrBuilder
            public j getImageUrlBytes() {
                return ((ImageOnlyMessage) this.instance).getImageUrlBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ImageOnlyMessageOrBuilder
            public boolean hasAction() {
                return ((ImageOnlyMessage) this.instance).hasAction();
            }

            public Builder mergeAction(Action action) {
                copyOnWrite();
                ((ImageOnlyMessage) this.instance).mergeAction(action);
                return this;
            }

            public Builder setAction(Action action) {
                copyOnWrite();
                ((ImageOnlyMessage) this.instance).setAction(action);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((ImageOnlyMessage) this.instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(j jVar) {
                copyOnWrite();
                ((ImageOnlyMessage) this.instance).setImageUrlBytes(jVar);
                return this;
            }

            private Builder() {
                super(ImageOnlyMessage.DEFAULT_INSTANCE);
            }

            public Builder setAction(Action.Builder builder) {
                copyOnWrite();
                ((ImageOnlyMessage) this.instance).setAction(builder.build());
                return this;
            }
        }

        static {
            ImageOnlyMessage imageOnlyMessage = new ImageOnlyMessage();
            DEFAULT_INSTANCE = imageOnlyMessage;
            GeneratedMessageLite.registerDefaultInstance(ImageOnlyMessage.class, imageOnlyMessage);
        }

        private ImageOnlyMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        public static ImageOnlyMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAction(Action action) {
            action.getClass();
            Action action2 = this.action_;
            if (action2 != null && action2 != Action.getDefaultInstance()) {
                this.action_ = Action.newBuilder(this.action_).mergeFrom((Action.Builder) action).buildPartial();
            } else {
                this.action_ = action;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ImageOnlyMessage parseDelimitedFrom(InputStream inputStream) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImageOnlyMessage parseFrom(ByteBuffer byteBuffer) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<ImageOnlyMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(Action action) {
            action.getClass();
            this.action_ = action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.imageUrl_ = jVar.n();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"imageUrl_", "action_"});
                case 3:
                    return new ImageOnlyMessage();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<ImageOnlyMessage> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (ImageOnlyMessage.class) {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = u0Var;
                            }
                        }
                    }
                    return u0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ImageOnlyMessageOrBuilder
        public Action getAction() {
            Action action = this.action_;
            return action == null ? Action.getDefaultInstance() : action;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ImageOnlyMessageOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ImageOnlyMessageOrBuilder
        public j getImageUrlBytes() {
            return j.d(this.imageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ImageOnlyMessageOrBuilder
        public boolean hasAction() {
            return this.action_ != null;
        }

        public static Builder newBuilder(ImageOnlyMessage imageOnlyMessage) {
            return DEFAULT_INSTANCE.createBuilder(imageOnlyMessage);
        }

        public static ImageOnlyMessage parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ImageOnlyMessage parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ImageOnlyMessage parseFrom(j jVar) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ImageOnlyMessage parseFrom(j jVar, q qVar) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ImageOnlyMessage parseFrom(byte[] bArr) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ImageOnlyMessage parseFrom(byte[] bArr, q qVar) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static ImageOnlyMessage parseFrom(InputStream inputStream) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImageOnlyMessage parseFrom(InputStream inputStream, q qVar) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ImageOnlyMessage parseFrom(k kVar) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ImageOnlyMessage parseFrom(k kVar, q qVar) {
            return (ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ImageOnlyMessageOrBuilder extends o0 {
        Action getAction();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        String getImageUrl();

        j getImageUrlBytes();

        boolean hasAction();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class ModalMessage extends GeneratedMessageLite<ModalMessage, Builder> implements ModalMessageOrBuilder {
        public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
        public static final int ACTION_FIELD_NUMBER = 5;
        public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final ModalMessage DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 3;
        private static volatile u0<ModalMessage> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private Button actionButton_;
        private Action action_;
        private Text body_;
        private Text title_;
        private String imageUrl_ = "";
        private String backgroundHexColor_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<ModalMessage, Builder> implements ModalMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((ModalMessage) this.instance).clearAction();
                return this;
            }

            public Builder clearActionButton() {
                copyOnWrite();
                ((ModalMessage) this.instance).clearActionButton();
                return this;
            }

            public Builder clearBackgroundHexColor() {
                copyOnWrite();
                ((ModalMessage) this.instance).clearBackgroundHexColor();
                return this;
            }

            public Builder clearBody() {
                copyOnWrite();
                ((ModalMessage) this.instance).clearBody();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((ModalMessage) this.instance).clearImageUrl();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((ModalMessage) this.instance).clearTitle();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public Action getAction() {
                return ((ModalMessage) this.instance).getAction();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public Button getActionButton() {
                return ((ModalMessage) this.instance).getActionButton();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public String getBackgroundHexColor() {
                return ((ModalMessage) this.instance).getBackgroundHexColor();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public j getBackgroundHexColorBytes() {
                return ((ModalMessage) this.instance).getBackgroundHexColorBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public Text getBody() {
                return ((ModalMessage) this.instance).getBody();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public String getImageUrl() {
                return ((ModalMessage) this.instance).getImageUrl();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public j getImageUrlBytes() {
                return ((ModalMessage) this.instance).getImageUrlBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public Text getTitle() {
                return ((ModalMessage) this.instance).getTitle();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public boolean hasAction() {
                return ((ModalMessage) this.instance).hasAction();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public boolean hasActionButton() {
                return ((ModalMessage) this.instance).hasActionButton();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public boolean hasBody() {
                return ((ModalMessage) this.instance).hasBody();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
            public boolean hasTitle() {
                return ((ModalMessage) this.instance).hasTitle();
            }

            public Builder mergeAction(Action action) {
                copyOnWrite();
                ((ModalMessage) this.instance).mergeAction(action);
                return this;
            }

            public Builder mergeActionButton(Button button) {
                copyOnWrite();
                ((ModalMessage) this.instance).mergeActionButton(button);
                return this;
            }

            public Builder mergeBody(Text text) {
                copyOnWrite();
                ((ModalMessage) this.instance).mergeBody(text);
                return this;
            }

            public Builder mergeTitle(Text text) {
                copyOnWrite();
                ((ModalMessage) this.instance).mergeTitle(text);
                return this;
            }

            public Builder setAction(Action action) {
                copyOnWrite();
                ((ModalMessage) this.instance).setAction(action);
                return this;
            }

            public Builder setActionButton(Button button) {
                copyOnWrite();
                ((ModalMessage) this.instance).setActionButton(button);
                return this;
            }

            public Builder setBackgroundHexColor(String str) {
                copyOnWrite();
                ((ModalMessage) this.instance).setBackgroundHexColor(str);
                return this;
            }

            public Builder setBackgroundHexColorBytes(j jVar) {
                copyOnWrite();
                ((ModalMessage) this.instance).setBackgroundHexColorBytes(jVar);
                return this;
            }

            public Builder setBody(Text text) {
                copyOnWrite();
                ((ModalMessage) this.instance).setBody(text);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((ModalMessage) this.instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(j jVar) {
                copyOnWrite();
                ((ModalMessage) this.instance).setImageUrlBytes(jVar);
                return this;
            }

            public Builder setTitle(Text text) {
                copyOnWrite();
                ((ModalMessage) this.instance).setTitle(text);
                return this;
            }

            private Builder() {
                super(ModalMessage.DEFAULT_INSTANCE);
            }

            public Builder setAction(Action.Builder builder) {
                copyOnWrite();
                ((ModalMessage) this.instance).setAction(builder.build());
                return this;
            }

            public Builder setActionButton(Button.Builder builder) {
                copyOnWrite();
                ((ModalMessage) this.instance).setActionButton(builder.build());
                return this;
            }

            public Builder setBody(Text.Builder builder) {
                copyOnWrite();
                ((ModalMessage) this.instance).setBody(builder.build());
                return this;
            }

            public Builder setTitle(Text.Builder builder) {
                copyOnWrite();
                ((ModalMessage) this.instance).setTitle(builder.build());
                return this;
            }
        }

        static {
            ModalMessage modalMessage = new ModalMessage();
            DEFAULT_INSTANCE = modalMessage;
            GeneratedMessageLite.registerDefaultInstance(ModalMessage.class, modalMessage);
        }

        private ModalMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionButton() {
            this.actionButton_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundHexColor() {
            this.backgroundHexColor_ = getDefaultInstance().getBackgroundHexColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBody() {
            this.body_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = null;
        }

        public static ModalMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAction(Action action) {
            action.getClass();
            Action action2 = this.action_;
            if (action2 != null && action2 != Action.getDefaultInstance()) {
                this.action_ = Action.newBuilder(this.action_).mergeFrom((Action.Builder) action).buildPartial();
            } else {
                this.action_ = action;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeActionButton(Button button) {
            button.getClass();
            Button button2 = this.actionButton_;
            if (button2 != null && button2 != Button.getDefaultInstance()) {
                this.actionButton_ = Button.newBuilder(this.actionButton_).mergeFrom((Button.Builder) button).buildPartial();
            } else {
                this.actionButton_ = button;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBody(Text text) {
            text.getClass();
            Text text2 = this.body_;
            if (text2 != null && text2 != Text.getDefaultInstance()) {
                this.body_ = Text.newBuilder(this.body_).mergeFrom((Text.Builder) text).buildPartial();
            } else {
                this.body_ = text;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTitle(Text text) {
            text.getClass();
            Text text2 = this.title_;
            if (text2 != null && text2 != Text.getDefaultInstance()) {
                this.title_ = Text.newBuilder(this.title_).mergeFrom((Text.Builder) text).buildPartial();
            } else {
                this.title_ = text;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ModalMessage parseDelimitedFrom(InputStream inputStream) {
            return (ModalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ModalMessage parseFrom(ByteBuffer byteBuffer) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<ModalMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(Action action) {
            action.getClass();
            this.action_ = action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionButton(Button button) {
            button.getClass();
            this.actionButton_ = button;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundHexColor(String str) {
            str.getClass();
            this.backgroundHexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundHexColorBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.backgroundHexColor_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBody(Text text) {
            text.getClass();
            this.body_ = text;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.imageUrl_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(Text text) {
            text.getClass();
            this.title_ = text;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005\t\u0006Ȉ", new Object[]{"title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
                case 3:
                    return new ModalMessage();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<ModalMessage> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (ModalMessage.class) {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = u0Var;
                            }
                        }
                    }
                    return u0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public Action getAction() {
            Action action = this.action_;
            return action == null ? Action.getDefaultInstance() : action;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public Button getActionButton() {
            Button button = this.actionButton_;
            return button == null ? Button.getDefaultInstance() : button;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public String getBackgroundHexColor() {
            return this.backgroundHexColor_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public j getBackgroundHexColorBytes() {
            return j.d(this.backgroundHexColor_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public Text getBody() {
            Text text = this.body_;
            return text == null ? Text.getDefaultInstance() : text;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public j getImageUrlBytes() {
            return j.d(this.imageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public Text getTitle() {
            Text text = this.title_;
            return text == null ? Text.getDefaultInstance() : text;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public boolean hasAction() {
            return this.action_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public boolean hasActionButton() {
            return this.actionButton_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public boolean hasBody() {
            return this.body_ != null;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.ModalMessageOrBuilder
        public boolean hasTitle() {
            return this.title_ != null;
        }

        public static Builder newBuilder(ModalMessage modalMessage) {
            return DEFAULT_INSTANCE.createBuilder(modalMessage);
        }

        public static ModalMessage parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ModalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ModalMessage parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ModalMessage parseFrom(j jVar) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ModalMessage parseFrom(j jVar, q qVar) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ModalMessage parseFrom(byte[] bArr) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ModalMessage parseFrom(byte[] bArr, q qVar) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static ModalMessage parseFrom(InputStream inputStream) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ModalMessage parseFrom(InputStream inputStream, q qVar) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ModalMessage parseFrom(k kVar) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ModalMessage parseFrom(k kVar, q qVar) {
            return (ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ModalMessageOrBuilder extends o0 {
        Action getAction();

        Button getActionButton();

        String getBackgroundHexColor();

        j getBackgroundHexColorBytes();

        Text getBody();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        String getImageUrl();

        j getImageUrlBytes();

        Text getTitle();

        boolean hasAction();

        boolean hasActionButton();

        boolean hasBody();

        boolean hasTitle();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class Text extends GeneratedMessageLite<Text, Builder> implements TextOrBuilder {
        private static final Text DEFAULT_INSTANCE;
        public static final int HEX_COLOR_FIELD_NUMBER = 2;
        private static volatile u0<Text> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String hexColor_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<Text, Builder> implements TextOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearHexColor() {
                copyOnWrite();
                ((Text) this.instance).clearHexColor();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((Text) this.instance).clearText();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.TextOrBuilder
            public String getHexColor() {
                return ((Text) this.instance).getHexColor();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.TextOrBuilder
            public j getHexColorBytes() {
                return ((Text) this.instance).getHexColorBytes();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.TextOrBuilder
            public String getText() {
                return ((Text) this.instance).getText();
            }

            @Override // com.google.firebase.inappmessaging.MessagesProto.TextOrBuilder
            public j getTextBytes() {
                return ((Text) this.instance).getTextBytes();
            }

            public Builder setHexColor(String str) {
                copyOnWrite();
                ((Text) this.instance).setHexColor(str);
                return this;
            }

            public Builder setHexColorBytes(j jVar) {
                copyOnWrite();
                ((Text) this.instance).setHexColorBytes(jVar);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((Text) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(j jVar) {
                copyOnWrite();
                ((Text) this.instance).setTextBytes(jVar);
                return this;
            }

            private Builder() {
                super(Text.DEFAULT_INSTANCE);
            }
        }

        static {
            Text text = new Text();
            DEFAULT_INSTANCE = text;
            GeneratedMessageLite.registerDefaultInstance(Text.class, text);
        }

        private Text() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHexColor() {
            this.hexColor_ = getDefaultInstance().getHexColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static Text getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Text parseDelimitedFrom(InputStream inputStream) {
            return (Text) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Text parseFrom(ByteBuffer byteBuffer) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<Text> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHexColor(String str) {
            str.getClass();
            this.hexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHexColorBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.hexColor_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.text_ = jVar.n();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "hexColor_"});
                case 3:
                    return new Text();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<Text> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (Text.class) {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = u0Var;
                            }
                        }
                    }
                    return u0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.TextOrBuilder
        public String getHexColor() {
            return this.hexColor_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.TextOrBuilder
        public j getHexColorBytes() {
            return j.d(this.hexColor_);
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.TextOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.google.firebase.inappmessaging.MessagesProto.TextOrBuilder
        public j getTextBytes() {
            return j.d(this.text_);
        }

        public static Builder newBuilder(Text text) {
            return DEFAULT_INSTANCE.createBuilder(text);
        }

        public static Text parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Text) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Text parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Text parseFrom(j jVar) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Text parseFrom(j jVar, q qVar) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Text parseFrom(byte[] bArr) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Text parseFrom(byte[] bArr, q qVar) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Text parseFrom(InputStream inputStream) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Text parseFrom(InputStream inputStream, q qVar) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Text parseFrom(k kVar) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Text parseFrom(k kVar, q qVar) {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface TextOrBuilder extends o0 {
        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        String getHexColor();

        j getHexColorBytes();

        String getText();

        j getTextBytes();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    private MessagesProto() {
    }

    public static void registerAllExtensions(q qVar) {
    }
}
