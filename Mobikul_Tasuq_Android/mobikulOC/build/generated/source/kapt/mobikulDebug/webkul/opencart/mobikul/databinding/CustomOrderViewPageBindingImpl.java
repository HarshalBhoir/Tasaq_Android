package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CustomOrderViewPageBindingImpl extends CustomOrderViewPageBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_order_id, 1);
        sViewsWithIds.put(R.id.tv_order_date, 2);
        sViewsWithIds.put(R.id.order_status, 3);
        sViewsWithIds.put(R.id.tv_order_shippingaddressheading, 4);
        sViewsWithIds.put(R.id.tv_order_shippingaddress, 5);
        sViewsWithIds.put(R.id.tv_order_billingaddressheading, 6);
        sViewsWithIds.put(R.id.tv_order_billingaddress, 7);
        sViewsWithIds.put(R.id.shipping_method_title, 8);
        sViewsWithIds.put(R.id.shipping_method, 9);
        sViewsWithIds.put(R.id.tv_order_paymentmethodheading, 10);
        sViewsWithIds.put(R.id.tv_order_paymentmethod, 11);
        sViewsWithIds.put(R.id.dboy, 12);
        sViewsWithIds.put(R.id.tv_order_status, 13);
        sViewsWithIds.put(R.id.productLayout, 14);
        sViewsWithIds.put(R.id.order_history, 15);
        sViewsWithIds.put(R.id.history_container, 16);
        sViewsWithIds.put(R.id.tableLayout, 17);
        sViewsWithIds.put(R.id.tv_gift_certificate, 18);
        sViewsWithIds.put(R.id.tv_can_reorder, 19);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CustomOrderViewPageBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private CustomOrderViewPageBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[16]
            , (android.support.design.card.MaterialCardView) bindings[15]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TableLayout) bindings[17]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[13]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
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