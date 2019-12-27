package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDashboardBindingImpl extends ActivityDashboardBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.appbar, 3);
        sViewsWithIds.put(R.id.banner_dashboard, 4);
        sViewsWithIds.put(R.id.dashboardContainer, 5);
        sViewsWithIds.put(R.id.heading, 6);
        sViewsWithIds.put(R.id.recentordersheading, 7);
        sViewsWithIds.put(R.id.newslettersheading, 8);
        sViewsWithIds.put(R.id.newslettersinfo, 9);
        sViewsWithIds.put(R.id.dashboardprogress, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDashboardBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityDashboardBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.support.design.widget.CollapsingToolbarLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.ProgressBar) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.support.design.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[2]
            );
        this.collapsingToolbar.setTag(null);
        this.mainContent.setTag(null);
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