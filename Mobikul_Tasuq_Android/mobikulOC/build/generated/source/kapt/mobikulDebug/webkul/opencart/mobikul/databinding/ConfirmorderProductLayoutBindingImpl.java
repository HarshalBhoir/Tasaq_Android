package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConfirmorderProductLayoutBindingImpl extends ConfirmorderProductLayoutBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.details_layout, 6);
        sViewsWithIds.put(R.id.model, 7);
        sViewsWithIds.put(R.id.unit, 8);
        sViewsWithIds.put(R.id.option_layout, 9);
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ConfirmorderProductLayoutBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ConfirmorderProductLayoutBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            );
        this.details.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.orderImg.setTag(null);
        this.orderProductName.setTag(null);
        this.qty.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback62 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
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
            setHandler((webkul.opencart.mobikul.handlers.ConfirmCheckoutHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.ConfirmOrderAdapteModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.ConfirmCheckoutHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.ConfirmOrderAdapteModel Data) {
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
        java.lang.String dataProductImageUrl = null;
        webkul.opencart.mobikul.handlers.ConfirmCheckoutHandler handler = mHandler;
        java.lang.String dataProductName = null;
        webkul.opencart.mobikul.adapterModel.ConfirmOrderAdapteModel data = mData;
        java.lang.String dataProductSubtotal = null;
        java.lang.String dataProductQty = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.productImageUrl
                    dataProductImageUrl = data.getProductImageUrl();
                    // read data.productName
                    dataProductName = data.getProductName();
                    // read data.productSubtotal
                    dataProductSubtotal = data.getProductSubtotal();
                    // read data.productQty
                    dataProductQty = data.getProductQty();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.details.setOnClickListener(mCallback62);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            webkul.opencart.mobikul.utils.ImageLoader.loadImage(this.orderImg, dataProductImageUrl, (java.lang.String)null);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.orderProductName, dataProductName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.qty, dataProductQty);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, dataProductSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        webkul.opencart.mobikul.handlers.ConfirmCheckoutHandler handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // data
        webkul.opencart.mobikul.adapterModel.ConfirmOrderAdapteModel data = mData;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {




            handler.onClickViewAll(callbackArg_0, data);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): data
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}