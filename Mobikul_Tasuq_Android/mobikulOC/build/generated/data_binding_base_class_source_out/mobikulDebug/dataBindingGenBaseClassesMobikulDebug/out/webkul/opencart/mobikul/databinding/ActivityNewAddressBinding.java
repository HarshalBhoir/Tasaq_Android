package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.CardView;
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
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public abstract class ActivityNewAddressBinding extends ViewDataBinding {
  @NonNull
  public final EditText addBookCityValue;

  @NonNull
  public final EditText addBookCompanyValue;

  @NonNull
  public final TextView addBookCountryTitle;

  @NonNull
  public final TextView addBookStateTitle;

  @NonNull
  public final EditText addBookStreetAddSecondValue;

  @NonNull
  public final EditText addBookStreetAddValue;

  @NonNull
  public final EditText addBookZipValue;

  @NonNull
  public final EditText addBookfirstnameValue;

  @NonNull
  public final TextView addBookheading;

  @NonNull
  public final EditText addBooklastnameValue;

  @NonNull
  public final LinearLayout addrDataContainer;

  @NonNull
  public final TextView addressHeading;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final Button button1;

  @NonNull
  public final Button changePasswordInfo;

  @NonNull
  public final CheckBox checkboxGdpr;

  @NonNull
  public final ScrollView checkoutScroll;

  @NonNull
  public final Spinner countrySpinner;

  @NonNull
  public final RadioGroup defaultAddress;

  @NonNull
  public final TextView defaultAddressTitle;

  @NonNull
  public final MaterialButton fetchAddressButton;

  @NonNull
  public final LinearLayout llCustomFields;

  @NonNull
  public final RelativeLayout mostParenLayout;

  @NonNull
  public final CardView newAddrContainer;

  @NonNull
  public final RadioButton no;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final Spinner statesSpinner;

  @NonNull
  public final View toolbar;

  @NonNull
  public final AutoCompleteTextView tvPlace;

  @NonNull
  public final RadioButton yes;

  protected ActivityNewAddressBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, EditText addBookCityValue, EditText addBookCompanyValue,
      TextView addBookCountryTitle, TextView addBookStateTitle,
      EditText addBookStreetAddSecondValue, EditText addBookStreetAddValue,
      EditText addBookZipValue, EditText addBookfirstnameValue, TextView addBookheading,
      EditText addBooklastnameValue, LinearLayout addrDataContainer, TextView addressHeading,
      AppBarLayout appbar, Button button1, Button changePasswordInfo, CheckBox checkboxGdpr,
      ScrollView checkoutScroll, Spinner countrySpinner, RadioGroup defaultAddress,
      TextView defaultAddressTitle, MaterialButton fetchAddressButton, LinearLayout llCustomFields,
      RelativeLayout mostParenLayout, CardView newAddrContainer, RadioButton no,
      ProgressBar progress, Spinner statesSpinner, View toolbar, AutoCompleteTextView tvPlace,
      RadioButton yes) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addBookCityValue = addBookCityValue;
    this.addBookCompanyValue = addBookCompanyValue;
    this.addBookCountryTitle = addBookCountryTitle;
    this.addBookStateTitle = addBookStateTitle;
    this.addBookStreetAddSecondValue = addBookStreetAddSecondValue;
    this.addBookStreetAddValue = addBookStreetAddValue;
    this.addBookZipValue = addBookZipValue;
    this.addBookfirstnameValue = addBookfirstnameValue;
    this.addBookheading = addBookheading;
    this.addBooklastnameValue = addBooklastnameValue;
    this.addrDataContainer = addrDataContainer;
    this.addressHeading = addressHeading;
    this.appbar = appbar;
    this.button1 = button1;
    this.changePasswordInfo = changePasswordInfo;
    this.checkboxGdpr = checkboxGdpr;
    this.checkoutScroll = checkoutScroll;
    this.countrySpinner = countrySpinner;
    this.defaultAddress = defaultAddress;
    this.defaultAddressTitle = defaultAddressTitle;
    this.fetchAddressButton = fetchAddressButton;
    this.llCustomFields = llCustomFields;
    this.mostParenLayout = mostParenLayout;
    this.newAddrContainer = newAddrContainer;
    this.no = no;
    this.progress = progress;
    this.statesSpinner = statesSpinner;
    this.toolbar = toolbar;
    this.tvPlace = tvPlace;
    this.yes = yes;
  }

  @NonNull
  public static ActivityNewAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityNewAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityNewAddressBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_new_address, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNewAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityNewAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityNewAddressBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_new_address, null, false, component);
  }

  public static ActivityNewAddressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityNewAddressBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityNewAddressBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_new_address);
  }
}
