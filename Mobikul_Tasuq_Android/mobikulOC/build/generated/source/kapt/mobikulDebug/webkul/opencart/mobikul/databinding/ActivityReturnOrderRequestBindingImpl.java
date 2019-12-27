package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityReturnOrderRequestBindingImpl extends ActivityReturnOrderRequestBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 11);
        sViewsWithIds.put(R.id.scrollView, 12);
        sViewsWithIds.put(R.id.select_date, 13);
        sViewsWithIds.put(R.id.product_qty, 14);
        sViewsWithIds.put(R.id.reason, 15);
        sViewsWithIds.put(R.id.yes, 16);
        sViewsWithIds.put(R.id.no, 17);
        sViewsWithIds.put(R.id.comment, 18);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityReturnOrderRequestBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityReturnOrderRequestBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.EditText) bindings[18]
            , (android.widget.TextView) bindings[7]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.RadioButton) bindings[17]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[14]
            , (android.widget.Spinner) bindings[15]
            , (android.widget.ScrollView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.Button) bindings[10]
            , (android.widget.EditText) bindings[5]
            , (android.view.View) bindings[11]
            , (android.widget.RadioButton) bindings[16]
            );
        this.appbar.setTag(null);
        this.dateAdded.setTag(null);
        this.email.setTag(null);
        this.fname.setTag(null);
        this.lname.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.orderId.setTag(null);
        this.productCode.setTag(null);
        this.productName.setTag(null);
        this.submit.setTag(null);
        this.telephone.setTag(null);
        setRootTag(root);
        // listeners
        mCallback56 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
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
            setHandler((webkul.opencart.mobikul.handlers.ReturnOrderRequestHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.model.returnOrderRequestModel.ReturnOrderRequest) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.ReturnOrderRequestHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.model.returnOrderRequestModel.ReturnOrderRequest Data) {
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
        java.lang.String dataFirstname = null;
        java.lang.String dataTelephone = null;
        java.lang.String dataProduct = null;
        webkul.opencart.mobikul.handlers.ReturnOrderRequestHandler handler = mHandler;
        java.lang.String dataLastname = null;
        webkul.opencart.mobikul.model.returnOrderRequestModel.ReturnOrderRequest data = mData;
        java.lang.String dataOrderId = null;
        java.lang.String dataDateOrdered = null;
        java.lang.String dataModel = null;
        java.lang.String dataEmail = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.firstname
                    dataFirstname = data.getFirstname();
                    // read data.telephone
                    dataTelephone = data.getTelephone();
                    // read data.product
                    dataProduct = data.getProduct();
                    // read data.lastname
                    dataLastname = data.getLastname();
                    // read data.orderId
                    dataOrderId = data.getOrderId();
                    // read data.dateOrdered
                    dataDateOrdered = data.getDateOrdered();
                    // read data.model
                    dataModel = data.getModel();
                    // read data.email
                    dataEmail = data.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.dateAdded, dataDateOrdered);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.email, dataEmail);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.fname, dataFirstname);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.lname, dataLastname);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.orderId, dataOrderId);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productCode, dataModel);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productName, dataProduct);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.telephone, dataTelephone);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.submit.setOnClickListener(mCallback56);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        webkul.opencart.mobikul.handlers.ReturnOrderRequestHandler handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {


            handler.onClickSubmit();
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