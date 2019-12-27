package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.MapView;

public abstract class DeliveryboyTrackBinding extends ViewDataBinding {
  @NonNull
  public final MapView map;

  protected DeliveryboyTrackBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, MapView map) {
    super(_bindingComponent, _root, _localFieldCount);
    this.map = map;
  }

  @NonNull
  public static DeliveryboyTrackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DeliveryboyTrackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DeliveryboyTrackBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.deliveryboy_track, root, attachToRoot, component);
  }

  @NonNull
  public static DeliveryboyTrackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DeliveryboyTrackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DeliveryboyTrackBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.deliveryboy_track, null, false, component);
  }

  public static DeliveryboyTrackBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DeliveryboyTrackBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DeliveryboyTrackBinding)bind(component, view, webkul.opencart.mobikul.R.layout.deliveryboy_track);
  }
}
