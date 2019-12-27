package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewProductSimpleOptionLayoutBindingImpl extends ViewProductSimpleOptionLayoutBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.newTheme_layout, 4);
        sViewsWithIds.put(R.id.qtyLayout, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewProductSimpleOptionLayoutBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ViewProductSimpleOptionLayoutBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.ImageView) bindings[1]
            );
        this.addQty.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.qty.setTag(null);
        this.subQty.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback24 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
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
            setHandler((webkul.opencart.mobikul.handlers.ViewProductSimpleHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.model.getProduct.ProductDetail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.ViewProductSimpleHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.model.getProduct.ProductDetail Data) {
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
        java.lang.String dataMinimum = null;
        webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
        webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.minimum
                    dataMinimum = data.getMinimum();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addQty.setOnClickListener(mCallback25);
            this.subQty.setOnClickListener(mCallback24);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.qty, dataMinimum);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAdd(callbackArg_0, data);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickSub(callbackArg_0, data);
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