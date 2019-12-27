package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BecomeASellerBindingImpl extends BecomeASellerBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.shop_layout, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.support.design.button.MaterialButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener descandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.description
            //         is data.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(desc);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.description
            java.lang.String dataDescription = null;
            // data
            webkul.opencart.mobikul.model.becomeSellerModel.BecomeSeller data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setDescription(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener shopandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.shopName
            //         is data.setShopName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(shop);
            // localize variables for thread safety
            // data.shopName
            java.lang.String dataShopName = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data
            webkul.opencart.mobikul.model.becomeSellerModel.BecomeSeller data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setShopName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public BecomeASellerBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private BecomeASellerBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.support.design.widget.TextInputLayout) bindings[4]
            );
        this.desc.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.support.design.button.MaterialButton) bindings[3];
        this.mboundView3.setTag(null);
        this.shop.setTag(null);
        setRootTag(root);
        // listeners
        mCallback70 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setHandler((webkul.opencart.mobikul.handlers.BecomeSellerHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.model.becomeSellerModel.BecomeSeller) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.BecomeSellerHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.model.becomeSellerModel.BecomeSeller Data) {
        updateRegistration(0, Data);
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeData((webkul.opencart.mobikul.model.becomeSellerModel.BecomeSeller) object, fieldId);
        }
        return false;
    }
    private boolean onChangeData(webkul.opencart.mobikul.model.becomeSellerModel.BecomeSeller Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.shopName) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.description) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        webkul.opencart.mobikul.handlers.BecomeSellerHandler handler = mHandler;
        java.lang.String dataShopName = null;
        webkul.opencart.mobikul.model.becomeSellerModel.BecomeSeller data = mData;
        java.lang.String dataDescription = null;

        if ((dirtyFlags & 0x1dL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (data != null) {
                        // read data.shopName
                        dataShopName = data.getShopName();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (data != null) {
                        // read data.description
                        dataDescription = data.getDescription();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.desc, dataDescription);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.desc, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, descandroidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback70);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.shop, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, shopandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.shop, dataShopName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        webkul.opencart.mobikul.handlers.BecomeSellerHandler handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // data
        webkul.opencart.mobikul.model.becomeSellerModel.BecomeSeller data = mData;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {



            handler.onClickSubmit(data);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): handler
        flag 2 (0x3L): data.shopName
        flag 3 (0x4L): data.description
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}