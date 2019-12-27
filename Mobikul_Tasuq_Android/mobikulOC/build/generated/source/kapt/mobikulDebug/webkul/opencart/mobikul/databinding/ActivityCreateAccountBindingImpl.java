package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCreateAccountBindingImpl extends ActivityCreateAccountBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 15);
        sViewsWithIds.put(R.id.registerScroll, 16);
        sViewsWithIds.put(R.id.mainContainer, 17);
        sViewsWithIds.put(R.id.registerHeading, 18);
        sViewsWithIds.put(R.id.customer_group, 19);
        sViewsWithIds.put(R.id.group_id, 20);
        sViewsWithIds.put(R.id.yes1, 21);
        sViewsWithIds.put(R.id.no1, 22);
        sViewsWithIds.put(R.id.profile_image, 23);
        sViewsWithIds.put(R.id.fnameTV, 24);
        sViewsWithIds.put(R.id.lnameTV, 25);
        sViewsWithIds.put(R.id.emailAddressTV, 26);
        sViewsWithIds.put(R.id.telephoneTv, 27);
        sViewsWithIds.put(R.id.faxTV, 28);
        sViewsWithIds.put(R.id.ll_custom_fields, 29);
        sViewsWithIds.put(R.id.addBookheading, 30);
        sViewsWithIds.put(R.id.addrDataContainer, 31);
        sViewsWithIds.put(R.id.addBookCompanyTitle, 32);
        sViewsWithIds.put(R.id.addBookStreetAddTitle, 33);
        sViewsWithIds.put(R.id.addBookStreetAddSecondTitle, 34);
        sViewsWithIds.put(R.id.addBookCityTitle, 35);
        sViewsWithIds.put(R.id.addBookZipTitle, 36);
        sViewsWithIds.put(R.id.addBookCountryTitle, 37);
        sViewsWithIds.put(R.id.countrySpinner, 38);
        sViewsWithIds.put(R.id.statesSpinner, 39);
        sViewsWithIds.put(R.id.addBookStateTitle, 40);
        sViewsWithIds.put(R.id.passwordLayout, 41);
        sViewsWithIds.put(R.id.password_TV, 42);
        sViewsWithIds.put(R.id.confirm_password_tv, 43);
        sViewsWithIds.put(R.id.become_seller, 44);
        sViewsWithIds.put(R.id.store_name, 45);
        sViewsWithIds.put(R.id.is_subscribed, 46);
        sViewsWithIds.put(R.id.yes, 47);
        sViewsWithIds.put(R.id.no, 48);
        sViewsWithIds.put(R.id.tAndC, 49);
        sViewsWithIds.put(R.id.sameBillingAndDelivery, 50);
        sViewsWithIds.put(R.id.progress, 51);
        sViewsWithIds.put(R.id.bottom_layout, 52);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener addBookCityValueandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.city
            //         is data.setCity((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(addBookCityValue);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.city
            java.lang.String dataCity = null;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setCity(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener addBookCompanyValueandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.company
            //         is data.setCompany((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(addBookCompanyValue);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.company
            java.lang.String dataCompany = null;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setCompany(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener addBookStreetAddSecondValueandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.address2
            //         is data.setAddress2((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(addBookStreetAddSecondValue);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.address2
            java.lang.String dataAddress2 = null;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setAddress2(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener addBookStreetAddValueandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.address1
            //         is data.setAddress1((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(addBookStreetAddValue);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.address1
            java.lang.String dataAddress1 = null;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setAddress1(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener addBookZipValueandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.zip
            //         is data.setZip((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(addBookZipValue);
            // localize variables for thread safety
            // data.zip
            java.lang.String dataZip = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setZip(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener confirmationandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.confirmPassword
            //         is data.setConfirmPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(confirmation);
            // localize variables for thread safety
            // data.confirmPassword
            java.lang.String dataConfirmPassword = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setConfirmPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener emailAddressandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.email
            //         is data.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(emailAddress);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.email
            java.lang.String dataEmail = null;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener faxandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.fax
            //         is data.setFax((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(fax);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.fax
            java.lang.String dataFax = null;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setFax(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener firstnameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.firstName
            //         is data.setFirstName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(firstname);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;
            // data.firstName
            java.lang.String dataFirstName = null;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setFirstName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener lastnameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.lastName
            //         is data.setLastName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(lastname);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;
            // data.lastName
            java.lang.String dataLastName = null;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setLastName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener passwordandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.password
            //         is data.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(password);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.password
            java.lang.String dataPassword = null;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener telephoneandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.telephone
            //         is data.setTelephone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(telephone);
            // localize variables for thread safety
            // data.telephone
            java.lang.String dataTelephone = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data
            webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {




                data.setTelephone(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityCreateAccountBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 53, sIncludes, sViewsWithIds));
    }
    private ActivityCreateAccountBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.design.widget.TextInputLayout) bindings[35]
            , (android.widget.EditText) bindings[10]
            , (android.support.design.widget.TextInputLayout) bindings[32]
            , (android.widget.EditText) bindings[7]
            , (android.widget.TextView) bindings[37]
            , (android.widget.TextView) bindings[40]
            , (android.support.design.widget.TextInputLayout) bindings[34]
            , (android.widget.EditText) bindings[9]
            , (android.support.design.widget.TextInputLayout) bindings[33]
            , (android.widget.EditText) bindings[8]
            , (android.support.design.widget.TextInputLayout) bindings[36]
            , (android.widget.EditText) bindings[11]
            , (android.widget.TextView) bindings[30]
            , (android.widget.LinearLayout) bindings[31]
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.CheckBox) bindings[44]
            , (android.widget.LinearLayout) bindings[52]
            , (android.support.design.widget.TextInputLayout) bindings[43]
            , (android.widget.EditText) bindings[13]
            , (android.widget.Spinner) bindings[38]
            , (android.widget.TextView) bindings[19]
            , (android.widget.EditText) bindings[4]
            , (android.support.design.widget.TextInputLayout) bindings[26]
            , (android.widget.EditText) bindings[6]
            , (android.support.design.widget.TextInputLayout) bindings[28]
            , (android.widget.EditText) bindings[2]
            , (android.support.design.widget.TextInputLayout) bindings[24]
            , (android.widget.RadioGroup) bindings[20]
            , (android.widget.RadioGroup) bindings[46]
            , (android.widget.EditText) bindings[3]
            , (android.widget.LinearLayout) bindings[29]
            , (android.support.design.widget.TextInputLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.RadioButton) bindings[48]
            , (android.widget.RadioButton) bindings[22]
            , (android.widget.EditText) bindings[12]
            , (android.widget.LinearLayout) bindings[41]
            , (android.support.design.widget.TextInputLayout) bindings[42]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[23]
            , (android.widget.ProgressBar) bindings[51]
            , (android.support.design.button.MaterialButton) bindings[14]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ScrollView) bindings[16]
            , (android.widget.CheckBox) bindings[50]
            , (android.widget.Spinner) bindings[39]
            , (android.widget.EditText) bindings[45]
            , (android.widget.CheckBox) bindings[49]
            , (android.widget.EditText) bindings[5]
            , (android.support.design.widget.TextInputLayout) bindings[27]
            , (android.view.View) bindings[15]
            , (android.widget.RadioButton) bindings[47]
            , (android.widget.RadioButton) bindings[21]
            );
        this.addBookCityValue.setTag(null);
        this.addBookCompanyValue.setTag(null);
        this.addBookStreetAddSecondValue.setTag(null);
        this.addBookStreetAddValue.setTag(null);
        this.addBookZipValue.setTag(null);
        this.appbar.setTag(null);
        this.confirmation.setTag(null);
        this.emailAddress.setTag(null);
        this.fax.setTag(null);
        this.firstname.setTag(null);
        this.lastname.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.password.setTag(null);
        this.register.setTag(null);
        this.telephone.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4000L;
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
            setHandler((webkul.opencart.mobikul.handlers.CreateAccountHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.CreateAccountHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel Data) {
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
                return onChangeData((webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeData(webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.firstName) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.lastName) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.telephone) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.fax) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.company) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.address1) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.address2) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.city) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.zip) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.password) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        else if (fieldId == BR.confirmPassword) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
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
        java.lang.String dataConfirmPassword = null;
        java.lang.String dataTelephone = null;
        java.lang.String dataFirstName = null;
        webkul.opencart.mobikul.handlers.CreateAccountHandler handler = mHandler;
        java.lang.String dataAddress1 = null;
        java.lang.String dataFax = null;
        java.lang.String dataZip = null;
        webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;
        java.lang.String dataPassword = null;
        java.lang.String dataAddress2 = null;
        java.lang.String dataEmail = null;
        java.lang.String dataCompany = null;
        java.lang.String dataCity = null;
        java.lang.String dataLastName = null;

        if ((dirtyFlags & 0x7ffdL) != 0) {


            if ((dirtyFlags & 0x6001L) != 0) {

                    if (data != null) {
                        // read data.confirmPassword
                        dataConfirmPassword = data.getConfirmPassword();
                    }
            }
            if ((dirtyFlags & 0x4021L) != 0) {

                    if (data != null) {
                        // read data.telephone
                        dataTelephone = data.getTelephone();
                    }
            }
            if ((dirtyFlags & 0x4005L) != 0) {

                    if (data != null) {
                        // read data.firstName
                        dataFirstName = data.getFirstName();
                    }
            }
            if ((dirtyFlags & 0x4101L) != 0) {

                    if (data != null) {
                        // read data.address1
                        dataAddress1 = data.getAddress1();
                    }
            }
            if ((dirtyFlags & 0x4041L) != 0) {

                    if (data != null) {
                        // read data.fax
                        dataFax = data.getFax();
                    }
            }
            if ((dirtyFlags & 0x4801L) != 0) {

                    if (data != null) {
                        // read data.zip
                        dataZip = data.getZip();
                    }
            }
            if ((dirtyFlags & 0x5001L) != 0) {

                    if (data != null) {
                        // read data.password
                        dataPassword = data.getPassword();
                    }
            }
            if ((dirtyFlags & 0x4201L) != 0) {

                    if (data != null) {
                        // read data.address2
                        dataAddress2 = data.getAddress2();
                    }
            }
            if ((dirtyFlags & 0x4011L) != 0) {

                    if (data != null) {
                        // read data.email
                        dataEmail = data.getEmail();
                    }
            }
            if ((dirtyFlags & 0x4081L) != 0) {

                    if (data != null) {
                        // read data.company
                        dataCompany = data.getCompany();
                    }
            }
            if ((dirtyFlags & 0x4401L) != 0) {

                    if (data != null) {
                        // read data.city
                        dataCity = data.getCity();
                    }
            }
            if ((dirtyFlags & 0x4009L) != 0) {

                    if (data != null) {
                        // read data.lastName
                        dataLastName = data.getLastName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4401L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.addBookCityValue, dataCity);
        }
        if ((dirtyFlags & 0x4000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addBookCityValue, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addBookCityValueandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addBookCompanyValue, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addBookCompanyValueandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addBookStreetAddSecondValue, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addBookStreetAddSecondValueandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addBookStreetAddValue, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addBookStreetAddValueandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addBookZipValue, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addBookZipValueandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.confirmation, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, confirmationandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.emailAddress, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, emailAddressandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fax, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, faxandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.firstname, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, firstnameandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.lastname, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, lastnameandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.password, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, passwordandroidTextAttrChanged);
            this.register.setOnClickListener(mCallback27);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.telephone, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, telephoneandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x4081L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.addBookCompanyValue, dataCompany);
        }
        if ((dirtyFlags & 0x4201L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.addBookStreetAddSecondValue, dataAddress2);
        }
        if ((dirtyFlags & 0x4101L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.addBookStreetAddValue, dataAddress1);
        }
        if ((dirtyFlags & 0x4801L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.addBookZipValue, dataZip);
        }
        if ((dirtyFlags & 0x6001L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.confirmation, dataConfirmPassword);
        }
        if ((dirtyFlags & 0x4011L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.emailAddress, dataEmail);
        }
        if ((dirtyFlags & 0x4041L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.fax, dataFax);
        }
        if ((dirtyFlags & 0x4005L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.firstname, dataFirstName);
        }
        if ((dirtyFlags & 0x4009L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.lastname, dataLastName);
        }
        if ((dirtyFlags & 0x5001L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.password, dataPassword);
        }
        if ((dirtyFlags & 0x4021L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.telephone, dataTelephone);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        webkul.opencart.mobikul.handlers.CreateAccountHandler handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // data
        webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel data = mData;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {




            handler.onClickRegisterAccount(callbackArg_0, data);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): handler
        flag 2 (0x3L): data.firstName
        flag 3 (0x4L): data.lastName
        flag 4 (0x5L): data.email
        flag 5 (0x6L): data.telephone
        flag 6 (0x7L): data.fax
        flag 7 (0x8L): data.company
        flag 8 (0x9L): data.address1
        flag 9 (0xaL): data.address2
        flag 10 (0xbL): data.city
        flag 11 (0xcL): data.zip
        flag 12 (0xdL): data.password
        flag 13 (0xeL): data.confirmPassword
        flag 14 (0xfL): null
    flag mapping end*/
    //end
}