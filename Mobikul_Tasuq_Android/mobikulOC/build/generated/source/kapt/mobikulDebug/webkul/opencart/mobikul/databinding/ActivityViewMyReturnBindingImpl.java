package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityViewMyReturnBindingImpl extends ActivityViewMyReturnBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.Container, 3);
        sViewsWithIds.put(R.id.heading, 4);
        sViewsWithIds.put(R.id.subHeading1, 5);
        sViewsWithIds.put(R.id.tableLayout, 6);
        sViewsWithIds.put(R.id.return_id, 7);
        sViewsWithIds.put(R.id.date_added, 8);
        sViewsWithIds.put(R.id.order_id, 9);
        sViewsWithIds.put(R.id.order_date, 10);
        sViewsWithIds.put(R.id.subHeading2, 11);
        sViewsWithIds.put(R.id.tableLayout1, 12);
        sViewsWithIds.put(R.id.product_name, 13);
        sViewsWithIds.put(R.id.model, 14);
        sViewsWithIds.put(R.id.quantity, 15);
        sViewsWithIds.put(R.id.reasonValue, 16);
        sViewsWithIds.put(R.id.openedValue, 17);
        sViewsWithIds.put(R.id.actionValue, 18);
        sViewsWithIds.put(R.id.return_comments_layput, 19);
        sViewsWithIds.put(R.id.return_comments_value, 20);
        sViewsWithIds.put(R.id.signupprogress, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityViewMyReturnBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityViewMyReturnBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.TextView) bindings[18]
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[14]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ProgressBar) bindings[21]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TableLayout) bindings[6]
            , (android.widget.TableLayout) bindings[12]
            , (android.view.View) bindings[2]
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