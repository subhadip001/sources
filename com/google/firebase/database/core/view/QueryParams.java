package com.google.firebase.database.core.view;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.filter.IndexedFilter;
import com.google.firebase.database.core.view.filter.LimitedFilter;
import com.google.firebase.database.core.view.filter.NodeFilter;
import com.google.firebase.database.core.view.filter.RangedFilter;
import com.google.firebase.database.snapshot.BooleanNode;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.DoubleNode;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.LongNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import com.google.firebase.database.snapshot.PriorityIndex;
import com.google.firebase.database.snapshot.PriorityUtilities;
import com.google.firebase.database.snapshot.StringNode;
import com.google.firebase.database.util.JsonMapper;
import f.a.b.a.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class QueryParams {
    public static final QueryParams DEFAULT_PARAMS = new QueryParams();
    private static final String INDEX = "i";
    private static final String INDEX_END_NAME = "en";
    private static final String INDEX_END_VALUE = "ep";
    private static final String INDEX_START_NAME = "sn";
    private static final String INDEX_START_VALUE = "sp";
    private static final String LIMIT = "l";
    private static final String VIEW_FROM = "vf";
    private Integer limit;
    private ViewFrom viewFrom;
    private Node indexStartValue = null;
    private ChildKey indexStartName = null;
    private Node indexEndValue = null;
    private ChildKey indexEndName = null;
    private Index index = PriorityIndex.getInstance();
    private String jsonSerialization = null;

    /* renamed from: com.google.firebase.database.core.view.QueryParams$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$database$core$view$QueryParams$ViewFrom;

        static {
            ViewFrom.values();
            int[] iArr = new int[2];
            $SwitchMap$com$google$firebase$database$core$view$QueryParams$ViewFrom = iArr;
            try {
                ViewFrom viewFrom = ViewFrom.LEFT;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$database$core$view$QueryParams$ViewFrom;
                ViewFrom viewFrom2 = ViewFrom.RIGHT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum ViewFrom {
        LEFT,
        RIGHT
    }

    private QueryParams copy() {
        QueryParams queryParams = new QueryParams();
        queryParams.limit = this.limit;
        queryParams.indexStartValue = this.indexStartValue;
        queryParams.indexStartName = this.indexStartName;
        queryParams.indexEndValue = this.indexEndValue;
        queryParams.indexEndName = this.indexEndName;
        queryParams.viewFrom = this.viewFrom;
        queryParams.index = this.index;
        return queryParams;
    }

    public static QueryParams fromQueryObject(Map<String, Object> map) {
        QueryParams queryParams = new QueryParams();
        queryParams.limit = (Integer) map.get(LIMIT);
        if (map.containsKey(INDEX_START_VALUE)) {
            queryParams.indexStartValue = normalizeValue(NodeUtilities.NodeFromJSON(map.get(INDEX_START_VALUE)));
            String str = (String) map.get(INDEX_START_NAME);
            if (str != null) {
                queryParams.indexStartName = ChildKey.fromString(str);
            }
        }
        if (map.containsKey(INDEX_END_VALUE)) {
            queryParams.indexEndValue = normalizeValue(NodeUtilities.NodeFromJSON(map.get(INDEX_END_VALUE)));
            String str2 = (String) map.get(INDEX_END_NAME);
            if (str2 != null) {
                queryParams.indexEndName = ChildKey.fromString(str2);
            }
        }
        String str3 = (String) map.get(VIEW_FROM);
        if (str3 != null) {
            queryParams.viewFrom = str3.equals(LIMIT) ? ViewFrom.LEFT : ViewFrom.RIGHT;
        }
        String str4 = (String) map.get(INDEX);
        if (str4 != null) {
            queryParams.index = Index.fromQueryDefinition(str4);
        }
        return queryParams;
    }

    private static Node normalizeValue(Node node) {
        if ((node instanceof StringNode) || (node instanceof BooleanNode) || (node instanceof DoubleNode) || (node instanceof EmptyNode)) {
            return node;
        }
        if (node instanceof LongNode) {
            return new DoubleNode(Double.valueOf(((Long) node.getValue()).doubleValue()), PriorityUtilities.NullPriority());
        }
        StringBuilder A = a.A("Unexpected value passed to normalizeValue: ");
        A.append(node.getValue());
        throw new IllegalStateException(A.toString());
    }

    public QueryParams endAt(Node node, ChildKey childKey) {
        Utilities.hardAssert(node.isLeafNode() || node.isEmpty());
        Utilities.hardAssert(!(node instanceof LongNode));
        QueryParams copy = copy();
        copy.indexEndValue = node;
        copy.indexEndName = childKey;
        return copy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueryParams.class != obj.getClass()) {
            return false;
        }
        QueryParams queryParams = (QueryParams) obj;
        Integer num = this.limit;
        if (num == null ? queryParams.limit == null : num.equals(queryParams.limit)) {
            Index index = this.index;
            if (index == null ? queryParams.index == null : index.equals(queryParams.index)) {
                ChildKey childKey = this.indexEndName;
                if (childKey == null ? queryParams.indexEndName == null : childKey.equals(queryParams.indexEndName)) {
                    Node node = this.indexEndValue;
                    if (node == null ? queryParams.indexEndValue == null : node.equals(queryParams.indexEndValue)) {
                        ChildKey childKey2 = this.indexStartName;
                        if (childKey2 == null ? queryParams.indexStartName == null : childKey2.equals(queryParams.indexStartName)) {
                            Node node2 = this.indexStartValue;
                            if (node2 == null ? queryParams.indexStartValue == null : node2.equals(queryParams.indexStartValue)) {
                                return isViewFromLeft() == queryParams.isViewFromLeft();
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public Index getIndex() {
        return this.index;
    }

    public ChildKey getIndexEndName() {
        if (hasEnd()) {
            ChildKey childKey = this.indexEndName;
            return childKey != null ? childKey : ChildKey.getMaxName();
        }
        throw new IllegalArgumentException("Cannot get index end name if start has not been set");
    }

    public Node getIndexEndValue() {
        if (hasEnd()) {
            return this.indexEndValue;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public ChildKey getIndexStartName() {
        if (hasStart()) {
            ChildKey childKey = this.indexStartName;
            return childKey != null ? childKey : ChildKey.getMinName();
        }
        throw new IllegalArgumentException("Cannot get index start name if start has not been set");
    }

    public Node getIndexStartValue() {
        if (hasStart()) {
            return this.indexStartValue;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    public int getLimit() {
        if (hasLimit()) {
            return this.limit.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public NodeFilter getNodeFilter() {
        if (loadsAllData()) {
            return new IndexedFilter(getIndex());
        }
        if (hasLimit()) {
            return new LimitedFilter(this);
        }
        return new RangedFilter(this);
    }

    public Map<String, Object> getWireProtocolParams() {
        HashMap hashMap = new HashMap();
        if (hasStart()) {
            hashMap.put(INDEX_START_VALUE, this.indexStartValue.getValue());
            ChildKey childKey = this.indexStartName;
            if (childKey != null) {
                hashMap.put(INDEX_START_NAME, childKey.asString());
            }
        }
        if (hasEnd()) {
            hashMap.put(INDEX_END_VALUE, this.indexEndValue.getValue());
            ChildKey childKey2 = this.indexEndName;
            if (childKey2 != null) {
                hashMap.put(INDEX_END_NAME, childKey2.asString());
            }
        }
        Integer num = this.limit;
        if (num != null) {
            hashMap.put(LIMIT, num);
            ViewFrom viewFrom = this.viewFrom;
            if (viewFrom == null) {
                if (hasStart()) {
                    viewFrom = ViewFrom.LEFT;
                } else {
                    viewFrom = ViewFrom.RIGHT;
                }
            }
            int ordinal = viewFrom.ordinal();
            if (ordinal == 0) {
                hashMap.put(VIEW_FROM, LIMIT);
            } else if (ordinal == 1) {
                hashMap.put(VIEW_FROM, "r");
            }
        }
        if (!this.index.equals(PriorityIndex.getInstance())) {
            hashMap.put(INDEX, this.index.getQueryDefinition());
        }
        return hashMap;
    }

    public boolean hasAnchoredLimit() {
        return hasLimit() && this.viewFrom != null;
    }

    public boolean hasEnd() {
        return this.indexEndValue != null;
    }

    public boolean hasLimit() {
        return this.limit != null;
    }

    public boolean hasStart() {
        return this.indexStartValue != null;
    }

    public int hashCode() {
        Integer num = this.limit;
        int intValue = (((num != null ? num.intValue() : 0) * 31) + (isViewFromLeft() ? 1231 : 1237)) * 31;
        Node node = this.indexStartValue;
        int hashCode = (intValue + (node != null ? node.hashCode() : 0)) * 31;
        ChildKey childKey = this.indexStartName;
        int hashCode2 = (hashCode + (childKey != null ? childKey.hashCode() : 0)) * 31;
        Node node2 = this.indexEndValue;
        int hashCode3 = (hashCode2 + (node2 != null ? node2.hashCode() : 0)) * 31;
        ChildKey childKey2 = this.indexEndName;
        int hashCode4 = (hashCode3 + (childKey2 != null ? childKey2.hashCode() : 0)) * 31;
        Index index = this.index;
        return hashCode4 + (index != null ? index.hashCode() : 0);
    }

    public boolean isDefault() {
        return loadsAllData() && this.index.equals(PriorityIndex.getInstance());
    }

    public boolean isValid() {
        return (hasStart() && hasEnd() && hasLimit() && !hasAnchoredLimit()) ? false : true;
    }

    public boolean isViewFromLeft() {
        ViewFrom viewFrom = this.viewFrom;
        return viewFrom != null ? viewFrom == ViewFrom.LEFT : hasStart();
    }

    public QueryParams limitToFirst(int i2) {
        QueryParams copy = copy();
        copy.limit = Integer.valueOf(i2);
        copy.viewFrom = ViewFrom.LEFT;
        return copy;
    }

    public QueryParams limitToLast(int i2) {
        QueryParams copy = copy();
        copy.limit = Integer.valueOf(i2);
        copy.viewFrom = ViewFrom.RIGHT;
        return copy;
    }

    public boolean loadsAllData() {
        return (hasStart() || hasEnd() || hasLimit()) ? false : true;
    }

    public QueryParams orderBy(Index index) {
        QueryParams copy = copy();
        copy.index = index;
        return copy;
    }

    public QueryParams startAt(Node node, ChildKey childKey) {
        Utilities.hardAssert(node.isLeafNode() || node.isEmpty());
        Utilities.hardAssert(!(node instanceof LongNode));
        QueryParams copy = copy();
        copy.indexStartValue = node;
        copy.indexStartName = childKey;
        return copy;
    }

    public String toJSON() {
        if (this.jsonSerialization == null) {
            try {
                this.jsonSerialization = JsonMapper.serializeJson(getWireProtocolParams());
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return this.jsonSerialization;
    }

    public String toString() {
        return getWireProtocolParams().toString();
    }
}
