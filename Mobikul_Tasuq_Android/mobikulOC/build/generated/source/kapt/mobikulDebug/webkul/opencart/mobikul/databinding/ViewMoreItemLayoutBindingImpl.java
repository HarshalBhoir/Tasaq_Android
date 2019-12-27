package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewMoreItemLayoutBindingImpl extends ViewMoreItemLayoutBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.product_layout, 8);
        sViewsWithIds.put(R.id.ll_parent, 9);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.Button mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback89;
    @Nullable
    private final android.view.View.OnClickListener mCallback90;
    @Nullable
    private final android.view.View.OnClickListener mCallback88;
    @Nullable
    private final android.view.View.OnClickListener mCallback91;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewMoreItemLayoutBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ViewMoreItemLayoutBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[9]
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[3]
            );
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.productCardv.setTag(null);
        this.productImage.setTag(null);
        this.productname.setTag(null);
        this.productprice.setTag(null);
        this.specialProductPrice.setTag(null);
        this.wishlist.setTag(null);
        setRootTag(root);
        // listeners
        mCallback89 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback90 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback88 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback91 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
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
            setHandler((webkul.opencart.mobikul.handlers.ViewMoreHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.HomePageAdapteModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.ViewMoreHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.HomePageAdapteModel Data) {
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
        java.lang.String dataDominiantColor = null;
        java.lang.String dataProduct = null;
        int validCheckSpecialPriceDataSpecialPriceProductpriceAndroidColorLightGrayProductpriceAndroidColorV3PriceColor = 0;
        boolean androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus = false;
        java.lang.String dataImageUrl = null;
        webkul.opencart.mobikul.handlers.ViewMoreHandler handler = mHandler;
        boolean validCheckSpecialDataSpecialPrice = false;
        java.lang.String dataFormattedSpecial = null;
        webkul.opencart.mobikul.adapterModel.HomePageAdapteModel data = mData;
        boolean validCheckSpecialPriceDataSpecialPrice = false;
        int validCheckSpecialDataSpecialPriceViewVISIBLEViewVISIBLE = 0;
        android.graphics.drawable.Drawable dataWishlistStatusWishlistAndroidDrawableWishlistSelectedWishlistAndroidDrawableWishlistV3Unselected = null;
        int validCheckSpecialPriceDataSpecialPriceViewVISIBLEViewGONE = 0;
        java.lang.String dataPrice = null;
        java.lang.String validCheckSpecialAtHomeDataSpecialPriceDataFormattedSpecialDataPrice = null;
        java.lang.String dataSpecialPrice = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.wishlist_status
                    dataWishlistStatus = data.getWishlist_status();
                    // read data.dominiantColor
                    dataDominiantColor = data.getDominiantColor();
                    // read data.product
                    dataProduct = data.getProduct();
                    // read data.ImageUrl
                    dataImageUrl = data.getImageUrl();
                    // read data.formattedSpecial
                    dataFormattedSpecial = data.getFormattedSpecial();
                    // read data.price
                    dataPrice = data.getPrice();
                    // read data.specialPrice
                    dataSpecialPrice = data.getSpecialPrice();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status)
                androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus = android.databinding.ViewDataBinding.safeUnbox(dataWishlistStatus);
                // read valid.checkSpecial(data.specialPrice)
                validCheckSpecialDataSpecialPrice = webkul.opencart.mobikul.utils.Validation.checkSpecial(dataSpecialPrice);
                // read valid.checkSpecialPrice(data.specialPrice)
                validCheckSpecialPriceDataSpecialPrice = webkul.opencart.mobikul.utils.Validation.checkSpecialPrice(dataSpecialPrice);
                // read valid.checkSpecialAtHome(data.specialPrice, data.formattedSpecial, data.price)
                validCheckSpecialAtHomeDataSpecialPriceDataFormattedSpecialDataPrice = webkul.opencart.mobikul.utils.Validation.checkSpecialAtHome(dataSpecialPrice, dataFormattedSpecial, dataPrice);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckSpecialDataSpecialPrice) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckSpecialPriceDataSpecialPrice) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x200L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlist_v3_unselected
                dataWishlistStatusWishlistAndroidDrawableWishlistSelectedWishlistAndroidDrawableWishlistV3Unselected = ((androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus) ? (getDrawableFromResource(wishlist, R.drawable.wishlist_selected)) : (getDrawableFromResource(wishlist, R.drawable.wishlist_v3_unselected)));
                // read valid.checkSpecial(data.specialPrice) ? View.VISIBLE : View.VISIBLE
                validCheckSpecialDataSpecialPriceViewVISIBLEViewVISIBLE = ((validCheckSpecialDataSpecialPrice) ? (android.view.View.VISIBLE) : (android.view.View.VISIBLE));
                // read valid.checkSpecialPrice(data.specialPrice) ? @android:color/light_gray : @android:color/v3_price_color
                validCheckSpecialPriceDataSpecialPriceProductpriceAndroidColorLightGrayProductpriceAndroidColorV3PriceColor = ((validCheckSpecialPriceDataSpecialPrice) ? (getColorFromResource(productprice, R.color.light_gray)) : (getColorFromResource(productprice, R.color.v3_price_color)));
                // read valid.checkSpecialPrice(data.specialPrice) ? View.VISIBLE : View.GONE
                validCheckSpecialPriceDataSpecialPriceViewVISIBLEViewGONE = ((validCheckSpecialPriceDataSpecialPrice) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(validCheckSpecialPriceDataSpecialPriceViewVISIBLEViewGONE);
            webkul.opencart.mobikul.utils.ImageLoader.loadImage(this.productImage, dataImageUrl, dataDominiantColor);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productname, dataProduct);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productprice, dataPrice);
            this.productprice.setTextColor(validCheckSpecialPriceDataSpecialPriceProductpriceAndroidColorLightGrayProductpriceAndroidColorV3PriceColor);
            this.productprice.setVisibility(validCheckSpecialDataSpecialPriceViewVISIBLEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.specialProductPrice, validCheckSpecialAtHomeDataSpecialPriceDataFormattedSpecialDataPrice);
            this.specialProductPrice.setVisibility(validCheckSpecialPriceDataSpecialPriceViewVISIBLEViewGONE);
            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.wishlist, dataWishlistStatusWishlistAndroidDrawableWishlistSelectedWishlistAndroidDrawableWishlistV3Unselected);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(mCallback91);
            this.productCardv.setOnClickListener(mCallback88);
            this.productImage.setOnClickListener(mCallback89);
            this.wishlist.setOnClickListener(mCallback90);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewMoreHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.HomePageAdapteModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickImage(callbackArg_0, data);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewMoreHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.HomePageAdapteModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddToWishlist(callbackArg_0, data);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewMoreHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.HomePageAdapteModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickImage(callbackArg_0, data);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewMoreHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.HomePageAdapteModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddToCart(callbackArg_0, data);
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
        flag 3 (0x4L): valid.checkSpecialPrice(data.specialPrice) ? @android:color/light_gray : @android:color/v3_price_color
        flag 4 (0x5L): valid.checkSpecialPrice(data.specialPrice) ? @android:color/light_gray : @android:color/v3_price_color
        flag 5 (0x6L): valid.checkSpecial(data.specialPrice) ? View.VISIBLE : View.VISIBLE
        flag 6 (0x7L): valid.checkSpecial(data.specialPrice) ? View.VISIBLE : View.VISIBLE
        flag 7 (0x8L): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlist_v3_unselected
        flag 8 (0x9L): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlist_v3_unselected
        flag 9 (0xaL): valid.checkSpecialPrice(data.specialPrice) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): valid.checkSpecialPrice(data.specialPrice) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}