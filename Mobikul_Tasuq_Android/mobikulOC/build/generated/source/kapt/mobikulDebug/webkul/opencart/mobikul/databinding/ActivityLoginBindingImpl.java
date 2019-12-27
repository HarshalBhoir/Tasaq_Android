package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.userlayout11, 5);
        sViewsWithIds.put(R.id.passLayout11, 6);
        sViewsWithIds.put(R.id.forgot_password, 7);
        sViewsWithIds.put(R.id.login, 8);
        sViewsWithIds.put(R.id.register, 9);
        sViewsWithIds.put(R.id.login_through_fp, 10);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.password
            //         is data.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.password
            java.lang.String dataPassword = null;
            // data
            webkul.opencart.mobikul.adapterModel.LoginAdapterModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener etUsernameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.username
            //         is data.setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etUsername);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.username
            java.lang.String dataUsername = null;
            // data
            webkul.opencart.mobikul.adapterModel.LoginAdapterModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setUsername(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.support.design.widget.TextInputEditText) bindings[3]
            , (android.support.design.widget.TextInputEditText) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.support.design.button.MaterialButton) bindings[8]
            , (android.widget.ImageView) bindings[10]
            , (android.support.design.widget.TextInputLayout) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.view.View) bindings[4]
            , (android.support.design.widget.TextInputLayout) bindings[5]
            );
        this.appbar.setTag(null);
        this.etPassword.setTag(null);
        this.etUsername.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
            setHandler((webkul.opencart.mobikul.handlers.LoginHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.LoginAdapterModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.LoginHandler Handler) {
        this.mHandler = Handler;
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.LoginAdapterModel Data) {
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
                return onChangeData((webkul.opencart.mobikul.adapterModel.LoginAdapterModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeData(webkul.opencart.mobikul.adapterModel.LoginAdapterModel Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.username) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.password) {
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
        webkul.opencart.mobikul.adapterModel.LoginAdapterModel data = mData;
        java.lang.String dataPassword = null;
        java.lang.String dataUsername = null;

        if ((dirtyFlags & 0x1dL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (data != null) {
                        // read data.password
                        dataPassword = data.getPassword();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (data != null) {
                        // read data.username
                        dataUsername = data.getUsername();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, dataPassword);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUsername, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etUsername, dataUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): handler
        flag 2 (0x3L): data.username
        flag 3 (0x4L): data.password
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}