package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySubCategoryV4ThemeBindingImpl extends ActivitySubCategoryV4ThemeBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.container, 3);
        sViewsWithIds.put(R.id.tablayout, 4);
        sViewsWithIds.put(R.id.pager, 5);
        sViewsWithIds.put(R.id.navigation_view, 6);
        sViewsWithIds.put(R.id.nav_drawer_recycler_view, 7);
        sViewsWithIds.put(R.id.nav_drawer_recycler_view_language, 8);
        sViewsWithIds.put(R.id.nav_drawer_recycler_view_currency, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySubCategoryV4ThemeBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivitySubCategoryV4ThemeBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.support.v4.widget.DrawerLayout) bindings[0]
            , (android.support.v7.widget.RecyclerView) bindings[7]
            , (android.support.v7.widget.RecyclerView) bindings[9]
            , (android.support.v7.widget.RecyclerView) bindings[8]
            , (android.support.design.widget.NavigationView) bindings[6]
            , (android.support.v4.view.ViewPager) bindings[5]
            , (android.support.design.widget.TabLayout) bindings[4]
            , (android.view.View) bindings[2]
            );
        this.appbar.setTag(null);
        this.drawerLayout.setTag(null);
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