package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNewAddressBindingImpl extends ActivityNewAddressBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.checkoutScroll, 3);
        sViewsWithIds.put(R.id.newAddrContainer, 4);
        sViewsWithIds.put(R.id.addBookheading, 5);
        sViewsWithIds.put(R.id.fetch_address_button, 6);
        sViewsWithIds.put(R.id.addrDataContainer, 7);
        sViewsWithIds.put(R.id.addBookfirstnameValue, 8);
        sViewsWithIds.put(R.id.addBooklastnameValue, 9);
        sViewsWithIds.put(R.id.addBookCompanyValue, 10);
        sViewsWithIds.put(R.id.ll_custom_fields, 11);
        sViewsWithIds.put(R.id.addressHeading, 12);
        sViewsWithIds.put(R.id.addBookStreetAddValue, 13);
        sViewsWithIds.put(R.id.tv_place, 14);
        sViewsWithIds.put(R.id.addBookStreetAddSecondValue, 15);
        sViewsWithIds.put(R.id.addBookCityValue, 16);
        sViewsWithIds.put(R.id.addBookZipValue, 17);
        sViewsWithIds.put(R.id.addBookCountryTitle, 18);
        sViewsWithIds.put(R.id.countrySpinner, 19);
        sViewsWithIds.put(R.id.statesSpinner, 20);
        sViewsWithIds.put(R.id.addBookStateTitle, 21);
        sViewsWithIds.put(R.id.defaultAddress, 22);
        sViewsWithIds.put(R.id.defaultAddressTitle, 23);
        sViewsWithIds.put(R.id.yes, 24);
        sViewsWithIds.put(R.id.no, 25);
        sViewsWithIds.put(R.id.checkbox_gdpr, 26);
        sViewsWithIds.put(R.id.change_password_info, 27);
        sViewsWithIds.put(R.id.button1, 28);
        sViewsWithIds.put(R.id.progress, 29);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNewAddressBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private ActivityNewAddressBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[16]
            , (android.widget.EditText) bindings[10]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[21]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[17]
            , (android.widget.EditText) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.EditText) bindings[9]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.Button) bindings[28]
            , (android.widget.Button) bindings[27]
            , (android.widget.CheckBox) bindings[26]
            , (android.widget.ScrollView) bindings[3]
            , (android.widget.Spinner) bindings[19]
            , (android.widget.RadioGroup) bindings[22]
            , (android.widget.TextView) bindings[23]
            , (android.support.design.button.MaterialButton) bindings[6]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.support.v7.widget.CardView) bindings[4]
            , (android.widget.RadioButton) bindings[25]
            , (android.widget.ProgressBar) bindings[29]
            , (android.widget.Spinner) bindings[20]
            , (android.view.View) bindings[2]
            , (android.widget.AutoCompleteTextView) bindings[14]
            , (android.widget.RadioButton) bindings[24]
            );
        this.appbar.setTag(null);
        this.mostParenLayout.setTag(null);
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