package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EditChangeAddressBindingImpl extends EditChangeAddressBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.checkoutScroll, 1);
        sViewsWithIds.put(R.id.newAddrContainer, 2);
        sViewsWithIds.put(R.id.addBookheading, 3);
        sViewsWithIds.put(R.id.fetch_address_button, 4);
        sViewsWithIds.put(R.id.addrDataContainer, 5);
        sViewsWithIds.put(R.id.addBookfirstnameValue, 6);
        sViewsWithIds.put(R.id.addBooklastnameValue, 7);
        sViewsWithIds.put(R.id.addBookCompanyValue, 8);
        sViewsWithIds.put(R.id.addressHeading, 9);
        sViewsWithIds.put(R.id.addBookStreetAddValue, 10);
        sViewsWithIds.put(R.id.addBookStreetAddSecondValue, 11);
        sViewsWithIds.put(R.id.addBookCityValue, 12);
        sViewsWithIds.put(R.id.addBookZipValue, 13);
        sViewsWithIds.put(R.id.addBookCountryTitle, 14);
        sViewsWithIds.put(R.id.countrySpinner, 15);
        sViewsWithIds.put(R.id.addBookStateTitle, 16);
        sViewsWithIds.put(R.id.statesSpinner, 17);
        sViewsWithIds.put(R.id.defaultAddress, 18);
        sViewsWithIds.put(R.id.defaultAddressTitle, 19);
        sViewsWithIds.put(R.id.yes, 20);
        sViewsWithIds.put(R.id.no, 21);
        sViewsWithIds.put(R.id.button1, 22);
        sViewsWithIds.put(R.id.progress, 23);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EditChangeAddressBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private EditChangeAddressBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[8]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.EditText) bindings[7]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.Button) bindings[22]
            , (android.widget.ScrollView) bindings[1]
            , (android.widget.Spinner) bindings[15]
            , (android.widget.RadioGroup) bindings[18]
            , (android.widget.TextView) bindings[19]
            , (android.widget.Button) bindings[4]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.support.v7.widget.CardView) bindings[2]
            , (android.widget.RadioButton) bindings[21]
            , (android.widget.ProgressBar) bindings[23]
            , (android.widget.Spinner) bindings[17]
            , (android.widget.RadioButton) bindings[20]
            );
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