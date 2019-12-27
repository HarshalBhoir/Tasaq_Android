package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.GuestShippingAddressHandler;
import webkul.opencart.mobikul.twoWayBindingModel.GuestCheckoutModel;

public abstract class FragmentGuestShippingAddressBinding extends ViewDataBinding {
  @NonNull
  public final TextInputLayout addBookCityTitle;

  @NonNull
  public final EditText addBookCityValue;

  @NonNull
  public final TextInputLayout addBookCompanyTitle;

  @NonNull
  public final EditText addBookCompanyValue;

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
  public final MaterialButton billingCheckoutContinue;

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
  public final ProgressBar progress;

  @NonNull
  public final Button register;

  @NonNull
  public final TextView registerHeading;

  @NonNull
  public final ScrollView registerScroll;

  @NonNull
  public final CheckBox sameBillingAndDelivery;

  @NonNull
  public final Spinner statesSpinner;

  @NonNull
  public final CheckBox tAndC;

  @NonNull
  public final EditText telephone;

  @NonNull
  public final TextInputLayout telephoneTv;

  @NonNull
  public final AutoCompleteTextView tvPlace;

  @NonNull
  public final RadioButton yes;

  @NonNull
  public final RadioButton yes1;

  @Bindable
  protected GuestShippingAddressHandler mHandler;

  @Bindable
  protected GuestCheckoutModel mData;

  protected FragmentGuestShippingAddressBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextInputLayout addBookCityTitle, EditText addBookCityValue,
      TextInputLayout addBookCompanyTitle, EditText addBookCompanyValue,
      TextInputLayout addBookStreetAddSecondTitle, EditText addBookStreetAddSecondValue,
      TextInputLayout addBookStreetAddTitle, EditText addBookStreetAddValue,
      TextInputLayout addBookZipTitle, EditText addBookZipValue, TextView addBookheading,
      LinearLayout addrDataContainer, MaterialButton billingCheckoutContinue,
      TextInputLayout confirmPasswordTv, EditText confirmation, Spinner countrySpinner,
      TextView customerGroup, EditText emailAddress, TextInputLayout emailAddressTV, EditText fax,
      TextInputLayout faxTV, EditText firstname, TextInputLayout fnameTV, RadioGroup groupId,
      RadioGroup isSubscribed, EditText lastname, LinearLayout llCustomFields,
      TextInputLayout lnameTV, LinearLayout mainContainer, RadioButton no, RadioButton no1,
      EditText password, LinearLayout passwordLayout, TextInputLayout passwordTV,
      ProgressBar progress, Button register, TextView registerHeading, ScrollView registerScroll,
      CheckBox sameBillingAndDelivery, Spinner statesSpinner, CheckBox tAndC, EditText telephone,
      TextInputLayout telephoneTv, AutoCompleteTextView tvPlace, RadioButton yes,
      RadioButton yes1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addBookCityTitle = addBookCityTitle;
    this.addBookCityValue = addBookCityValue;
    this.addBookCompanyTitle = addBookCompanyTitle;
    this.addBookCompanyValue = addBookCompanyValue;
    this.addBookStreetAddSecondTitle = addBookStreetAddSecondTitle;
    this.addBookStreetAddSecondValue = addBookStreetAddSecondValue;
    this.addBookStreetAddTitle = addBookStreetAddTitle;
    this.addBookStreetAddValue = addBookStreetAddValue;
    this.addBookZipTitle = addBookZipTitle;
    this.addBookZipValue = addBookZipValue;
    this.addBookheading = addBookheading;
    this.addrDataContainer = addrDataContainer;
    this.billingCheckoutContinue = billingCheckoutContinue;
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
    this.progress = progress;
    this.register = register;
    this.registerHeading = registerHeading;
    this.registerScroll = registerScroll;
    this.sameBillingAndDelivery = sameBillingAndDelivery;
    this.statesSpinner = statesSpinner;
    this.tAndC = tAndC;
    this.telephone = telephone;
    this.telephoneTv = telephoneTv;
    this.tvPlace = tvPlace;
    this.yes = yes;
    this.yes1 = yes1;
  }

  public abstract void setHandler(@Nullable GuestShippingAddressHandler handler);

  @Nullable
  public GuestShippingAddressHandler getHandler() {
    return mHandler;
  }

  public abstract void setData(@Nullable GuestCheckoutModel data);

  @Nullable
  public GuestCheckoutModel getData() {
    return mData;
  }

  @NonNull
  public static FragmentGuestShippingAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentGuestShippingAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentGuestShippingAddressBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_guest_shipping_address, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGuestShippingAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentGuestShippingAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentGuestShippingAddressBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_guest_shipping_address, null, false, component);
  }

  public static FragmentGuestShippingAddressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentGuestShippingAddressBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentGuestShippingAddressBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_guest_shipping_address);
  }
}
