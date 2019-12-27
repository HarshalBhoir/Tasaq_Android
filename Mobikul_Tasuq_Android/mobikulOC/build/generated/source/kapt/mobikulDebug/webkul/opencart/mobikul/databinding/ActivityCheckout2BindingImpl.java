package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCheckout2BindingImpl extends ActivityCheckout2Binding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.billing_pipeView12, 8);
        sViewsWithIds.put(R.id.billing_pipeView, 9);
        sViewsWithIds.put(R.id.billing_pipeView1, 10);
        sViewsWithIds.put(R.id.payment_pipeView, 11);
        sViewsWithIds.put(R.id.confirm_pipeView, 12);
        sViewsWithIds.put(R.id.confirm_pipeView12, 13);
        sViewsWithIds.put(R.id.checkout_container, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    @Nullable
    private final android.view.View.OnClickListener mCallback74;
    @Nullable
    private final android.view.View.OnClickListener mCallback75;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    @Nullable
    private final android.view.View.OnClickListener mCallback73;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCheckout2BindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityCheckout2BindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[8]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.ImageView) bindings[6]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[13]
            , (android.widget.ImageView) bindings[5]
            , (android.view.View) bindings[11]
            , (android.widget.ImageView) bindings[4]
            , (android.view.View) bindings[7]
            );
        this.appbar.setTag(null);
        this.billingAddressImage.setTag(null);
        this.billingAddressImage1.setTag(null);
        this.confirmOrderImage.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.paymentMethodImage.setTag(null);
        this.shippingAddressImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback71 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback74 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        mCallback75 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 5);
        mCallback72 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback73 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
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
            setHandler((webkul.opencart.mobikul.handlers.CheckoutHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.CheckoutHandler Handler) {
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
        webkul.opencart.mobikul.handlers.CheckoutHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.billingAddressImage.setOnClickListener(mCallback71);
            this.billingAddressImage1.setOnClickListener(mCallback72);
            this.confirmOrderImage.setOnClickListener(mCallback75);
            this.paymentMethodImage.setOnClickListener(mCallback74);
            this.shippingAddressImage.setOnClickListener(mCallback73);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickPaymentAddress(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickPaymentMethod(callbackArg_0);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickConfirmOrderMethod(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickPaymentAddress1(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickShippingMethod(callbackArg_0);
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