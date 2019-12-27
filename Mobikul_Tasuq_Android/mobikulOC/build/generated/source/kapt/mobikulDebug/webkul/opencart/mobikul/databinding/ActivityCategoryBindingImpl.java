package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCategoryBindingImpl extends ActivityCategoryBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.listCategoryContainer, 6);
        sViewsWithIds.put(R.id.notificationLayout, 7);
        sViewsWithIds.put(R.id.notificationMessage, 8);
        sViewsWithIds.put(R.id.line2, 9);
        sViewsWithIds.put(R.id.funtionBar, 10);
        sViewsWithIds.put(R.id.shop_by_button_layout, 11);
        sViewsWithIds.put(R.id.sort_by_button_layout, 12);
        sViewsWithIds.put(R.id.view_switcher_button_layout, 13);
        sViewsWithIds.put(R.id.view1, 14);
        sViewsWithIds.put(R.id.view2, 15);
        sViewsWithIds.put(R.id.subCategoryRecyclerView, 16);
        sViewsWithIds.put(R.id.vendorLayout, 17);
        sViewsWithIds.put(R.id.my_recycler_view, 18);
        sViewsWithIds.put(R.id.error_tv, 19);
        sViewsWithIds.put(R.id.listcategoryRequestBar, 20);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback106;
    @Nullable
    private final android.view.View.OnClickListener mCallback107;
    @Nullable
    private final android.view.View.OnClickListener mCallback105;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCategoryBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityCategoryBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[10]
            , (android.view.View) bindings[9]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.ProgressBar) bindings[20]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.support.v7.widget.RecyclerView) bindings[18]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[12]
            , (android.support.v7.widget.RecyclerView) bindings[16]
            , (android.view.View) bindings[5]
            , (android.widget.LinearLayout) bindings[17]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[15]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.LinearLayout) bindings[13]
            );
        this.appbar.setTag(null);
        this.filter.setTag(null);
        this.mainContent.setTag(null);
        this.sort.setTag(null);
        this.viewSwitcher.setTag(null);
        setRootTag(root);
        // listeners
        mCallback106 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback107 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback105 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
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

            this.filter.setOnClickListener(mCallback105);
            this.sort.setOnClickListener(mCallback106);
            this.viewSwitcher.setOnClickListener(mCallback107);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.CategoryActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickSortBy(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.CategoryActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickViewSwitcher(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.CategoryActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickShopBy(callbackArg_0);
                }
                break;
            }
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