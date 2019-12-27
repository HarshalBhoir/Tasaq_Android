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
import android.widget.ListView;
import android.widget.TextView;

public abstract class ActivityFileExplorerBinding extends ViewDataBinding {
  @NonNull
  public final TextView dirPath;

  @NonNull
  public final ListView list;

  @NonNull
  public final Button select;

  protected ActivityFileExplorerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView dirPath, ListView list, Button select) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dirPath = dirPath;
    this.list = list;
    this.select = select;
  }

  @NonNull
  public static ActivityFileExplorerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityFileExplorerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityFileExplorerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_file_explorer, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFileExplorerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityFileExplorerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityFileExplorerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_file_explorer, null, false, component);
  }

  public static ActivityFileExplorerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityFileExplorerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityFileExplorerBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_file_explorer);
  }
}
