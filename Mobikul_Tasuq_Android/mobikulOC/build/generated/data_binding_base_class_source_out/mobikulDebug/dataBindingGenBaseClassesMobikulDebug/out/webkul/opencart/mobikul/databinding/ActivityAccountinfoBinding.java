package webkul.opencart.mobikul.databinding;

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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;

public abstract class ActivityAccountinfoBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout accinfoContainer;

  @NonNull
  public final LinearLayout accinfoContainer1;

  @NonNull
  public final EditText accinfoFaxValue;

  @NonNull
  public final EditText accinfoPhoneValue;

  @NonNull
  public final EditText accinfoemailValue;

  @NonNull
  public final EditText accinfofirstnameValue;

  @NonNull
  public final TextView accinfoheading;

  @NonNull
  public final EditText accinfolastnameValue;

  @NonNull
  public final EditText accinfonewconfirmpasswordValue;

  @NonNull
  public final EditText accinfonewpasswordValue;

  @NonNull
  public final ProgressBar accountinfoprogress;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final LinearLayout bottomEditLayout;

  @NonNull
  public final Button button1;

  @NonNull
  public final MaterialButton button2;

  @NonNull
  public final MaterialButton cancel;

  @NonNull
  public final Button changePasswordInfo;

  @NonNull
  public final CheckBox checkboxGdpr;

  @NonNull
  public final TextInputLayout confirmpassword;

  @NonNull
  public final TextInputLayout email;

  @NonNull
  public final TextInputLayout fax;

  @NonNull
  public final TextInputLayout firstname;

  @NonNull
  public final TextInputLayout lastname;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final LinearLayout passwrodLayout;

  @NonNull
  public final TextInputLayout phone;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final View toolbar;

  protected ActivityAccountinfoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout accinfoContainer, LinearLayout accinfoContainer1,
      EditText accinfoFaxValue, EditText accinfoPhoneValue, EditText accinfoemailValue,
      EditText accinfofirstnameValue, TextView accinfoheading, EditText accinfolastnameValue,
      EditText accinfonewconfirmpasswordValue, EditText accinfonewpasswordValue,
      ProgressBar accountinfoprogress, AppBarLayout appbar, LinearLayout bottomEditLayout,
      Button button1, MaterialButton button2, MaterialButton cancel, Button changePasswordInfo,
      CheckBox checkboxGdpr, TextInputLayout confirmpassword, TextInputLayout email,
      TextInputLayout fax, TextInputLayout firstname, TextInputLayout lastname,
      TextInputLayout password, LinearLayout passwrodLayout, TextInputLayout phone,
      CircleImageView profileImage, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accinfoContainer = accinfoContainer;
    this.accinfoContainer1 = accinfoContainer1;
    this.accinfoFaxValue = accinfoFaxValue;
    this.accinfoPhoneValue = accinfoPhoneValue;
    this.accinfoemailValue = accinfoemailValue;
    this.accinfofirstnameValue = accinfofirstnameValue;
    this.accinfoheading = accinfoheading;
    this.accinfolastnameValue = accinfolastnameValue;
    this.accinfonewconfirmpasswordValue = accinfonewconfirmpasswordValue;
    this.accinfonewpasswordValue = accinfonewpasswordValue;
    this.accountinfoprogress = accountinfoprogress;
    this.appbar = appbar;
    this.bottomEditLayout = bottomEditLayout;
    this.button1 = button1;
    this.button2 = button2;
    this.cancel = cancel;
    this.changePasswordInfo = changePasswordInfo;
    this.checkboxGdpr = checkboxGdpr;
    this.confirmpassword = confirmpassword;
    this.email = email;
    this.fax = fax;
    this.firstname = firstname;
    this.lastname = lastname;
    this.password = password;
    this.passwrodLayout = passwrodLayout;
    this.phone = phone;
    this.profileImage = profileImage;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityAccountinfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAccountinfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAccountinfoBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_accountinfo, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAccountinfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAccountinfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAccountinfoBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_accountinfo, null, false, component);
  }

  public static ActivityAccountinfoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityAccountinfoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityAccountinfoBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_accountinfo);
  }
}
