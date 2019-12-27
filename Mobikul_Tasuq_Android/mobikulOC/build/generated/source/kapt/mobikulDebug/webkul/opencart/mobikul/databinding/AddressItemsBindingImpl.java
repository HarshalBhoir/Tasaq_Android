package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddressItemsBindingImpl extends AddressItemsBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.edit_option, 4);
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AddressItemsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private AddressItemsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.support.design.button.MaterialButton) bindings[3]
            , (android.support.design.button.MaterialButton) bindings[2]
            , (android.widget.ImageView) bindings[4]
            );
        this.addrbookdefaultValue.setTag(null);
        this.deleteBtn.setTag(null);
        this.editBtn.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback3 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
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
            setHandler((webkul.opencart.mobikul.handlers.GetAddressHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.GetAddressAdaperModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.GetAddressHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.GetAddressAdaperModel Data) {
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
        webkul.opencart.mobikul.handlers.GetAddressHandler handler = mHandler;
        webkul.opencart.mobikul.adapterModel.GetAddressAdaperModel data = mData;
        java.lang.String dataValue = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.value
                    dataValue = data.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.addrbookdefaultValue, dataValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.deleteBtn.setOnClickListener(mCallback4);
            this.editBtn.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.GetAddressHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.GetAddressAdaperModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickDelete(callbackArg_0, data);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.GetAddressHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.adapterModel.GetAddressAdaperModel data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickEdit(callbackArg_0, data);
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