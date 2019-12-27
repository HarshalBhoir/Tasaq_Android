package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PointAndTransactionDetailsBindingImpl extends PointAndTransactionDetailsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.heading, 3);
        sViewsWithIds.put(R.id.ptContainer, 4);
        sViewsWithIds.put(R.id.dataContainer, 5);
        sViewsWithIds.put(R.id.subHeading, 6);
        sViewsWithIds.put(R.id.tableLayout, 7);
        sViewsWithIds.put(R.id.tableRowHeadingLayout, 8);
        sViewsWithIds.put(R.id.TableHeading1, 9);
        sViewsWithIds.put(R.id.TableHeading2, 10);
        sViewsWithIds.put(R.id.TableHeading3, 11);
        sViewsWithIds.put(R.id.progress, 12);
        sViewsWithIds.put(R.id.error_tv, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PointAndTransactionDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private PointAndTransactionDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[12]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TableLayout) bindings[7]
            , (android.widget.TableRow) bindings[8]
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