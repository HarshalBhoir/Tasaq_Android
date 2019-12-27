package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchDialogActivityBindingImpl extends SearchDialogActivityBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dialog, 1);
        sViewsWithIds.put(R.id.back, 2);
        sViewsWithIds.put(R.id.search_edt, 3);
        sViewsWithIds.put(R.id.mlkit, 4);
        sViewsWithIds.put(R.id.empty_search, 5);
        sViewsWithIds.put(R.id.recent_search_container, 6);
        sViewsWithIds.put(R.id.tvSearch, 7);
        sViewsWithIds.put(R.id.recent_search, 8);
        sViewsWithIds.put(R.id.scroll_view, 9);
        sViewsWithIds.put(R.id.category_container, 10);
        sViewsWithIds.put(R.id.tv_category_product, 11);
        sViewsWithIds.put(R.id.category_product, 12);
        sViewsWithIds.put(R.id.latest_product_container, 13);
        sViewsWithIds.put(R.id.tv_latest_product, 14);
        sViewsWithIds.put(R.id.latest_product, 15);
        sViewsWithIds.put(R.id.recent_viewed_container, 16);
        sViewsWithIds.put(R.id.tvView, 17);
        sViewsWithIds.put(R.id.recent_viewed, 18);
        sViewsWithIds.put(R.id.brand_container, 19);
        sViewsWithIds.put(R.id.tv_brand, 20);
        sViewsWithIds.put(R.id.brand_list, 21);
        sViewsWithIds.put(R.id.scroll_view2, 22);
        sViewsWithIds.put(R.id.search_list, 23);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SearchDialogActivityBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private SearchDialogActivityBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[19]
            , (android.support.v7.widget.RecyclerView) bindings[21]
            , (android.widget.LinearLayout) bindings[10]
            , (android.support.v7.widget.RecyclerView) bindings[12]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (android.support.v7.widget.RecyclerView) bindings[15]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.ImageView) bindings[4]
            , (android.support.v7.widget.RecyclerView) bindings[8]
            , (android.widget.LinearLayout) bindings[6]
            , (android.support.v7.widget.RecyclerView) bindings[18]
            , (android.widget.LinearLayout) bindings[16]
            , (android.support.v4.widget.NestedScrollView) bindings[9]
            , (android.support.v4.widget.NestedScrollView) bindings[22]
            , (android.widget.AutoCompleteTextView) bindings[3]
            , (android.support.v7.widget.RecyclerView) bindings[23]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[17]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}