package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCartBindingImpl extends ItemCartBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cart_layout, 16);
        sViewsWithIds.put(R.id.moveTOWishList, 17);
        sViewsWithIds.put(R.id.optionsLL, 18);
        sViewsWithIds.put(R.id.errorLL, 19);
        sViewsWithIds.put(R.id.qtyTV, 20);
        sViewsWithIds.put(R.id.deleteBtn, 21);
        sViewsWithIds.put(R.id.qtyLayout, 22);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCartBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ItemCartBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[13]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[14]
            );
        this.addQty.setTag(null);
        this.delete.setTag(null);
        this.layoutContainer.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.productCustomOptions.setTag(null);
        this.productImage.setTag(null);
        this.productName.setTag(null);
        this.productPrice.setTag(null);
        this.qty.setTag(null);
        this.sellerStringTV.setTag(null);
        this.subQty.setTag(null);
        this.subTotal.setTag(null);
        this.viewgap.setTag(null);
        this.wishlist.setTag(null);
        setRootTag(root);
        // listeners
        mCallback37 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 5);
        mCallback35 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback36 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        mCallback33 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback34 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
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
            setHandler((webkul.opencart.mobikul.handlers.CartHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.CartAdapterModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.CartHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.CartAdapterModel Data) {
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
        java.lang.String dataReward = null;
        java.lang.Boolean dataStock = null;
        java.lang.String dataSubTotal = null;
        boolean androidDatabindingViewDataBindingSafeUnboxDataIsAr = false;
        java.lang.String dataProductPrice = null;
        java.lang.String dataQuantity = null;
        java.lang.String dataImageUrl = null;
        webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
        java.lang.String dataDominantColor = null;
        java.lang.Boolean dataIsAr = null;
        java.lang.String dataProductTitle = null;
        int dataIsArViewVISIBLEViewGONE = 0;
        webkul.opencart.mobikul.adapterModel.CartAdapterModel data = mData;
        int dataStockViewGONEViewVISIBLE = 0;
        int validCheckForLengthDataRewardViewVISIBLEViewGONE = 0;
        java.lang.String dataProductModel = null;
        boolean androidDatabindingViewDataBindingSafeUnboxDataStock = false;
        boolean validCheckForLengthDataReward = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.reward
                    dataReward = data.getReward();
                    // read data.stock
                    dataStock = data.getStock();
                    // read data.subTotal
                    dataSubTotal = data.getSubTotal();
                    // read data.productPrice
                    dataProductPrice = data.getProductPrice();
                    // read data.quantity
                    dataQuantity = data.getQuantity();
                    // read data.ImageUrl
                    dataImageUrl = data.getImageUrl();
                    // read data.dominantColor
                    dataDominantColor = data.getDominantColor();
                    // read data.isAr()
                    dataIsAr = data.isAr();
                    // read data.productTitle
                    dataProductTitle = data.getProductTitle();
                    // read data.productModel
                    dataProductModel = data.getProductModel();
                }


                // read valid.checkForLength(data.reward)
                validCheckForLengthDataReward = webkul.opencart.mobikul.utils.Validation.checkForLength(dataReward);
                // read android.databinding.ViewDataBinding.safeUnbox(data.stock)
                androidDatabindingViewDataBindingSafeUnboxDataStock = android.databinding.ViewDataBinding.safeUnbox(dataStock);
                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr())
                androidDatabindingViewDataBindingSafeUnboxDataIsAr = android.databinding.ViewDataBinding.safeUnbox(dataIsAr);
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckForLengthDataReward) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataStock) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataIsAr) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read valid.checkForLength(data.reward) ? View.VISIBLE : View.GONE
                validCheckForLengthDataRewardViewVISIBLEViewGONE = ((validCheckForLengthDataReward) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read android.databinding.ViewDataBinding.safeUnbox(data.stock) ? View.GONE : View.VISIBLE
                dataStockViewGONEViewVISIBLE = ((androidDatabindingViewDataBindingSafeUnboxDataStock) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
                dataIsArViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxDataIsAr) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addQty.setOnClickListener(mCallback35);
            this.delete.setOnClickListener(mCallback37);
            this.layoutContainer.setOnClickListener(mCallback33);
            this.subQty.setOnClickListener(mCallback34);
            this.wishlist.setOnClickListener(mCallback36);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(dataStockViewGONEViewVISIBLE);
            this.mboundView3.setVisibility(dataIsArViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(validCheckForLengthDataRewardViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productCustomOptions, dataProductModel);
            webkul.opencart.mobikul.utils.ImageLoader.loadImage(this.productImage, dataImageUrl, dataDominantColor);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productName, dataProductTitle);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productPrice, dataProductPrice);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.qty, dataQuantity);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.sellerStringTV, dataReward);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.subTotal, dataSubTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.CartAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickRemoveItem(callbackArg_0, data);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.CartAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddQty(callbackArg_0, data);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.CartAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddToWishlist(callbackArg_0, data);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.CartAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickProduct(callbackArg_0, data);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.CartAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickSubtractQty(callbackArg_0, data);
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
        flag 3 (0x4L): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): android.databinding.ViewDataBinding.safeUnbox(data.stock) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): android.databinding.ViewDataBinding.safeUnbox(data.stock) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): valid.checkForLength(data.reward) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): valid.checkForLength(data.reward) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}