package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyWishlistBindingImpl extends ItemMyWishlistBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.newTheme_layout, 11);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyWishlistBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemMyWishlistBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[7]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.LinearLayout) bindings[1]
            );
        this.addToCart.setTag(null);
        this.delete.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.name.setTag(null);
        this.newAddrContainer.setTag(null);
        this.newPrice.setTag(null);
        this.productImage.setTag(null);
        this.sku.setTag(null);
        this.special.setTag(null);
        this.wishlistItemDetailLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback32 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback31 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
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
            setHandler((webkul.opencart.mobikul.handlers.GetWishlistHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.GetWishlistAdapterModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.GetWishlistHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.GetWishlistAdapterModel Data) {
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
        int validCheckSpecialPriceDataProductSpecailPriceViewVISIBLEViewGONE = 0;
        boolean validCheckSpecialPriceDataProductSpecailPrice = false;
        boolean androidDatabindingViewDataBindingSafeUnboxDataIsAr = false;
        java.lang.String dataDomiantColor = null;
        java.lang.String dataProductPrice = null;
        webkul.opencart.mobikul.handlers.GetWishlistHandler handler = mHandler;
        java.lang.Boolean dataIsAr = null;
        java.lang.String dataAvailable = null;
        int validCheckSpecialPriceDataProductSpecailPriceNewPriceAndroidColorLightGrayNewPriceAndroidColorV3PriceColor = 0;
        java.lang.String dataProductSpecailPrice = null;
        java.lang.String dataFormattedSpecial = null;
        java.lang.String dataProductName = null;
        int dataIsArViewVISIBLEViewGONE = 0;
        java.lang.String dataProductImage = null;
        webkul.opencart.mobikul.adapterModel.GetWishlistAdapterModel data = mData;
        java.lang.String dataModel = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.domiantColor
                    dataDomiantColor = data.getDomiantColor();
                    // read data.productPrice
                    dataProductPrice = data.getProductPrice();
                    // read data.isAr()
                    dataIsAr = data.isAr();
                    // read data.available
                    dataAvailable = data.getAvailable();
                    // read data.productSpecailPrice
                    dataProductSpecailPrice = data.getProductSpecailPrice();
                    // read data.formattedSpecial
                    dataFormattedSpecial = data.getFormattedSpecial();
                    // read data.productName
                    dataProductName = data.getProductName();
                    // read data.productImage
                    dataProductImage = data.getProductImage();
                    // read data.model
                    dataModel = data.getModel();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr())
                androidDatabindingViewDataBindingSafeUnboxDataIsAr = android.databinding.ViewDataBinding.safeUnbox(dataIsAr);
                // read valid.checkSpecialPrice(data.productSpecailPrice)
                validCheckSpecialPriceDataProductSpecailPrice = webkul.opencart.mobikul.utils.Validation.checkSpecialPrice(dataProductSpecailPrice);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataIsAr) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckSpecialPriceDataProductSpecailPrice) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
                dataIsArViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxDataIsAr) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkSpecialPrice(data.productSpecailPrice) ? View.VISIBLE : View.GONE
                validCheckSpecialPriceDataProductSpecailPriceViewVISIBLEViewGONE = ((validCheckSpecialPriceDataProductSpecailPrice) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkSpecialPrice(data.productSpecailPrice) ? @android:color/light_gray : @android:color/v3_price_color
                validCheckSpecialPriceDataProductSpecailPriceNewPriceAndroidColorLightGrayNewPriceAndroidColorV3PriceColor = ((validCheckSpecialPriceDataProductSpecailPrice) ? (getColorFromResource(newPrice, R.color.light_gray)) : (getColorFromResource(newPrice, R.color.v3_price_color)));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addToCart.setOnClickListener(mCallback32);
            this.delete.setOnClickListener(mCallback31);
            this.wishlistItemDetailLayout.setOnClickListener(mCallback30);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(dataIsArViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataModel);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.name, dataProductName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.newPrice, dataProductPrice);
            this.newPrice.setTextColor(validCheckSpecialPriceDataProductSpecailPriceNewPriceAndroidColorLightGrayNewPriceAndroidColorV3PriceColor);
            webkul.opencart.mobikul.utils.ImageLoader.loadImage(this.productImage, dataProductImage, dataDomiantColor);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.sku, dataAvailable);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.special, dataFormattedSpecial);
            this.special.setVisibility(validCheckSpecialPriceDataProductSpecailPriceViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.GetWishlistHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.GetWishlistAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickProduct(data);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.GetWishlistHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.GetWishlistAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickAddtoCart(data);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.GetWishlistHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.GetWishlistAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickRemoveFromWishlist(data);
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
        flag 3 (0x4L): valid.checkSpecialPrice(data.productSpecailPrice) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): valid.checkSpecialPrice(data.productSpecailPrice) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): valid.checkSpecialPrice(data.productSpecailPrice) ? @android:color/light_gray : @android:color/v3_price_color
        flag 6 (0x7L): valid.checkSpecialPrice(data.productSpecailPrice) ? @android:color/light_gray : @android:color/v3_price_color
        flag 7 (0x8L): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}