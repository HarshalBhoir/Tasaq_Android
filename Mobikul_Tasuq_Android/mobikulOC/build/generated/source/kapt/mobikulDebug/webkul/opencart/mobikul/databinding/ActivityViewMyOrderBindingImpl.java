package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityViewMyOrderBindingImpl extends ActivityViewMyOrderBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.heading, 3);
        sViewsWithIds.put(R.id.linearLaoyutBtns, 4);
        sViewsWithIds.put(R.id.cancelOrderAction, 5);
        sViewsWithIds.put(R.id.sendmailAction, 6);
        sViewsWithIds.put(R.id.invoiceAction, 7);
        sViewsWithIds.put(R.id.paycomissionAction, 8);
        sViewsWithIds.put(R.id.viewOrderLayout, 9);
        sViewsWithIds.put(R.id.viewmyorderheading, 10);
        sViewsWithIds.put(R.id.invoicesView, 11);
        sViewsWithIds.put(R.id.refundsView, 12);
        sViewsWithIds.put(R.id.shipmentsView, 13);
        sViewsWithIds.put(R.id.myproreviewprogress, 14);
        sViewsWithIds.put(R.id.change_password_info, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityViewMyOrderBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityViewMyOrderBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[15]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[14]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[13]
            , (android.view.View) bindings[2]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[10]
            );
        this.appbar.setTag(null);
        this.mostParenLayout.setTag(null);
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