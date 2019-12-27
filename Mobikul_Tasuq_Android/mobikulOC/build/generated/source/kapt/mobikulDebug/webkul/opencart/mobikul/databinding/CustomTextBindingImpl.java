package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CustomTextBindingImpl extends CustomTextBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.et_lebal, 3);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CustomTextBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private CustomTextBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[1]
            , (android.support.design.widget.TextInputLayout) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.etField.setTag("text");
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvReq.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.model.registerModel.CustomField) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable webkul.opencart.mobikul.model.registerModel.CustomField Data) {
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
        boolean dataIsRequired = false;
        java.lang.String dataName = null;
        webkul.opencart.mobikul.model.registerModel.CustomField data = mData;
        java.lang.String tvReqAndroidStringIsRequireDataName = null;
        int dataIsRequiredViewVISIBLEViewGONE = 0;
        java.lang.String dataValue = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.isRequired
                    dataIsRequired = data.isRequired();
                    // read data.name
                    dataName = data.getName();
                    // read data.value
                    dataValue = data.getValue();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataIsRequired) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read data.isRequired ? View.VISIBLE : View.GONE
                dataIsRequiredViewVISIBLEViewGONE = ((dataIsRequired) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read @android:string/is_require
                tvReqAndroidStringIsRequireDataName = tvReq.getResources().getString(R.string.is_require, dataName);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.etField.setHint(dataName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.etField, dataValue);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvReq, tvReqAndroidStringIsRequireDataName);
            this.tvReq.setVisibility(dataIsRequiredViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): data.isRequired ? View.VISIBLE : View.GONE
        flag 3 (0x4L): data.isRequired ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}