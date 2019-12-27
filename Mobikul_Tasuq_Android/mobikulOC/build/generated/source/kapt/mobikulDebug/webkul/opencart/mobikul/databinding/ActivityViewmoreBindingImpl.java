package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityViewmoreBindingImpl extends ActivityViewmoreBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.listCategoryContainer, 4);
        sViewsWithIds.put(R.id.notificationLayout, 5);
        sViewsWithIds.put(R.id.notificationMessage, 6);
        sViewsWithIds.put(R.id.line2, 7);
        sViewsWithIds.put(R.id.sort_by_button_layout, 8);
        sViewsWithIds.put(R.id.sort, 9);
        sViewsWithIds.put(R.id.view_list, 10);
        sViewsWithIds.put(R.id.listcategoryRequestBar, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityViewmoreBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityViewmoreBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.support.design.widget.FloatingActionButton) bindings[2]
            , (android.view.View) bindings[7]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.ProgressBar) bindings[11]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[9]
            , (android.widget.LinearLayout) bindings[8]
            , (android.view.View) bindings[3]
            , (android.support.v7.widget.RecyclerView) bindings[10]
            );
        this.appbar.setTag(null);
        this.fab.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback52 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.handlers == variableId) {
            setHandlers((webkul.opencart.mobikul.handlers.CategoryActivityHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandlers(@Nullable webkul.opencart.mobikul.handlers.CategoryActivityHandler Handlers) {
        this.mHandlers = Handlers;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handlers);
        super.requestRebind();
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
        webkul.opencart.mobikul.handlers.CategoryActivityHandler handlers = mHandlers;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.fab.setOnClickListener(mCallback52);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handlers
        webkul.opencart.mobikul.handlers.CategoryActivityHandler handlers = mHandlers;
        // handlers != null
        boolean handlersJavaLangObjectNull = false;



        handlersJavaLangObjectNull = (handlers) != (null);
        if (handlersJavaLangObjectNull) {



            handlers.onClickSortByViewMore(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handlers
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}