package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SimilarProductsBindingImpl extends SimilarProductsBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.relative, 8);
        sViewsWithIds.put(R.id.productImageLayout, 9);
        sViewsWithIds.put(R.id.outOfStock, 10);
        sViewsWithIds.put(R.id.sale, 11);
        sViewsWithIds.put(R.id.trans, 12);
        sViewsWithIds.put(R.id.relativeLayout, 13);
        sViewsWithIds.put(R.id.tv_add_to_cart, 14);
        sViewsWithIds.put(R.id.linearLayout, 15);
        sViewsWithIds.put(R.id.textView6, 16);
        sViewsWithIds.put(R.id.productInfoLayout, 17);
        sViewsWithIds.put(R.id.productInfoLayoutInner, 18);
        sViewsWithIds.put(R.id.shortDescription, 19);
        sViewsWithIds.put(R.id.sellerStringTV, 20);
        sViewsWithIds.put(R.id.ratingBar, 21);
        sViewsWithIds.put(R.id.model, 22);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback77;
    @Nullable
    private final android.view.View.OnClickListener mCallback78;
    @Nullable
    private final android.view.View.OnClickListener mCallback76;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SimilarProductsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private SimilarProductsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.button.MaterialButton) bindings[7]
            , (android.support.design.card.MaterialCardView) bindings[0]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.RatingBar) bindings[21]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[16]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.ImageView) bindings[6]
            );
        this.addToCart.setTag(null);
        this.cardViewNewsletter.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.productImage.setTag(null);
        this.productName.setTag(null);
        this.productprice.setTag(null);
        this.specialProductPrice.setTag(null);
        this.wishlist.setTag(null);
        setRootTag(root);
        // listeners
        mCallback77 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback78 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback76 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
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
            setHandler((webkul.opencart.mobikul.handlers.SimilarProductHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.SimiliarProductsAdapterModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.SimilarProductHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.SimiliarProductsAdapterModel Data) {
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
        boolean validCheckSpecialPriceDataIsProductSpecial = false;
        boolean androidDatabindingViewDataBindingSafeUnboxDataIsAr = false;
        java.lang.String dataIsProductSpecial = null;
        java.lang.String dataProductPrice = null;
        int validCheckSpecialPriceDataIsProductSpecialViewVISIBLEViewGONE = 0;
        webkul.opencart.mobikul.handlers.SimilarProductHandler handler = mHandler;
        java.lang.String dataDominantColor = null;
        java.lang.Boolean dataIsAr = null;
        java.lang.String dataFormatedPrice = null;
        java.lang.String dataProductName = null;
        int dataIsArViewVISIBLEViewGONE = 0;
        java.lang.String dataProductImage = null;
        webkul.opencart.mobikul.adapterModel.SimiliarProductsAdapterModel data = mData;
        int validCheckSpecialPriceDataIsProductSpecialProductpriceAndroidColorLightGrayProductpriceAndroidColorV3PriceColor = 0;
        int validCheckSpecialPriceDataIsProductSpecialViewVISIBLEViewVISIBLE = 0;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.isProductSpecial()
                    dataIsProductSpecial = data.isProductSpecial();
                    // read data.productPrice
                    dataProductPrice = data.getProductPrice();
                    // read data.dominantColor
                    dataDominantColor = data.getDominantColor();
                    // read data.isAr()
                    dataIsAr = data.isAr();
                    // read data.formatedPrice
                    dataFormatedPrice = data.getFormatedPrice();
                    // read data.productName
                    dataProductName = data.getProductName();
                    // read data.productImage
                    dataProductImage = data.getProductImage();
                }


                // read valid.checkSpecialPrice(data.isProductSpecial())
                validCheckSpecialPriceDataIsProductSpecial = webkul.opencart.mobikul.utils.Validation.checkSpecialPrice(dataIsProductSpecial);
                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr())
                androidDatabindingViewDataBindingSafeUnboxDataIsAr = android.databinding.ViewDataBinding.safeUnbox(dataIsAr);
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckSpecialPriceDataIsProductSpecial) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataIsAr) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read valid.checkSpecialPrice(data.isProductSpecial()) ? View.VISIBLE : View.GONE
                validCheckSpecialPriceDataIsProductSpecialViewVISIBLEViewGONE = ((validCheckSpecialPriceDataIsProductSpecial) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkSpecialPrice(data.isProductSpecial()) ? @android:color/light_gray : @android:color/v3_price_color
                validCheckSpecialPriceDataIsProductSpecialProductpriceAndroidColorLightGrayProductpriceAndroidColorV3PriceColor = ((validCheckSpecialPriceDataIsProductSpecial) ? (getColorFromResource(productprice, R.color.light_gray)) : (getColorFromResource(productprice, R.color.v3_price_color)));
                // read valid.checkSpecialPrice(data.isProductSpecial()) ? View.VISIBLE : View.VISIBLE
                validCheckSpecialPriceDataIsProductSpecialViewVISIBLEViewVISIBLE = ((validCheckSpecialPriceDataIsProductSpecial) ? (android.view.View.VISIBLE) : (android.view.View.VISIBLE));
                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
                dataIsArViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxDataIsAr) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addToCart.setOnClickListener(mCallback78);
            this.cardViewNewsletter.setOnClickListener(mCallback76);
            this.wishlist.setOnClickListener(mCallback77);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(dataIsArViewVISIBLEViewGONE);
            webkul.opencart.mobikul.utils.ImageLoader.loadImage(this.productImage, dataProductImage, dataDominantColor);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productName, dataProductName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productprice, dataProductPrice);
            this.productprice.setTextColor(validCheckSpecialPriceDataIsProductSpecialProductpriceAndroidColorLightGrayProductpriceAndroidColorV3PriceColor);
            this.productprice.setVisibility(validCheckSpecialPriceDataIsProductSpecialViewVISIBLEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.specialProductPrice, dataFormatedPrice);
            this.specialProductPrice.setVisibility(validCheckSpecialPriceDataIsProductSpecialViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.SimilarProductHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.SimiliarProductsAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddToWishlist(callbackArg_0, data);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.SimilarProductHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.SimiliarProductsAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddToCart(callbackArg_0, data);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.SimilarProductHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.SimiliarProductsAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickProduct(callbackArg_0, data);
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
        flag 3 (0x4L): valid.checkSpecialPrice(data.isProductSpecial()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): valid.checkSpecialPrice(data.isProductSpecial()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): valid.checkSpecialPrice(data.isProductSpecial()) ? @android:color/light_gray : @android:color/v3_price_color
        flag 8 (0x9L): valid.checkSpecialPrice(data.isProductSpecial()) ? @android:color/light_gray : @android:color/v3_price_color
        flag 9 (0xaL): valid.checkSpecialPrice(data.isProductSpecial()) ? View.VISIBLE : View.VISIBLE
        flag 10 (0xbL): valid.checkSpecialPrice(data.isProductSpecial()) ? View.VISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}