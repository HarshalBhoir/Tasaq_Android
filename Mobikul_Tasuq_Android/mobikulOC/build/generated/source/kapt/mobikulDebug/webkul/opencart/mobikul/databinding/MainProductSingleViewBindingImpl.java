package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainProductSingleViewBindingImpl extends MainProductSingleViewBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.product_layout, 11);
        sViewsWithIds.put(R.id.ll_main, 12);
    }
    // views
    @NonNull
    private final android.widget.Button mboundView10;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback134;
    @Nullable
    private final android.view.View.OnClickListener mCallback132;
    @Nullable
    private final android.view.View.OnClickListener mCallback129;
    @Nullable
    private final android.view.View.OnClickListener mCallback133;
    @Nullable
    private final android.view.View.OnClickListener mCallback130;
    @Nullable
    private final android.view.View.OnClickListener mCallback131;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainProductSingleViewBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private MainProductSingleViewBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[1]
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[4]
            );
        this.llParent.setTag(null);
        this.mboundView10 = (android.widget.Button) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.productCardv.setTag(null);
        this.productImage.setTag(null);
        this.productname.setTag(null);
        this.productprice.setTag(null);
        this.specialProductPrice.setTag(null);
        this.wishlist.setTag(null);
        setRootTag(root);
        // listeners
        mCallback134 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 6);
        mCallback132 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        mCallback129 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback133 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 5);
        mCallback130 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback131 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.status == variableId) {
            setStatus((webkul.opencart.mobikul.HomeFeatureStatus) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((webkul.opencart.mobikul.handlers.MainActivityHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.HomePageAdapteModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable webkul.opencart.mobikul.HomeFeatureStatus Status) {
        this.mStatus = Status;
    }
    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.MainActivityHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.HomePageAdapteModel Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
        boolean androidDatabindingViewDataBindingSafeUnboxDataIsAr = false;
        java.lang.String dataDominiantColor = null;
        java.lang.String dataProduct = null;
        int validCheckSpecialPriceDataSpecialPriceProductpriceAndroidColorLightGrayProductpriceAndroidColorV3PriceColor = 0;
        boolean androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus = false;
        java.lang.String dataImageUrl = null;
        webkul.opencart.mobikul.handlers.MainActivityHandler handler = mHandler;
        boolean validCheckSpecialDataSpecialPrice = false;
        java.lang.Boolean dataIsAr = null;
        java.lang.String dataFormattedSpecial = null;
        int dataIsArViewVISIBLEViewGONE = 0;
        webkul.opencart.mobikul.adapterModel.HomePageAdapteModel data = mData;
        boolean validCheckSpecialPriceDataSpecialPrice = false;
        int validCheckSpecialDataSpecialPriceViewVISIBLEViewVISIBLE = 0;
        int validCheckSpecialPriceDataSpecialPriceViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable dataWishlistStatusWishlistAndroidDrawableWishlistSelectedWishlistAndroidDrawableWishlishv3ProductPage = null;
        java.lang.String dataPrice = null;
        java.lang.String validCheckSpecialAtHomeDataSpecialPriceDataFormattedSpecialDataPrice = null;
        android.graphics.drawable.Drawable dataWishlistStatusMboundView9AndroidDrawableWishlistSelectedMboundView9AndroidDrawableWishlishv3ProductPage = null;
        java.lang.String dataSpecialPrice = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.wishlist_status
                    dataWishlistStatus = data.getWishlist_status();
                    // read data.dominiantColor
                    dataDominiantColor = data.getDominiantColor();
                    // read data.product
                    dataProduct = data.getProduct();
                    // read data.ImageUrl
                    dataImageUrl = data.getImageUrl();
                    // read data.isAr()
                    dataIsAr = data.isAr();
                    // read data.formattedSpecial
                    dataFormattedSpecial = data.getFormattedSpecial();
                    // read data.price
                    dataPrice = data.getPrice();
                    // read data.specialPrice
                    dataSpecialPrice = data.getSpecialPrice();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status)
                androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus = android.databinding.ViewDataBinding.safeUnbox(dataWishlistStatus);
                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr())
                androidDatabindingViewDataBindingSafeUnboxDataIsAr = android.databinding.ViewDataBinding.safeUnbox(dataIsAr);
                // read valid.checkSpecial(data.specialPrice)
                validCheckSpecialDataSpecialPrice = webkul.opencart.mobikul.utils.Validation.checkSpecial(dataSpecialPrice);
                // read valid.checkSpecialPrice(data.specialPrice)
                validCheckSpecialPriceDataSpecialPrice = webkul.opencart.mobikul.utils.Validation.checkSpecialPrice(dataSpecialPrice);
                // read valid.checkSpecialAtHome(data.specialPrice, data.formattedSpecial, data.price)
                validCheckSpecialAtHomeDataSpecialPriceDataFormattedSpecialDataPrice = webkul.opencart.mobikul.utils.Validation.checkSpecialAtHome(dataSpecialPrice, dataFormattedSpecial, dataPrice);
            if((dirtyFlags & 0xcL) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus) {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataIsAr) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(validCheckSpecialDataSpecialPrice) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(validCheckSpecialPriceDataSpecialPrice) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x400L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlishv3_product_page
                dataWishlistStatusWishlistAndroidDrawableWishlistSelectedWishlistAndroidDrawableWishlishv3ProductPage = ((androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus) ? (getDrawableFromResource(wishlist, R.drawable.wishlist_selected)) : (getDrawableFromResource(wishlist, R.drawable.wishlishv3_product_page)));
                // read android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlishv3_product_page
                dataWishlistStatusMboundView9AndroidDrawableWishlistSelectedMboundView9AndroidDrawableWishlishv3ProductPage = ((androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus) ? (getDrawableFromResource(mboundView9, R.drawable.wishlist_selected)) : (getDrawableFromResource(mboundView9, R.drawable.wishlishv3_product_page)));
                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
                dataIsArViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxDataIsAr) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkSpecial(data.specialPrice) ? View.VISIBLE : View.VISIBLE
                validCheckSpecialDataSpecialPriceViewVISIBLEViewVISIBLE = ((validCheckSpecialDataSpecialPrice) ? (android.view.View.VISIBLE) : (android.view.View.VISIBLE));
                // read valid.checkSpecialPrice(data.specialPrice) ? @android:color/light_gray : @android:color/v3_price_color
                validCheckSpecialPriceDataSpecialPriceProductpriceAndroidColorLightGrayProductpriceAndroidColorV3PriceColor = ((validCheckSpecialPriceDataSpecialPrice) ? (getColorFromResource(productprice, R.color.light_gray)) : (getColorFromResource(productprice, R.color.v3_price_color)));
                // read valid.checkSpecialPrice(data.specialPrice) ? View.VISIBLE : View.GONE
                validCheckSpecialPriceDataSpecialPriceViewVISIBLEViewGONE = ((validCheckSpecialPriceDataSpecialPrice) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.llParent.setOnClickListener(mCallback130);
            this.mboundView10.setOnClickListener(mCallback134);
            this.mboundView9.setOnClickListener(mCallback133);
            this.productCardv.setOnClickListener(mCallback129);
            this.productImage.setOnClickListener(mCallback131);
            this.wishlist.setOnClickListener(mCallback132);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(validCheckSpecialPriceDataSpecialPriceViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(dataIsArViewVISIBLEViewGONE);
            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView9, dataWishlistStatusMboundView9AndroidDrawableWishlistSelectedMboundView9AndroidDrawableWishlishv3ProductPage);
            webkul.opencart.mobikul.utils.ImageLoader.loadImage(this.productImage, dataImageUrl, dataDominiantColor);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productname, dataProduct);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productprice, dataPrice);
            this.productprice.setTextColor(validCheckSpecialPriceDataSpecialPriceProductpriceAndroidColorLightGrayProductpriceAndroidColorV3PriceColor);
            this.productprice.setVisibility(validCheckSpecialDataSpecialPriceViewVISIBLEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.specialProductPrice, validCheckSpecialAtHomeDataSpecialPriceDataFormattedSpecialDataPrice);
            this.specialProductPrice.setVisibility(validCheckSpecialPriceDataSpecialPriceViewVISIBLEViewGONE);
            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.wishlist, dataWishlistStatusWishlistAndroidDrawableWishlistSelectedWishlistAndroidDrawableWishlishv3ProductPage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.MainActivityHandler handler = mHandler;
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
            case 4: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.MainActivityHandler handler = mHandler;
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
                webkul.opencart.mobikul.handlers.MainActivityHandler handler = mHandler;
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
            case 5: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.MainActivityHandler handler = mHandler;
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
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.MainActivityHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.viewMore(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.MainActivityHandler handler = mHandler;
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): handler
        flag 2 (0x3L): data
        flag 3 (0x4L): null
        flag 4 (0x5L): valid.checkSpecialPrice(data.specialPrice) ? @android:color/light_gray : @android:color/v3_price_color
        flag 5 (0x6L): valid.checkSpecialPrice(data.specialPrice) ? @android:color/light_gray : @android:color/v3_price_color
        flag 6 (0x7L): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): valid.checkSpecial(data.specialPrice) ? View.VISIBLE : View.VISIBLE
        flag 9 (0xaL): valid.checkSpecial(data.specialPrice) ? View.VISIBLE : View.VISIBLE
        flag 10 (0xbL): valid.checkSpecialPrice(data.specialPrice) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): valid.checkSpecialPrice(data.specialPrice) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlishv3_product_page
        flag 13 (0xeL): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlishv3_product_page
        flag 14 (0xfL): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlishv3_product_page
        flag 15 (0x10L): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlishv3_product_page
    flag mapping end*/
    //end
}