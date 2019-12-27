package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCartBindingImpl extends ActivityCartBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 9);
        sViewsWithIds.put(R.id.svHeader, 10);
        sViewsWithIds.put(R.id.errorTv, 11);
        sViewsWithIds.put(R.id.emptyCart, 12);
        sViewsWithIds.put(R.id.errorBStn, 13);
        sViewsWithIds.put(R.id.scroll_view, 14);
        sViewsWithIds.put(R.id.scrollViewMainContainer, 15);
        sViewsWithIds.put(R.id.outOfStockError, 16);
        sViewsWithIds.put(R.id.itemsOnTop, 17);
        sViewsWithIds.put(R.id.totalAmountOnTop, 18);
        sViewsWithIds.put(R.id.linearLayoutMain, 19);
        sViewsWithIds.put(R.id.cart_recycler, 20);
        sViewsWithIds.put(R.id.linearLaoyutAddMoreFromWishlist, 21);
        sViewsWithIds.put(R.id.linearLaoyutAddMoreFromWishlistChild, 22);
        sViewsWithIds.put(R.id.WishListImage, 23);
        sViewsWithIds.put(R.id.WishListText, 24);
        sViewsWithIds.put(R.id.EmptyCartTitle, 25);
        sViewsWithIds.put(R.id.linearLaoyutDiscountTop, 26);
        sViewsWithIds.put(R.id.reward_card, 27);
        sViewsWithIds.put(R.id.rewardDiscountTop, 28);
        sViewsWithIds.put(R.id.reward_tv, 29);
        sViewsWithIds.put(R.id.reward_points_tv, 30);
        sViewsWithIds.put(R.id.reward_edittxt, 31);
        sViewsWithIds.put(R.id.reward_button, 32);
        sViewsWithIds.put(R.id.coupon_container, 33);
        sViewsWithIds.put(R.id.coupon_edittxt, 34);
        sViewsWithIds.put(R.id.voucher_container, 35);
        sViewsWithIds.put(R.id.linearLaoyutApplyVoucher, 36);
        sViewsWithIds.put(R.id.voucher_edittxt, 37);
        sViewsWithIds.put(R.id.linearLaoyutCartTotals, 38);
        sViewsWithIds.put(R.id.linearLaoyutDiscount, 39);
        sViewsWithIds.put(R.id.discoutCOdeET, 40);
        sViewsWithIds.put(R.id.discountApplyBtn, 41);
        sViewsWithIds.put(R.id.discountCancelBtn, 42);
        sViewsWithIds.put(R.id.main_progress_bar, 43);
    }
    // views
    @NonNull
    private final android.support.design.button.MaterialButton mboundView2;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.Button mboundView6;
    @NonNull
    private final android.widget.Button mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCartBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 44, sIncludes, sViewsWithIds));
    }
    private ActivityCartBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[25]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.TextView) bindings[24]
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.support.v7.widget.RecyclerView) bindings[20]
            , (android.widget.TextView) bindings[3]
            , (android.support.v7.widget.CardView) bindings[33]
            , (android.widget.EditText) bindings[34]
            , (android.widget.Button) bindings[41]
            , (android.widget.Button) bindings[42]
            , (android.widget.EditText) bindings[40]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.Button) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[17]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[38]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.ProgressBar) bindings[43]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.TextView) bindings[16]
            , (android.support.design.button.MaterialButton) bindings[8]
            , (android.widget.Button) bindings[32]
            , (android.support.v7.widget.CardView) bindings[27]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.EditText) bindings[31]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[29]
            , (android.widget.ScrollView) bindings[14]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.view.View) bindings[9]
            , (android.widget.TextView) bindings[18]
            , (android.support.v7.widget.CardView) bindings[35]
            , (android.widget.EditText) bindings[37]
            );
        this.appbar.setTag(null);
        this.continueShopping.setTag(null);
        this.emptyCart.setTag(null);
        this.mboundView2 = (android.support.design.button.MaterialButton) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.Button) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.mostParenLayout.setTag(null);
        this.proceedToCheckout2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 5);
        mCallback68 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 6);
        mCallback65 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback64 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback66 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        mCallback63 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback69 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 7);
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
        if (BR.handler == variableId) {
            setHandler((webkul.opencart.mobikul.handlers.CartHandler) variable);
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
        webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.continueShopping.setOnClickListener(mCallback64);
            this.emptyCart.setOnClickListener(mCallback65);
            this.mboundView2.setOnClickListener(mCallback63);
            this.mboundView5.setOnClickListener(mCallback66);
            this.mboundView6.setOnClickListener(mCallback67);
            this.mboundView7.setOnClickListener(mCallback68);
            this.proceedToCheckout2.setOnClickListener(mCallback69);
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



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onclickCouponCode(callbackArg_0);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickVoucherCode(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickEmptyCart(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickContinueShop(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onclickCouponCode(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onClickUpdateCart();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CartHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickProceedToCheckout(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}