package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;
import webkul.opencart.mobikul.handlers.CreateAccountHandler;
import webkul.opencart.mobikul.twoWayBindingModel.RegisterAccountModel;

public abstract class ActivityCreateAccountBinding extends ViewDataBinding {
  @NonNull
  public final TextInputLayout addBookCityTitle;

  @NonNull
  public final EditText addBookCityValue;

  @NonNull
  public final TextInputLayout addBookCompanyTitle;

  @NonNull
  public final EditText addBookCompanyValue;

  @NonNull
  public final TextView addBookCountryTitle;

  @NonNull
  public final TextView addBookStateTitle;

  @NonNull
  public final TextInputLayout addBookStreetAddSecondTitle;

  @NonNull
  public final EditText addBookStreetAddSecondValue;

  @NonNull
  public final TextInputLayout addBookStreetAddTitle;

  @NonNull
  public final EditText addBookStreetAddValue;

  @NonNull
  public final TextInputLayout addBookZipTitle;

  @NonNull
  public final EditText addBookZipValue;

  @NonNull
  public final TextView addBookheading;

  @NonNull
  public final LinearLayout addrDataContainer;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CheckBox becomeSeller;

  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final TextInputLayout confirmPasswordTv;

  @NonNull
  public final EditText confirmation;

  @NonNull
  public final Spinner countrySpinner;

  @NonNull
  public final TextView customerGroup;

  @NonNull
  public final EditText emailAddress;

  @NonNull
  public final TextInputLayout emailAddressTV;

  @NonNull
  public final EditText fax;

  @NonNull
  public final TextInputLayout faxTV;

  @NonNull
  public final EditText firstname;

  @NonNull
  public final TextInputLayout fnameTV;

  @NonNull
  public final RadioGroup groupId;

  @NonNull
  public final RadioGroup isSubscribed;

  @NonNull
  public final EditText lastname;

  @NonNull
  public final LinearLayout llCustomFields;

  @NonNull
  public final TextInputLayout lnameTV;

  @NonNull
  public final LinearLayout mainContainer;

  @NonNull
  public final RadioButton no;

  @NonNull
  public final RadioButton no1;

  @NonNull
  public final EditText password;

  @NonNull
  public final LinearLayout passwordLayout;

  @NonNull
  public final TextInputLayout passwordTV;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final MaterialButton register;

  @NonNull
  public final TextView registerHeading;

  @NonNull
  public final ScrollView registerScroll;

  @NonNull
  public final CheckBox sameBillingAndDelivery;

  @NonNull
  public final Spinner statesSpinner;

  @NonNull
  public final EditText storeName;

  @NonNull
  public final CheckBox tAndC;

  @NonNull
  public final EditText telephone;

  @NonNull
  public final TextInputLayout telephoneTv;

  @NonNull
  public final View toolbar;

  @NonNull
  public final RadioButton yes;

  @NonNull
  public final RadioButton yes1;

  @Bindable
  protected RegisterAccountModel mData;

  @Bindable
  protected CreateAccountHandler mHandler;

  protected ActivityCreateAccountBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextInputLayout addBookCityTitle, EditText addBookCityValue,
      TextInputLayout addBookCompanyTitle, EditText addBookCompanyValue,
      TextView addBookCountryTitle, TextView addBookStateTitle,
      TextInputLayout addBookStreetAddSecondTitle, EditText addBookStreetAddSecondValue,
      TextInputLayout addBookStreetAddTitle, EditText addBookStreetAddValue,
      TextInputLayout addBookZipTitle, EditText addBookZipValue, TextView addBookheading,
      LinearLayout addrDataContainer, AppBarLayout appbar, CheckBox becomeSeller,
      LinearLayout bottomLayout, TextInputLayout confirmPasswordTv, EditText confirmation,
      Spinner countrySpinner, TextView customerGroup, EditText emailAddress,
      TextInputLayout emailAddressTV, EditText fax, TextInputLayout faxTV, EditText firstname,
      TextInputLayout fnameTV, RadioGroup groupId, RadioGroup isSubscribed, EditText lastname,
      LinearLayout llCustomFields, TextInputLayout lnameTV, LinearLayout mainContainer,
      RadioButton no, RadioButton no1, EditText password, LinearLayout passwordLayout,
      TextInputLayout passwordTV, CircleImageView profileImage, ProgressBar progress,
      MaterialButton register, TextView registerHeading, ScrollView registerScroll,
      CheckBox sameBillingAndDelivery, Spinner statesSpinner, EditText storeName, CheckBox tAndC,
      EditText telephone, TextInputLayout telephoneTv, View toolbar, RadioButton yes,
      RadioButton yes1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addBookCityTitle = addBookCityTitle;
    this.addBookCityValue = addBookCityValue;
    this.addBookCompanyTitle = addBookCompanyTitle;
    this.addBookCompanyValue = addBookCompanyValue;
    this.addBookCountryTitle = addBookCountryTitle;
    this.addBookStateTitle = addBookStateTitle;
    this.addBookStreetAddSecondTitle = addBookStreetAddSecondTitle;
    this.addBookStreetAddSecondValue = addBookStreetAddSecondValue;
    this.addBookStreetAddTitle = addBookStreetAddTitle;
    this.addBookStreetAddValue = addBookStreetAddValue;
    this.addBookZipTitle = addBookZipTitle;
    this.addBookZipValue = addBookZipValue;
    this.addBookheading = addBookheading;
    this.addrDataContainer = addrDataContainer;
    this.appbar = appbar;
    this.becomeSeller = becomeSeller;
    this.bottomLayout = bottomLayout;
    this.confirmPasswordTv = confirmPasswordTv;
    this.confirmation = confirmation;
    this.countrySpinner = countrySpinner;
    this.customerGroup = customerGroup;
    this.emailAddress = emailAddress;
    this.emailAddressTV = emailAddressTV;
    this.fax = fax;
    this.faxTV = faxTV;
    this.firstname = firstname;
    this.fnameTV = fnameTV;
    this.groupId = groupId;
    this.isSubscribed = isSubscribed;
    this.lastname = lastname;
    this.llCustomFields = llCustomFields;
    this.lnameTV = lnameTV;
    this.mainContainer = mainContainer;
    this.no = no;
    this.no1 = no1;
    this.password = password;
    this.passwordLayout = passwordLayout;
    this.passwordTV = passwordTV;
    this.profileImage = profileImage;
    this.progress = progress;
    this.register = register;
    this.registerHeading = registerHeading;
    this.registerScroll = registerScroll;
    this.sameBillingAndDelivery = sameBillingAndDelivery;
    this.statesSpinner = statesSpinner;
    this.storeName = storeName;
    this.tAndC = tAndC;
    this.telephone = telephone;
    this.telephoneTv = telephoneTv;
    this.toolbar = toolbar;
    this.yes = yes;
    this.yes1 = yes1;
  }

  public abstract void setData(@Nullable RegisterAccountModel data);

  @Nullable
  public RegisterAccountModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable CreateAccountHandler handler);

  @Nullable
  public CreateAccountHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityCreateAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCreateAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCreateAccountBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_create_account, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCreateAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCreateAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCreateAccountBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_create_account, null, false, component);
  }

  public static ActivityCreateAccountBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCreateAccountBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCreateAccountBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_create_account);
  }
}
