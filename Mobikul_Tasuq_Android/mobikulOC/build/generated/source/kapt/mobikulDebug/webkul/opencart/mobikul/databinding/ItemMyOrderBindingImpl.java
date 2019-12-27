package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyOrderBindingImpl extends ItemMyOrderBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.container_in_card_view, 9);
        sViewsWithIds.put(R.id.order, 10);
        sViewsWithIds.put(R.id.myview, 11);
        sViewsWithIds.put(R.id.noOfProRow, 12);
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    @NonNull
    private final android.support.design.button.MaterialButton mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback92;
    @Nullable
    private final android.view.View.OnClickListener mCallback93;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyOrderBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemMyOrderBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[11]
            , (android.widget.TableRow) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            );
        this.floatingvieworder.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.support.design.button.MaterialButton) bindings[2];
        this.mboundView2.setTag(null);
        this.myorderCustomerName.setTag(null);
        this.myorderId.setTag(null);
        this.myorderdate.setTag(null);
        this.myorderordertotal.setTag(null);
        this.myorderstatus.setTag(null);
        this.noOfProducts.setTag(null);
        setRootTag(root);
        // listeners
        mCallback92 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback93 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
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
            setHandler((webkul.opencart.mobikul.handlers.SellerOrderHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.SellerOrderAdapterModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.SellerOrderHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.SellerOrderAdapterModel Data) {
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
        java.lang.String dataTotal = null;
        webkul.opencart.mobikul.handlers.SellerOrderHandler handler = mHandler;
        java.lang.String dataCustomer = null;
        java.lang.String dataNoOfProducts = null;
        webkul.opencart.mobikul.adapterModel.SellerOrderAdapterModel data = mData;
        java.lang.String dataDate = null;
        java.lang.String dataOrderId = null;
        java.lang.String dataStatus = null;
        java.lang.String charDataOrderId = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.total
                    dataTotal = data.getTotal();
                    // read data.customer
                    dataCustomer = data.getCustomer();
                    // read data.noOfProducts
                    dataNoOfProducts = data.getNoOfProducts();
                    // read data.date
                    dataDate = data.getDate();
                    // read data.orderId
                    dataOrderId = data.getOrderId();
                    // read data.status
                    dataStatus = data.getStatus();
                }


                // read ('#') + (data.orderId)
                charDataOrderId = ('#') + (dataOrderId);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.floatingvieworder.setOnClickListener(mCallback93);
            this.mboundView2.setOnClickListener(mCallback92);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.myorderCustomerName, dataCustomer);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.myorderId, charDataOrderId);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.myorderdate, dataDate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.myorderordertotal, dataTotal);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.myorderstatus, dataStatus);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.noOfProducts, dataNoOfProducts);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.SellerOrderHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.SellerOrderAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickOrder(callbackArg_0, data);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.SellerOrderHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.SellerOrderAdapterModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickOrder(callbackArg_0, data);
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
    flag mapping end*/
    //end
}