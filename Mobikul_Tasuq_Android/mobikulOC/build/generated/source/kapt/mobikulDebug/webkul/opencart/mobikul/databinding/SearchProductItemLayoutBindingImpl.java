package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchProductItemLayoutBindingImpl extends SearchProductItemLayoutBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.firstItem, 4);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SearchProductItemLayoutBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private SearchProductItemLayoutBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mainLinear.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.productImage.setTag(null);
        this.search.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback8 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback10 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
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
        if (BR.handler == variableId) {
            setHandler((webkul.opencart.mobikul.handlers.RecentSearchHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.model.getHomePage.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.RecentSearchHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.model.getHomePage.Product Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.data);
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
        java.lang.Boolean dataWishlistStatus = null;
        boolean androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus = false;
        webkul.opencart.mobikul.handlers.RecentSearchHandler handler = mHandler;
        java.lang.String dataName = null;
        webkul.opencart.mobikul.model.getHomePage.Product data = mData;
        android.graphics.drawable.Drawable dataWishlistStatusMboundView3AndroidDrawableWishlistSelectedMboundView3AndroidDrawableWishlistV3Unselected = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.wishlist_status
                    dataWishlistStatus = data.getWishlist_status();
                    // read data.name
                    dataName = data.getName();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status)
                androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus = android.databinding.ViewDataBinding.safeUnbox(dataWishlistStatus);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlist_v3_unselected
                dataWishlistStatusMboundView3AndroidDrawableWishlistSelectedMboundView3AndroidDrawableWishlistV3Unselected = ((androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus) ? (getDrawableFromResource(mboundView3, R.drawable.wishlist_selected)) : (getDrawableFromResource(mboundView3, R.drawable.wishlist_v3_unselected)));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback10);
            this.productImage.setOnClickListener(mCallback8);
            this.search.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView3, dataWishlistStatusMboundView3AndroidDrawableWishlistSelectedMboundView3AndroidDrawableWishlistV3Unselected);
            this.search.setText(dataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.RecentSearchHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getHomePage.Product data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickViewedLatestProd(callbackArg_0, data);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.RecentSearchHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getHomePage.Product data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickViewedLatestProd(callbackArg_0, data);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.RecentSearchHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getHomePage.Product data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddToWishlist(callbackArg_0, data);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): data
        flag 2 (0x3L): null
        flag 3 (0x4L): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlist_v3_unselected
        flag 4 (0x5L): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlist_v3_unselected
    flag mapping end*/
    //end
}