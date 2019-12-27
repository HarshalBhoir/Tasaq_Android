package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleDashboardMyordersLayoutBindingImpl extends SingleDashboardMyordersLayoutBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

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
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.support.design.button.MaterialButton mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleDashboardMyordersLayoutBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private SingleDashboardMyordersLayoutBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.dateAdded.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.support.design.button.MaterialButton) bindings[2];
        this.mboundView2.setTag(null);
        this.orderId.setTag(null);
        this.orderName.setTag(null);
        this.orderProducts.setTag(null);
        this.orderStatus.setTag(null);
        this.orderTotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback87 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
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
            setHandler((webkul.opencart.mobikul.handlers.DashBoardMyOrderHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.DashBoardOrderAdapterModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.DashBoardMyOrderHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.DashBoardOrderAdapterModel Data) {
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
        java.lang.String dataProducts = null;
        webkul.opencart.mobikul.handlers.DashBoardMyOrderHandler handler = mHandler;
        java.lang.String dataName = null;
        java.lang.String dataDateAdded = null;
        webkul.opencart.mobikul.adapterModel.DashBoardOrderAdapterModel data = mData;
        java.lang.String dataOrderId = null;
        java.lang.String dataStatus = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.total
                    dataTotal = data.getTotal();
                    // read data.products
                    dataProducts = data.getProducts();
                    // read data.name
                    dataName = data.getName();
                    // read data.dateAdded
                    dataDateAdded = data.getDateAdded();
                    // read data.orderId
                    dataOrderId = data.getOrderId();
                    // read data.status
                    dataStatus = data.getStatus();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.dateAdded, dataDateAdded);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.orderId, dataOrderId);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.orderName, dataName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.orderProducts, dataProducts);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.orderStatus, dataStatus);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.orderTotal, dataTotal);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback87);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        webkul.opencart.mobikul.handlers.DashBoardMyOrderHandler handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // data
        webkul.opencart.mobikul.adapterModel.DashBoardOrderAdapterModel data = mData;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {



            handler.onClickDetails(data);
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