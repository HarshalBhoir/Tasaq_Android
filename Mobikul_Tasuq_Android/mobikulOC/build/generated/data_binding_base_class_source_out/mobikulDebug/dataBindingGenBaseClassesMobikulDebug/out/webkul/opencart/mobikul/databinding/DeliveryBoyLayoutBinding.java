package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;

public abstract class DeliveryBoyLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView dboyContact;

  @NonNull
  public final CircleImageView dboyImage;

  @NonNull
  public final TextView dboyName;

  @NonNull
  public final TextView dboyOtp;

  @NonNull
  public final TextView dboyVehicle;

  @NonNull
  public final Button track;

  protected DeliveryBoyLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView dboyContact, CircleImageView dboyImage, TextView dboyName,
      TextView dboyOtp, TextView dboyVehicle, Button track) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dboyContact = dboyContact;
    this.dboyImage = dboyImage;
    this.dboyName = dboyName;
    this.dboyOtp = dboyOtp;
    this.dboyVehicle = dboyVehicle;
    this.track = track;
  }

  @NonNull
  public static DeliveryBoyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DeliveryBoyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DeliveryBoyLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.delivery_boy_layout, root, attachToRoot, component);
  }

  @NonNull
  public static DeliveryBoyLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DeliveryBoyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DeliveryBoyLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.delivery_boy_layout, null, false, component);
  }

  public static DeliveryBoyLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DeliveryBoyLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DeliveryBoyLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.delivery_boy_layout);
  }
}
