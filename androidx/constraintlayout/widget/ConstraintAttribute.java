package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import e.g.c.h;
import f.a.b.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class ConstraintAttribute {
    public boolean a;
    public String b;
    public AttributeType c;

    /* renamed from: d  reason: collision with root package name */
    public int f277d;

    /* renamed from: e  reason: collision with root package name */
    public float f278e;

    /* renamed from: f  reason: collision with root package name */
    public String f279f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f280g;

    /* renamed from: h  reason: collision with root package name */
    public int f281h;

    /* loaded from: classes.dex */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.a = false;
        this.b = str;
        this.c = attributeType;
        this.a = z;
        c(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f2180e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    attributeType = AttributeType.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    attributeType = AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            String p = !constraintAttribute.a ? a.p("set", str) : str;
            try {
                switch (constraintAttribute.c.ordinal()) {
                    case 0:
                        cls.getMethod(p, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f277d));
                        break;
                    case 1:
                        cls.getMethod(p, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f278e));
                        break;
                    case 2:
                        cls.getMethod(p, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f281h));
                        break;
                    case 3:
                        Method method = cls.getMethod(p, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f281h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(p, CharSequence.class).invoke(view, constraintAttribute.f279f);
                        break;
                    case 5:
                        cls.getMethod(p, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f280g));
                        break;
                    case 6:
                        cls.getMethod(p, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f278e));
                        break;
                    case 7:
                        cls.getMethod(p, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f277d));
                        break;
                }
            } catch (IllegalAccessException e2) {
                StringBuilder E = a.E(" Custom Attribute \"", str, "\" not found on ");
                E.append(cls.getName());
                Log.e("TransitionLayout", E.toString());
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                Log.e("TransitionLayout", e3.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(p);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e4) {
                StringBuilder E2 = a.E(" Custom Attribute \"", str, "\" not found on ");
                E2.append(cls.getName());
                Log.e("TransitionLayout", E2.toString());
                e4.printStackTrace();
            }
        }
    }

    public void c(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.f277d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f278e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f281h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f279f = (String) obj;
                return;
            case 5:
                this.f280g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f278e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.a = false;
        this.b = constraintAttribute.b;
        this.c = constraintAttribute.c;
        c(obj);
    }
}
