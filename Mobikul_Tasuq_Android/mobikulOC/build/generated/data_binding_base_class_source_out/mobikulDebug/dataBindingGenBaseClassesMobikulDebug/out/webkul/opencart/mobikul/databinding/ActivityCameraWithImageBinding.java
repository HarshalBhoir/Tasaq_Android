package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

public abstract class ActivityCameraWithImageBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout cameraPreview;

  @NonNull
  public final ImageView imageView;

  protected ActivityCameraWithImageBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout cameraPreview, ImageView imageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cameraPreview = cameraPreview;
    this.imageView = imageView;
  }

  @NonNull
  public static ActivityCameraWithImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCameraWithImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCameraWithImageBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_camera_with_image, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCameraWithImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCameraWithImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCameraWithImageBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_camera_with_image, null, false, component);
  }

  public static ActivityCameraWithImageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCameraWithImageBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCameraWithImageBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_camera_with_image);
  }
}
