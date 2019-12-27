package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAccountinfoBindingImpl extends ActivityAccountinfoBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.accinfoContainer, 3);
        sViewsWithIds.put(R.id.accinfoheading, 4);
        sViewsWithIds.put(R.id.profile_image, 5);
        sViewsWithIds.put(R.id.email, 6);
        sViewsWithIds.put(R.id.accinfoemailValue, 7);
        sViewsWithIds.put(R.id.accinfoContainer1, 8);
        sViewsWithIds.put(R.id.firstname, 9);
        sViewsWithIds.put(R.id.accinfofirstnameValue, 10);
        sViewsWithIds.put(R.id.lastname, 11);
        sViewsWithIds.put(R.id.accinfolastnameValue, 12);
        sViewsWithIds.put(R.id.phone, 13);
        sViewsWithIds.put(R.id.accinfoPhoneValue, 14);
        sViewsWithIds.put(R.id.fax, 15);
        sViewsWithIds.put(R.id.accinfoFaxValue, 16);
        sViewsWithIds.put(R.id.passwrodLayout, 17);
        sViewsWithIds.put(R.id.password, 18);
        sViewsWithIds.put(R.id.accinfonewpasswordValue, 19);
        sViewsWithIds.put(R.id.confirmpassword, 20);
        sViewsWithIds.put(R.id.accinfonewconfirmpasswordValue, 21);
        sViewsWithIds.put(R.id.checkbox_gdpr, 22);
        sViewsWithIds.put(R.id.button1, 23);
        sViewsWithIds.put(R.id.change_password_info, 24);
        sViewsWithIds.put(R.id.bottom_edit_layout, 25);
        sViewsWithIds.put(R.id.cancel, 26);
        sViewsWithIds.put(R.id.button2, 27);
        sViewsWithIds.put(R.id.accountinfoprogress, 28);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAccountinfoBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ActivityAccountinfoBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.EditText) bindings[16]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[21]
            , (android.widget.EditText) bindings[19]
            , (android.widget.ProgressBar) bindings[28]
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.Button) bindings[23]
            , (android.support.design.button.MaterialButton) bindings[27]
            , (android.support.design.button.MaterialButton) bindings[26]
            , (android.widget.Button) bindings[24]
            , (android.widget.CheckBox) bindings[22]
            , (android.support.design.widget.TextInputLayout) bindings[20]
            , (android.support.design.widget.TextInputLayout) bindings[6]
            , (android.support.design.widget.TextInputLayout) bindings[15]
            , (android.support.design.widget.TextInputLayout) bindings[9]
            , (android.support.design.widget.TextInputLayout) bindings[11]
            , (android.support.design.widget.TextInputLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[17]
            , (android.support.design.widget.TextInputLayout) bindings[13]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[5]
            , (android.view.View) bindings[2]
            );
        this.appbar.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}