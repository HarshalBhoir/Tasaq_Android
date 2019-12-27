package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProductGridViewBindingImpl extends ItemProductGridViewBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.relative, 11);
        sViewsWithIds.put(R.id.productImageLayout, 12);
        sViewsWithIds.put(R.id.outOfStock, 13);
        sViewsWithIds.put(R.id.sale, 14);
        sViewsWithIds.put(R.id.trans, 15);
        sViewsWithIds.put(R.id.relativeLayout, 16);
        sViewsWithIds.put(R.id.tv_add_to_cart, 17);
        sViewsWithIds.put(R.id.linearLayout, 18);
        sViewsWithIds.put(R.id.textView6, 19);
        sViewsWithIds.put(R.id.productInfoLayout, 20);
        sViewsWithIds.put(R.id.productInfoLayoutInner, 21);
        sViewsWithIds.put(R.id.sellerStringTV, 22);
        sViewsWithIds.put(R.id.model, 23);
        sViewsWithIds.put(R.id.productInfoLayoutPrice, 24);
        sViewsWithIds.put(R.id.btnLayout, 25);
        sViewsWithIds.put(R.id.addToCartPop, 26);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    @Nullable
    private final android.view.View.OnClickListener mCallback86;
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProductGridViewBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ItemProductGridViewBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[10]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.LinearLayout) bindings[25]
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.RelativeLayout) bindings[24]
            , (android.widget.TextView) bindings[5]
            , (android.widget.RatingBar) bindings[7]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[19]
            , (android.widget.RelativeLayout) bindings[15]
            , (android.widget.TextView) bindings[17]
            , (android.widget.ImageView) bindings[3]
            );
        this.addToCart.setTag(null);
        this.cardViewNewsletter.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.newPrice.setTag(null);
        this.price.setTag(null);
        this.productImage.setTag(null);
        this.productName.setTag(null);
        this.ratingBar.setTag(null);
        this.shortDescription.setTag(null);
        this.wishlist.setTag(null);
        setRootTag(root);
        // listeners
        mCallback83 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback86 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        mCallback84 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback85 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
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
            setHandler((webkul.opencart.mobikul.handlers.CategoryActivityHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.CategoryActivityHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.Product Data) {
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
        int validCheckSpecialPriceDataIsFormatedSpecialPriceViewVISIBLEViewGONE = 0;
        java.lang.Boolean dataWishlistStatus = null;
        boolean validCheckIntDataRating = false;
        boolean validCheckSpecialPriceDataIsFormatedSpecialPrice = false;
        int ValidCheckSpecialPriceDataIsFormatedSpecialPriceViewVISIBLEViewGONE1 = 0;
        java.lang.String dataIsFormatedSpecialPrice = null;
        java.lang.String dataShortDescription = null;
        boolean androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus = false;
        webkul.opencart.mobikul.handlers.CategoryActivityHandler handler = mHandler;
        java.lang.String dataDominantColor = null;
        boolean validCheckSpecialDataIsFormatedSpecialPrice = false;
        java.lang.String dataImgUrl = null;
        java.lang.String dataProductName = null;
        java.lang.String dataFormatedSpecial = null;
        webkul.opencart.mobikul.Product data = mData;
        java.lang.Boolean dataAr = null;
        java.lang.String DataIsFormatedSpecialPrice1 = null;
        int validCheckSpecialDataIsFormatedSpecialPriceViewVISIBLEViewVISIBLE = 0;
        android.graphics.drawable.Drawable dataWishlistStatusWishlistAndroidDrawableWishlistSelectedWishlistAndroidDrawableWishlishv3ProductPage = null;
        int validCheckIntDataRatingViewVISIBLEViewINVISIBLE = 0;
        int validCheckDescriptionDataShortDescriptionViewVISIBLEViewGONE = 0;
        int dataRating = 0;
        boolean androidDatabindingViewDataBindingSafeUnboxDataAr = false;
        int dataArViewVISIBLEViewGONE = 0;
        java.lang.String dataPrice = null;
        java.lang.String validCheckSpecialAtHomeDataIsFormatedSpecialPriceDataFormatedSpecialDataPrice = null;
        boolean validCheckDescriptionDataShortDescription = false;
        boolean ValidCheckSpecialPriceDataIsFormatedSpecialPrice1 = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.wishlist_status
                    dataWishlistStatus = data.isWishlist_status();
                    // read data.isFormatedSpecialPrice
                    dataIsFormatedSpecialPrice = data.isFormatedSpecialPrice();
                    // read data.shortDescription
                    dataShortDescription = data.getShortDescription();
                    // read data.dominantColor
                    dataDominantColor = data.getDominantColor();
                    // read data.img_url
                    dataImgUrl = data.getImg_url();
                    // read data.productName
                    dataProductName = data.getProductName();
                    // read data.formatedSpecial
                    dataFormatedSpecial = data.getFormatedSpecial();
                    // read data.ar
                    dataAr = data.getAr();
                    // read data.isFormatedSpecialPrice()
                    DataIsFormatedSpecialPrice1 = data.isFormatedSpecialPrice();
                    // read data.rating
                    dataRating = data.getRating();
                    // read data.price
                    dataPrice = data.getPrice();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status)
                androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus = android.databinding.ViewDataBinding.safeUnbox(dataWishlistStatus);
                // read valid.checkSpecialPrice(data.isFormatedSpecialPrice)
                validCheckSpecialPriceDataIsFormatedSpecialPrice = webkul.opencart.mobikul.utils.Validation.checkSpecialPrice(dataIsFormatedSpecialPrice);
                // read valid.checkDescription(data.shortDescription)
                validCheckDescriptionDataShortDescription = webkul.opencart.mobikul.utils.Validation.checkDescription(dataShortDescription);
                // read android.databinding.ViewDataBinding.safeUnbox(data.ar)
                androidDatabindingViewDataBindingSafeUnboxDataAr = android.databinding.ViewDataBinding.safeUnbox(dataAr);
                // read valid.checkSpecial(data.isFormatedSpecialPrice())
                validCheckSpecialDataIsFormatedSpecialPrice = webkul.opencart.mobikul.utils.Validation.checkSpecial(DataIsFormatedSpecialPrice1);
                // read valid.checkSpecialPrice(data.isFormatedSpecialPrice())
                ValidCheckSpecialPriceDataIsFormatedSpecialPrice1 = webkul.opencart.mobikul.utils.Validation.checkSpecialPrice(DataIsFormatedSpecialPrice1);
                // read valid.checkInt(data.rating)
                validCheckIntDataRating = webkul.opencart.mobikul.utils.Validation.checkInt(dataRating);
                // read valid.checkSpecialAtHome(data.isFormatedSpecialPrice(), data.formatedSpecial, data.price)
                validCheckSpecialAtHomeDataIsFormatedSpecialPriceDataFormatedSpecialDataPrice = webkul.opencart.mobikul.utils.Validation.checkSpecialAtHome(DataIsFormatedSpecialPrice1, dataFormatedSpecial, dataPrice);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckSpecialPriceDataIsFormatedSpecialPrice) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckDescriptionDataShortDescription) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataAr) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckSpecialDataIsFormatedSpecialPrice) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(ValidCheckSpecialPriceDataIsFormatedSpecialPrice1) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckIntDataRating) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlishv3_product_page
                dataWishlistStatusWishlistAndroidDrawableWishlistSelectedWishlistAndroidDrawableWishlishv3ProductPage = ((androidDatabindingViewDataBindingSafeUnboxDataWishlistStatus) ? (getDrawableFromResource(wishlist, R.drawable.wishlist_selected)) : (getDrawableFromResource(wishlist, R.drawable.wishlishv3_product_page)));
                // read valid.checkSpecialPrice(data.isFormatedSpecialPrice) ? View.VISIBLE : View.GONE
                validCheckSpecialPriceDataIsFormatedSpecialPriceViewVISIBLEViewGONE = ((validCheckSpecialPriceDataIsFormatedSpecialPrice) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkDescription(data.shortDescription) ? View.VISIBLE : View.GONE
                validCheckDescriptionDataShortDescriptionViewVISIBLEViewGONE = ((validCheckDescriptionDataShortDescription) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read android.databinding.ViewDataBinding.safeUnbox(data.ar) ? View.VISIBLE : View.GONE
                dataArViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxDataAr) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkSpecial(data.isFormatedSpecialPrice()) ? View.VISIBLE : View.VISIBLE
                validCheckSpecialDataIsFormatedSpecialPriceViewVISIBLEViewVISIBLE = ((validCheckSpecialDataIsFormatedSpecialPrice) ? (android.view.View.VISIBLE) : (android.view.View.VISIBLE));
                // read valid.checkSpecialPrice(data.isFormatedSpecialPrice()) ? View.VISIBLE : View.GONE
                ValidCheckSpecialPriceDataIsFormatedSpecialPriceViewVISIBLEViewGONE1 = ((ValidCheckSpecialPriceDataIsFormatedSpecialPrice1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkInt(data.rating) ? View.VISIBLE : View.INVISIBLE
                validCheckIntDataRatingViewVISIBLEViewINVISIBLE = ((validCheckIntDataRating) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addToCart.setOnClickListener(mCallback86);
            this.cardViewNewsletter.setOnClickListener(mCallback83);
            this.productImage.setOnClickListener(mCallback84);
            this.wishlist.setOnClickListener(mCallback85);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(validCheckSpecialPriceDataIsFormatedSpecialPriceViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(dataArViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.newPrice, dataPrice);
            this.newPrice.setVisibility(validCheckSpecialDataIsFormatedSpecialPriceViewVISIBLEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.price, validCheckSpecialAtHomeDataIsFormatedSpecialPriceDataFormatedSpecialDataPrice);
            this.price.setVisibility(ValidCheckSpecialPriceDataIsFormatedSpecialPriceViewVISIBLEViewGONE1);
            webkul.opencart.mobikul.utils.ImageLoader.loadImage(this.productImage, dataImgUrl, dataDominantColor);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productName, dataProductName);
            android.databinding.adapters.RatingBarBindingAdapter.setRating(this.ratingBar, dataRating);
            this.ratingBar.setVisibility(validCheckIntDataRatingViewVISIBLEViewINVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.shortDescription, dataShortDescription);
            this.shortDescription.setVisibility(validCheckDescriptionDataShortDescriptionViewVISIBLEViewGONE);
            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.wishlist, dataWishlistStatusWishlistAndroidDrawableWishlistSelectedWishlistAndroidDrawableWishlishv3ProductPage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CategoryActivityHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.Product data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickProduct(callbackArg_0, data);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CategoryActivityHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.Product data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddToCart(callbackArg_0, data);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CategoryActivityHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.Product data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickProduct(callbackArg_0, data);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CategoryActivityHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.Product data = mData;



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
        flag 3 (0x4L): valid.checkSpecialPrice(data.isFormatedSpecialPrice) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): valid.checkSpecialPrice(data.isFormatedSpecialPrice) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): valid.checkSpecialPrice(data.isFormatedSpecialPrice()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): valid.checkSpecialPrice(data.isFormatedSpecialPrice()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): valid.checkSpecial(data.isFormatedSpecialPrice()) ? View.VISIBLE : View.VISIBLE
        flag 8 (0x9L): valid.checkSpecial(data.isFormatedSpecialPrice()) ? View.VISIBLE : View.VISIBLE
        flag 9 (0xaL): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlishv3_product_page
        flag 10 (0xbL): android.databinding.ViewDataBinding.safeUnbox(data.wishlist_status) ? @android:drawable/wishlist_selected : @android:drawable/wishlishv3_product_page
        flag 11 (0xcL): valid.checkInt(data.rating) ? View.VISIBLE : View.INVISIBLE
        flag 12 (0xdL): valid.checkInt(data.rating) ? View.VISIBLE : View.INVISIBLE
        flag 13 (0xeL): valid.checkDescription(data.shortDescription) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): valid.checkDescription(data.shortDescription) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): android.databinding.ViewDataBinding.safeUnbox(data.ar) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): android.databinding.ViewDataBinding.safeUnbox(data.ar) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}