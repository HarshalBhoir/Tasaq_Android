package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CommentToOrdersBindingImpl extends CommentToOrdersBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.addBookheading, 1);
        sViewsWithIds.put(R.id.headingOrderStatus, 2);
        sViewsWithIds.put(R.id.statusSpinner, 3);
        sViewsWithIds.put(R.id.textView, 4);
        sViewsWithIds.put(R.id.notifyCustomer, 5);
        sViewsWithIds.put(R.id.textView2, 6);
        sViewsWithIds.put(R.id.notifyAdmin, 7);
        sViewsWithIds.put(R.id.textView3, 8);
        sViewsWithIds.put(R.id.editText, 9);
        sViewsWithIds.put(R.id.addHistory, 10);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CommentToOrdersBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private CommentToOrdersBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.Button) bindings[10]
            , (android.widget.EditText) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.Spinner) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
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