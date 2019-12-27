package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProceedToCheckoutDialogBindingImpl extends ProceedToCheckoutDialogBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProceedToCheckoutDialogBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ProceedToCheckoutDialogBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.button.MaterialButton) bindings[1]
            , (android.support.design.button.MaterialButton) bindings[2]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            );
        this.facebook.setTag(null);
        this.google.setTag(null);
        this.guestBtn.setTag(null);
        this.loginBtn.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.registerBtn.setTag(null);
        setRootTag(root);
        // listeners
        mCallback43 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback44 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback47 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 5);
        mCallback45 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback46 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
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
            setHandler((webkul.opencart.mobikul.handlers.CheckoutBottomSheetHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.CheckoutBottomSheetHandler Handler) {
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
        webkul.opencart.mobikul.handlers.CheckoutBottomSheetHandler handler = mHandler;

        if ((dirtyFlags & 0x2L) != 0) {

            if((dirtyFlags & 0x2L) != 0) {
                if(webkul.opencart.mobikul.BuildConfig.isDemo) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.facebook.setOnClickListener(mCallback43);
            this.facebook.setVisibility(((webkul.opencart.mobikul.BuildConfig.isDemo) ? (android.view.View.VISIBLE) : (android.view.View.GONE)));
            this.google.setOnClickListener(mCallback44);
            this.google.setVisibility(((webkul.opencart.mobikul.BuildConfig.isDemo) ? (android.view.View.VISIBLE) : (android.view.View.GONE)));
            this.guestBtn.setOnClickListener(mCallback47);
            this.loginBtn.setOnClickListener(mCallback45);
            this.registerBtn.setOnClickListener(mCallback46);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutBottomSheetHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onClickFaceBook();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutBottomSheetHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onClickGoogle();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutBottomSheetHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickGuest(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutBottomSheetHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickLogin(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.CheckoutBottomSheetHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickRegister(callbackArg_0);
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
        flag 2 (0x3L): project.isDemo ? View.VISIBLE : View.GONE
        flag 3 (0x4L): project.isDemo ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}