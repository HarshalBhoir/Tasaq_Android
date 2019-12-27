package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityQrCategoryBindingImpl extends ActivityQrCategoryBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 6);
        sViewsWithIds.put(R.id.listCategoryContainer, 7);
        sViewsWithIds.put(R.id.notificationLayout, 8);
        sViewsWithIds.put(R.id.notificationMessage, 9);
        sViewsWithIds.put(R.id.line2, 10);
        sViewsWithIds.put(R.id.funtionBar, 11);
        sViewsWithIds.put(R.id.shop_by_button_layout, 12);
        sViewsWithIds.put(R.id.sort_by_button_layout, 13);
        sViewsWithIds.put(R.id.view_switcher_button_layout, 14);
        sViewsWithIds.put(R.id.view1, 15);
        sViewsWithIds.put(R.id.view2, 16);
        sViewsWithIds.put(R.id.subCategoryRecyclerView, 17);
        sViewsWithIds.put(R.id.vendorLayout, 18);
        sViewsWithIds.put(R.id.venderBannerImage, 19);
        sViewsWithIds.put(R.id.venderLogo, 20);
        sViewsWithIds.put(R.id.venderName, 21);
        sViewsWithIds.put(R.id.venderStoreAddress, 22);
        sViewsWithIds.put(R.id.my_recycler_view, 23);
        sViewsWithIds.put(R.id.error_tv, 24);
        sViewsWithIds.put(R.id.listcategoryRequestBar, 25);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityQrCategoryBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private ActivityQrCategoryBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.view.View) bindings[10]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.ProgressBar) bindings[25]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.support.v7.widget.RecyclerView) bindings[23]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[13]
            , (android.support.v7.widget.RecyclerView) bindings[17]
            , (android.view.View) bindings[6]
            , (android.widget.ImageView) bindings[19]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[22]
            , (android.widget.LinearLayout) bindings[18]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[16]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.LinearLayout) bindings[14]
            );
        this.appbar.setTag(null);
        this.filter.setTag(null);
        this.gotoinstoreGoogleMap.setTag(null);
        this.mainContent.setTag(null);
        this.sort.setTag(null);
        this.viewSwitcher.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback42 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        mCallback40 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback41 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.model.qrscannerModel.QrScannerModel) variable);
        }
        else if (BR.handlers == variableId) {
            setHandlers((webkul.opencart.mobikul.handlers.QrScannerActivityHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable webkul.opencart.mobikul.model.qrscannerModel.QrScannerModel Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setHandlers(@Nullable webkul.opencart.mobikul.handlers.QrScannerActivityHandler Handlers) {
        this.mHandlers = Handlers;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        webkul.opencart.mobikul.model.qrscannerModel.QrScannerModel data = mData;
        webkul.opencart.mobikul.handlers.QrScannerActivityHandler handlers = mHandlers;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.filter.setOnClickListener(mCallback39);
            this.gotoinstoreGoogleMap.setOnClickListener(mCallback42);
            this.sort.setOnClickListener(mCallback40);
            this.viewSwitcher.setOnClickListener(mCallback41);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.QrScannerActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickShopBy(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.QrScannerActivityHandler handlers = mHandlers;
                // data
                webkul.opencart.mobikul.model.qrscannerModel.QrScannerModel data = mData;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.gotoGoogleMap(data);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.QrScannerActivityHandler handlers = mHandlers;
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
                webkul.opencart.mobikul.handlers.QrScannerActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickViewSwitcher(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): handlers
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}